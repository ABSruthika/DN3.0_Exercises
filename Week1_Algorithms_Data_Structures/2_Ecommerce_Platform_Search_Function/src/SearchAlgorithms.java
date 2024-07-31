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

/*Search Operation Scenarios
Linear Search:

Best Case: O(1) – the desired element is the first in the list.
Average Case: O(n) – the desired element is somewhere in the middle of the list.
Worst Case: O(n) – the desired element is the last in the list or not present at all.
Binary Search:

Best Case: O(1) – the desired element is at the midpoint of the array.
Average Case: O(log n) – the desired element is somewhere in the array, requiring multiple splits.
Worst Case: O(log n) – the desired element is found after multiple splits.

Time Complexity Comparison
Linear Search:

Time Complexity: O(n)
Characteristics: Works on unsorted arrays or lists. No additional preprocessing is required.
Binary Search:

Time Complexity: O(log n)
Characteristics: Requires a sorted array. More efficient for larger datasets if the array is already sorted.
*/
