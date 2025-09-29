package pekan4;

import java.util.Scanner;

public class multiif {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a = new Scanner(System.in);
		System.out.print("Input umur anda : ");
		umur = a.nextInt();
		System.out.print("Apakah Anda Sudah Punya SIM : ");
		sim = a.next().charAt(0);
		a.close();
			if((umur >= 17) && (sim == 'y')) {
				System.out.println("Anda Sudah Dewasa dan Boleh Bawa Motor");
			}
			if ((umur>=17) && (sim != 'y')) {
				System.out.println("Anda Sudah Dewasa Tetapi Belum Boleh Bawa Motor");
			}
			if ((umur < 17) && (sim != 'y')) {
				System.out.println("Anda Belum Cukup Umur Untuk Membawa Motor");
			}
			if ((umur < 17) && (sim =='y')) {
				System.out.println("Anda Belum Cukup Umur Untuk Mempunyai SIM");
				
			}
	}

}
