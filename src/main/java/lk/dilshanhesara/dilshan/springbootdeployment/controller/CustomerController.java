package lk.dilshanhesara.dilshan.springbootdeployment.controller;


import lk.dilshanhesara.dilshan.springbootdeployment.enitiy.Customer;
import lk.dilshanhesara.dilshan.springbootdeployment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;



    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }
}