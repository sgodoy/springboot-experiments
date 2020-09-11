package com.sgodoy.experiments.utils;

import org.slf4j.Logger;

/**
 * @author sergio
 *
 */
public class LogUtils {
	public static String separator = "-";
	public static String strInit = "INIT";
	public static String strFin = "FIN";
	
	/**
	 * Log INIT
	 * @param logger
	 * @param method
	 */
	static public void logInit(Logger logger, String method) {
		logger.info(method + separator + strInit);
	}
	
	/**
	 * Log FIN
	 * @param logger
	 * @param method
	 */
	static public void logFin(Logger logger, String method) {
		logger.info(method + separator + strFin);
	}

	
	/**
	 * Log Info
	 * @param logger
	 * @param message
	 * @param classLogged
	 * @param method
	 */
	static public void logInfo(Logger logger, String message, String classLogged, String method) {
		logger.info(createLog(message, classLogged, method));
	}
	
	/**
	 * Log Debug
	 * @param logger
	 * @param message
	 * @param classLogged
	 * @param method
	 */
	static public void logDebug(Logger logger, String message, String classLogged, String method) {
		if(logger.isDebugEnabled()) {
			logger.debug(createLog(message, classLogged, method));
		}
	}
	
	/**
	 * Log Error
	 * @param logger
	 * @param message
	 * @param classLogged
	 * @param method
	 */
	static public void logError(Logger logger, String message, String classLogged, String method) {
		if(logger.isDebugEnabled()) {
			logger.debug(createLog(message, classLogged, method));
		}
	}
	
	/**
	 * Create text for log
	 * @param message
	 * @param classLogged
	 * @param method
	 * @return
	 */
	static public String createLog(String message, String classLogged, String method) {
		StringBuilder strMessage = new StringBuilder();
		strMessage.append(classLogged).append(separator);
		strMessage.append(method).append(separator);
		strMessage.append(message);	
		return strMessage.toString();
	}
}
