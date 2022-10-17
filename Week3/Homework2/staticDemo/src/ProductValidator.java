public class ProductValidator {

    //Static metodlar çağrıldığında çalışmaz çünkü Yapıcı bloklar new leyince çalışır.
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }

    //Static metodlarda yapıcı blok çalıştırılmak istenirse static yapıcı blok oluşturulur.
    static {
        System.out.println("Static yapıcı blok çalıştı.");
    }

    //Burda methodu static yaptığımızda ProductManagerda isValid metodunu kullanırken ProductValidator.isValid() şeklinde new işlemi yapmadanda kullanabiliriz.
    //Çok yaygın kullanılmaz sebebi new işlemi yaptığımızda bellekte bir alan açılır işi bitince kapatılır. Ancak staticte o açılan kısım kapatılmaz proje durdurulana kadar açık kalmaya devam eder.
    //Veya başka bir metodda olsaydı static olmayan ona erişemeyeceğiz bu yüzden newlememiz gerekirdi
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }

    }

}
