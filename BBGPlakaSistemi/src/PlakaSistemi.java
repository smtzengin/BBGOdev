import java.util.Scanner;
public class PlakaSistemi {
    public static void main(String[] args) throws InterruptedException {
	Scanner scanner = new Scanner(System.in);
	    //Diziler ile şehirleri tanımladık
        String[][] sehirler= {
			{"01" , "Adana"},
			{"02" , "Adıyaman"},
			{"03" , "Afyonkarahisar"},
			{"04" , "Ağrı"},
			{"05" , "Amasya"},
			{"06" , "Ankara"},
			{"07" , "Antalya"},
			{"08" , "Artvin"},
			{"09" , "Aydın"},
			{"10" , "Balıkesir"},
			{"11" , "Bilecik"},
			{"12" , "Bingöl"},
			{"13" , "Bitlis"},
			{"14" , "Bolu"},
			{"15" , "Burdur"},
			{"16" , "Bursa"},
			{"17" , "Çanakkale"},
			{"18" , "Çankırı"},
			{"19" , "Çorum"},
			{"20" , "Denizli"},
			{"21" , "Diyarbakır"},
			{"22" , "Edirne"},
			{"23" , "Elâzığ"},
			{"24" , "Erzincan"},
			{"25" , "Erzurum"},
			{"26" , "Eskişehir"},
			{"27" , "Gaziantep"},
			{"28" , "Giresun"},
			{"29" , "Gümüşhane"},
			{"30" , "Hakkari"},
			{"31" , "Hatay"},
			{"32" , "Isparta"},
			{"33" , "Mersin"},
			{"34" , "İstanbul"},
			{"35" , "İzmir"},
			{"36" , "Kars"},
			{"37" , "Kastamonu"},
			{"38" , "Kayseri"},
			{"39" , "Kırklareli"},
			{"40" , "Kırşehir"},
			{"41" , "Kocaeli"},
			{"42" , "Konya"},
			{"43" , "Kütahya"},
			{"44" , "Malatya"},
			{"45" , "Manisa"},
			{"46" , "Kahramanmaraş"},
			{"47" , "Mardin"},
			{"48" , "Muğla"},
			{"49" , "Muş"},
			{"50" , "Nevşehir"},
			{"51" , "Niğde"},
			{"52" , "Ordu"},
			{"53" , "Rize"},
			{"54" , "Sakarya"},
			{"55" , "Samsun"},
			{"56" , "Siirt"},
			{"57" , "Sinop"},
			{"58" , "Sivas"},
			{"59" , "Tekirdağ"},
			{"60" , "Tokat"},
			{"61" , "Trabzon"},
			{"62" , "Tunceli"},
			{"63" , "Şanlıurfa"},
			{"64" , "Uşak"},
			{"65" , "Van"},
			{"66" , "Yozgat"},
			{"67" , "Zonguldak"},
			{"68" , "Aksaray"},
			{"69" , "Bayburt"},
			{"70" , "Karaman"},
			{"71" , "Kırıkkale"},
			{"72" , "Batman"},
			{"73" , "Şırnak"},
			{"74" , "Bartın"},
			{"75" , "Ardahan"},
			{"76" , "Iğdır"},
			{"77" , "Yalova"},
			{"78" , "Karabük"},
			{"79" , "Kilis"},
			{"80" , "Osmaniye"},
			{"81" , "Düzce"}
	};
        
	    // Kullanıcıdan Araç plakasındaki Şehir kodunu girmesini istedik
        System.out.print("Lütfen Plakanızın Şehir Kodunu Giriniz: ");
        int sehirPlaka = scanner.nextInt();
          // Bir sıkıntıdan dolayı 1-10 arasındaki şehir plakalarının başına çıktıda "0" eklenmiyordu bunun için kendim eklemek zorunda kladım
        if(sehirPlaka>0 && sehirPlaka<10){
            System.out.println("0"+sehirPlaka+" plakalı şehir: "+sehirler[sehirPlaka-1][1]);
        }
        else if(sehirPlaka>=10 && sehirPlaka<82){
             System.out.println(sehirPlaka+" plakalı şehir: "+sehirler[sehirPlaka-1][1]);
        }
        
        else {
            System.out.println("Lütfen Geçerli Bir Plaka Kodu Giriniz!");
            System.exit(0);
        }
        
        //Kullanıcıdan Araç plakasının Orta Kısmını istedik
        System.out.print("Lütfen Plakanızın Orta Harf Kısmını Giriniz: ");
        String ortaPlaka = scanner.next();
        ortaPlaka = ortaPlaka.toUpperCase();
	    
        if(ortaPlaka.length()> 0 && ortaPlaka.length() < 4)  // plakanın orta harf kısmının minumum 1 , maksiumum 4 olacak şekilde kontrolünü sağladık
	{
            System.out.println("Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            // plakanın orta harf kısımlarının neleri temsil ettiğini kontrol ediyoruz
            if(ortaPlaka.equals("A")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Asayişe bağlıdır...");
            }
            else if(ortaPlaka.equals("AA")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası İl yönetimi ve rektörlüğe bağlıdır...");
            }
            else if(ortaPlaka.equals("JAA")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Jandarmaya bağlıdır...");
            }
            else if(ortaPlaka.equals("SGH")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Sahil Güvenliğe bağlıdır...");
            }
            else if(ortaPlaka.equals("B")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Uluslararası kuruluş üyelerine bağlıdır...");
            }
            else if(ortaPlaka.equals("CD")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Diplomatik topluluklar'a bağlıdır...");
            }
            else if(ortaPlaka.equals("CC")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası konsolosluğa bağlıdır...");
            }
            else if(ortaPlaka.equals("GMR")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Geçici Gümrüğ'ü temsil etmektedir.");
            }
            else if(ortaPlaka.equals("MA")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Geçici konaklama izinli yabancılar'ı temsil etmektedir");
            }
            else if(ortaPlaka.equals("SAB")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Suriye Vatandaşlığı için geçici plakayı temsil etmektedir.");
            }
            else if(ortaPlaka.equals("TAB")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Taksiler, dolmuşlar ve şehir merkezi dışı hatlı minibüsler (İstanbul)'i temsil etmektedir");
            }
            else if(ortaPlaka.equals("T")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Taksi plakasıdır(Diğer iller)");
            }
            else if(ortaPlaka.equals("CB")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası Cumhurbaşkanlığına bağlıdır.");
            }
            else if(ortaPlaka.equals("TBMM")){
                System.out.println("Aracınızın Orta Plakası : " + ortaPlaka);
                System.out.println("Aracınızın plakası TBMM'ye bağlıdır.");
            }
            
        } 
        else {
            System.out.println("Lütfen Aracınızın Orta Plakanızı Geçerli Giriniz");
            System.exit(0);
        }
        
	    
	    // kullanıcıdan plakanın son nümerik kısımlarının girişini istedik
        System.out.println("Lütfen Plakanızın Son Nümerik Kısmını Giriniz : ");
        String sonPlaka = scanner.next();
        int s1 = Integer.parseInt(sonPlaka); // String olarak aldığımız son nümerik kısmını int'e çevirdik
        
	    // son nümerik kısmın minumum 1 maksimum 4 karakterden oluşacağını kontrol ettik
        if(sonPlaka.length() > 0 && sonPlaka.length()< 5) {
            System.out.println("Aracınızın Son Nümerik Plakası : " + sonPlaka);
        }
        else{
            System.out.println("Lütfen Geçerli Bir Nümerik Plaka Giriniz...!");
            System.exit(0);
        }
        
        //Yukarıda belirttiğim gibi 0-10 arasındaki plakaların çıktılarında başında "0" yazmadığı için kontrolünü kendimiz sağladık 
        if(sehirPlaka>0 && sehirPlaka<10) {
            System.out.println("Aracınızın Plakası : "+ "0" + sehirPlaka + " " + ortaPlaka +" " + sonPlaka);
        }
        else {
            System.out.println("Aracınızın Plakası : " + sehirPlaka + " " + ortaPlaka +" " + sonPlaka);
        }
       
}
    
}
