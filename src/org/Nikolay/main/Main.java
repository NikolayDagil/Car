package org.Nikolay.main;

import org.Nikolay.bmw.BMW;
import org.Nikolay.ford.Ford;
import org.Nikolay.mersedes.Mersedes;

public class Main {

	public static void main(String[] args) {

		Ford ford = new Ford();

		System.out.print("�������� Ford: ");
		System.out.println(ford.speed());

		Mersedes mersedes = new Mersedes();
		
		System.out.print("��� Mersedes: ");
		System.out.println(mersedes.weight());

		BMW bmw = new BMW();

		System.out.print("������ ������� BMW: ");
		System.out.println(bmw.consumption());

	}
}