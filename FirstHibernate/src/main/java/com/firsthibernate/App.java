package com.firsthibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args ) throws IOException
    {
       Configuration config=new Configuration();
       config.configure(); // read the configure cofiguration(hibernate.cfg.xml) file and pojo(Student) class.
       SessionFactory factory=config.buildSessionFactory(); // obtained connection between java application and database
       
       Student student =new Student("sairaj","mumbai");
       
       Address ad=new Address();
       ad.setCity("pune");
       ad.setOpen(true);
       ad.setDate(new Date());
       ad.setX(123.34);
       
       FileInputStream file=new FileInputStream("src/main/java/IMG_20180402_134642.jpg");
       byte data[]=new byte[file.available()]; 
       file.read();
       ad.setImage(data);
       
       
       Session session =factory.openSession(); //this will open the connection to do crud opreration
       Transaction tx=session.beginTransaction();
       
       session.save(student);
       session.save(ad);
       
       tx.commit();
       session.close();
    }
}
