package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Semester;


public class SemesterDAO {

    public void saveOrUpdateSemester(Semester semester) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(semester);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Semester getSemesterById(String semesterId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(Semester.class, semesterId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteSemester(String semesterId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Semester semester = session.get(Semester.class, semesterId);
            if (semester != null) {
                session.delete(semester);
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
