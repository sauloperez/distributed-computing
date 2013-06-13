require 'savon'

class WebServiceModel
	extend Savon::Model

	@@folder = 'config'
	@@webservicesURLs = 'webservices.yml'

	webservices = File.join(Rails.root, @@folder, @@webservicesURLs)
	@@wsdlURLs = YAML.load_file(webservices)
end