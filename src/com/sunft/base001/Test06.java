package com.sunft.base001;

import java.util.HashMap;
import java.util.Map;

public class Test06 {

	public static void main(String[] args) {
		//初始堆内存和最大内存为30M,使用串行垃圾收集器,申请内存大小大于1000k,直接进入老年代
		//参数：-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
		//这种现象的原因为:虚拟机对于体积不大的对象会优先把数据分配到TLAB区域中,因此就失去了在老年代分配的机会
		//下面一行的配置,禁止虚拟机将内存分配到TLAB区
		//参数:-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		Map<Integer, byte[]> m = new HashMap<Integer, byte[]>();
		for(int i = 0; i < 5 * 1024; i ++) {
			byte[] b = new byte[1024];
			m.put(i, b);
		}
	}

}


