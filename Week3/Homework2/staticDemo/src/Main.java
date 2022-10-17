public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id=1;
        product.name="Laptop";
        product.price=11000;


        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }
}