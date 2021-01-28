// 200541035 - SAMET ZENGIN
// FIRAT UNİVERSİTESİ YAZILIM MUHENDISLIGI 1.SINIF
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class WebAdresi{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]"; //  regexleri(normal ifadeleri) belirliyoruz 
        Pattern pattern = Pattern.compile(regex); // tasarım kalıplarımızı oluşturuyoruz
        
        System.out.println("https:// eklemeden direkt sitenizi giriniz!");
        System.out.print("Websitenizi Giriniz:");
        String website = "https://"+scanner.next(); // kullanıcıdan https:// 'nin sonrasındaki website adresini istiyoruz yoksa hata verir
        
        Matcher matcher = pattern.matcher(website);
        
        if(matcher.matches() == true){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Website Adresiniz : " + website);
            System.out.println("Tebrikler Doğru Bir Website Adresi Girdiniz...");
            System.out.println("Websitenizin Hangi Domain'e ait olduğuna bakalım!");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Kontrol Ediliyor");
            Thread.sleep(1000);
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            if(website.contains(".com")){
                System.out.println("Site uzantınız .com'dur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Ticari alan adı olarak üretilmiş olmasına rağmen günümüzde her tür site için kullanılmaya başlamıştır. İngilizce de \" commercial\" anlamına gelmektedir.");
            }
            else if(website.contains(".net")){
                System.out.println("Site uzantınız .net'tir ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("İngilizcede ağ uzantısı anlamına gelen \"network\" kelimesinden kısaltılmıştır.");
            }
            else if(website.contains(".org")){
                System.out.println("Site uzantınız .org'tur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Organizasyonlar için kullanılır \"organization\" kelimesinin ilk üç harfi kullanılmıştır. ");
            }
            else if(website.contains(".biz")){
                System.out.println("Site uzantınız .biz'tir ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Bu uzantı iş, ticaret anlamına gelen \"business\"  kelimesinden kısaltılmıştır. ");
            }
            else if(website.contains(".info")){
                System.out.println("Site uzantınız .info'dur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Uzantısı bilgi anlamına gelmektedir. İngilizcede \"information\" kelimesinin kısaltılmışıdır.");
            }
            else if(website.contains(".pro")){
                System.out.println("Site uzantınız .pro'dur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Profesyonel anlamına gelmektedir. İngilizcede professional\" kelimesinin kısaltılmışıdır.");
            }
            else if(website.contains(".name")){
                System.out.println("Site uzantınız .name'dir ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Gerçek isimler için bu uzantı kullanılmaktadır. İngilizcede \"nickler\" kelimesinden üretilmiştir.");
            }
            else if(website.contains(".edu")){
                System.out.println("Site uzantınız .edu'dur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Eğitim kurumları için türetilmiş bir alan adı uzantısıdır. \"education\" kelimesinin kısaltılmışıdır.");
            }
            else if(website.contains(".gov")){
                System.out.println("Site uzantınız .gov'dur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Devlet kuruluşlarının alan adı uzantısıdır. \"government\" kelimesinin kısaltılmışıdır.");
            }
            else if(website.contains(".github")){
                System.out.println("Site uzantınız .github'dur ");
                System.out.println("BİLGİLENDİRME:");
                System.out.println("Github sitesi üzerine kurulmuş bir sitedir");
            }
            else{
               
                try {
                 String parts[] = website.split(".");
                String part1 = parts[0];
                String part2 = parts[1];
                System.out.println(part2);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Böyle Bir domain adresini tanımlayamadık üzgünüm");
                    System.out.println("Muhtemelen yanlış bir website adresi girdiniz lütfen tekrar deneyiniz");
                }

                
            }
            
        }
        else{
            System.out.println("Geçerli Bir WebSite adresi Giriniz..!");
        }
        
        
        
      
 

 

    
}
}
