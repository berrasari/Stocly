package StokTakipProgramı;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	
    static Depo anaDepo = new Depo("anaDepo");
	static ArrayList<Kullanici> calisanlar = new ArrayList<Kullanici>();
    final static Fabrika fabrika = new Fabrika("Fabrika");
    final static BayiCalisan bc=new BayiCalisan("Bayi", 1);
    final static GenelMerkezCalisani gmc=new GenelMerkezCalisani("GenelMerkez", 2);
    final static Admin admin =new Admin("Admin", 0);
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	
        ArrayList<Bayi> bayiler = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        Test menu = new Test();
               
        Bayi b1 = new Bayi("Istanbul");
        Bayi b2 = new Bayi("Ankara");
        Bayi b3 = new Bayi("Rize");
        Bayi b4 = new Bayi("Antep");
        Bayi b5 = new Bayi("Mersin");
        bayiler.add(b1);
        bayiler.add(b2);
        bayiler.add(b3);
        bayiler.add(b4);
        bayiler.add(b5);

    	Urun u1 = new Urun("Mont", 500);
    	Urun u2 = new Urun("Ayakkabi", 500);
    	Urun u3 = new Urun("Elbise", 500);
    	Urun u4 = new Urun("Kazak", 500);
        Urun u5 = new Urun("Pantolon",500);
        
        Urun u6 = new Urun("Mont", 500);
    	Urun u7 = new Urun("Ayakkabi", 500);
    	Urun u8 = new Urun("Elbise", 500);
    	Urun u9 = new Urun("Kazak", 500);
        Urun u10 = new Urun("Pantolon",500);
        
        Urun u11 = new Urun("Mont", 500);
    	Urun u12 = new Urun("Ayakkabi", 500);
    	Urun u13 = new Urun("Elbise", 500);
    	Urun u14 = new Urun("Kazak", 500);
        Urun u15 = new Urun("Pantolon",500);
        
        Urun u16 = new Urun("Mont", 500);
    	Urun u17 = new Urun("Ayakkabi", 500);
    	Urun u18 = new Urun("Elbise", 500);
    	Urun u19 = new Urun("Kazak", 500);
        Urun u20= new Urun("Pantolon",500);
        
        Urun u21 = new Urun("Mont", 500);
    	Urun u22 = new Urun("Ayakkabi", 500);
    	Urun u23 = new Urun("Elbise", 500);
    	Urun u24 = new Urun("Kazak", 500);
        Urun u25 = new Urun("Pantolon",500);
        
        Urun u26 = new Urun("Mont", 500);
    	Urun u27 = new Urun("Ayakkabi", 500);
    	Urun u28 = new Urun("Elbise", 500);
    	Urun u29 = new Urun("Kazak", 500);
        Urun u30 = new Urun("Pantolon",500);
        
        b1.getUrunler().add(u1);
        b1.getUrunler().add(u2);
        b1.getUrunler().add(u3);
        b1.getUrunler().add(u4);
        b1.getUrunler().add(u5);
        
        b2.getUrunler().add(u6);
        b2.getUrunler().add(u7);
        b2.getUrunler().add(u8);
        b2.getUrunler().add(u9);
        b2.getUrunler().add(u10);
        
        b3.getUrunler().add(u11);
        b3.getUrunler().add(u12);
        b3.getUrunler().add(u13);
        b3.getUrunler().add(u14);
        b3.getUrunler().add(u15);
        
        b4.getUrunler().add(u16);
        b4.getUrunler().add(u17);
        b4.getUrunler().add(u18);
        b4.getUrunler().add(u19);
        b4.getUrunler().add(u20);
        
        b5.getUrunler().add(u21);
        b5.getUrunler().add(u22);
        b5.getUrunler().add(u23);
        b5.getUrunler().add(u24);
        b5.getUrunler().add(u25);
        
        anaDepo.urunler.add(u26);
        anaDepo.urunler.add(u27);
        anaDepo.urunler.add(u28);
        anaDepo.urunler.add(u29);
        anaDepo.urunler.add(u30);

        calisanlar.add(admin);
        calisanlar.add(bc);
        calisanlar.add(gmc);

        do {
        	    System.out.println("* * * * * * *  GIRIS * * * * * * *");
        	    System.out.println("*       KULLANICI ADI  :         *");
        	    Scanner scn3 = new Scanner(System.in);
        		String ad=scn3.nextLine();

        	    System.out.println("*          SIFRE (rakam) :        *");
        	    Scanner scn2=new Scanner(System.in);
        		int sifre=scn2.nextInt();

        		System.out.println("* * * * * * * * * * * * * * * * *");
                 int option=kullanicigirisi(ad,sifre,calisanlar);
        		
        		
            switch (option) {
                case 1:
                    adminGirisi(calisanlar,bayiler);
                    break;
                case 2:
                    bayiGirisi(bayiler, anaDepo);
                    break;
                case 3:
                    GenelMerkezGirisi(anaDepo,bayiler);
                    break;
                              
            }
            System.out.println();
            if(option == 0) {
                System.out.println("Hatali sifre ya da kullanici adi girdiniz.");

            	System.out.println("Program Sonlandirildi");
                break;//exit loop
            }

        } while (true);
    }

    public static void adminGirisi(ArrayList<Kullanici> calisanlar,ArrayList<Bayi> bayiler) throws IOException, ClassNotFoundException {
        Scanner scn = new Scanner(System.in);
    
            	do {
                	System.out.println("* * * *  ADMIN PANEL  * * * *");
                    System.out.println("*    1. Personel Islemleri  *");
                    System.out.println("*     2. Stok Goruntuleme   *"); 
                    System.out.println("*         0. Cikis          *");
                	System.out.println("* * * * * * * * * * * * * * *");

                    System.out.print("Secim yapiniz 0 - 1 - 2: ");
                    int option = scn.nextInt();
                    
                    switch (option) {
                        case 1:
                            admin.personelIslemleri(admin,calisanlar);
                            break;
                          case 2:
                            admin.stokGoruntuleme(bayiler);
                            break;
                          case 3:
                            fabrika.fabrikaIslemleri(anaDepo);
                            break;
                                      
                    }
                    System.out.println();
                    if(option == 0) {
                    	System.out.println("Program Sonlandirildi");
                        break;//exit loop
                    }

                } while (true);
            }	
 	
     
    public static void GenelMerkezGirisi(Depo anaDepo,ArrayList<Bayi> bayiler) throws ClassNotFoundException, IOException {Scanner scn = new Scanner(System.in);
    
       	do {
            	System.out.println("* * * *  GENEL MERKEZ PANEL * * * *");
                System.out.println("*        1. Depo  Islemleri       *");
                System.out.println("*       2. Fabrika Islemleri      *");
                System.out.println("*        3. Stok Goruntuleme      *"); 
                System.out.println("*             0. Cikis            *");
            	System.out.println("* * * * * * * * * * * * * * * * * *");
                
                System.out.print("Secim yapiniz 0 - 1 - 2 - 3: ");
                int option = scn.nextInt();
                
                switch (option) {
                    case 1:
                        anaDepo.depoIslemleri(anaDepo,bayiler);
                        break;
                    case 2:
                        fabrika.fabrikaIslemleri(anaDepo);
                        break;
                    case 3:
                        admin.stokGoruntuleme(bayiler);
                         break;
                                           }
                System.out.println();
                if(option == 0) {
                	System.out.println("Program Sonlandirildi");
                    break;//exit loop
                }
             
            } while (true);
                }
        
     
    
 public static void bayiGirisi(ArrayList<Bayi> bayiler,Depo anaDepo) throws ClassNotFoundException, IOException {Scanner scn = new Scanner(System.in);
    
    
                
        	do {
            	System.out.println("* * * * *   BAYI PANEL  * * * * *");
                System.out.println("*         1. Urun Satisi        *");
                System.out.println("*      2. Stok Goruntuleme      *");
                System.out.println("*            0. Cikis           *");
            	System.out.println("* * * * * * * * * * * * * * * * *");
                
                System.out.print("Secim yapiniz 0 - 1 - 2 : ");
                int option = scn.nextInt();
                
                switch (option) {
                    case 1:
                        admin.UrunSatisi(anaDepo,bayiler);
                        break;
                   
                    case 2:
                        admin.stokGoruntuleme(bayiler);
                         break;
                                           }
                System.out.println();
                if(option == 0) {
                	System.out.println("Program Sonlandirildi");
                    break;//exit loop
                }
             
            } while (true);
                }
        
   
    
 public static int kullanicigirisi(String ad,int sifre,ArrayList<Kullanici> calisanlar) {
	 int option = 0;
		for (int i = 0; i<calisanlar.size();i++) {
         if (calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad) && calisanlar.get(i).getSifre()==sifre && calisanlar.get(i) instanceof Admin) {
              option = 1;
         	System.out.println("Giris Yapildi.");
         	break;}
         else if(calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad) && calisanlar.get(i).getSifre()==sifre && calisanlar.get(i) instanceof BayiCalisan) {
         	option = 2;
         	break;
         }
         else if (calisanlar.get(i).getKullaniciAdi().equalsIgnoreCase(ad) && calisanlar.get(i).getSifre()==sifre && calisanlar.get(i) instanceof GenelMerkezCalisani) {
         	option = 3;
         	break;
         }
        
		}
	 return option;
 }

 }
 



