package com.example.lab1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World!!!\n");
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("학번 입력: ");
		int num = scan.nextInt();
		System.out.println("[" + num + " " + name + "]님 환영합니다~!");
	}
}
