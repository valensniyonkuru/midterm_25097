package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.AcademicUnit;
import model.Teacher;

public class AcademicUnitDAO {

    public void saveOrUpdateAcademicUnit(AcademicUnit academicUnit) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(academicUnit);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public AcademicUnit getAcademicUnitById(String academicId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(AcademicUnit.class, academicId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteAcademicUnit(String academicId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            AcademicUnit academicUnit = session.get(AcademicUnit.class, academicId);
            if (academicUnit != null) {
                session.delete(academicUnit);
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
