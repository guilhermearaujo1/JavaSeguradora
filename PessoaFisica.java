
import java.util.ArrayList;

public class PessoaFisica extends Cliente{
	private String dataNascimento;
	private String cpf;
	private ArrayList<Residencial> listResidencial = new ArrayList<Residencial>();
	
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nomeCliente,String email, String cpf, String dataNascimento) {
		
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.setNome(nomeCliente);
		this.setEmail(email);
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Residencial> getListResidencial() {
		return listResidencial;
	}

	public void setListResidencial(ArrayList<Residencial> listResidencial) {
		this.listResidencial = listResidencial;
	}
	
}
