package opgave3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        // 5 Products
        Product product1 = new Product(1, "pro1", 10);
        Product product2 = new Product(2, "pro2", 20);
        Product product3 = new Product(3, "pro3", 30);
        Product product4 = new Product(4, "pro4", 40);
        Product product5 = new Product(5, "pro5", 50);

        // 2 Customers
        Customer customer1 = new Customer("Gustav", LocalDate.of(2000, 11, 4));
        Customer customer2 = new Customer("Magnus", LocalDate.of(1999, 5, 18));

        // Customer 1 – 2 orders
        Order order1 = new Order(1);
        order1.createOrderLine(2, product1);
        order1.createOrderLine(1, product2);

        Order order2 = new Order(2);
        order2.createOrderLine(3, product3);
        order2.createOrderLine(1, product4);

        customer1.addOrder(order1);
        customer1.addOrder(order2);

        // Customer 2 – 4 orders
        Order order3 = new Order(3);
        order3.createOrderLine(1, product1);
        order3.createOrderLine(2, product5);

        Order order4 = new Order(4);
        order4.createOrderLine(2, product2);
        order4.createOrderLine(1, product3);

        Order order5 = new Order(5);
        order5.createOrderLine(1, product4);
        order5.createOrderLine(3, product5);

        Order order6 = new Order(6);
        order6.createOrderLine(2, product1);
        order6.createOrderLine(2, product3);

        customer2.addOrder(order3);
        customer2.addOrder(order4);
        customer2.addOrder(order5);
        customer2.addOrder(order6);

        // Tildel rabatter
        customer1.setDiscount(new PercentDiscount(15));
        customer2.setDiscount(new FixedDiscount(250, 1000));

        // Udskriv resultater
        System.out.println("----- Kunde 1 -----");
        System.out.println("Total uden rabat: " + customer1.totalBuy());
        System.out.println("Total med rabat: " + customer1.totalBuyWithDiscount());

        System.out.println();

        System.out.println("----- Kunde 2 -----");
        System.out.println("Total uden rabat: " + customer2.totalBuy());
        System.out.println("Total med rabat: " + customer2.totalBuyWithDiscount());

    }
}
