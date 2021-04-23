package basic.dev;

import java.text.NumberFormat;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(2);
		
		//thuoc tinh
		int a,b;
		
		//Nhap vao hai so nguyen
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		b = sc.nextInt();
		
		//in ra kq
		float d = (float) a/b;
	
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d x %d = %d\n",a,b,a*b);
		System.out.printf("%d : %d = ",a,b);
		System.out.println(Math.ceil(d*100)/100);
		
		// khai bao c
		String c;
		
		//Toan tu so sanh 
		c = a>b?">":a==b?"=":"<";
		
		//in kq
		System.out.println("Ket qua so sanh cua a voi b la: " + c);
	
		
	}

}
