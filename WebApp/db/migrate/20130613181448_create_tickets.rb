class CreateTickets < ActiveRecord::Migration
  def change
    create_table :tickets do |t|
      t.float :price
      t.boolean :sold
      t.boolean :available

      t.timestamps
    end
  end
end
