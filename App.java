App.java

package com.exanple;

import org.hibernate Session

import org.hibernate.que

public static void main(String[] args) (

Session session= HibernateUtil

getSessionFactory()

open Session()

session begin Transaction();

Query<Product> query

session.createQuery(
  getSessionFactory()

open Session():

session begin Transaction():

Query Product query=

session.createQuery(

"FROM Product ORDER BY price ASC

Product class);

List Product> products

for(Product

pget Price())

session.getTransaction().commit();

session.close():
   }
}
