/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cenaflix.cenaflixpodcast.dao;

import com.cenaflix.cenaflixpodcast.model.Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author Carlos Borges
 */
public class PodcastDAO {

    private EntityManager em;

    public PodcastDAO(EntityManager em) {
        this.em = em;
    }

    public PodcastDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
        em = emf.createEntityManager();
    }

    public void salvar(Podcast p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        
    }

   public boolean excluir(int id) {
    Podcast p = em.find(Podcast.class, id);
       
    if (p == null) {
        return false; // Não existe registro com esse ID
    }
    

    em.getTransaction().begin();
    em.remove(p);
    em.getTransaction().commit();
    return true; // Exclusão realizada
}

    public List<Podcast> listarTodos() {

        return em.createQuery("FROM Podcast", Podcast.class).getResultList();
    }

    public List<Podcast> filtrarPorProdutor(String filtro) {
        return em.createQuery(
                "FROM Podcast p WHERE LOWER(p.produtor) LIKE :filtro", Podcast.class)
                .setParameter("filtro", "%" + filtro.toLowerCase() + "%")
                .getResultList();
    }
}
