import java.util.HashMap;

class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public int getProductId() 
    {
        return productId;
    }
    public void setProductId(int productId) 
    {
        this.productId = productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
}
class Inventory 
{
    private HashMap<Integer, Product> products;

    public Inventory() 
    {
        products = new HashMap<>();
    }

    public void addProduct(Product product) 
    {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, Product updatedProduct) 
    {
        products.put(productId, updatedProduct);
    }

    public void deleteProduct(int productId) 
    {
        products.remove(productId);
    }

    public Product getProduct(int productId) 
    {
        return products.get(productId);
    }

    public int getSize() 
    {
        return products.size();
    }
}
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product(1, "Product A", 10, 100.0);
        Product product2 = new Product(2, "Product B", 5, 50.0);

        // Add prods
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Update prods
        Product updatedProduct1 = new Product(1, "Product A", 20, 120.0);
        inventory.updateProduct(1, updatedProduct1);

        // Delete prods
        inventory.deleteProduct(2);

        // Get prods
        Product retrievedProduct = inventory.getProduct(1);
        System.out.println("Retrieved Product: " + retrievedProduct.getProductName() + ",Quantity:" + retrievedProduct.getQuantity() + ", Price: " + retrievedProduct.getPrice());

        // Get size
        System.out.println("Inventory Size: " + inventory.getSize());
    }
}


