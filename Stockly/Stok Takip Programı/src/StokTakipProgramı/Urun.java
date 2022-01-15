package StokTakipProgramı;

public class Urun {
 private String ad;
 private int stok;

public Urun() {
	this.ad="default";
	this.stok=500;
}
 
 
public Urun(String ad, int stok) {
	super();
	this.ad = ad;
	this.stok = stok;
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public int getStok() {
	return stok;
}
public void setStok(int stok) {
	this.stok = stok;
}
 
}
