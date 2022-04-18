package testes;

import dao.CategoriaDao;
import dao.ProdutoDao;
import model.Categoria;
import model.Produto;
import util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

import static java.lang.System.out;

public class CadastroDeProduto {

    public static void cadastrarProduto(EntityManager entity) {
        Produto produto = new Produto();
        Categoria categoria = new Categoria();
        categoria.setNome("celular");
        produto.setCodigoDeBarra(111022);
        produto.setDescricao("Celular da Xiaomi com xxxx....");
        produto.setPreco(new BigDecimal("4500"));
        produto.setNome("Xiaomi M3");

        ProdutoDao dao = new ProdutoDao(entity);
        CategoriaDao categoriaDao = new CategoriaDao(entity);
        entity.getTransaction().begin();
        categoriaDao.cadastrar(categoria);
        dao.cadastrar(produto);
        entity.getTransaction().commit();
    }
    public static void main(String[] args) {
        EntityManager entity = JPAUtil.getEntityManager();

        cadastrarProduto(entity);
        ProdutoDao produtoDao = new ProdutoDao(entity);
        Produto produto = produtoDao.findProductById(1);
        System.out.println(produto.getNome() + produto.getDescricao());
        produtoDao.findAllProducts().forEach(produto1 -> out.println(produto1.getPreco()));
        entity.close();
    }
}
