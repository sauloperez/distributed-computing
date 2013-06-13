require 'web_service_model'

class Ticket < WebServiceModel
	client wsdl: "http://macbook-macbook-pro-de-pau.local:9090/TicketService/TicketServiceImplService?wsdl"# @@wsdlURLs['ticket']

	operations :get_ticket_by_id, :get_tickets, :get_tickets_by_event

	def self.wrap_with_array(body)
		if body == nil 
			body = []
		else
			body = [body] if !body.kind_of?(Array)
		end
		return body
	end

	def self.all
		response = get_tickets()
		wrap_with_array(response.body[:get_tickets_response][:return])
	end

	def self.find(id)
		response = get_ticket_by_id(message: { id: id })
		return response.body[:get_ticket_by_id_response][:return]
	end

	def self.find_by_event(event_token)
		response = get_tickets_by_event(message: { event: {token: event_token}} )

		logger.debug "return = #{response.body[:get_tickets_by_event_response][:return]}"

		wrap_with_array(response.body[:get_tickets_by_event_response][:return])
	end
end
