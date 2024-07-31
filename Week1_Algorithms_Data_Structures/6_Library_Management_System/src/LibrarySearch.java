public class LibrarySearch {

    // Linear Search Method
    public static Book linearSearch(Book[] books, String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                return book;
            }
        }
        return null; // Not found
    }

    // Binary Search Method
    public static Book binarySearch(Book[] books, String searchTitle) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].getTitle().equalsIgnoreCase(searchTitle)) {
                return books[mid];
            }
            if (books[mid].getTitle().compareToIgnoreCase(searchTitle) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }
}
/*Linear Search Time Complexity: O(n)
Binary Search Time Complexity: O(log n)
Use binary search for sorted datasets.*/