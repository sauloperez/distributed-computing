require 'savon'

class EventWs < ActiveRecord::Base 
	extend Savon::Model
	client wsdl: "http://macbook-macbook-pro-de-pau.local:9090/TicketService/TicketServiceImplService?wsdl"# @@wsdlURLs['ticket']

	operations :get_events, :get_event_by_id, :get_tickets_by_event

	def self.wrap_with_array(body)
		if body == nil 
			body = []
		else
			body = [body] if !body.kind_of?(Array)
		end
		return body
	end

	def self.find(id)
		response = get_event_by_id(message: { id: id })
		ret = response.body[:get_event_by_id_response][:return]

		# logger.debug "get_event_by_id = #{ret}"

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
			event = Event.new
			event.id = ws_event[:id]
			event.token = ws_event[:token]
			event.name = ws_event[:name]
			event.location = ws_event[:location]
			event.date = ws_event[:date]
			return event
		end
end
