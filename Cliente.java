public class Cliente extends Pessoa{
	private String plano;//Plano que o cliente ira contratar
	private static final String tipo = "cliente";//variavel para definir o tipo
	
	public Cliente() {}
	
	public Cliente(int id, String nome, String cpf, Contato contato, Endereco endereco,String data_nascimento, String plano){
		super(id, nome, cpf, contato ,endereco, data_nascimento, tipo);
		this.plano = plano;
		this.dependentes = dependentes;
	}
	
	public void setPlano(String plano) {//pega o plano contratado pelo cliente
		this.plano = plano;
	}
	
	public String getPlano() {//retorna o plano contratado pelo cliente
		return this.plano;
	}
	
	public String toString() {//retorna os dados do cliente
		return "\nID: "+super.getId()+"\nNome: "+super.getNome()+"\nCPF: "+super.getCpf()+"\nContato: "+super.getContato()+"\nEndereco: "+super.getEndereco()+"Plano contratado: "+this.plano;
	}
}
