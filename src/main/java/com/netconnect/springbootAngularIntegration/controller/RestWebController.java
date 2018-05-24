package com.netconnect.springbootAngularIntegration.controller;

import com.netconnect.springbootAngularIntegration.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * author anand.
 * since on 24/5/18.
 */

@RestController
public class RestWebController {

    List<Customer> cust = new ArrayList<Customer>();

    @RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
    public List<Customer> getResource(){
        cust.add(new Customer("anand","sharma"));
        return cust;
    }

    @RequestMapping(value="/postcustomer", method= RequestMethod.POST)
    public String postCustomer(@RequestBody Customer customer){


        cust.add(customer);
        cust.forEach(i-> System.out.println(i.getFirstName()+" : "+i.getLastName()));

        return "Sucessful!";
    }
}