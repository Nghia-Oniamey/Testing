package lession.lession5.ProductTest;

import org.example.lession.lession5.Product.entities.Product;
import org.example.lession.lession5.Product.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {

//    @BeforeEach
    private ProductService productService = new ProductService();

    @Test
    public void addProductSuccess(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 50L);
        productService.addProducts(product);
        Assertions.assertEquals(1, productService.getProductList().size());
    }

    @Test
    public void addProductFalse(){
        Product product = null;
        productService.addProducts(product);
        Assertions.assertEquals(0, productService.getProductList().size());
//        Expected :1
//        Actual   :0
    }

    @Test
    public void addProductInValidMaxQuantity(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 200L);
        productService.addProducts(product);
        Assertions.assertEquals(0, productService.getProductList().size());
    }

    @Test
    public void addProductInValidMinQuantity(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 0L);
        productService.addProducts(product);
        Assertions.assertEquals(0, productService.getProductList().size());
    }

    @Test
    public void updateProductSuccess(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 50L);
        productService.addProducts(product);
        product.setQuantity(70L);
        productService.updateProducts("SP2", product);
        Assertions.assertEquals(70L, productService.getProductList().get(0).getQuantity());
        Assertions.assertEquals("SP2", productService.getProductList().get(0).getCode());
    }

    @Test
    public void updateProductFalse(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 50L);
        productService.addProducts(product);
        product.setQuantity(70L);
        productService.updateProducts("SP1", product);
        Assertions.assertEquals(1, productService.getProductList().size());
    }

    @Test
    public void deleteProductSuccess(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 50L);
        productService.addProducts(product);
        productService.deleteProducts("SP2");
        Assertions.assertEquals(0, productService.getProductList().size());
    }

    @Test
    public void deleteProductFalse(){
        Product product = new Product("2", "SP2", "Ao polo", 1000.5f, "Đen", 50L);
        productService.addProducts(product);
        productService.deleteProducts("SP1");
        Assertions.assertEquals(0, productService.getProductList().size());
    }
}
