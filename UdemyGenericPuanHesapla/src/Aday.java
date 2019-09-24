import java.util.Scanner;

public abstract class Aday {
	
	private int turkce;
	private int matematik;
	private int edebiyat;
	private int fizik;
	private String isim;
	//public Aday(int turkce, int matematik, int edebiyat, int fizik,String isim) {
	public Aday() {	
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Ýsim?:");
		this.isim=scan.nextLine();
		
		
		
		System.out.print("Türkçe?:");
		this.turkce=scan.nextInt();
		scan.nextLine();
		
		System.out.print("Matematik?:");
		this.matematik=scan.nextInt();
		scan.nextLine();
		
		System.out.print("Edebiyat?:");
		this.edebiyat=scan.nextInt();
		scan.nextLine();
		
		
		System.out.print("Fizik?:");
		this.fizik=scan.nextInt();
		scan.nextLine();
		
		
	
		
	}
	public int getTurkce() {
		return turkce;
	}
	public void setTurkce(int turkce) {
		this.turkce = turkce;
	}
	public int getMatematik() {
		return matematik;
	}
	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}
	public int getEdebiyat() {
		return edebiyat;
	}
	public void setEdebiyat(int edebiyat) {
		this.edebiyat = edebiyat;
	}
	public int getFizik() {
		return fizik;
	}
	public void setFizik(int fizik) {
		this.fizik = fizik;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	abstract int puanHesapla();
	
	

}
