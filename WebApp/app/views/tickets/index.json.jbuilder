json.array!(@tickets) do |ticket|
  json.extract! ticket, :event_id, :price, :sold, :available
  json.url ticket_url(ticket, format: :json)
end