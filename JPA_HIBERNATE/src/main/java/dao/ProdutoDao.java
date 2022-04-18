package dao;

import model.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {

    private EntityManager entity;
    public ProdutoDao(EntityManager entity) {
        this.entity = entity;
    }

    public void cadastrar(Produto produto) {
        entity.persist(produto);
    }

    public Produto findProductById(int id) {
        return entity.find(Produto.class, id);
    }

    public List<Produto> findAllProducts() {
        String jpql = "SELECT p from Produto p";
        return entity.createQuery(jpql, Produto.class).getResultList();
    }
}
