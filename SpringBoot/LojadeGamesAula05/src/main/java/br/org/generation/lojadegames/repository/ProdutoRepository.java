package br.org.generation.lojadegames.repository;

import java.math.BigDecimal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojadegames.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
	
	public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Produtos> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produtos> findByprecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
