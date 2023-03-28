
public class Kardiyoloji extends Isgucu{
    
    private String unvan;
    
    public Kardiyoloji(String ad, String soyad, int kimlikNo,String unvan) {
        super(ad, soyad, kimlikNo);
        this.unvan=unvan;
    }
    
    void riskHesapla() throws InterruptedException{
        System.out.println(unvan+" doktor "+getAd()+" tarafindan kalp krizi riski hesaplaniyor...");
        Thread.sleep(2500);
        System.out.println("İnceleme başarıyla tamamlandı.");
    }
    void ekg_hesapla() throws InterruptedException{
        System.out.println(unvan+" doktor "+getAd()+" tarafindan ekg çekiliyor...");
        Thread.sleep(2500);
        System.out.println("EKG başarıyla çekildi.");
    
    }

    @Override
    void yakaKartiOku() {
        super.yakaKartiOku(); 
        System.out.println("Unvan: "+unvan);
        
    }
    
}
