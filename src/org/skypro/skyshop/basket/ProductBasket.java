package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products;
    private static int size;


    public ProductBasket(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    public void addProduct(Product product) {
        if (size < products.length) {
            products[size++] = product;
        } else {
            System.out.println("КОРЗИНА ПЕРЕПОЛНЕНА");
        }
    }

    public double totalCost() {
        double amount = 0;
        for (int i = 0; i < size; i++) {
            if (products[i] != null) {
                amount = amount + products[i].getCost();
            }else System.out.println("Корзина пуста");
        }
        return amount;
    }

    public void printTotalCost() {
        System.out.println("Сумма: " + totalCost());
    }

    public Product getProduct(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс " + index);
        }
        return products[index];
    }

    public void printAllProducts() {
        if (size == 0) {
            System.out.println("Корзина пуста");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(products[i]);
            }
        }
    }

    public boolean checkProduct(Product product) {
        for (int i = 0; i <size; i++) {
            if (products[i] != null) {
                if (products[i].equals(product)) {
                    System.out.println("Продукт: " + product + " есть в корзине");
                    return true;
                }
            }
        }
        System.out.println("В корзине нет такого товара");
        return false;
    }


    public void getSize() {
        System.out.println(size);
    }

    public void clearBasket() {
        for (int i = 0; i < size; i++) {
            products[i] = null;
        }
    }
}

