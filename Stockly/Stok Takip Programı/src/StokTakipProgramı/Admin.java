package StokTakipProgramı;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Kullanici{

	public Admin(String kullaniciAdi, int sifre) {
		super(kullaniciAdi, sifre);		
	}
 
	 public static void personelIslemleri(Admin admin,ArrayList<Kullanici> calisanlar) throws IOException, ClassNotFoundException {
	        Scanner scn2 = new Scanner(System.in);
	    	Scanner scn3= new Scanner(System.in);    
	        System.out.println("* *    PERSONEL ISLEMLERI   * *");
	        System.out.println("*    1. Yeni Personel Ekle    *");
	        System.out.println("*     2. Personel Listesi     *"); 
	        System.out.println("*       3.Personel Sil        *");          
	        System.out.println("*         0. Cikis            *");
	    	System.out.println("* * * * * * * * * * * * * * * *");

	    	int secenek = scn2.nextInt();
	        switch (secenek) {
	        case 1:
	        	   calisanlar.add(yeniPersonel(calisanlar));
	               break;
	        	
	        case 2:
	        	   System.out.println("*             PERSONEL BILGILERI               *"); 

	        	   for (int i = 0; i<calisanlar.size();i++) {
					System.out.println("* NO:"+(i+1)+" // KULLANICI-ADI:"+((Kullanici) calisanlar.get(i)).getKullaniciAdi()+" SIFRE:"+((Kullanici) calisanlar.get(i)).getSifre());
					
				}
	        	   break;
	        	   
	        case 3:
	       	   System.out.println("*                       PERSONEL SILME                       *"); 
	       	for (int i = 0; i<calisanlar.size();i++) {
				System.out.println("* NO:"+(i+1)+" // KULLANICI-ADI:"+((Kullanici) calisanlar.get(i)).getKullaniciAdi());
			
			}
	      	   System.out.println("* Silmek istediginiz personel no:                              *"); 
	           int sil = scn3.nextInt();
	           calisanlar.remove(sil-1);
	      	   System.out.println("*                       Personel Silindi                     *"); 
	      	   break;
				}
	        }
	 public static Kullanici yeniPersonel(ArrayList<Kullanici> calisanlar) {
	        boolean dogru=true;
	        Scanner scn2 = new Scanner(System.in);
	    	Scanner scn3= new Scanner(System.in);   

		 System.out.println("*               PERSONEL EKLEME                *"); 
  	   System.out.println("*  BAYI CALISANI[1]   ANAMERKEZ CALISANI[2]   *"); 
         int secenek2 = scn2.nextInt();
         if(secenek2==1) {
      	   System.out.println("* KULLANICI ADI:  *"); 
             String ad=scn3.nextLine();
             for(int i = 0;i<=calisanlar.size()+1;i++) {
          	 if(calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad)!=dogru)  {
          		 System.out.println("* SIFRE:          *"); 
	                   int sifre =scn2.nextInt();
	                   BayiCalisan newBayiCalisan =new BayiCalisan(ad, sifre);
	                   return (newBayiCalisan);
          	 }
          	 else if(calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad)!=dogru) {
          		 System.out.println("Girdiginiz kullanici adina sahip calisan vardir,bu kullanici adiyla yeni olusturamazsiniz.");
          		 break;
          	 }
          	 
             }
         }
         else if(secenek2 == 2) {
      	         System.out.println("* KULLANICI ADI:          *"); 
             String ad=scn3.nextLine();
             for(int i = 0;i<=calisanlar.size()+1;i++) {
          	 if(calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad)!=dogru)  {
          		 System.out.println("* SIFRE (rakam):          *"); 
                   int sifre =scn2.nextInt();
                   GenelMerkezCalisani newGenelMerkezCalisani =new GenelMerkezCalisani(ad, sifre);
                   return(newGenelMerkezCalisani);
          	 }
          	 else if(calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad)==dogru) {
          		 System.out.println("Girdiginiz kullanici adina sahip calisan vardir,bu kullanici adiyla yeni olusturamazsiniz.");
          		 break;
          	 }
             }
         }
		return null;  
         
	 }
}
