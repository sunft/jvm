package com.sunft.base001;

import java.util.HashMap;
import java.util.Map;

public class Test06 {

	public static void main(String[] args) {
		//��ʼ���ڴ������ڴ�Ϊ30M,ʹ�ô��������ռ���,�����ڴ��С����1000k,ֱ�ӽ��������
		//������-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
		//���������ԭ��Ϊ:����������������Ķ�������Ȱ����ݷ��䵽TLAB������,��˾�ʧȥ�������������Ļ���
		//����һ�е�����,��ֹ��������ڴ���䵽TLAB��
		//����:-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		Map<Integer, byte[]> m = new HashMap<Integer, byte[]>();
		for(int i = 0; i < 5 * 1024; i ++) {
			byte[] b = new byte[1024];
			m.put(i, b);
		}
	}

}


