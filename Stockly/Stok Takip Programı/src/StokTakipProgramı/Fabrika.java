package StokTakipProgramı;

import java.io.IOException;
import java.util.Scanner;

public class Fabrika {
	private String ad;

	public Fabrika(String ad) {
		super();
		this.ad = ad;
	}

	  public static void fabrikaIslemleri(Depo anaDepo) throws IOException, ClassNotFoundException {
	        Scanner scn2 = new Scanner(System.in);
	    	Scanner scn3= new Scanner(System.in);    
	        System.out.println("* *     FABRIKA ISLEMLERI    * *");
	        System.out.println("*          1. Uret             *");        
	        System.out.println("*         0. Cikis             *");
	    	System.out.println("* * * * * * * * * * * * * * *  *");

	        int secenek = scn2.nextInt();
	        
	        switch (secenek) {
	        case 1:
	        	   System.out.println("*               ANA DEPO STOK                *"); 
	        	  

	        for (int j = 0; j<anaDepo.urunler.size();j++) {
		System.out.println("* "+anaDepo.urunler.get(j).getAd()   +"  // STOK:"+anaDepo.urunler.get(j).getStok());

	}
			System.out.println("* Uretmek istediginiz urun:");
			String urun=scn3.nextLine();
			System.out.println("* Miktar                  :");
			int miktar =scn2.nextInt();
			
			for (int j = 0; j<anaDepo.urunler.size();j++) {
				if(anaDepo.urunler.get(j).getAd().equalsIgnoreCase(urun)) {
					anaDepo.urunler.get(j).setStok(anaDepo.urunler.get(j).getStok()+miktar);
					break;
				}

			}
			

	        }	
	}

}
