import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String islemler="1.Say�sal ��renciler\n"
				+ "2.E�it A��rl�k ��renciler\n"
				+ "3.��k�� i�in q ya bas�n..";
		
		
		while(true)
		{
			System.out.println(islemler);
			System.out.print("��lem se�iniz: ");
			String islem=scan.nextLine();
			
			if(islem.equals("1"))
			{
				
				//��renci ekleyerek her seferinde en y�ksek puan� alan� yazd�r .ba�ka bir fonk kullan.
				
				
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
				System.out.println("��k�l�yor...");
				break;
			}
			else
			{
				System.out.println("Hatal� i�lem...");
			}
		}
		
	}
	
	
	
	public static <Nesne extends Aday>Nesne birinci(Nesne n1,Nesne n2,Nesne n3)//Nesne extends Aday:Adaydan extends edilen objeler buraya girebilsin.
	//2.yaz�lan Nesne d�n�� tipi (String int gibi...)
	{
		if(n1.puanHesapla()>n2.puanHesapla() && n1.puanHesapla()>n3.puanHesapla())
			
		   return n1;
		
		else if(n2.puanHesapla()>n1.puanHesapla() && n2.puanHesapla()>n3.puanHesapla())
			return n2;
		
		else if (n3.puanHesapla()>n1.puanHesapla() && n3.puanHesapla()>n2.puanHesapla())
			return n3;
		else
			return n1;//3 � de e�itse herhangi birinin puan� d�ns�n.
		
	}

}
