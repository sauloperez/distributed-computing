require 'web_service_model'

class Event < ActiveRecord::Base#WebServiceModel
	client wsdl: "http://macbook-macbook-pro-de-pau.local:9090/TicketService/TicketServiceImplService?wsdl"# @@wsdlURLs['ticket']

	operations :get_events

	def self.get_array(body)
		if body == nil 
			body = []
		else
			body = [body] if !body.kind_of?(Array)
		end
		return body
	end

	def self.all
		response = get_events()
		logger.debug "hash = #{get_array(response.body[:get_events_response][:return])}"
	end
end
