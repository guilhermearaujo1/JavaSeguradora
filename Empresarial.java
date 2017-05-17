
public class Empresarial extends Contrato{
	
	private PessoaJuridica pessoaJuridica;
	private int numeroDeFuncionarios;
	private int numedoDeVisitantes;
	private String ramo;
	
	
	
	public Empresarial(PessoaJuridica cliente, int numeroDeFuncionarios, int numedoDeVisitantes, float valorDoImovel, String ramo) {
		super();
		this.pessoaJuridica = cliente;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
		this.numedoDeVisitantes = numedoDeVisitantes;
		this.ramo = ramo;
		this.setValorDoImovel(valorDoImovel);
	}
	
	
	public PessoaJuridica getpessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	public int getNumedoDeVisitantes() {
		return numedoDeVisitantes;
	}
	public void setNumedoDeVisitantes(int numedoDeVisitantes) {
		this.numedoDeVisitantes = numedoDeVisitantes;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	
}
