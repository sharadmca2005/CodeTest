package com.cgi.factory;

import com.cgi.constants.CordType;
import com.cgi.model.Cord;
import com.cgi.model.impl.GreenCord;
import com.cgi.model.impl.RedCord;

/**
 * Return cord object based on cord type
 * 
 * @author SHarad
 *
 */
public abstract class CordFactory {
	public static Cord getCord(CordType cordType){
		Cord pullCord = null;
		switch (cordType) {
			case RED:
				pullCord = new RedCord();
				break;
	
			case GREEN:
				pullCord = new GreenCord();
				break;
		}
		
		return pullCord;
	}
}
