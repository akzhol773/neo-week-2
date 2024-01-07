package com.neobis.dao;

import com.neobis.entity.book.Review;
import com.neobis.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ReviewDAO {

    // Create or update a review
    public void saveOrUpdateReview(Review review) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(review);
            transaction.commit();
        }
    }

    // Retrieve a review by ID
    public Review getReviewById(Long reviewID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Review.class, reviewID);
        }
    }

    // Retrieve all reviews
    public List<Review> getAllReviews() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Review", Review.class).list();
        }
    }

    // Delete a review
    public void deleteReview(Review review) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(review);
            transaction.commit();
        }
    }
}


