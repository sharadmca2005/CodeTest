package com.cgi.util;

import java.util.function.Supplier;

public class CommonUtil {
	public static <T> T getValue(Supplier<T> statement) {
	    try {
	        return statement.get();
	    }
	    catch (NullPointerException | IndexOutOfBoundsException e) {
	        return null;
	    }
	}
}
