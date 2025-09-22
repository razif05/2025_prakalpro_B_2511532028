package pekan3;

import java.util.Scanner;

public class OperatorAssignment {
	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input angka -1: ");
		A1 = keyboard.nextInt();
		System.out.print("input angka -2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Assignment Penambahan");
		A1 += A2; // penambahan, sekarang A1 = 15
		System.out.println("Penambahan : " + A1);
		System.out.println("Assigment Pengurangan");
		A1 -= A2; //pengurangan
		System.out.println("Pengurangan : " + A1);
		System.out.println("Assignment Perkalian");
		A1 *= A2; //perkalian
		System.out.println("Perkalian : " + A1);
		System.out.println("Assigment Hasil Bagi");
		A1 /= A2; //pembagian
		System.out.println("Pembagian : " + A1);
		System.out.println("Assignment Sisa Bagi");
		A1 %= A2; //sisa bagi
		System.out.println("Sisa Bagi : " + A1);		
		
	}
}
