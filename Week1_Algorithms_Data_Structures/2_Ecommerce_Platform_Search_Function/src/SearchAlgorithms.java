import java.util.List;

public class SearchAlgorithms {

    // Linear Search Method
    public static Product linearSearch(List<Product> products, String searchId) {
        for (Product product : products) {
            if (product.getProductId().equals(searchId)) {
                return product;
            }
        }
        return null; // Not found
    }

    // Binary Search Method
    public static Product binarySearch(Product[] products, String searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId().equals(searchId)) {
                return products[mid];
            }
            if (products[mid].getProductId().compareTo(searchId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }
}
