package odev2;

public class Main {

    public static void main(String[] args) {
CustomerManager customerManager = new NeroCustomerManager();
customerManager.save(new Customer(1,"Beyza", "Kaynak", 1111));

CustomerManager customerManager1 = new StarbucksCustomerManager();
customerManager1.save(new Customer(3,"Domates", "Kızgın", 2222));
    }
}
