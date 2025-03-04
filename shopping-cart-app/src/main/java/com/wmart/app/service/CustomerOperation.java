package com.wmart.app.service;

import com.wmart.app.model.Customer;

public interface CustomerOperation {

   void addCustomer(Customer customer);

   Customer getCustomerByName(String name);

}
