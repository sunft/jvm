package com.sunft.base001;

import java.util.Vector;

/**
 * @author sunft
 *
 */
public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//-Xms2m -Xmx2m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=H:/Test03.dump
		//¶ÑÄÚ´æÒç³ö
		Vector v = new Vector();
		for(int i = 0; i < 5; i ++) {
			v.add(new Byte[1 * 1024 * 1024]);
		}
	}

}




