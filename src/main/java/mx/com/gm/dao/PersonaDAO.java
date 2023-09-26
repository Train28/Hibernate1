/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

/**
 *
 * @author pc_dev
 */
public class PersonaDAO {

    private EntityManager em;
    private EntityManagerFactory emf;

    public PersonaDAO() {

        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        
        for (Persona persona : personas) {
            System.out.println("Persona" + persona);
        }
    }

    public void insertar(Persona person){
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        
    }
    
//    public Persona buscarPersona(Persona per){
//        return em.find(Persona.class,0);
//        
//        }
//


    public Persona buscarPersona(int id){
       return em.find(Persona.class, id);
    }
}
