package com.sunft.base001;

import java.util.HashMap;
import java.util.Map;

public class Test05 {

	public static void main(String[] args) {
		//初始化对象在eden区
		//参数:-Xmx64M -Xms64M -XX:+PrintGCDetails
		for(int i = 0; i < 5; i ++) {
			byte[] b = new byte[1024 * 1024];
		}
		
		//测试进入老年代的对象
		//初始和最大堆内存设置为1G,使用串行垃圾收集器,进入老年代的次数是15,并且打印垃圾收集详细信息
		//参数：-Xmx1024M -Xms1024M -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails
		//-XX:+PrintHeapAtGC
		//注意这里的m变量是一直被应用的
		Map<Integer, byte[]> m = new HashMap<Integer, byte[]>();
		for(int i = 0; i < 5; i ++) {
			byte[] b = new byte[1024 * 1024];
			m.put(i, b);
		}
		
		/**
		 * for循环的目的是让程序不停止
		 */
		for(int k = 0; k < 20; k ++) {
			for(int j = 0; j < 300; j ++) {
				byte[] b = new byte[1024 * 1024];
			}
		}
	}

}





