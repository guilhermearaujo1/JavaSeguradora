
public class Residencial extends Contrato{
	
	private PessoaFisica pessoaFisica;
	private String endereco;
	private String zonaDoImovel;
	private String tipoDeResidencia;
	
	
	
	
	
	public Residencial(PessoaFisica cliente, String endereco, String tipoDeResidencia, float valorDoImovel, String zonaDoImovel) {
		super();
		this.pessoaFisica = cliente;
		this.endereco = endereco;
		this.zonaDoImovel = zonaDoImovel;
		this.tipoDeResidencia = tipoDeResidencia;
		this.setValorDoImovel(valorDoImovel);
	}
	
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getZonaDoImovel() {
		return zonaDoImovel;
	}
	public void setZonaDoImovel(String zonaDoImovel) {
		this.zonaDoImovel = zonaDoImovel;
	}
	public String getTipoDeResidencia() {
		return tipoDeResidencia;
	}
	public void setTipoDeResidencia(String tipoDeResidencia) {
		this.tipoDeResidencia = tipoDeResidencia;
	}

}
