package entities;

public class Conta {
	
	private Integer numero;
	private String pessoa;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String pessoa, Double saldo, Double limiteSaque) {

		
		this.numero = numero;
		this.pessoa = pessoa;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double quantia) {
		this.saldo += quantia;
	}
	
	public void saque(Double quantia) {
		validaSaque(quantia);
		this.saldo -= quantia;
	}
	
	public void validaSaque(Double quantia) {
		if(quantia > saldo) {
			throw new Excessoes("Saldo insuficiente");
		}
		
		if(quantia > limiteSaque) {
			throw new Excessoes("A quantia excede o limite de saque");
		}
	}

}
