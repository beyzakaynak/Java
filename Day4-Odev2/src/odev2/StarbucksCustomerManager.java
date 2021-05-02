package odev2;

public class StarbucksCustomerManager extends CustomerManager implements VerificationServices {
    @Override
    public boolean check(Customer customer) {
        Customer customer2 = new Customer(123, "Domates", "Kızgın", 222);
        if(customer2.getFirstName().equals(customer.getFirstName())){
            System.out.println(customer.getFirstName() + " Starbucks'a Onaylandı ");
            return true;
        }

        return false;
    }
    @Override
    public void save(Customer customer){
        boolean isTrue = check(customer);
        if(isTrue){
            System.out.println(customer.getFirstName()+ " Veritabanına eklendi");
        }else{
            System.out.println("Malesef onaylanamadı");
        }

    }
}
