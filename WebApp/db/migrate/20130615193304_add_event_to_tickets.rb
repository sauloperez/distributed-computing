class AddEventToTickets < ActiveRecord::Migration
  def self.up
    add_column :tickets, :event_id, :string
  end

  def self.down
  	remove_column :tickets, :event_id
  end
end
