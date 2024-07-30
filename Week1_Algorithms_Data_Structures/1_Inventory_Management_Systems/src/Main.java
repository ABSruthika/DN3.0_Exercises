public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Create products
        Product product1 = new Product("001", "Laptop", 10, 999.99);
        Product product2 = new Product("002", "Smartphone", 20, 599.99);

        // Add products to inventory
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);

        // Retrieve and print product details
        System.out.println("Product 1: " + inventoryManager.getProduct("001").getProductName());
        System.out.println("Product 2: " + inventoryManager.getProduct("002").getProductName());

        // Update product
        product1.setQuantity(15);
        inventoryManager.updateProduct("001", product1);
        System.out.println("Updated Product 1 Quantity: " + inventoryManager.getProduct("001").getQuantity());

        // Delete product
        inventoryManager.deleteProduct("002");
        System.out.println("Product 2 after deletion: " + inventoryManager.getProduct("002"));
    }
}
