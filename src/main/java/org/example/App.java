package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
User u = new User();
        u.setId(100L);
        u.setNombre("Ma");
        u.setApellido("Dipa");
        u.setEmail("morron@gmail.com");
        u.setTelefono("9667254897");
        u.setPassword("1234");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        System.out.println(u);
    }
}
