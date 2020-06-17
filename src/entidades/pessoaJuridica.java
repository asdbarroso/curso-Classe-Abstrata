package entidades;

public class pessoaJuridica extends Pessoa{

	private int funcionarios;

	public pessoaJuridica(String nome, Double rendaAnual, int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public double calculaImposto() {
		
		double imposto = 0.00;
		
		if(getFuncionarios() < 10) {
		imposto = getRendaAnual() * 0.15;
		} else {
			imposto = getRendaAnual() * 0.14;
		}
			return imposto;
	}
	
	
}
