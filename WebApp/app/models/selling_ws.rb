require 'savon'

class SellingWs < ActiveRecord::Base
	extend Savon::Model
	client wsdl: "http://MacBook-MacBook-Pro-de-Pau.local:9090/SellingService/SellingServiceImplService?wsdl"
	
	operations :start_purchase, :execute_purchase, :test

	def self.get_purchase_url(tickets)
		customer = Customer.new
		customer.name = "Test name"
		customer.surname = "Test surname"
		customer.country = "Catalunya"
		customer.address = "Test address"
		customer.phone = "999999999"
		customer.email = "test@test.com"

		ws_customer = CustomerWs.parse(customer)
		ws_tickets = Array.new
		tickets.each do |ticket| 
			ws_ticket = ticket_to_hash(ticket)
			ws_tickets << ws_ticket
		end

		logger.debug "ws_customer = #{ws_customer.inspect}"

		response = start_purchase(message: { customer: ws_customer, tickets: ws_tickets })
		ret = response.body[:start_purchase_response][:return]

		# logger.debug "start_purchase = #{ret}"

		return ret
	end

	def self.pay(token, payer_id)
		response = execute_purchase(message: { token: token, payerId: payer_id })
		ret = response.body[:execute_purchase_response][:return]

		# logger.debug "execute_purchase = #{ret}"

		return ret
	end

	private
		def self.ticket_to_hash(ticket)
			ticket.attributes
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