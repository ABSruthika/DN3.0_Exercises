package Implementing_Proxy_Pattern;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display();  // Loading and displaying the image
        image.display();  // Displaying the cached image
    }
}
