package org.practice.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.practice.entity.Users;

public class App {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration().
				                 configure("hibernate.cfg.xml").
				                 addAnnotatedClass(Users.class).
				                 buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			 session.beginTransaction();
			 List<Users> user = session.createQuery("from users").getResultList();
			 session.getTransaction().commit();
			 for (Users users : user) {
				 System.out.println(users);
					
			}
			
			
			
			
			/*
			 * Users user=new Users("sivasai", "kiran", "sivakiran", "pandilla");
			 * session.beginTransaction(); session.save(user);
			 * session.getTransaction().commit();
			 * System.out.println("Transaction Sussesfull!");
			 * 
			 */
			
			/*
			 * Users user=new Users(); session.beginTransaction();
			 * user=session.get(Users.class,1); session.getTransaction().commit();
			 * System.out.println("Transaction Sussesfull!" + user);
			 */
		}
		finally {
			session.close();
			factory.close();
		}


	}
	
}
