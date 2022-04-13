package testes;

import Model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setCodigoDeBarra(111022);
        produto.setDescricao("Celular da Xiaomi com xxxx....");
        produto.setPreco(new BigDecimal("4500"));
        produto.setNome("Xiaomi M3");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbH2");
        EntityManager entity = factory.createEntityManager();
        entity.getTransaction().begin();
        entity.persist(produto);
        entity.getTransaction().commit();
        entity.close();
    }
}
