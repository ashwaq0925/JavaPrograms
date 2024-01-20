package Hibernet01.HibernetEx;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;


public class ZomatoMain {
	

	public static void main(String[] args) {
		Zomato obj = new Zomato();
		obj.setOrderid(3459);
		obj.setLocation("chennai");
		obj.setItem(" mutton kebab");
	Configuration cfg = new Configuration().configure().addAnnotatedClass(Zomato.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Transaction trs = s.beginTransaction();
	s.save(obj);
	trs.commit();
	}

}
