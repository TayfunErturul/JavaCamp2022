public class ProductManager {
    public void add(Product product){
        //ProductValidator productValidator = new ProductValidator(); //ProductValidator classında isValid metodunu static yaptığımız için newleme yapmadan aşağıdaki gibi "ProductValidator.isValid" şeklinde direkt olarak kullanabiliriz.
        //Çok yaygın kullanılmaz sebebi new işlemi yaptığımızda bellekte bir alan açılır işi bitince kapatılır. Ancak staticte o açılan kısım kapatılmaz proje durdurulana kadar açık kalmaya devam eder.
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }
        else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }
}
