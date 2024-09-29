class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "Product [Name=" + name + ", Price=" + price + "]";
    }
}

// Test class
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product originalProduct = new Product("Phone", 500.00);
        Product clonedProduct = originalProduct.clone();
        clonedProduct.setPrice(450.00);

        System.out.println(originalProduct); // Phone, 500.00
        System.out.println(clonedProduct);   // Phone, 450.00
    }
}
