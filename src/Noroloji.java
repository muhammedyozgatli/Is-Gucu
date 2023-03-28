
public class Noroloji extends Isgucu{
    private String diploma_aldigi_kurum;
    
    public Noroloji(String ad, String soyad, int kimlikNo,String diploma_aldigi_kurum) {
        super(ad, soyad, kimlikNo);
        this.diploma_aldigi_kurum=diploma_aldigi_kurum;
    }
    
    void uyku_bozuklugu() throws InterruptedException{
        System.out.println("Doktor "+getAd()+" tarafindan uyku bozukluguna dair tedavis uygulaniyor...");
        Thread.sleep(2500);
        System.out.println("Tedavi tamamlandi.");
    }
    void bas_agrisi() throws InterruptedException{
        System.out.println("Doktor "+getAd()+" tarafindan bas agrisi tedavisi uygulaniyor...");
        Thread.sleep(2500);
        System.out.println("Tedavi tamamlandi.");
    }

    @Override
    void yakaKartiOku() { 
        super.yakaKartiOku();
        System.out.println("Diploma aldığı yükseköğretim kurumu: "+diploma_aldigi_kurum);
        
    }
    
}
