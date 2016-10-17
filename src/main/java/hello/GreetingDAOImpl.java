package hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Oleg on 15.10.2016.
 */
public class GreetingDAOImpl implements GreetingDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Greeting g) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(g);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Greeting> get() {
        Session session = this.sessionFactory.openSession();
        List<Greeting> g = (List<Greeting>) session.createQuery("from Greeting").list();
        session.close();
        return g;
    }
}
