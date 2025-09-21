package pekan2;

public class TugasAlproPekan2 {

	public static void main(String[] args) {
		char inisial1 = 'R' ;
		char inisial2 = 'a' ;
		char inisial3 = 'z' ;
		char inisial4 = 'i' ;
		char inisial5 = 'f' ;
		long nim = 2511532028L;
		char jurusan1 = 'I',  jurusan2 = 'n', jurusan3 = 'f', jurusan4 = 'o', jurusan5 = 'r', jurusan6 = 'm' ;
		char jurusan7 = 'a', jurusan8 = 't', jurusan9 = 'i', jurusan10 = 'k', jurusan11 = 'a' ;
		char kelasif = 'B' ;
		int A = 70 ;
		int B = 50;
		int C = 30;
		int D = 0;
		float nilai_agama = 70.1f, nilai_mtk = 60.6f, nilai_kimia = 80.3f, nilai_oarsikom = 67.7f, nilai_pancasila = 58.8f ;
		float rata_rata ;
		boolean Aktif = true;
		
		
		rata_rata = (nilai_agama + nilai_mtk + nilai_kimia + nilai_oarsikom + nilai_pancasila)/5 ;
		System.out.println("=====Data Nilai Mahasiswa Semester 1=====");
		System.out.print("Nama Mahasiswa	: " + inisial1 + inisial2 + inisial3 + inisial4 + inisial5);
		System.out.println();
		System.out.println("Nim		: " + nim);
		System.out.print("Fakultas		: ");
		System.out.println("Teknologi Informasi");
		System.out.println("Jurusan		: " + jurusan1 + jurusan2 + jurusan3 +
				jurusan4 + jurusan5 + jurusan6 + jurusan7 + jurusan8 +
				jurusan9 + jurusan10 + jurusan11);
		System.out.println("Kelas		: " + kelasif);
		System.out.print("Status Mahasiswa	: ");
		if (Aktif == true) {
			System.out.println("Aktif");
		}else {
				System.out.println("Tidak Aktif");
		}
		
		System.out.println("Nilai Mahasiswa	: "); 
		System.out.print("agama			= " + nilai_agama);
		if (nilai_agama >= A == true) {
			System.out.println(" (A)"); 
		} else if (nilai_agama >= B == true) {
				System.out.println(" (B)"); 
		} else if (nilai_agama >= C == true) {
			System.out.println(" (C)");
		} else if (nilai_agama >= D == true) {
			System.out.println(" (D)");
		}
		System.out.print("Matematika		= " + nilai_mtk);
		if (nilai_mtk >= A == true) {
			System.out.println(" (A)"); 
		} else if (nilai_mtk >= B == true) {
				System.out.println(" (B)"); 
		} else if (nilai_mtk >= C == true) {
			System.out.println(" (C)");
		} else if (nilai_mtk >= D == true) {
			System.out.println(" (D)");
		}
		System.out.print("Kimia			= " + nilai_kimia);
		if (nilai_kimia >= A == true) {
			System.out.println(" (A)"); 
		} else if (nilai_kimia >= B == true) {
				System.out.println(" (B)"); 
		} else if (nilai_kimia >= C == true) {
			System.out.println(" (C)");
		} else if (nilai_kimia >= D == true) {
			System.out.println(" (D)");
		}
		System.out.print("Organisasi & Komputer	= " + nilai_oarsikom);
		if (nilai_oarsikom >= A == true) {
			System.out.println(" (A)"); 
		} else if (nilai_oarsikom >= B == true) {
				System.out.println(" (B)"); 
		} else if (nilai_oarsikom >= C == true) {
			System.out.println(" (C)");
		} else if (nilai_oarsikom >= D == true) {
			System.out.println(" (D)");
		}
		System.out.print("Pancasila		= " + nilai_pancasila);
		if (nilai_pancasila >= A == true) {
			System.out.println(" (A)"); 
		} else if (nilai_pancasila >= B == true) {
				System.out.println(" (B)"); 
		} else if (nilai_pancasila >= C == true) {
			System.out.println(" (C)");
		} else if (nilai_pancasila >= D == true) {
			System.out.println(" (D)");
		}
		System.out.print("Rata-Rata	: " + rata_rata);
		if (rata_rata >= A == true) {
			System.out.println(" (A)"); 
		} else if (rata_rata >= B == true) {
				System.out.println(" (B)"); 
		} else if (rata_rata >= C == true) {
			System.out.println(" (C)");
		} else if (rata_rata >= D == true) {
			System.out.println(" (D)");
		}
		//System.out.println("\033[1mLulus\033[0m");

		}
}