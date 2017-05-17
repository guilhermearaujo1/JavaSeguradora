
import java.util.ArrayList;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String inscricaoEstadual;
	private String nomeDaEmpresa;
	private ArrayList<Empresarial> listEmpresarial = new ArrayList<Empresarial>();
	
	
	
	
	
	public PessoaJuridica(String nomeCliente, String email, String nomeDaEmpresa, String cnpj, String inscricaoEstadual) {
		super();
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.setNome(nomeCliente);
		this.setEmail(email);
	}
	
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public ArrayList<Empresarial> getListEmpresarial() {
		return listEmpresarial;
	}


	public void setListEmpresarial(ArrayList<Empresarial> listEmpresarial) {
		this.listEmpresarial = listEmpresarial;
	}
	
	
	
}
