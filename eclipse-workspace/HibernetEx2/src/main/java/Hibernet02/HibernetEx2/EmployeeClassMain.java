/*
*step 1: create Maven project and copy required dependencies.
* step 2: right click on project go to other type hibernate and select the required field.
* step 3:select all the databases and enter username and password.
* step 4: create a pojo class and main class
* step 5: set entity or table and primary key.
* step6:a create obj and set.
* step 7: run th program.
* 
*/

package Hibernet02.HibernetEx2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClassMain {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(003);
        emp.setName("king kong");
        emp.setSalary(14000);
        emp.setDept("analyst");

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction trs = s.beginTransaction();

        // Save the employee object
        s.save(emp);

        trs.commit();
        s.close();
        sf.close();
    }
}
