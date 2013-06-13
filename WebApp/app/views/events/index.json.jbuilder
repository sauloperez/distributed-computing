json.array!(@events) do |event|
  json.extract! event, :name, :date, :datetime,, :location, :string
  json.url event_url(event, format: :json)
end