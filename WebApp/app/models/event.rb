class Event < ActiveRecord::Base
	self.primary_key = "token"
	has_many :tickets

	def self.find(id)
		EventWs.find(id)
	end

	def self.all
		EventWs.all
	end

	def get_tickets
		tickets = TicketWs.find_by_event(self.token)
		tickets.each { |ticket| ticket.event = self }
		self.tickets = tickets
	end	
end
