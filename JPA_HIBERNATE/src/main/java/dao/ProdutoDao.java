package dao;

import model.Produto;

import javax.persistence.EntityManager;

public class ProdutoDao {

    private EntityManager entity;
    public ProdutoDao(EntityManager entity) {
        this.entity = entity;
    }

    public void cadastrar(Produto produto) {
        entity.persist(produto);
    }
}
