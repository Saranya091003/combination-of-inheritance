package com.Cont;

import java.util.Set;

import com.view.*;
import com.form.*;
import com.model.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TPCExample {

	public static void main(String[] args) {
		try(Session ses=HbUtil.getSessionFactory().openSession())
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
			Validator validator=validatorFactory.getValidator();
			System.out.println("Checking for invalid user data...");
			System.out.println("------------------------------------------");
		    Transaction tr=ses.beginTransaction();
			Person e1=new Person("Jothika","Hydrabad");
			Customer e2=new Customer("Jothika","Hydrabad","jothika@gmail.com",863096789,"regular");
			Employee e3=new Employee("Jothika","Hydrabad","CEO",70000,"April 18");
			ses.persist(e1);
			ses.persist(e2);
			ses.persist(e3);
			Person1 e4=new Person1("Jothika","Hydrabad");
			Customer1 e5=new Customer1("Jothika","Hydrabad","jothika@gmail.com",863753357,"regular");
			Employee1 e6=new Employee1("Jothika","Hydrabad","CEO",70000,"April 18");
			ses.persist(e4);
			ses.persist(e5);
			ses.persist(e6);
			Person2 e7=new Person2("Jothika","Hydrabad");
			Customer2 e8=new Customer2("Jothika","Hydrabad","jothika@gmail.com",863465045,"regular");
			Employee2 e9=new Employee2("Jothika","Hydrabad","CEO",70000,"April 18");
			ses.persist(e7);
			ses.persist(e8);
			ses.persist(e9);
			tr.commit();
			ses.close();
			Set<ConstraintViolation<Person>> violations=validator.validate(e1);
			if(violations.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
						session.merge(e1);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Person>validation:violations)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Customer>> violations1=validator.validate(e2);
			if(violations1.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e2);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Customer>validation:violations1)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Employee>> violations2=validator.validate(e3);
			if(violations2.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e3);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Employee> validation:violations2)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Person1>> violations3=validator.validate(e4);
			if(violations3.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e4);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Person1>validation:violations3)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Customer1>> violations4=validator.validate(e5);
			if(violations4.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e5);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Customer1>validation:violations4)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Employee1>> violations5=validator.validate(e6);
			if(violations5.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e6);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Employee1> validation:violations5)
				{
					System.out.println(validation.getMessage());
				}
			}
			
			Set<ConstraintViolation<Person2>> violations6=validator.validate(e7);
			if(violations6.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e7);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Person2>validation:violations6)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Customer2>> violations7=validator.validate(e8);
			if(violations7.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e8);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Customer2>validation:violations7)
				{
					System.out.println(validation.getMessage());
				}
			}
			Set<ConstraintViolation<Employee2>> violations8=validator.validate(e9);
			if(violations8.isEmpty())
			{
				System.out.println("Valid user data provided");
				try (Session session=HbUtil.getSessionFactory().openSession()){
					tr=session.beginTransaction();
					session.merge(e9);
						tr.commit();
					}
					catch(Exception e) {
						if(tr!=null)
							tr.rollback();
						e.printStackTrace();
					}
			}
			else
			{
				System.out.println("Invalid user data found");
				for(ConstraintViolation<Employee2> validation:violations8)
				{
					System.out.println(validation.getMessage());
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
