class CreateEventWs < ActiveRecord::Migration
  def change
    create_table :event_ws do |t|

      t.timestamps
    end
  end
end
