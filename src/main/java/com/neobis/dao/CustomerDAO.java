package com.neobis.dao;

import com.neobis.entity.person.Customer;
import com.neobis.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDAO {

    // Create or update a customer
    public void saveOrUpdateCustomer(Customer customer) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(customer);
            transaction.commit();
        }
    }

    // Retrieve a customer by ID
    public Customer getCustomerById(Long customerId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Customer.class, customerId);
        }
    }

    // Retrieve all customers
    public List<Customer> getAllCustomers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Customer", Customer.class).list();
        }
    }

    // Delete a customer
    public void deleteCustomer(Customer customer) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(customer);
            transaction.commit();
        }
    }
}
