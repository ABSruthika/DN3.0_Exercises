package Implementing_Dependency_Injection;

class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // For simplicity, returning a dummy customer
        return new Customer(id, "Sruthika");
    }
}
