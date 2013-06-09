package ua.be.dc.services.sellingService.cli.util;

import java.util.ArrayList;

public class Utils {

	/**
	 * Returns a list of multiple-word command line arguments separated by a certain separator char
	 * @param args
	 * @return
	 */
	public static String[] parseFields(String[] args) {
		ArrayList<String> fieldsList = new ArrayList<>();
		
		int i = 0;
		while (i < args.length) {
			
			String field = "";
			for (int j = i; j < args.length; j++) {
				String str = args[j];
				String lastChar = str.substring(str.length() - 1);
				
				// Stop building the field when we reach a separator char
				if (str.equals(Constants.INPUT_SEPARATOR) || lastChar.equals(Constants.INPUT_SEPARATOR)) {
					str = str.substring(0, str.length()-1);
					field += str;
					
					i = j+1;
					break;
				}
				else {
					str += " ";
				}
				
				field += str;
				i = j+1;
			}
			
			// once built add it to the list of fields
			fieldsList.add(field);
		}
		
		return fieldsList.toArray(new String[fieldsList.size()]);
	}
}
