package Pekan7;

public class Akun {

	private String nama, email, password;
	private int PIN;
	
	public void setemail (String email) {
		this.email=email;
	}
	public void setnama (String nama) {
		this.nama=nama;
	}
	public void setpassword (String password) {
		this.password=password;
	}
	public void setPIN (int PIN) {
		this.PIN=PIN;
	}
	public String getemail() {
		return email;
	}
	public String getnama() {
		return nama;
	}
	public String getpassword() {
		return password;
	}
	public int PIN() {
		return PIN;
	}
	public void cetak() {
		System.out.println("Nama		:" + nama);
		System.out.println("Email		:" + email);
		System.out.println("ID Pengguna	:" + nama + PIN);
	}
	public void cetak2() {
		System.out.println("=== Uji Tipe Data ===");
		System.out.println(PIN + 10) ;
		System.out.println("" + PIN + 10);
	}
	public boolean isemailValid() {
		return email.contains("@") && email.contains(".");
	}
	public boolean ispasswordValid() {
		return password != null && password.length() >= 8;
	}
}
