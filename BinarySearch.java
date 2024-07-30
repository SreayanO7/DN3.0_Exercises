class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }
}
public class BinarySearch {
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == targetId) {
                return products[mid];
            }
            if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Product A", "Category 1"),
            new Product(2, "Product B", "Category 2"),
            new Product(3, "Product C", "Category 1"),
            new Product(4, "Product D", "Category 3")
        };
        Product result = binarySearch(products, 3);
        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found");
        }
    }
}
