package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Course;


public class CourseDAO {

    public void saveOrUpdateCourse(Course course) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(course);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Course getCourseById(int courseId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(Course.class, courseId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteCourse(int courseId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Course course = session.get(Course.class, courseId);
            if (course != null) {
                session.delete(course);
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
