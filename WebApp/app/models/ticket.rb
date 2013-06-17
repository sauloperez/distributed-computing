class Ticket < ActiveRecord::Base
	belongs_to :event

	def self.all
		logger.debug "self = #{self}"
		find_by_event(event_id)
	end

	def self.find_by_event(event_token)
		logger.debug "find_by_event"

		e = Event.new(id: event_token)

		logger.debug "e = #{e}"
		tickets = TicketWs.find_by_event(event_token)
		tickets.each do |ticket| 
			ticket.event = e
		end
		return tickets
	end

	def self.get_purchase_url(id)
		ticket = TicketWs.find(id)
		SellingWs.get_purchase_url([ticket])
	end

	def self.pay(token, payer_id)
		SellingWs.pay(token, payer_id)
	end
end
