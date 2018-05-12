package com.sunft.base001;

/**
 * ��ӡjvm����
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
		
		//�鿴GC��Ϣ
		//��ȡ����ڴ�
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		//�ܹ�ʹ�õ�
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		System.out.println("����1M�ڴ���ǰ");
		byte[] b1 = new byte[1 * 1024 * 1024];//����1M�ڴ�
		System.out.println("������1M��");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		System.out.println("�ַ���4M�ڴ�ǰ");
		byte[] b2 = new byte[4 * 1024 * 1024];
		System.out.println("������4M��");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		int a = 0x00000000fa0a0000;
		int b = 0x00000000fa801000;
		System.out.println("���Ϊ:" + (b - a) / 1024);
	}

}
