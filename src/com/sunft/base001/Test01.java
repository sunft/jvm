package com.sunft.base001;

/**
 * 打印jvm参数
 * @author sunft
 *
 */
public class Test01 {

	public static void main(String[] args) {
		//-XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation
		
		//-Xms5m -Xmx20m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		//-XX:+PrintGCDetails
		//-XX:+PrintCommandLineFlags
		
		//1:
		//-XX:+PrintGC -Xms5m -Xmx20m -XX:+UseSerialGC -XX:PrintGCDetails
		
		//查看GC信息
		//获取最大内存
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		//总共使用的
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		System.out.println("分配1M内存以前");
		byte[] b1 = new byte[1 * 1024 * 1024];//分配1M内存
		System.out.println("分配了1M后");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		System.out.println("又分配4M内存前");
		byte[] b2 = new byte[4 * 1024 * 1024];
		System.out.println("分配了4M后");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		int a = 0x00000000fa0a0000;
		int b = 0x00000000fa801000;
		System.out.println("结果为:" + (b - a) / 1024);
	}

}
