import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

    public static void main(String[] args) {
        //ToDo: Spring IoC ile cozulecek
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(2,2,"Elma",12,50);
        productService.add(product);


    }
}
