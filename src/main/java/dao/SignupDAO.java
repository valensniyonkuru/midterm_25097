package dao;

import model.Signup;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SignupDAO {

    
    public void saveSignup(Signup signup) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(signup);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
