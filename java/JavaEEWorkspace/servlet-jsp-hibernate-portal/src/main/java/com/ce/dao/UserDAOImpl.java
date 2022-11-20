package com.ce.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ce.entity.User;
import com.ce.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	@Override
	public void saveUser(User user) {
		Transaction txn = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			txn = session.beginTransaction();
			session.save(user);
			txn.commit();
		} catch (HibernateException excep) {
			if (txn != null) {
				txn.rollback();
			}
			System.out.println(excep.getMessage());
		}
	}

	@Override
	public void updateUser(User user) {
		Transaction txn = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			txn = session.beginTransaction();
			session.update(user);
			txn.commit();
		} catch (HibernateException excep) {
			if (txn != null) {
				txn.rollback();
			}
			System.out.println(excep.getMessage());
		}

	}

	@Override
	public void deleteUser(int id) {
		Transaction txn = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			txn = session.beginTransaction();
			User user = session.get(User.class, id);
			if (user != null) {
				session.delete(user);
				System.out.println("user is deleted");
			}
			txn.commit();
		} catch (HibernateException excep) {
			if (txn != null) {
				txn.rollback();
			}
			System.out.println(excep.getMessage());
		}

	}

	@Override
	public User getUser(int id) {
		
		User user = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			user = session.get(User.class, id);
		} catch (HibernateException excep) {
			System.out.println(excep.getMessage());
		}

		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			users = session.createQuery("from User", User.class).getResultList();
		} catch (HibernateException excep) {
			System.out.println(excep.getMessage());
		}
		return users;
	}

}
