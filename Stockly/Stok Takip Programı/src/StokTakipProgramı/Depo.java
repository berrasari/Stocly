package StokTakipProgramı;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Depo {
	private String ad;
ArrayList<Urun> urunler = new ArrayList<Urun>();




public Depo(String ad) {
	this.ad=ad;
	this.urunler=urunler;
}


public String getAd() {
	return ad;
}


public void setAd(String ad) {
	this.ad = ad;
}


public ArrayList<Urun> getUrunler() {
	return urunler;
}


public void setUrunler(ArrayList<Urun> urunler) {
	this.urunler = urunler;
}


public static void depoIslemleri(Depo anaDepo, ArrayList<Bayi> bayiler) {
	  Scanner scn2 = new Scanner(System.in);
		Scanner scn3= new Scanner(System.in);    
	    System.out.println("* *             DEPO ISLEMLERI        * *");
	    System.out.println("*         1. Bayilere Stok Gonder       *");        
	    System.out.println("*                 0. Cikis              *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");

	    int secenek = scn2.nextInt();
	    
	    switch (secenek) {
	    case 1:
	    	   System.out.println("*               STOK GONDERIMI                *"); 
	    	  	    	   
				for (int i = 0; i<bayiler.size();i++) {
				   	System.out.println("* NO:"+(i+1)+" // BAYI:"+bayiler.get(i).getAd());

				   }
			
			
	           System.out.println("* Bayi no giriniz:");

	           int secenek2 = scn2.nextInt();
	          
				System.out.println("* *   "+bayiler.get(secenek2-1).getAd().toUpperCase()+" :   STOK BILGISI      * *");
			

	           
				for (int j = 0; j<bayiler.get(secenek2-1).getUrunler().size();j++) {
				   	System.out.println("* NO: "+(j+1)+" "+bayiler.get(secenek2-1).getUrunler().get(j).getAd()+" // STOK:"+bayiler.get(secenek2-1).getUrunler().get(j).getStok());

				   }
			
	        			System.out.println("* Gondermek istediginiz urun no:");
	        			int urun=scn3.nextInt();
	        			System.out.println("* Miktar                  :");
	        			int miktar =scn2.nextInt();
	      			
	        			
	        		    if(miktar<=anaDepo.getUrunler().get(urun-1).getStok()) {
	        		     switch(secenek2) {
	        		     case 1:
	        		    	 bayiler.get(0).getUrunler().get(urun-1).setStok(bayiler.get(0).getUrunler().get(urun-1).getStok()+miktar);
	        		    
	        		    	 break;
	        		    	 
	        		     case 2:
	        		    	 bayiler.get(1).getUrunler().get(urun-1).setStok(bayiler.get(1).getUrunler().get(urun-1).getStok()+miktar);
	        		    	 break;
	        		     case 3:
	        		    	 bayiler.get(2).getUrunler().get(urun-1).setStok(bayiler.get(2).getUrunler().get(urun-1).getStok()+miktar);
	        		    	 break;
	        		     case 4:
	        		    	 bayiler.get(3).getUrunler().get(urun-1).setStok(bayiler.get(3).getUrunler().get(urun-1).getStok()+miktar);
	        		    	 break;
	        		     case 5:
	        		    	 bayiler.get(4).getUrunler().get(urun-1).setStok(bayiler.get(4).getUrunler().get(urun-1).getStok()+miktar);
	        		    	 break;

	        		     
	        		     }
        		    	 anaDepo.getUrunler().get(urun-1).setStok(anaDepo.getUrunler().get(urun-1).getStok()-miktar);

	        		    	
	        		    }
	        		    else {
	        		    	System.out.println("Ana depoda istenilen miktarda urun yoktur.Fabrika islemlerinden olusturunuz.");
	        		    }

	        			 			        			
	       	break;	
	    case 0:
	    	System.out.println("Program Sonlandirildi");
	        break;//exit loop
		 
	    }

}
}
