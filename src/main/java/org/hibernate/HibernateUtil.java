/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate;


import java.util.HashMap;
import java.util.Map;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.models.Person;


public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    private static final String CONTROLADOR = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/test-struts";
    private static final String USUARIO = "postgres";
    private static final String CLAVE = "postgres";
    private static final String INICIALIZACION = "create-drop";    // create , create-drop , update
    private static final String DIALECT = "org.hibernate.dialect.PostgreSQL10Dialect";

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                StandardServiceRegistryBuilder registryBuilder
                        = new StandardServiceRegistryBuilder();

                Map<String, String> settings = new HashMap<>();

                settings.put("hibernate.connection.driver_class", CONTROLADOR);
                settings.put("hibernate.connection.url", URL);
                settings.put("hibernate.connection.username", USUARIO);
                settings.put("hibernate.connection.password", CLAVE);
                settings.put("hibernate.show_sql", "false");
                settings.put("hibernate.hbm2ddl.auto", INICIALIZACION);
                settings.put(Environment.DIALECT, DIALECT);

       

                registryBuilder.applySettings(settings);
                registry = registryBuilder.build();
                MetadataSources sources = new MetadataSources(registry)
                        .addAnnotatedClass(Person.class);


                sessionFactory = sources.buildMetadata().buildSessionFactory();

            } catch (Exception e) {
                System.out.println("SessionFactory creation failed");
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

}
