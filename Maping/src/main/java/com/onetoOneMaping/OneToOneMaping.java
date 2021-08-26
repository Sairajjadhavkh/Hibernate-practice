package com.onetoOneMaping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMaping 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration();
        con.configure();
        SessionFactory factory=con.buildSessionFactory();
        //creating question
        Question que=new Question();
        que.setId(1);
        que.setQuestion("what is java ?");
        
        //creating answer
        Answer ans=new Answer();
        ans.setId(123);
        ans.setAnswer("java is a programing language");
        
        que.setAnswer(ans);
        
        //creating question
        Question que1=new Question();
        que1.setId(2);
        que1.setQuestion("what is framework ?");
        
        //creating answer
        Answer ans1=new Answer();
        ans1.setId(124);
        ans1.setAnswer("pre-written codes used by Java developers to develop Java applications or web applications");
        
        que1.setAnswer(ans1);
        
        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(que);
        session.save(que1);
        session.save(ans1);
        session.save(ans);
        
        tx.commit();        
        session.close();
    }
}
