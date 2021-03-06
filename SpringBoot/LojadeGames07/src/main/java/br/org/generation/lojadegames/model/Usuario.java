package br.org.generation.lojadegames.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	/*Declarando a variavel de ID, fazendo o AUTO_INCREMENT
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*Declarando a variavel de nome, e aplicando o 
	  NotBlank para não aceitar espaços em branco e não ser nulo
	 */
	@NotBlank(message = "O atributo Nome é Obrigatório!")
	private String nome;

	/*Declarando variavel de usuario, e aplicando 
	  NotBlank para não aceitar espaços e não ser nulo e fazendo a validação do email
	 */
	@NotBlank(message = "O atributo Usuário é Obrigatório!")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	private String usuario;
	
	/*Declarando variavel de senha, e aplicando 
	  NotBlank para não aceitar espaços e não ser nulo e definindo o tamanho
	 */
	@NotBlank(message = "O atributo Senha é Obrigatório!")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	/*Formatando a data de nascimento
	 */
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-DD")
	private LocalDate data;
    
	/*
	@JsonFormat(pattern = "yyyy-MM-DD")
	private LocalDate data;
	*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
}