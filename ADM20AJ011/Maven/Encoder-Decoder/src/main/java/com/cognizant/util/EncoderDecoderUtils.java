package com.cognizant.util;

import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Base64;

public class EncoderDecoderUtils {
	public static String encodeString(String data) {
		Encoder encoder = Base64.getEncoder();
		byte[] encodedBytes = encoder.encode(data.getBytes());
		String encodedData = new String(encodedBytes);
		return encodedData;
	}
	
	public static String decodeString(String encodedData) {
		Decoder decoder = Base64.getDecoder();
		byte[] originalButes = decoder.decode(encodedData);
		String originalData = new String(originalButes);
		return originalData;
	}
}
