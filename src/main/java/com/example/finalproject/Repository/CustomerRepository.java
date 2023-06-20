package com.example.finalproject.Repository;

import com.example.finalproject.Model.Company;
import com.example.finalproject.Model.Customer;
import com.example.finalproject.Model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findCustomerById(Integer id);
    Customer findCustomerByMyUser(MyUser myUser);

}