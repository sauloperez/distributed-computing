package ua.be.dc.services.sellingService.cli.util;

import java.util.ArrayList;

public class Utils {

	/**
	 * Returns a list of multiple-word command line arguments separated by a certain separator char
	 * @param fields
	 * @return
	 */
	public static String[] parseFields(String[] fields) {
		ArrayList<String> fieldsList = new ArrayList<>();
		
		if (fields.length == 1) {
			fieldsList.add(fields[0]);
		}
		else {
			int i = 0;
			while (i < fields.length) {
				
				String field = "";
				for (int j = i; j < fields.length; j++) {
					String str = fields[j];
					String lastChar = str.substring(str.length() - 1);
					
					// Stop building the field when we reach a separator char
					if (str.equals(Constants.INPUT_SEPARATOR) || lastChar.equals(Constants.INPUT_SEPARATOR)) {
						str = str.substring(0, str.length()-1);
						field += str;
						
						i = j+1;
						break;
					}
					else {
						// add whitespace except for the last word
						if (j < fields.length-1) {
							str += " ";
						}
					}
					
					field += str;
					i = j+1;
				}
				
				// once built add it to the list of fields
				fieldsList.add(field);
			}
		}
		
		return fieldsList.toArray(new String[fieldsList.size()]);
	}
}
