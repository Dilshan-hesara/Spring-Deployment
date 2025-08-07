package lk.dilshanhesara.dilshan.springbootdeployment.service;


import lk.dilshanhesara.dilshan.springbootdeployment.enitiy.Customer;
import lk.dilshanhesara.dilshan.springbootdeployment.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public List<Customer> getCustomer() {

        return customerRepo.findAll();
    }
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}