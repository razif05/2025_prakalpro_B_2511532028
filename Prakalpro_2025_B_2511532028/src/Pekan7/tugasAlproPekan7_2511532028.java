package Pekan7;

import java.util.Scanner;

public class tugasAlproPekan7_2511532028 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("=== Registrasi Akun Baru ===");
	System.out.print("Masukkan Username	: ");
	String x = input.nextLine().toLowerCase();
	System.out.print("Masukkan Email		: ");
	String y = input.nextLine().toUpperCase();
	System.out.print("Masukkan Password	: ");
	String z = input.nextLine();
	System.out.print("Masukkan PIN		: ");
	int p = input.nextInt();
	Akun a = new Akun();
	a.setnama(x);
	a.setemail(y);
	a.setpassword(z);
	a.setPIN(p);
	System.out.println();
	a.isemailValid();
	if(!a.isemailValid()) {
		System.out.println("=== Registrasi Gagal ===");
		System.out.println("email harus mengandung '@' dan '.' ");
		System.out.println("Coba lagi");
		return ;
	}
	a.ispasswordValid();
	if(!a.ispasswordValid()) {
		System.out.println("=== Registrasi Gagal ===");
		System.out.println("Password harus mengandung minimal 8 karakter");
		System.out.println("Coba lagi");
		return ;
	}
	System.out.println("=== Registrasi Berhasil ===");
	a.cetak();
	System.out.println();
	a.cetak2();
	input.close();
	}
}
