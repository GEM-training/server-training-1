package com.gem.nhom1.service;

import com.gem.nhom1.model.Bill;
import com.gem.nhom1.model.Customer;
import com.gem.nhom1.model.Unit;

import java.util.List;

/**
 * Created by vanhop on 1/18/16.
 */
public interface CustomerService {
    public Customer getById(int id);
    public List<Customer> getList();
    public int insert(Customer customer);
    public void delete(int customerId) throws Exception;
    public void update(Customer customer);

    public List<Bill> getListBill(int customerId);
}
