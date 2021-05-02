package odev2;

public class NeroCustomerManager extends CustomerManager{
    @Override
    public void save(Customer customer) {
        System.out.println("Nero Veritabanına kaydedildi : " + customer.getFirstName());

    }
    }

