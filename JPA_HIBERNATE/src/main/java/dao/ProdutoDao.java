package dao;

import model.Produto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
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
    public List<Produto> findProductByName(String nome) {
        String jpql = "SELECT p from Produto p WHERE p.nome = :nome";
        return entity.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    public List<Produto> findProductByCategoria(String nome) {
        String jpql = "SELECT p from Produto p WHERE p.categoria.nome = :nome";
        return entity.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    public BigDecimal findPriceOfProductByName(String nome) {
        String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome";
        return entity.createQuery(jpql, BigDecimal.class)
                .setParameter("nome", nome)
                .getSingleResult();
    }
}
