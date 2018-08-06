package academia.ufpb.br;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Pessoa extends Planos{
	private int id;
	private String nome;
	private String cpf;
	private Contato contato;
	private Endereco endereco;
	private String tipo;//Para diferenciar se a pessoa é cliente ou funcionario
	private String data_nascimento;


	public Pessoa(){}

	public Pessoa(int id, String nome, String cpf, Contato contato, Endereco endereco, String data_nascimento,String tipo){

		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.endereco = endereco;
		this.data_nascimento = data_nascimento;
		this.tipo = tipo;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getCpf(){
		return this.cpf;
	}

	public void setContato(Contato contato){
		this.contato = contato;
	}

	public Contato getContato(){
		return this.contato;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}

	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	public Endereco getEndereco(){
		return this.endereco;
	}
	
	
}
