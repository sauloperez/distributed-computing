class CreateSellingWs < ActiveRecord::Migration
  def change
    create_table :selling_ws do |t|

      t.timestamps
    end
  end
end
