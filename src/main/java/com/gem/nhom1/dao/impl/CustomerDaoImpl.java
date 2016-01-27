package com.gem.nhom1.dao.impl;

import com.gem.nhom1.dao.CustomerDao;
import com.gem.nhom1.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vanhop on 1/18/16.
 */
@Repository
public class CustomerDaoImpl extends AbstractDao<Integer, Customer> implements CustomerDao {

    public Customer getById(int id) {
        return getByKey(id);
    }

    public List<Customer> getList() {
        return getSession().createQuery("from Customer").list();
    }

    public int insert(Customer customer){
        return insertObject(customer);
    }

    public void delete(int customerId) throws Exception {
        deleteObject(getByKey(customerId));
    }

    public void update(Customer customer){
        updateObject(customer);
    }
}
