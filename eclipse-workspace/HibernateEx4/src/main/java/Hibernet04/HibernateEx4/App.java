package Hibernet04.HibernateEx4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Session session = createConnection();
		Employee catchEmpObj = createEmployeeObjects();
		saveEmployeeDetails(session, catchEmpObj);
		//fetchEMployeeDetails(session, 1);
		fetchAddressDetails(session, 1);
	}
	private static void fetchAddressDetails(Session session, int i) {
		Address adrsObj = session.get(Address.class, 1);
		System.out.println(adrsObj);
		System.out.println(adrsObj.getEmp());
		
	}
	private static void fetchEMployeeDetails(Session session, int primaryKey) {
		Employee empObj = session.get(Employee.class, 1);  //see addrs as well as emp, emp primary key is passed
		System.out.println(empObj);
		System.out.println(empObj.getPermantAdrs());

	}
	private static void saveEmployeeDetails(Session session, Employee catchEmpObj) {
		session.beginTransaction();
		//Integer insertedKey = (Integer) session.save(catchEmpObj);
		/*	session.save(catchEmpObj);  //saving emp
		session.save(catchEmpObj.getPermantAdrs()); //save adrs*/

		//cascade type 
		session.persist(catchEmpObj);
		session.getTransaction().commit();

	}
	private static Employee createEmployeeObjects() {

		//scanner class
		Employee empObj = new Employee();
		empObj.setEmail("janani@gmail.com");
		empObj.setName("janani");

		Address adrs = new Address();
		adrs.setCity("blre");
		adrs.setStreetname("dkljfkdf");
		empObj.setPermantAdrs(adrs);  //employee + adrs details (uni)
		adrs.setEmp(empObj); //bidirec
		return empObj;
	}
	private static Session createConnection() {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sessionFact =  config.buildSessionFactory();
		Session session =  sessionFact.openSession();
		return session;
	}
}

