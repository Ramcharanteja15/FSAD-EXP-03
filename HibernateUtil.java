package com.example;

import org.hibernate.SessionFactory;

import org.hibernate.boot registry.StandardService

import org.hibernate.cfg.Configuration;

 private static final SessionFactory();

public final class HibernateUtil

sessionFactory = buildSessionFactory():

private HibernateUtil()

private static SessionFactory buildSessionFactory() {

try{

Configuration.configuration = new Configuration();

configuration.configure(); // loads hibernate.cfg.xml

configuration.addAnnotatedClass(Product.class);

return configuration.buildSessionFactory(

new StandardService Registry Builder()
  }
}
  applySettings (configuration.getProperties())

build());

} catch (Exception ex) {

throw new IllegalStateException("SessionFactory creation failed", ex);

1

public static SessionFactory getSessionFactory()

return sessionFactory:

 }
}
