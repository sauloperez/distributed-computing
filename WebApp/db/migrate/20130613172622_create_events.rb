class CreateEvents < ActiveRecord::Migration
  def change
    create_table :events do |t|
      t.string :token
      t.string :name
      t.string :location
      t.datetime :date

      t.timestamps
    end
  end
end
