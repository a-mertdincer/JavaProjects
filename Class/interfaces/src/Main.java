public class Main {

    public static void main(String[] args) {


    Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger(), new FileLogger()};
    CustomerManager customerManager = new CustomerManager(loggers);

    Customer mert = new Customer(1, "Mert", "Dincer");
    customerManager.add(mert);


    }
}
