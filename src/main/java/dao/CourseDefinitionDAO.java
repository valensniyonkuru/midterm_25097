package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.CourseDefinition;


public class CourseDefinitionDAO {

    public void saveOrUpdateCourseDefinition(CourseDefinition courseDefinition) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(courseDefinition);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public CourseDefinition getCourseDefinitionById(String courseDefinitionId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(CourseDefinition.class, courseDefinitionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteCourseDefinition(String courseDefinitionId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            CourseDefinition courseDefinition = session.get(CourseDefinition.class, courseDefinitionId);
            if (courseDefinition != null) {
                session.delete(courseDefinition);
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
