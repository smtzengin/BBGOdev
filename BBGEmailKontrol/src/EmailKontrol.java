// 200541035 - SAMET ZENGIN
// FIRAT UNİVERSİTESİ YAZILIM MUHENDISLIGI 1.SINIF

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailKontrol {
     public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in); // kullanıcıdan giriş almak için scanner objesini tanımlıyoruz
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // kullanıcı e-mail giriş yaptığında içerisinde bulunacak & bulunmayacak karakterleri regex kontrolüyle yapıyoruz
        Pattern pattern = Pattern.compile(regex); 
        
       System.out.println("E-mail Adresini Giriniz:");
       String email = scanner.next(); // kullanıcıdan email girişi alıyoruz
       
        Matcher matcher = pattern.matcher(email); // kullanıcının girdiği email adresinde bulunmasını istediğimiz karakterler var mı yok mu onu kontrol ediyoruz eğer var ise true, yoksa false döndürücek
          

        if(matcher.matches() == true){
             //eğer doğru girilmişse 
            System.out.println("Tebrikler.. Girdiğiniz E-mail adresi doğru.");
            System.out.println("Mail Sağlayıcı kontrolü yapalım..");
            System.out.println("Kontrol Yapılıyor");
            Thread.sleep(1000);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            
            if(email.contains("@gmail.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Gmail , en iyi e-posta hizmetine kayıtlıdır.!! ");
                System.out.println("15GB'a kadar depolama alanı ve gelen kutunuz için yüksek düzeyde güvenlik sunar.");
                System.out.println("Hizmetin Dünya genelinde 1 milyardan fazla aktif kullancısı var!");
                System.out.println("**************************************************************************************");
                System.exit(0);
            }
            else if(email.contains("@outlook.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız outlook.com , şu an dünyanın en iyi e-posta servislerinden birine kayıtlıdır!! ");
                System.out.println("Bu Microsoft e-posta sağlayıcısıdır.");
                System.out.println("Gmail gibi, takvim veya bulut depolama gibi farklı hizmetleri de vardır.");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@hotmail.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız outlook.com , şu an dünyanın en iyi e-posta servislerinden birine kayıtlıdır!! ");
                System.out.println("Bu Microsoft e-posta sağlayıcısıdır.");
                System.out.println("Gmail gibi, takvim veya bulut depolama gibi farklı hizmetleri de vardır.");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@zoho.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Zoho Mail , Zoho Mail kişisel amaçlı kullanımlar için ücretsizdir. ");
                System.out.println("Ücretsiz planda e-postalar için 5 GB depolama alanı ve maksimum 3 MB ek dosya limiti bulunmaktadır.");   
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@yahoo.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Yahoo! Mail , Yahoo! Mail, ücretsiz e-posta sağlayıcısıdır. ");
                System.out.println("Her kullanıcı için 1 TB depolama alanı vardır.");
                System.out.println("Tüm e-posta hesaplarınızı (örneğin Gmail, Outlook...) gelen kutunuza bağlayabilir ve tüm gelen kutunuzu tek bir yerden yönetebilirsiniz.");
                System.out.println("Yahoo'da e-posta başına maksimum ek dosya sınırı 25 MB'dir.");
                System.out.println("***************************************************************************************************");
            }
            else if(email.contains("@aol.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");      
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@love.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");    
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@ygm.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");      
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@games.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**********************************************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");    
                System.out.println("*********************************************************************************************************************************");
            }
            else if(email.contains("@wow.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("*****************************************************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");        
                System.out.println("*****************************************************************************************************************************************");
            }
            
            else if(email.contains("@icloud.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("***************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Apple iCloud Hizmeti , iCloud'da yeni bir e-posta hesabı oluşturmak için bir iOS veya macOS'a ihtiyacınız vardır.");
                System.out.println("Bu hizmet 5 GB'a kadar ücretsiz depolama alanı sunmaktadır.");     
                System.out.println("Ek depolama için belirli bir ücret ödeyebilirsiniz.");
                System.out.println("***************************************************************************************************");
            }
            else if(email.contains("@me.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("*************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Apple iCloud Hizmeti , iCloud'da yeni bir e-posta hesabı oluşturmak için bir iOS veya macOS'a ihtiyacınız vardır.");
                System.out.println("Bu hizmet 5 GB'a kadar ücretsiz depolama alanı sunmaktadır.");     
                System.out.println("Ek depolama için belirli bir ücret ödeyebilirsiniz.");
                System.out.println("*************************************************************************************************");
            }
            else if(email.contains("@mac.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("***********************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Apple iCloud Hizmeti , iCloud'da yeni bir e-posta hesabı oluşturmak için bir iOS veya macOS'a ihtiyacınız vardır.");
                System.out.println("Bu hizmet 5 GB'a kadar ücretsiz depolama alanı sunmaktadır.");     
                System.out.println("Ek depolama için belirli bir ücret ödeyebilirsiniz.");
                System.out.println("************************************************************************************************");
            }
            else if(email.contains("@yandex.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Yandex Mail , tamamen ücretsiz bir e-posta hizmetidir.");
                System.out.println("Tüm kullanıcılara sınırsız depolama alanı ve 30 MB ek dosya limiti sunar.");     
                System.out.println("Yandex, Rusya'da arama motoru bakımından Google'dan daha popüler bir şirkettir.");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@mail.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Mail.com , tamamen ücretsiz bir e-posta hizmetidir.");
                System.out.println("Sınırsız depolama alanı ve 50 MB'a kadar ek dosya limiti sunar.");  
                System.out.println("**************************************************************************************");
               
            }
            else if(email.contains("@email.com")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Mail.com , tamamen ücretsiz bir e-posta hizmetidir.");
                System.out.println("Sınırsız depolama alanı ve 50 MB'a kadar ek dosya limiti sunar.");     
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("edu.tr")){
                System.out.println("E-Mail Adresiniz : "+email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("*****************************************************************************************");
                System.out.println("E-mail adresiniz, T.C. Yüksek Öğretim Kurumu(YÖK) tarafından onaylı öğretim kurumlarının kullanabileceği alan adına sahiptir");
                System.out.println("****************************************************************************************");
            }
            else{
                System.out.println("Geçerli bir mail sağlayıcı adresi giriniz..");
            }
        }
        else{
             
             //eğer kullanılmayacak harfler,semboller girilmişse kullanıcıya aşşağıdaki çıktıyı yolluyoruz
            System.out.println("Lütfen Geçerli Bir E-Mail Adresi Giriniz!");
        }
        
 

 

    
}
}
