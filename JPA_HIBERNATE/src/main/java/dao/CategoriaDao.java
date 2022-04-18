package dao;

import model.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {

    public EntityManager entity;

    public CategoriaDao(EntityManager entity) {
        this.entity = entity;
    }

    public void cadastrar(Categoria categoria) {
        this.entity.persist(categoria);
    }
}
