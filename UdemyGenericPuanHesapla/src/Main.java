import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String islemler="1.Sayýsal Öðrenciler\n"
				+ "2.Eþit Aðýrlýk Öðrenciler\n"
				+ "3.Çýkýþ için q ya basýn..";
		
		
		while(true)
		{
			System.out.println(islemler);
			System.out.print("Ýþlem seçiniz: ");
			String islem=scan.nextLine();
			
			if(islem.equals("1"))
			{
				
				//Öðrenci ekleyerek her seferinde en yüksek puaný alaný yazdýr .baþka bir fonk kullan.
				
				
				Sayisal ogr=new Sayisal();
				Sayisal ogr2=new Sayisal();
				Sayisal ogr3=new Sayisal();
				
				
                Sayisal birinci_ogr=birinci(ogr, ogr2, ogr3);
				
				System.out.println("Birinci:"+birinci_ogr.getIsim());
				System.out.println("Puan: "+birinci_ogr.puanHesapla());
				
				
				
				
				
			}
			else if(islem.equals("2"))
			{
				EsitAgirlik ogr=new EsitAgirlik();
				EsitAgirlik ogr2=new EsitAgirlik();
				EsitAgirlik ogr3=new EsitAgirlik();
				
				
				EsitAgirlik birinci_ogr=birinci(ogr, ogr2, ogr3);
				
				System.out.println("Birinci:"+birinci_ogr.getIsim());
				System.out.println("Puan: "+birinci_ogr.puanHesapla());
			}
			else if(islem.equals("q"))
			{
				System.out.println("Çýkýlýyor...");
				break;
			}
			else
			{
				System.out.println("Hatalý iþlem...");
			}
		}
		
	}
	
	
	
	public static <Nesne extends Aday>Nesne birinci(Nesne n1,Nesne n2,Nesne n3)//Nesne extends Aday:Adaydan extends edilen objeler buraya girebilsin.
	//2.yazýlan Nesne dönüþ tipi (String int gibi...)
	{
		if(n1.puanHesapla()>n2.puanHesapla() && n1.puanHesapla()>n3.puanHesapla())
			
		   return n1;
		
		else if(n2.puanHesapla()>n1.puanHesapla() && n2.puanHesapla()>n3.puanHesapla())
			return n2;
		
		else if (n3.puanHesapla()>n1.puanHesapla() && n3.puanHesapla()>n2.puanHesapla())
			return n3;
		else
			return n1;//3 ü de eþitse herhangi birinin puaný dönsün.
		
	}

}
