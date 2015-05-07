package controller;

import javax.swing.JOptionPane;
import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Controller {

    public void insertEmpleado(Empleado emp) {
        SessionFactory session = NewHibernateUtil.getSessionFactory();
        Session bvalerin = session.openSession();
        Transaction tx = bvalerin.beginTransaction();
        bvalerin.save(emp);
        tx.commit();
        bvalerin.close();
        JOptionPane.showMessageDialog(null, "Empleado insertado con exito");
    }
    
    public void updateEmployer(Empleado emp){
        SessionFactory session = NewHibernateUtil.getSessionFactory();
        Session bvalerin = session.openSession();
        Transaction tx = bvalerin.beginTransaction();
        bvalerin.update(emp);
        tx.commit();
        bvalerin.close();
        JOptionPane.showMessageDialog(null, "Empleado Modificado  con exito");
    }
}
