package ua.be.dc.services.sellingService.cli;

import java.util.Arrays;

public abstract class BasicCLIWrapper {

	public static String getModel(String[] args) {
		return args[1];
	}
	
	public static String[] getSubCLIargs(String[] args) {
		return Arrays.copyOfRange(args, 2, args.length);
	}
}
