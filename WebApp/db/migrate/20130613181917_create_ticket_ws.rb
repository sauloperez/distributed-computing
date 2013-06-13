class CreateTicketWs < ActiveRecord::Migration
  def change
    create_table :ticket_ws do |t|

      t.timestamps
    end
  end
end
