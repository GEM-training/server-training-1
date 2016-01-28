package com.gem.nhom1.dao.impl;

import com.gem.nhom1.config.HibernateConfiguration;
import com.gem.nhom1.dao.CustomerDao;
import com.gem.nhom1.model.Customer;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vanhop on 1/18/16.
 */
@Repository
public class CustomerDaoImpl extends AbstractDao<Integer,Customer> implements CustomerDao {

    public Customer getById(int id) {
        return getByKey(id);
    }

    public List<Customer> getList(int page) {
        Query query =  getSession().createQuery("from Customer");
        query.setFirstResult((page - 1) * HibernateConfiguration.pageSize);
        query.setMaxResults(HibernateConfiguration.pageSize);

        return query.list();
    }

    public int insert(Customer customer) {
        return insertObject(customer);
    }

    public boolean delete(int customerId) {
        try {
            deleteObject(getByKey(customerId));
        } catch (Exception e) {
            return false;
        }
        return  true;
    }

    public void update(Customer customer) {
        updateObject(customer);
    }
}
