package com.lveqia.cloud.mybatis.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Leolaurel
 */
public class UtilDate {
	public static String getToday(){
		String result;
		Date date = new Date();
		result = format(date);
		return result;
	}
	private static String format(Date date){
		String format = "yyyy-MM-dd";
		SimpleDateFormat fmt = new SimpleDateFormat(format);
		return fmt.format(date);
	}
}
