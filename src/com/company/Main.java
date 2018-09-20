package com.company;
import java.util.Scanner;

////////////////////////////////////
//Task 1
public class Main {
	public static void main(String[] args) {
		double a;
		double b;
		double c=0;
		int n;
		System.out.print("Введите  а: ");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		System.out.print("Введите b: ");
		b = in.nextDouble();
		System.out.print("Введите n: ");
		n = in.nextInt();
		c=(double) Math.pow(a,n)+(double)Math.pow(b,n);
		c=(double)Math.pow(c,n);
		System.out.print(c);
	}}


//////////////////////////////////
//Task 2
/*public class Main {
	public static void main(String[] args) {
		float x=0;
		int a=2;
		for(float i=1f;i<=10000f;i++) {
			if(a % 2==0) {
				x += 1 / i;
			}else{
				x-=1 /i;
			}
			a++;
			//System.out.println(x);
		}
		System.out.print(x);
	}}*/
