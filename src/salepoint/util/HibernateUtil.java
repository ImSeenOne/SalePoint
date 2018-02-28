package salepoint.util;

import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

/**
 *
 * @author Cristian Ramírez
 */
@SuppressWarnings("UnnecessaryReturnStatement")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;    
    static {
        
        try {
            
            sessionFactory = new Configuration().configure().buildSessionFactory();
            
        } catch (HibernateException ex) {
            
            System.err.println("Initial SessionFactory creation failed." + ex);
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
