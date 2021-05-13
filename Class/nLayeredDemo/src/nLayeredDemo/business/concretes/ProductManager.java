package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;
import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;


    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        // work codes

        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride urun kabul edilmiyor.");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Urun eklendi " + product.getName());

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
