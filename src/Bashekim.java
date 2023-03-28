
public class Bashekim extends Isgucu{
    
    private String unvan;
    private String uzmanlikAlani;
    private int hizmetSuresi;
    
    public Bashekim(String ad, String soyad, int kimlikNo,String unvan,String uzmanlikAlani,int hizmetSuresi) {
        super(ad, soyad, kimlikNo);
        this.unvan = unvan;
        this.uzmanlikAlani = uzmanlikAlani;
        this.hizmetSuresi = hizmetSuresi;
        
    }
    void calis() throws InterruptedException{
        String s1="Bashekim "+getAd()+" ,doktorlarin yıllık izinlerini denetleyor...";
        Thread.sleep(2500);
        String s2="Bashekim "+getAd()+" ,laboratuvar hizmetlerini denetliyor...";
        Thread.sleep(2500);
        
        System.out.println(s1);
        System.out.println(s2);
    }

    @Override
    void yakaKartiOku() {
        super.yakaKartiOku();
        System.out.println("Unvan: "+unvan);
        System.out.println("Uzmanlık alanı: "+uzmanlikAlani);
        System.out.println("Hizmet süresi: "+hizmetSuresi);
    }
    
    
    
}
