
import java.util.Scanner;


public class EmailKontrol {
    
    public static void main(String[] args) throws InterruptedException {
        //kullanıcının klavyeden değer girebilmesi için scanner objesini tanımlıyoruz
        Scanner scanner = new Scanner(System.in);
        
 
        // kullancıya sistemimizde kayıtlı olan mail sağlayıcılarını listeliyoruz
        System.out.println("Sistemimizde kayıtlı olan mail sağlayıcıları : ");
        System.out.println("1 - @gmail.com");
        System.out.println("2 - @outlook.com");
        System.out.println("3 - @hotmail.com");
        System.out.println("4 - @zoho.com");
        System.out.println("5 - @yahoo.com");
        System.out.println("6 - @aol.com");
        System.out.println("7 - @love.com");
        System.out.println("8 - @ygm.com");
        System.out.println("9 - @games.com");
        System.out.println("10 - @wow.com");
        System.out.println("11 - @icloud.com");
        System.out.println("12 - @me.com");
        System.out.println("13 - @mac.com");
        System.out.println("14 - @yandex.com");
        System.out.println("15 - @mail.com");
        System.out.println("16 - @email.com");
        System.out.println("17 - @uniAdi.edu.tr");
        
        //kullanıcıdan email adres girişi alıyoruz
        System.out.print("Lütfen E-mail Adresinizi giriniz(ör:blablabla@hotmail.com): ");
        String email = scanner.nextLine(); // kullanıcıdan email adresini aldık
        System.out.println("Kontrol Ediliyor...");
        Thread.sleep(1000);
        boolean at; // '@'in varlığını sorgulamak için boolean tipinde bir değişken tanımlıyoruz
        boolean bosluk; // ' ' karakterlerin arasında bosluk var mı yok mu onu kontrol etmek için boolean tipinde bir değişken tanımlıyoruz
        
        // karakterlerin arasında bosluğun kontrolünü sağlıyoruz
        if(email.contains(" ")){
            bosluk = false; // eğer mail adresinin içerisinde bosluk karakteri varsa bosluk değişkenini false döndürüp kullanıcıya bir hata yazısı gönderip programı sonlandırıyoruz
            System.out.println("E-mail adresinizin içerisinde space( ) bulunamaz!!! lütfen geçerli bir e-mail adresi giriniz!");
            System.exit(0);
        }
        else{
            // eğer bosluk karakteri yok ise true döndürüp programın diğer kontrolleri yapmasına izin veriyoruz
            bosluk = true;
        }
        
        if(email.contains("@")){
            at = true;           
            // email adresi içerisinde '@' in varlığını sorguluyoruz eğer var ise programa devam edip aşşağıda ki iç içe if - else if bloklarında bazı mail sağlayıcılarının varlığını sorguluyoruz!
            if(email.contains("@gmail.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Gmail , en iyi e-posta hizmetine kayıtlıdır.!! ");
                System.out.println("15GB'a kadar depolama alanı ve gelen kutunuz için yüksek düzeyde güvenlik sunar.");
                System.out.println("Hizmetin Dünya genelinde 1 milyardan fazla aktif kullancısı var!");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@outlook.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız outlook.com , şu an dünyanın en iyi e-posta servislerinden birine kayıtlıdır!! ");
                System.out.println("Bu Microsoft e-posta sağlayıcısıdır.");
                System.out.println("Gmail gibi, takvim veya bulut depolama gibi farklı hizmetleri de vardır.");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@hotmail.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız outlook.com , şu an dünyanın en iyi e-posta servislerinden birine kayıtlıdır!! ");
                System.out.println("Bu Microsoft e-posta sağlayıcısıdır.");
                System.out.println("Gmail gibi, takvim veya bulut depolama gibi farklı hizmetleri de vardır.");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@zoho.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Zoho Mail , Zoho Mail kişisel amaçlı kullanımlar için ücretsizdir. ");
                System.out.println("Ücretsiz planda e-postalar için 5 GB depolama alanı ve maksimum 3 MB ek dosya limiti bulunmaktadır.");   
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@yahoo.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Yahoo! Mail , Yahoo! Mail, ücretsiz e-posta sağlayıcısıdır. ");
                System.out.println("Her kullanıcı için 1 TB depolama alanı vardır.");
                System.out.println("Tüm e-posta hesaplarınızı (örneğin Gmail, Outlook...) gelen kutunuza bağlayabilir ve tüm gelen kutunuzu tek bir yerden yönetebilirsiniz.");
                System.out.println("Yahoo'da e-posta başına maksimum ek dosya sınırı 25 MB'dir.");
                System.out.println("***************************************************************************************************");
            }
            else if(email.contains("@aol.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");      
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@love.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");    
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@ygm.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");      
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@games.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**********************************************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");    
                System.out.println("*********************************************************************************************************************************");
            }
            else if(email.contains("@wow.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("*****************************************************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız AOL Mail , AOL Mail ücretsiz bir e-posta sağlayıcıdır. ");
                System.out.println("Bu hizmeti kullanarak açtığınız e-posta adresleri için \n \"@aol.com\", \"@love.com\", \"@ygm.com\", \"@games.com\" veya \"wow.com\" etki alanlarından birini kullanabilirsiniz.");
                System.out.println("AOL Mail'de e-postalar için maksimum dosya ek limiti 25 MB'dir.");        
                System.out.println("*****************************************************************************************************************************************");
            }
            
            else if(email.contains("@icloud.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("***************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Apple iCloud Hizmeti , iCloud'da yeni bir e-posta hesabı oluşturmak için bir iOS veya macOS'a ihtiyacınız vardır.");
                System.out.println("Bu hizmet 5 GB'a kadar ücretsiz depolama alanı sunmaktadır.");     
                System.out.println("Ek depolama için belirli bir ücret ödeyebilirsiniz.");
                System.out.println("***************************************************************************************************");
            }
            else if(email.contains("@me.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("*************************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Apple iCloud Hizmeti , iCloud'da yeni bir e-posta hesabı oluşturmak için bir iOS veya macOS'a ihtiyacınız vardır.");
                System.out.println("Bu hizmet 5 GB'a kadar ücretsiz depolama alanı sunmaktadır.");     
                System.out.println("Ek depolama için belirli bir ücret ödeyebilirsiniz.");
                System.out.println("*************************************************************************************************");
            }
            else if(email.contains("@mac.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("***********************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Apple iCloud Hizmeti , iCloud'da yeni bir e-posta hesabı oluşturmak için bir iOS veya macOS'a ihtiyacınız vardır.");
                System.out.println("Bu hizmet 5 GB'a kadar ücretsiz depolama alanı sunmaktadır.");     
                System.out.println("Ek depolama için belirli bir ücret ödeyebilirsiniz.");
                System.out.println("************************************************************************************************");
            }
            else if(email.contains("@yandex.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Yandex Mail , tamamen ücretsiz bir e-posta hizmetidir.");
                System.out.println("Tüm kullanıcılara sınırsız depolama alanı ve 30 MB ek dosya limiti sunar.");     
                System.out.println("Yandex, Rusya'da arama motoru bakımından Google'dan daha popüler bir şirkettir.");
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("@mail.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Mail.com , tamamen ücretsiz bir e-posta hizmetidir.");
                System.out.println("Sınırsız depolama alanı ve 50 MB'a kadar ek dosya limiti sunar.");  
                System.out.println("**************************************************************************************");
               
            }
            else if(email.contains("@email.com")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("**************************************************************************************");
                System.out.println("E-mail adres sağlayıcınız Mail.com , tamamen ücretsiz bir e-posta hizmetidir.");
                System.out.println("Sınırsız depolama alanı ve 50 MB'a kadar ek dosya limiti sunar.");     
                System.out.println("**************************************************************************************");
            }
            else if(email.contains("edu.tr")){
                System.out.println(email);
                System.out.println("BİLGİLENDİRME;");
                System.out.println("*****************************************************************************************");
                System.out.println("E-mail adresiniz, T.C. Yüksek Öğretim Kurumu(YÖK) tarafından onaylı öğretim kurumlarının kullanabileceği alan adına sahiptir");
                System.out.println("****************************************************************************************");
            }
            
            else{
                // yukarıda tanımladığımız mail sağlayıcıları dışında bir mail sağlayıcısı girilirse kullanıcıya hata mesajını verip programı durduruyoruz
                System.out.println("Geçerli bir mail sağlayıcısı girmeniz gerekiyor!!");
                System.exit(0);
            }
            
        }
        else{
            // yukarıda '@'in varlığını kontrol edip diğer kontrolleri sağlamıştık, ama eğer email adresi içerisinde '@' bulunmuyorsa kullanıcıya hata mesajını verip programı durduruyoruz
            at = false;
            System.out.println("Lütfen Geçerli bir e-mail adresi giriniz...");    
            System.exit(0);
        }
        
        
       // Yukarıda yazdıklarımın dışında bir çok mail sağlayıcısı bulunmakta ama ben bu kadarının kontrolünü yapmak istedim
       // okuduğunuz için teşekkürler
       
       // 200541035
       // Samet Zengin
        
        
    }
    
}
