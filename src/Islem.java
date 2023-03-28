
import java.util.Scanner;


public class Islem {
    public static void main(String[] args) throws InterruptedException {
        Bashekim b=new Bashekim("Nurgül" ,"Tan", 4449, "Profesör", "İç hastalıkları", 20);
        Kardiyoloji k=new Kardiyoloji("Mehmet" ,"Gül", 1248, "Doçent");
        Noroloji n=new Noroloji("Ali", "Veli", 6655, "SUBÜ");
        Scanner scanner=new Scanner(System.in);
       String komut="Hastanemizin Sistemine Hosgeldniz...\n"
               + "Yapılabilecek işlemler:\n"
               + "Bashekimiyle ile ilgili bilgiler için 1'e\n"
               + "Kardiyoloji bölümüyle ile ilgili işlemler için 2'ye\n"
               + "Noroloji bölümüyüyle ile ilgili işlemler için 3'e\n"
               + "Sistemden çıkmak için 0'a basınız.";
       while(true){
           System.out.println("//////////////////////////////////////");
           System.out.println(komut);
           System.out.println("//////////////////////////////////////");
           System.out.println("");
           System.out.print("Lütfen işlem yapmak istediğiniz işlemi seçin:");
           String secim=scanner.nextLine();
           while(true){
               if(secim.equals("0")){
                   System.out.println("Sistemden çıkılıyor...");
                   Thread.sleep(2500);
                   return;
               }
               else if(secim.equals("1")){
                   System.out.println("Bashekimi birimine hosgeldiniz\n"
                           + "Bashekim bilgileri tanımlanıyor...");
                   Thread.sleep(2000);
                   b.yakaKartiOku();
                   b.calis();
                   System.out.println("Bashekim çalışmasını bitirdi.");
                   break;
            
               }
               else if(secim.equals("2")){
                   System.out.println("Kardiyoloji bölümüne hoşheldiniz\n"
                           + "Kardiyoloji doktorun bilgileri tanımlanıyor...");
                   Thread.sleep(2000);
                   k.yakaKartiOku();
                   String s="Kalp krizi riskini hesaplamak için 1'e\n"
                           + "EKG çektirmek için 2'ye basınız";
                   System.out.println(s);
                   String secim1=scanner.nextLine();
                   if(secim1.equals("1")){
                       k.riskHesapla();
                       break;
                   }
                   else if(secim1.equals("2")){
                       k.ekg_hesapla();
                       break;
                       
                   }
                   else{
                       System.out.println("Hatali giriş yaptınız");
                   break;
                   }
               }
               else if(secim.equals("3")){
                   System.out.println("Noroloji bölümüne hoşgeldiniz\n"
                           + "Doktor bilgileri tanımlanıyor...");
                   Thread.sleep(2000);
                   n.yakaKartiOku();
                   
                  String nor="Uyku bozukluğuna baktırmak için 1'e"
                           + "Baş ağrısı için 2'ye basınız";
                   System.out.println(nor);
                   String secim2=scanner.nextLine();
                   if(secim2.equals("1")){
                       n.uyku_bozuklugu();
                       break;
                   }
                   else if(secim2.equals("2")){
                       n.bas_agrisi();
                       break;
                   }
                   else {
                       System.out.println("Hatali giriş yaptınız.");
                   break;
                   }
               }
           }
           
       }
    }
    
}
