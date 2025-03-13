import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return name + " | Category: " + category + " | Price: " + price;
    }
}

public class b {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 70000),
            new Product("Headphones", "Electronics", 2000),
            new Product("Shirt", "Clothing", 1500),
            new Product("Jeans", "Clothing", 2500),
            new Product("Smartphone", "Electronics", 25000)
        );

        // Group products by category
        Map<String, Optional<Product>> expensiveProduct = products.stream()
                .collect(groupingBy(p -> p.category, 
                                    maxBy(Comparator.comparingDouble(p -> p.price))));

        // Calculate average product price
        double averagePrice = products.stream()
                                      .mapToDouble(p -> p.price)
                                      .average()
                                      .orElse(0.0);

        System.out.println("Most Expensive Product in Each Category:");
        expensiveProduct.forEach((category, product) -> 
            System.out.println(category + ": " + product.get()));

        System.out.println("\nAverage Product Price: " + averagePrice);
    }
}
