package com.sunft.base001;

import java.util.HashMap;
import java.util.Map;

public class Test05 {

	public static void main(String[] args) {
		//��ʼ��������eden��
		//����:-Xmx64M -Xms64M -XX:+PrintGCDetails
		for(int i = 0; i < 5; i ++) {
			byte[] b = new byte[1024 * 1024];
		}
		
		//���Խ���������Ķ���
		//��ʼ�������ڴ�����Ϊ1G,ʹ�ô��������ռ���,����������Ĵ�����15,���Ҵ�ӡ�����ռ���ϸ��Ϣ
		//������-Xmx1024M -Xms1024M -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails
		//-XX:+PrintHeapAtGC
		//ע�������m������һֱ��Ӧ�õ�
		Map<Integer, byte[]> m = new HashMap<Integer, byte[]>();
		for(int i = 0; i < 5; i ++) {
			byte[] b = new byte[1024 * 1024];
			m.put(i, b);
		}
		
		/**
		 * forѭ����Ŀ�����ó���ֹͣ
		 */
		for(int k = 0; k < 20; k ++) {
			for(int j = 0; j < 300; j ++) {
				byte[] b = new byte[1024 * 1024];
			}
		}
	}

}





