package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Department;


public class DepartmentDAO {

    public void saveOrUpdateDepartment(Department department) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(department);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Department getDepartmentById(String departmentId) {
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            return session.get(Department.class, departmentId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteDepartment(String departmentId) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Department department = session.get(Department.class, departmentId);
            if (department != null) {
                session.delete(department);
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
