package testes;

import dao.ProdutoDao;
import model.Produto;
import util.JPAUtil;

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

        EntityManager entity = JPAUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(entity);
        entity.getTransaction().begin();
        dao.cadastrar(produto);
        entity.getTransaction().commit();
        entity.close();
    }
}
