package com.sunft.base001;

/**
 * 新生代参数配置
 * @author sunft
 *
 */
public class Test02 {

	public static void main(String[] args) {
		//第一次配置         eden 2 = from 1 + to 1
		//-Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//第二次配置
		//-Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//第三次配置
		//-XX:NewRatio=老年代/新生代
		//-Xms20m -Xmx20m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		byte[] b = null;
		//连续相系统申请10M内存空间
		for(int i = 0; i < 10; i ++) {
			b = new byte[1*1024*1024];
		}
	}

}



