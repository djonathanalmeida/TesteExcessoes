package entities;

public class Excessoes extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public Excessoes(String mensagem) {
		super(mensagem);
	}
	
}
