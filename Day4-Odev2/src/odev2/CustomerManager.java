package odev2;

public class CustomerManager implements CustomerServices{
    @Override
    public void save(Customer customer) {
        System.out.println("Veri tabanına kaydedildi : " + customer.getFirstName());

    }

}
