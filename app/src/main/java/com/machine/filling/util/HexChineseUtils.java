package com.machine.filling.util;

import java.io.UnsupportedEncodingException;

public class HexChineseUtils {

	private static String hexString = "0123456789ABCDEF";

	public static String encodeCN(String data) {
		byte[] bytes;
		try {
			bytes = data.getBytes("gbk");
			StringBuilder sb = new StringBuilder(bytes.length * 2);

			for (int i = 0; i < bytes.length; i++) {
				sb.append(hexString.charAt((bytes[i] & 0xf0) >> 4));
				sb.append(hexString.charAt((bytes[i] & 0x0f) >> 0));
			}
			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String encodeStr(String data) {
		String result = "";
		byte[] bytes;
		try {
			bytes = data.getBytes("utf-8");
			for (int i = 0; i < bytes.length; i++) {
				result += Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1);
			}
			return result;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 判定是否为中文汉字
	 *
	 * @param data
	 * @return
	 */
	public static boolean isCN(String data) {
		boolean flag = false;
		String regex = "^[\u4e00-\u9fa5]*$";
		int len = data.length();
		if (len > 0) {
			for (int i = 0; i < len; i++) {
				char tempStr = data.charAt(i);
				if (String.valueOf(tempStr).matches(regex)) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static String getHexResult(String targetStr) {
		StringBuilder hexStr = new StringBuilder();
		int len = targetStr.length();
		if (len > 0) {
			for (int i = 0; i < len; i++) {
				char tempStr = targetStr.charAt(i);
				String data = String.valueOf(tempStr);
				if (isCN(data)) {
					hexStr.append(encodeCN(data));
				} else {
					hexStr.append(encodeStr(data));
				}
			}
		}
		return hexStr.toString();
	}

	/**
	 * 16进制转ASC字符串
	 * @param hexStr
	 * @return
	 */
	public static String getStringResultFromHex(String hexStr) {
		if (null == hexStr || "".equals(hexStr) || (hexStr.length()) % 2 != 0) {
			return null;
		}
		int byteLength = hexStr.length() / 2;
		byte[] bytes = new byte[byteLength];

		int temp = 0;
		for (int i = 0; i < byteLength; i++) {
			temp = hex2Dec(hexStr.charAt(2 * i)) * 16 + hex2Dec(hexStr.charAt(2 * i + 1));
			bytes[i] = (byte) (temp < 128 ? temp : temp - 256);
		}
		try {
			return new String(bytes, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public static int hex2Dec(char ch) {
		if (ch == '0')
			return 0;
		if (ch == '1')
			return 1;
		if (ch == '2')
			return 2;
		if (ch == '3')
			return 3;
		if (ch == '4')
			return 4;
		if (ch == '5')
			return 5;
		if (ch == '6')
			return 6;
		if (ch == '7')
			return 7;
		if (ch == '8')
			return 8;
		if (ch == '9')
			return 9;
		if (ch == 'a')
			return 10;
		if (ch == 'A')
			return 10;
		if (ch == 'b')
			return 11;
		if (ch == 'B')
			return 11;
		if (ch == 'c')
			return 12;
		if (ch == 'C')
			return 12;
		if (ch == 'd')
			return 13;
		if (ch == 'D')
			return 13;
		if (ch == 'e')
			return 14;
		if (ch == 'E')
			return 14;
		if (ch == 'f')
			return 15;
		if (ch == 'F')
			return 15;
		else
			return -1;
	}

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		System.out.println(getStringResultFromHex("6646"));
//		System.out.println(getHexResult("fF"));
//	}
}
