package pekan3;

import java.util.Scanner;

public class hitungvolume {

	public static void main(String[] args) {
		int r;
		int t;
		float π = 3.14f;
		float V;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("====Menghitung Volume Kerucut====");
		System.out.print("Masukkan Jari-Jari Kerucut = ");
		r = keyboard.nextInt();
		System.out.print("Masukkan Tinggi Tabung = ");
		t = keyboard.nextInt();
		keyboard.close();
		V = π*r*r*t*1/3;
		System.out.print("Volume Kerucut = " + V);

	}

}
