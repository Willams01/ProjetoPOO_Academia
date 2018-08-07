package academia.ufpb.br;

public class Funcionario extends Pessoa{
	private double salario;//Salario do Funcionario
	private String cargaHoraria;//Carga Horaria do funcionario
	private static final String tipo = "funcionario";//Variavel para definir que a pessoa é um funcionario
	
	public Funcionario(){}//Construtor vazio
	
	public Funcionario(int id, String nome, String cpf, Contato contato, Endereco endereco, String data_nascimento,double salario, String cargaHoraria){//Construtor
		super(id, nome, cpf, contato, endereco, data_nascimento, tipo);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setCargaHorario(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	public String toString() {
		return "\nID: "+this.getId()+"\nNome: "+super.getNome()+"\nCPF: "+super.getCpf()+"\nContato: "+super.getContato()+"\nEndereco: "+super.getEndereco()+"\nSalario: "+this.salario+"\nCarga Horaria: "+this.cargaHoraria;
	}
}
