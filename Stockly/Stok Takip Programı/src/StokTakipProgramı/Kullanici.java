package StokTakipProgramı;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Kullanici {
	private String kullaniciAdi;
	private int sifre;
	
	public Kullanici(String kullaniciAdi, int sifre) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
    
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public int getSifre() {
		return sifre;
	}
    
	public void setSifre(int sifre) {
		this.sifre = sifre;
	}


	@Override
	public String toString() {
		return " "+kullaniciAdi+" "+sifre;
	}

	  public static void stokGoruntuleme(ArrayList<Bayi> bayiler) throws IOException, ClassNotFoundException {
	        Scanner scn2 = new Scanner(System.in);
	    	Scanner scn3= new Scanner(System.in);    
	        System.out.println("* *      STOK GORUNTULEME     * *");
	        
	        for (int i = 0; i<bayiler.size();i++) {
	        	System.out.println("*NO:"+(i+1)+" // BAYI:"+bayiler.get(i).getAd());

	        }
	        System.out.println("*Bayi no giriniz:");

	        int secenek = scn2.nextInt();
	        System.out.println("* *   "+bayiler.get(secenek-1).getAd().toUpperCase()+" :   STOK BILGISI      * *");

	        for (int j = 0; j<bayiler.get(secenek-1).getUrunler().size();j++) {
	        	System.out.println("*" +bayiler.get(secenek-1).getUrunler().get(j).getAd()+" // STOK:"+bayiler.get(secenek-1).getUrunler().get(j).getStok());

	        }

	        }
		public static void UrunSatisi(Depo anaDepo ,ArrayList<Bayi> bayiler) {
			 for (int i = 0; i<bayiler.size();i++) {
				   	System.out.println("* NO:"+(i+1)+" // BAYI:"+bayiler.get(i).getAd());

				   }
			
			
		    System.out.println("* Bayi no giriniz:");

		    Scanner scn2=new Scanner(System.in);
			int secenek2 = scn2.nextInt();
		   
				System.out.println("* *   "+bayiler.get(secenek2-1).getAd().toUpperCase()+" :   STOK BILGISI      * *");
			

		    
				for (int j = 0; j<bayiler.get(secenek2-1).getUrunler().size();j++) {
				   	System.out.println("* "+bayiler.get(secenek2-1).getUrunler().get(j).getAd()+" // STOK:"+bayiler.get(secenek2-1).getUrunler().get(j).getStok());

				   }
			
		 			System.out.println("Satis yaptiginiz  urun:");
		 			Scanner scn3=new Scanner(System.in);
					String urun=scn3.nextLine();
		 			System.out.println("Satis miktari         :");
		 			int miktar =scn2.nextInt();
		 			
		 			for (int j = 0; j<anaDepo.urunler.size();j++) {
		 				if(bayiler.get(secenek2-1).getUrunler().get(j).getAd().equalsIgnoreCase(urun)) {
		 					if(miktar<=anaDepo.urunler.get(j).getStok()) {
		 					bayiler.get(secenek2-1).getUrunler().get(j).setStok(bayiler.get(secenek2-1).getUrunler().get(j).getStok()-miktar);
		 					break;
		 				}
		 					else {
		 						System.out.println("Stokta istediginiz miktarda ürün yoktur.");
		 					}
		 					}}
		 			
		 			
		 			
			 
		 }
	

}
