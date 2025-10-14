/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cenaflix.cenaflixpodcast.dao;

import com.cenaflix.cenaflixpodcast.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

/**
 *
 * @author Carlos Borges
 */
public class UsuarioDAO {

    private EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;

//         EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("teste");
//        EntityManager manager = entityFactory.createEntityManager();
    }

    public Usuario buscarPorNomeSenha(String nome, String senha) {
        try {
            return em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.nome_usuario = :nome AND u.senha = :senha",
                    Usuario.class)
                    .setParameter("nome", nome)
                    .setParameter("senha", senha)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void cadastrarUsuariosPadrao() {
        long count = em.createQuery("SELECT COUNT(u) FROM Usuario u", Long.class).getSingleResult();
        if (count == 0) {
            em.getTransaction().begin();
            em.persist(new Usuario("admin", "123", "Administrador"));
            em.persist(new Usuario("op", "123", "Operador"));
            em.persist(new Usuario("user", "123", "Usuário"));
            em.getTransaction().commit();
        }
    }
}
