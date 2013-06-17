class CreateCustomerWs < ActiveRecord::Migration
  def change
    create_table :customer_ws do |t|

      t.timestamps
    end
  end
end
