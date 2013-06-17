require 'savon'

class EventWs < ActiveRecord::Base 
	extend Savon::Model
	client wsdl: "http://macbook-macbook-pro-de-pau.local:9090/TicketService/TicketServiceImplService?wsdl"# @@wsdlURLs['ticket']

	operations :get_events, :get_event_by_token, :get_tickets_by_event

	def self.find(token)
		response = get_event_by_token(message: { token: token })
		ret = response.body[:get_event_by_token_response][:return]

		# logger.debug "get_event_by_token = #{ret}"

		return hash_to_event(ret)
	end

	def self.all
		response = get_events()
		ws_events = wrap_with_array(response.body[:get_events_response][:return])

		# logger.debug "get_events = #{ret}"

		events = Array.new
		ws_events.each do |ws_event|
			events << hash_to_event(ws_event)
		end
		return events
	end

	private
		def self.hash_to_event(ws_event)
			event = Event.new(id: ws_event[:token])
			event.name = ws_event[:name]
			event.location = ws_event[:location]
			event.date = ws_event[:date]
			return event
		end

		def self.wrap_with_array(body)
			if body == nil 
				body = []
			else
				body = [body] if !body.kind_of?(Array)
			end
			return body
		end
end
