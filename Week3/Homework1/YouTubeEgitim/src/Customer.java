public class Customer {

    public int Id;
    public String City;

    public Customer(){
        System.out.println("Müşteri nesnesi başlatıldı");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
