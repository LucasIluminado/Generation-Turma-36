package br.org.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.generation.farmacia.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
	
public List <Produtos> findAllByNomeContainingIgnoreCase(String nome);
	
	 public List <Produtos> findByNomeAndLaboratorio(String nome, String laboratorio);
	
	 public List <Produtos> findByNomeOrLaboratorio(String nome, String laboratorio);

	@Query(value = "select * from tb_produtos where preco between :inicio and :fim", nativeQuery = true)
	public List <Produtos> buscarProdutosEntre(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);
}