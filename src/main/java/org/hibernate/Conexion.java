/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Conexion {

    private static Session session;
    private static Transaction transaction;

    public static Session session() {

        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.getTransaction();
        transaction.begin();
        
        return session;
        
    }

    public static void commit() {
        
        transaction.commit();
        session.close();



    }

}
