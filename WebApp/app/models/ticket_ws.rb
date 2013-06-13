class TicketWs < ActiveRecord::Base
	extend Savon::Model
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

	def self.find_by_event(token)
		response = get_tickets_by_event(message: { event: {token: token}} )
		ws_tickets = wrap_with_array(response.body[:get_tickets_by_event_response][:return])

		# logger.debug "get_tickets_by_event = #{ws_tickets}"

		tickets = Array.new
		ws_tickets.each do |ws_ticket|
			tickets << hash_to_ticket(ws_ticket)
		end
		return tickets
	end

	private
		def self.hash_to_ticket(ws_ticket)
			t = Ticket.new
			t.id = ws_ticket[:id]
			t.price = ws_ticket[:price]
			t.sold = ws_ticket[:sold]
			t.available = ws_ticket[:available]
			return t
		end
end
