package com.cg.ui;

import com.cg.service.Calcy;

public class Main {

	public static void main(String[] args) {
		Calcy calcy=new Calcy();
		System.out.println(calcy.add(3,4));
		System.out.println(calcy.substract(10, 8));\
		System.out.println(calcy.multiply(3,4));

	}

}
