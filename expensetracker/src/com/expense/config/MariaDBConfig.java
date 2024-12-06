package com.expense.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class MariaDBConfig {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "org.mariadb.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mariadb://localhost:3306/expense_tracker");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "your_password");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MariaDB103Dialect");

                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.FORMAT_SQL, "true");
                settings.put(Environment.HBM2DDL_AUTO, "update");

                settings.put(Environment.C3P0_MIN_SIZE, "5");
                settings.put(Environment.C3P0_MAX_SIZE, "20");
                settings.put(Environment.C3P0_TIMEOUT, "300");
                settings.put(Environment.C3P0_MAX_STATEMENTS, "50");
                settings.put(Environment.C3P0_IDLE_TEST_PERIOD, "3000");

                configuration.setProperties(settings);

                // Add annotated entity classes
                configuration.addAnnotatedClass(com.expense.entity.User.class);
                configuration.addAnnotatedClass(com.expense.entity.Funds.class);
                configuration.addAnnotatedClass(com.expense.entity.Expenses.class);
                configuration.addAnnotatedClass(com.expense.entity.Wishlist.class);

                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception ex) {
                System.err.println("SessionFactory creation failed: " + ex.getMessage());
                throw new ExceptionInInitializerError(ex);
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
