class Ticket < ActiveRecord::Base
	belongs_to :event

	def self.all
		TicketWs.find_by_event(self.parent.id)
	end

	def self.hash_to_ticket(ws_ticket)
		t = Ticket.new
		t.price = ws_ticket[:price]
		t.sold = ws_ticket[:sold]
		t.available = ws_ticket[:available]
		return t
	end
end
