package com.osf.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayCopyTest {
	public static void main(String[] args) {
		String str1 = "1234";
		byte[] strByte= str1.getBytes();
		String str2 = "abcd";
		byte[] strByte2= str2.getBytes();
		byte[] sunByte= new byte[strByte.length+strByte2.length];
		System.arraycopy(strByte, 0, sunByte, 0, strByte.length);
		System.arraycopy(strByte2, 0, sunByte, strByte.length, strByte2.length);
//		for(byte b:sunByte) {
//			log.debug("b=>{}",b);
//		}
		try {
			MessageDigest mDigest= MessageDigest.getInstance("SHA-256");
			sunByte=mDigest.digest(sunByte);
			StringBuffer sb= new StringBuffer();
			for(int i=0;i<sunByte.length;i++) {
				String s = Integer.toString((sunByte[i] & 0xFF)+0x100,16).substring(1);
				sb.append(s);
			}
			log.info("encoding str => {}",sb.toString());
//			221b37fcdb52d0f7c39bbd0be211db0e1c00ca5fbecd5788780463026c6b964b
			log.info("encoding str length => {}",sb.length());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
