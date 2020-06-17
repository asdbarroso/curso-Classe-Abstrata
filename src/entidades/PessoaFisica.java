package entidades;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculaImposto() {
		double imposto = 0.0;
		if (getRendaAnual() < 20000 && getGastoSaude() > 0) {
			imposto = (getRendaAnual() * 0.15) - (getGastoSaude() * 0.5);
		} else if (getRendaAnual() < 20000) {
			imposto = getRendaAnual() * 0.15;
		} else if (getRendaAnual() >= 20000 && getGastoSaude() > 0) {
			imposto = (getRendaAnual() * 0.25) - (getGastoSaude() * 0.5);
		} else if (getRendaAnual() >= 20000) {
			imposto = getRendaAnual() * 0.25;
		}
		return imposto;
	}
	
}
