public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();

        /*
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;

        int[] sayilar1={1,2,3};
        int[] sayilar2={10,20,30};

        sayilar1=sayilar2;
        sayilar2[0]=1000;


        System.out.println(sayi1);
        System.out.println(sayilar1[0]);
         */

        /*CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer=new Customer(); //örnek oluşturma, instance oluşturma, instance creation
        customer.Id=1;
        customer.City="Ordu";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.CompanyName="Arçelik";
        company.TaxNumber = "1000010";
        company.Id=100;

        CustomerManager customerManager2=new CustomerManager(new Person());

        Person person = new Person();
        person.FirstName="Tayfun";
        person.LastName="Erturul";
        person.NationalIdentity="123456";
        */



    }
}