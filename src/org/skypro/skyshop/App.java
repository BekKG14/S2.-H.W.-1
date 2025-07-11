package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product cucumber = new Product("Cucumner", 110);
        Product vodka = new Product("Vodka", 101);
        Product pivo = new Product("Pivo", 80);

        System.out.println(cucumber);
        System.out.println("Корзина 1");
        ProductBasket basket = new ProductBasket(4);

        basket.addProduct(pivo);
        basket.addProduct(pivo);
        basket.addProduct(vodka);
        basket.addProduct(cucumber);
        basket.addProduct(cucumber);
        basket.printAllProducts();
        basket.checkProduct(pivo);
//        Basket.printTotalCost();
//        System.out.println(Basket.getProduct(3));


        System.out.println("Корзина 2");
        ProductBasket basket2 = new ProductBasket(3);

        basket2.addProduct(pivo);
        basket2.addProduct(vodka);
        basket2.addProduct(pivo);
        basket2.checkProduct(vodka);
        basket2.clearBasket();
        basket2.printAllProducts();

        ProductBasket Basket3 = new ProductBasket(3);
        Basket3.printAllProducts();
        Basket3.checkProduct(pivo);

    }

}