package com.kitri.lang;

//Wrapper Class : �⺻ DT�� Ŭ����ȭ

//�⺻ DT			WrapperClass
//boolean			Boolean
//char			Character
//byte			Byte
//short			Short
//int				Integer
//long			Long
//float			Float
//double			Double

public class WrapperClassTest {
	public static void main(String[] args) {	
		Boolean b1 = new Boolean("true");
		boolean b2 = b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");
		
		if (b2) {
			System.out.println("b2�� true�̴�.");
		}
		if (b3) {
			System.out.println("b3�� true�̴�.");
		}
		
		String s = "123";
		System.out.println(s+4); // 1234
//		int x = (int) s; // �⺻ Ÿ�Կ�  ���۷����� ��� �� �� ����.
//		Integer i = new Integer(s);
//		int x = i.intValue();
		int x = Integer.parseInt(s); // 1237 ���ڿ��� �ȵ� ���ڷ� ��ȯ �ȵ�!!! , ���ڷ� ���������
		System.out.println(x+4);
		
		s = "123.45";
		double d = Double.parseDouble(s);
		System.out.println(d + 4); // 127.45
		
		// autoboxing �� ������ ����Ŭ�������� ���� Ÿ�����θ� ����.
		Integer i2 = new Integer(3);
		int y = i2; // Integer�� ������. unboxing. -- i2�� int�� �ٲ�
		Integer i3 = y;	//	boxing
	}
}








//equals(Object obj)
//toString()