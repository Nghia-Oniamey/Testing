package org.example.lession.lession5.Product.service;

import org.example.lession.lession5.Product.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> productList;

    public ProductService(){
        this.productList = new ArrayList<>();
    }

    public void addProducts(Product product){

        if(product != null){
            if(checkQuantity(product.getQuantity())){
                productList.add(product);
                System.out.println("Add success");
            }else{
                System.out.println("Quantity is not valid");
                System.out.println("add false");
//                throw new ArithmeticException("Quantity has >0 and <100");
            }
        }else {
            System.out.println("Product is not null");
            System.out.println("add false");
//            throw new ArithmeticException("Product not null");
        }

    }

    public void updateProducts(String code, Product product){

        for (Product pr : productList){
            if(pr.getCode().equalsIgnoreCase(code)){
                pr.setName(product.getName());
                pr.setPrice(product.getPrice());
                pr.setQuantity(product.getQuantity());
                productList.add(pr);
                System.out.println("update success");
                return;
            }else{
                System.out.println("code is not valid!");
                System.out.println("update false");
            }
        }

    }

    public Boolean checkQuantity(Long quantity){
        return (quantity > 0 && quantity < 100);
    }

    public List<Product> getProductList(){
        return productList;
    }

    public void deleteProducts(String code){
        for (Product pr : productList){
            if(pr.getCode().equalsIgnoreCase(code)){
                productList.remove(pr);
                System.out.println("delete success");
                return;
            }else{
                System.out.println("code is not valid!");
                System.out.println("update false");
            }
        }
    }

//    public void deleteProducts(String code){
//        for (Product pr : productList){
//            if(pr.getCode().equalsIgnoreCase(code)){
//                productList.remove(pr);
//                System.out.println("update success");
//                return;
//            }else{
//                System.out.println("code is not valid!");
//                System.out.println("update false");
//            }
//        }
//    }
}
