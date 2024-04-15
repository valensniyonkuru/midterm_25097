package dao;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.AcademicUnit;
import model.Course;
import model.CourseDefinition;
import model.Department;
import model.EAcademicUnit;
import model.EQualification;
import model.Semester;
import model.Signup;
import model.Student;
import model.StudentRegistration;
import model.Teacher;

public class HibernetUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "org.postgresql.Driver");
                settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/auca_systemdb");
                settings.put(Environment.USER, "postgres"); 
                settings.put(Environment.PASS, "valens@118"); 
                settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Signup.class);
                configuration.addAnnotatedClass(Teacher.class);
               configuration.addAnnotatedClass(AcademicUnit.class);
               configuration.addAnnotatedClass(Course.class);
               configuration.addAnnotatedClass(CourseDefinition.class);
               configuration.addAnnotatedClass(Department.class);
               configuration.addAnnotatedClass(EAcademicUnit.class);
               configuration.addAnnotatedClass(EQualification.class);
               configuration.addAnnotatedClass(Semester.class);
               configuration.addAnnotatedClass(Student.class);
               configuration.addAnnotatedClass(StudentRegistration.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                System.out.println("Hibernate Java Config serviceRegistry created");
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return sessionFactory;
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }
}
