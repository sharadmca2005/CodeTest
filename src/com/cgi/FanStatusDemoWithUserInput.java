package com.cgi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cgi.constants.CordType;
import com.cgi.factory.CordFactory;
import com.cgi.util.CommonUtil;

public class FanStatusDemoWithUserInput {
	public static void main(String[] args) {
		CeilingFanChain fan = new CeilingFanChain();
		
		while (true) {
            System.out.print("Enter Cord name which pull ");
            CordType cordType = null;
            try {
            	cordType = CordType.valueOf(getCord());
			} catch (Exception e) {
				System.out.print("Enter RED or GREEN only ");
			}
            
            if(null != cordType){
            	fan.pull(CordFactory.getCord(cordType));
            }
        }
	}

	static String getCord() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return line;
	}
}
