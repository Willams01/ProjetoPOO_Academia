package br.ufpb.dce.br.poo.SistemaDeAcademia;


public class cpfNaoExisteException extends Exception {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public cpfNaoExisteException() {
		super();
	}

	public cpfNaoExisteException(String msgErro) {
		super(msgErro);
	}
}
