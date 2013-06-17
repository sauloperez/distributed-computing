class CustomerWs < ActiveRecord::Base

	def self.parse(customer)
		ws_customer = customer_to_hash(customer)
		ws_customer.delete("id")
		ws_customer.delete("created_at")
		ws_customer.delete("updated_at")
		return ws_customer
	end

	private
		def self.customer_to_hash(customer)
			customer.attributes
		end
end
