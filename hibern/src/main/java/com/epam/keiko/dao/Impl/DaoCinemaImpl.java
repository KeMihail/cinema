package com.epam.keiko.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.epam.keiko.dao.ICinema;
import com.epam.keiko.entity.Cinema;
import com.epam.keiko.util.HibernateUtil;


public class DaoCinemaImpl implements ICinema
{
	final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void addCinema(final Cinema cinema)
	{
		final Session session = sessionFactory.openSession();
		final Transaction transaction = session.beginTransaction();
		session.save(cinema);
		transaction.commit();
		session.close();
	}
}
