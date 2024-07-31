package Implementing_Builder_Pattern;

public class BuilderTest {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println(myComputer);
    }
}
