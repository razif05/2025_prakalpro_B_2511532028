package pekan4;

import java.util.Scanner;

public class TugasAlproPekan4_2511532028 {

	public static void main(String[] args) {
				 Scanner input = new Scanner(System.in);

			        String[] kursi = {"A1","A2","A3","A4","A5","B1","B2","B3","B4","B5"};
			        boolean[] statuskursi = new boolean[kursi.length];
			        
			        System.out.print("Masukkan nama pembeli: ");
			        String nama = input.nextLine();

			        System.out.println("Pilih hari : ");
			        System.out.println("1 = Senin-Kamis"); 
			        System.out.println("2 = Jumat"); 
			        System.out.println("3 = Sabtu-Minggu");
			        System.out.print("Pilihan Anda (1-3): ");
			        int hari = input.nextInt();
			        System.out.println();
			        
			        System.out.println("Pilih waktu tayang : ");
			        System.out.println("1 = Pagi 	(09.30-11.30)");
			        System.out.println("2 = Siang	(12.00-17.00)");
			        System.out.println("3 = Malam	(17.30-22.30)");
			        System.out.print("Pilihan Anda (1-3): ");
			        int waktu = input.nextInt();
			        System.out.println();

			        System.out.println("Pilih jenis studio : ");
			        System.out.println("1 = Regular"); 
			        System.out.println("2 = Deluxe");
			        System.out.println("3 = Premium");
			        System.out.print("Pilihan Anda (1-3): ");
			        int studio = input.nextInt();
			        
			        System.out.print("Masukkan jumlah tiket: ");
			        int jumlahTiket = input.nextInt();
			        
			        // tempat
			        if (jumlahTiket > kursi.length) {
			            System.out.println("Jumlah tiket melebihi kapasitas kursi tersedia!");
			            return; 
			        }   
			        input.nextLine();
			        
			        String[] kursiDipilih = new String[jumlahTiket];
			        for (int i = 0; i < jumlahTiket; i++) {  
			            System.out.println("\nDaftar Kursi Tersedia:");
			            for (int j = 0; j < kursi.length; j++) {  
			                if (!statuskursi[j]) {
			                    System.out.print(kursi[j] + " ");
			                } else {
			                    System.out.print("[X] ");
			                }
			            }
			            System.out.println();

			            System.out.print("Pilih kursi ke-" + (i + 1) + ": ");
			            String pilih = input.nextLine().toUpperCase();

			            boolean valid = false;   
			            for (int j = 0; j < kursi.length; j++) {
			                if (kursi[j].equals(pilih) && !statuskursi[j]) {
			                    statuskursi[j] = true; 
			                    kursiDipilih[i] = pilih;
			                    valid = true;
			                    break;
			                }
			            }
			            if (!valid) {
			                System.out.println("Kursi tidak valid atau sudah terisi. Silakan pilih lagi.");
			                i--; // ulangi
			            }
			            System.out.println();
			        }

			        int harga = 0;

			        if (hari == 1) { 
			            if (studio == 1) harga = 30000;
			            else if (studio == 2) harga = 50000;
			            else if (studio == 3) harga = 70000;
			        } else if (hari == 2) { 
			            if (studio == 1) harga = 35000;
			            else if (studio == 2) harga = 55000;
			            else if (studio == 3) harga = 75000;
			        } else if (hari == 3) { 
			            if (studio == 1) harga = 40000;
			            else if (studio == 2) harga = 60000;
			            else if (studio == 3) harga = 80000;
			        }

			        // biaya tambahan
			        if (waktu == 2) { 
			            harga += 5000;
			        } else if (waktu == 3) { 
			            harga += 10000;
			        }

			        // total
			        int totalHarga = harga * jumlahTiket;
			        totalHarga = harga * jumlahTiket;
			        double diskon = 0;
					if (jumlahTiket >= 5) {
			            diskon = 0.2 * totalHarga;
			        } else if (jumlahTiket >= 2) {
			            diskon = 0.1 * totalHarga;
			        }
			        double bayar = totalHarga - diskon;

			        // output
			        System.out.println("\n===== STRUK PEMBELIAN TIKET =====");
			        System.out.println("Nama Pembeli 	: " + nama);
			        System.out.println("Jumlah Tiket 	: " + jumlahTiket);
			        System.out.println("Hari         	: " + (hari==1?"Senin-Kamis":hari==2?"Jumat":"Sabtu-Minggu"));
			        System.out.println("Waktu Tayang 	: " + (waktu==1?"Pagi":waktu==2?"Siang":"Malam"));
			        System.out.println("Studio       	: " + (studio==1?"Regular":studio==2?"Deluxe":"Premium"));
			        System.out.print("Tempat Duduk 	: ");
			        for (String k : kursiDipilih) {
			            System.out.print(k + " ");
			        }
			        System.out.println();
			        System.out.println("Harga per Tiket	: Rp " + harga);
			        System.out.println("Diskon       	: Rp " + diskon);
			        System.out.println("Total Bayar    	: Rp " + bayar);
			        System.out.println("=================================");
			    }
			

	}


