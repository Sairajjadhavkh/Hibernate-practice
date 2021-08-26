package com.firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		
		// creating student
		Student student1=new Student();
		student1.setName("shinde");
		student1.setCity("srirampur");
		
		// creating certificate
		Certificate certificate1=new Certificate();
		certificate1.setCourse("java");
		certificate1.setDuration("6 months");
		
		student1.setCertificate(certificate1);
		
		Student student2=new Student();
		student2.setName("sahil");
		student2.setCity("vidharbha");
		
		Certificate certificate2=new Certificate();
		certificate2.setCourse("c++");
		certificate2.setDuration("6 months");
		
		student2.setCertificate(certificate2);
		
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student1);
		session.save(student2);
		
		tx.commit();
		session.close();
		
		
		

	}

}
