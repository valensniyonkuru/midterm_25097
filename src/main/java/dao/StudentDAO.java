package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;


public class StudentDAO {

    public void saveOrUpdateStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Student getStudentById(String studentId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(Student.class, studentId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteStudent(String studentId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
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
