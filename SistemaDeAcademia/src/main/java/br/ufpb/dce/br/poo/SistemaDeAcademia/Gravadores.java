package br.ufpb.dce.br.poo.SistemaDeAcademia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gravadores {

	public void gravarClientes(List<Cliente> clientes, String nomeArquivo) throws IOException {
		BufferedWriter gravador = null;

		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
			gravador.write(clientes.size() + "\n");

			for (Cliente c : clientes) {
				gravador.write(c.getId() + "\n");
				gravador.write(c.getNome() + "\n");
				gravador.write(c.getCpf() + "\n");
				gravador.write(c.getDataNascimento() + "\n");
				gravador.write(c.getContato().getEmail() + "\n");
				gravador.write(c.getContato().getTelefone().getDd() + "\n");
				gravador.write(c.getContato().getTelefone().getNumero() + "\n");
				gravador.write(c.getEndereco().getBairro() + "\n");
				gravador.write(c.getEndereco().getCidade() + "\n");
				gravador.write(c.getEndereco().getEstado() + "\n");
				gravador.write(c.getEndereco().getLogradouro() + "\n");
				gravador.write(c.getEndereco().getNumero() + "\n");
				gravador.write(c.getEndereco().getComplemento() + "\n");

			}
		} finally {
			if (gravador != null) {
				gravador.close();
			}
		}
	}

	public List<Cliente> recuperarCliente(String nomeArquivo) throws IOException {
		BufferedReader leitor = null;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			leitor = new BufferedReader(new FileReader(nomeArquivo));
			String texto = null;
			do {
				texto = leitor.readLine();
				if(texto != null) {
					int quantidadeClientes = Integer.parseInt(texto);
					for(int i = 0; i < quantidadeClientes;i++) {
						int id = Integer.parseInt(leitor.readLine());
						String nome = leitor.readLine();
						String cpf = leitor.readLine();
						String dataNascimento = leitor.readLine();
						String email = leitor.readLine();
						int ddd = Integer.parseInt(leitor.readLine());
						int numeroTelefone = Integer.parseInt(leitor.readLine()); 
						String bairro = leitor.readLine();
						String cidade = leitor.readLine();
						String estado = leitor.readLine();
						String logradouro = leitor.readLine();
						int numeroEndereco = Integer.parseInt(leitor.readLine());
						String complemento = leitor.readLine();
						
						Telefone telefone1 = new Telefone(ddd,numeroTelefone);
						Contato contato1 = new Contato(telefone1, email);
						Endereco endereco1 = new Endereco(logradouro,numeroEndereco,complemento,bairro,cidade,estado);
						Cliente cliente = new Cliente(id, nome, cpf, contato1, endereco1,dataNascimento, null);
						
						clientes.add(cliente);
					}
				}
			}while(texto != null);
			
		}finally {
			if(leitor != null) {
				leitor.close();
			}
		}
		return clientes;
	}
	
	//Gravador e Leitor Funcionario 
	
	public void gravarFuncionarios(List<Funcionario> funcionarios, String nomeArquivo) throws IOException {
		BufferedWriter gravador = null;

		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
			gravador.write(funcionarios.size() + "\n");

			for (Funcionario f : funcionarios) {
				gravador.write(f.getId() + "\n");
				gravador.write(f.getNome() + "\n");
				gravador.write(f.getCpf() + "\n");
				gravador.write(f.getDataNascimento() + "\n");
				gravador.write(f.getContato().getEmail() + "\n");
				gravador.write(f.getContato().getTelefone().getDd() + "\n");
				gravador.write(f.getContato().getTelefone().getNumero() + "\n");
				gravador.write(f.getEndereco().getBairro() + "\n");
				gravador.write(f.getEndereco().getCidade() + "\n");
				gravador.write(f.getEndereco().getEstado() + "\n");
				gravador.write(f.getEndereco().getLogradouro() + "\n");
				gravador.write(f.getEndereco().getNumero() + "\n");
				gravador.write(f.getEndereco().getComplemento() + "\n");
				gravador.write(f.getSalario()+"\n");
				gravador.write(f.getCargaHoraria());

			}
		} finally {
			if (gravador != null) {
				gravador.close();
			}
		}
	}

	public List<Funcionario> recuperarFuncionario(String nomeArquivo) throws IOException {
		BufferedReader leitor = null;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try {
			leitor = new BufferedReader(new FileReader(nomeArquivo));
			String texto = null;
			do {
				texto = leitor.readLine();
				if(texto != null) {
					int quantidadeFuncionarios = Integer.parseInt(texto);
					for(int i = 0; i < quantidadeFuncionarios;i++) {
						int id = Integer.parseInt(leitor.readLine());
						String nome = leitor.readLine();
						String cpf = leitor.readLine();
						String dataNascimento = leitor.readLine();
						String email = leitor.readLine();
						int ddd = Integer.parseInt(leitor.readLine());
						int numeroTelefone = Integer.parseInt(leitor.readLine()); 
						String bairro = leitor.readLine();
						String cidade = leitor.readLine();
						String estado = leitor.readLine();
						String logradouro = leitor.readLine();
						int numeroEndereco = Integer.parseInt(leitor.readLine());
						String complemento = leitor.readLine();
						double salario = Double.parseDouble(leitor.readLine());
						String cargaHoraria = leitor.readLine();
						
						Telefone telefone1 = new Telefone(ddd,numeroTelefone);
						Contato contato1 = new Contato(telefone1, email);
						Endereco endereco1 = new Endereco(logradouro,numeroEndereco,complemento,bairro,cidade,estado);
						Funcionario funcionario = new Funcionario(id, nome, cpf, contato1, endereco1,dataNascimento, salario, cargaHoraria);
						
						funcionarios.add(funcionario);
					}
				}
			}while(texto != null);
			
		}finally {
			if(leitor != null) {
				leitor.close();
			}
		}
		return funcionarios;
	}
	
	//Gravador e leitor Equipamentos
	
	public void gravarEquipamentos(List<Equipamento> equipamentos, String nomeArquivo) throws IOException {
		BufferedWriter gravador = null;

		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
			gravador.write(equipamentos.size() + "\n");

			for (Equipamento e : equipamentos) {
				gravador.write(e.getNome() + "\n");
				gravador.write(e.getTipoEquipamento()+"\n");
				gravador.write(e.getPesoMaterial()+"\n");
				gravador.write(e.getID() + "\n");
				gravador.write(e.getDescricao()+"\n");

			}
		} finally {
			if (gravador != null) {
				gravador.close();
			}
		}
	}

	public List<Equipamento> recuperarEquipamento(String nomeArquivo) throws IOException {
		BufferedReader leitor = null;
		List<Equipamento> equipamentos = new ArrayList<Equipamento>();
		
		try {
			leitor = new BufferedReader(new FileReader(nomeArquivo));
			String texto = null;
			do {
				texto = leitor.readLine();
				if(texto != null) {
					int quantidadeFuncionarios = Integer.parseInt(texto);
					for(int i = 0; i < quantidadeFuncionarios;i++) {
						int id = Integer.parseInt(leitor.readLine());
						String nome = leitor.readLine();
						String tipoEquipamento = leitor.readLine();
						double pesoMaterial = Double.parseDouble(leitor.readLine());
						String descricao = leitor.readLine();
						
						Equipamento equipamento = new Equipamento(nome, tipoEquipamento,pesoMaterial,id,descricao);
						
						equipamentos.add(equipamento);
					}
				}
			}while(texto != null);
			
		}finally {
			if(leitor != null) {
				leitor.close();
			}
		}
		return equipamentos;
	}
	
}

//gravadores.gravadorCliente(clientes, nome+txt);

