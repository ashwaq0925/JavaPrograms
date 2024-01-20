package Hibernet03.HibernetEx3;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.id.Configurable;

public class StudentMain {

	public static void main(String[] args) {
		Configuration conf =  new Configuration().configure().addAnnotatedClass(StudentDetails.class);
		SessionFactory session = 
		

	}

}
