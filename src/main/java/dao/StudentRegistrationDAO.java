package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.StudentRegistration;


public class StudentRegistrationDAO {

    public void saveOrUpdateStudentRegistration(StudentRegistration studentRegistration) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(studentRegistration);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public StudentRegistration getStudentRegistrationById(String registrationId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(StudentRegistration.class, registrationId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteStudentRegistration(String registrationId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            StudentRegistration studentRegistration = session.get(StudentRegistration.class, registrationId);
            if (studentRegistration != null) {
                session.delete(studentRegistration);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Other methods as needed
}
