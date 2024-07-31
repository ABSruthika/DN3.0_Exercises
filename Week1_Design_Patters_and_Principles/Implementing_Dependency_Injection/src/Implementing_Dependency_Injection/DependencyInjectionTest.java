package Implementing_Dependency_Injection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        Customer customer = service.getCustomerById("1010");
        System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
    }
}

class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
