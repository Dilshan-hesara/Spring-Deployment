package lk.dilshanhesara.dilshan.springbootdeployment.repo;

import lk.dilshanhesara.dilshan.springbootdeployment.enitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}