package com.epam.keiko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.keiko.dao.Impl.DaoCinemaImpl;
import com.epam.keiko.entity.Cinema;


public class Main
{
	private static org.hibernate.SessionFactory sessionFactory;

	public static void main(String [] args){

		final ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");

		final Cinema cinema = cxt.getBean("cinema",Cinema.class);
		final DaoCinemaImpl dao = cxt.getBean("cinemaImpl",DaoCinemaImpl.class);

		cinema.setId(3);
		cinema.setName("cinema");

		dao.addCinema(cinema);
	}
}
