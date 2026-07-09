package com.prasoon.HibernateFirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prasoon.Entity.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        System.out.println(factory);
        System.out.println(factory.isClosed());
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Student s = new Student();
        s.setSname("Hitesh");
        s.setPer(75.67);
        session.save(s);

        tx.commit();

        session.close();
        factory.close();
    }
}