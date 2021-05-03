public class Main {

    public static void main(String[] args) {

        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "1234";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "12345";

        UnionCustomer union1 = new UnionCustomer();
        union1.customerNumber = "12123345";

        CustomerManager customerManager = new CustomerManager();

//        customerManager.add(hepsiBurada);
//        customerManager.add(engin);
//        customerManager.add(union1);

        Customer[] customers = {engin, union1 , hepsiBurada};

        customerManager.addMultiple(customers);






    }
}
