package br.org.generation.farmacia.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.farmacia.model.Produtos;
import br.org.generation.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutosController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> getAll(){ 
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> getById(@PathVariable long id){
		return produtoRepository.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produtos>> getByTitulo(@PathVariable String nome){
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping 
	public ResponseEntity<Produtos> postProduto(@RequestBody Produtos produto){ 
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produtos> putProduto(@Valid @RequestBody Produtos produto) {
					
		return produtoRepository.findById(produto.getId())
				.map(resposta -> {
					return ResponseEntity.ok().body(produtoRepository.save(produto));
				})
				.orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable long id) {
		
		return produtoRepository.findById(id)
				.map(resposta -> {
					produtoRepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}/oulaboratorio/{laboratorio}")
	public ResponseEntity<List<Produtos>> getByNomeOuLaboratorio(@PathVariable String nome, @PathVariable String laboratorio){
		return ResponseEntity.ok(produtoRepository.findByNomeOrLaboratorio(nome, laboratorio));
	}
	
	@GetMapping("/nome/{nome}/elaboratorio/{laboratorio}")
	public ResponseEntity<List<Produtos>> getByNomeELaboratorio(@PathVariable String nome, @PathVariable String laboratorio){
		return ResponseEntity.ok(produtoRepository.findByNomeAndLaboratorio(nome, laboratorio));
	}
	
	@GetMapping("/preco_inicial/{inicio}/preco_final/{fim}")
	public ResponseEntity<List<Produtos>> getByPrecoEntre(@PathVariable BigDecimal inicio, @PathVariable BigDecimal fim){
		return ResponseEntity.ok(produtoRepository.buscarProdutosEntre(inicio, fim));
	}

}
