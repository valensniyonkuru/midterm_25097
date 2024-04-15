package dao;

import model.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeacherDAO {
    public void addTeacher(Teacher teacher) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(teacher); // This will cascade the save operation to associated entities
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
