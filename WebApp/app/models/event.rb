class Event < ActiveRecord::Base
	has_many :tickets

	def self.find(id)
		EventWs.find(id)
	end

	def self.all
		EventWs.all
	end

	def get_tickets
		TicketWs.find_by_event(self.token)
	end	
end
