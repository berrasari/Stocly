package StokTakipProgramı;

import java.util.ArrayList;

public class Bayi {
	private String ad;
	private ArrayList<Urun> urunler = new ArrayList<Urun>();


	public Bayi(String ad) {
		super();
		this.ad = ad;
		this.urunler = urunler;
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


	
}
