package com.company;

import java.util.Scanner;

class Product {
    String name;
    String manufacturer;
    double price;
    int shelfLife; // в днях
    int quantity;

    public Product(String name, String manufacturer, double price, int shelfLife, int quantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", Производитель: " + manufacturer +
                ", Цена: " + price + " руб., Срок хранения: " + shelfLife +
                " дней, Количество: " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Молоко", "Простоквашино", 90.5, 7, 50),
                new Product("Хлеб", "Хлебозавод №1", 40.0, 3, 100),
                new Product("Молоко ультрапастеризованное", "Домик в деревне", 95.0, 10, 30),
                new Product("Йогурт", "Активиа", 60.0, 14, 25)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часть названия товара для поиска: ");
        String searchName = scanner.nextLine();

        System.out.println("Результаты поиска:");
        boolean found = false;
        for (Product product : products) {
            if (product.name.contains(searchName)) { 
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Товар с таким наименованием не найден.");
        }

        scanner.close();
    }
}
