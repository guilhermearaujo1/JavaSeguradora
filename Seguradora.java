
import java.util.ArrayList;

public class Seguradora {
	
	private ArrayList<PessoaFisica> listPessoaFisica = new ArrayList<PessoaFisica>();
	private ArrayList<PessoaJuridica> listPessoaJuridica = new ArrayList<PessoaJuridica>();
	
	
	public void cadastrarClientePessoaFisica(String nomeCliente,String email, String cpf, String dataNascimento){
		
		PessoaFisica cliente = new PessoaFisica(nomeCliente, email, cpf, dataNascimento);
		
		this.listPessoaFisica.add(cliente);
		
	}
	
	public void cadastrarClientePessoaJuridica(String nomeCliente, String email, String nomeDaEmpresa, String cnpj, String inscricaoEstadual){
		
		PessoaJuridica cliente = new PessoaJuridica(nomeCliente, email, nomeDaEmpresa, cnpj, inscricaoEstadual);
		
		this.listPessoaJuridica.add(cliente);
		
	}
	
	public void cadastrarContratoResidencial(PessoaFisica cliente, String endereco, String tipoDeResidencia, float valorDoImovel, String zonaDoImovel){
		
		Residencial contrato = new Residencial(cliente, endereco, tipoDeResidencia, valorDoImovel, zonaDoImovel);
		
		cliente.getListResidencial().add(contrato);
		
	}
	
	public void cadastrarContratoEmpresarial(PessoaJuridica cliente, int numeroDeFuncionarios, int numedoDeVisitantes, float valorDoImovel, String ramo){
		
		Empresarial contrato = new Empresarial(cliente, numeroDeFuncionarios, numedoDeVisitantes, valorDoImovel, ramo);
		
		
		cliente.getListEmpresarial().add(contrato);
		
	}
	
	public void listaClientes(int tipoCliente){
		
		int i = 0;
		
		if(tipoCliente == 1){
			
			System.out.println();
			System.out.println();
			System.out.println("------------ Lista de Clientes Pessoa Fisica ------------");
			
			for( i = 0; i < this.listPessoaFisica.size(); i++){
			   
				System.out.println();
				System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getNome());
				System.out.println("Email: " + this.listPessoaFisica.get(i).getEmail());
				System.out.println();
				
			}
			
			System.out.println();
			System.out.println();
			
		}else if(tipoCliente == 2){
			
			System.out.println();
			System.out.println();
			System.out.println("------------ Lista de Clientes Pessoa Juridica ------------");
			
			for( i = 0; i < this.listPessoaJuridica.size(); i++){
			   
				System.out.println();
				System.out.println("Nome Cliente: " + this.listPessoaJuridica.get(i).getNome());
				System.out.println("Nome da Empresa: " + this.listPessoaJuridica.get(i).getNomeDaEmpresa());
				System.out.println();
				
			}
			
			System.out.println();
			System.out.println();
			
		}else if(tipoCliente == 3){
			
			System.out.println();
			System.out.println();
			System.out.println("------------ Lista de Todos os Clientes ------------");
			
			for( i = 0; i < this.listPessoaFisica.size(); i++){
			   
				System.out.println();
				System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getNome());
				System.out.println("Email: " + this.listPessoaFisica.get(i).getEmail());
				System.out.println();
				
			}
			for( i = 0; i < this.listPessoaJuridica.size(); i++){
				   
				System.out.println();
				System.out.println("Nome Cliente: " + this.listPessoaJuridica.get(i).getNome());
				System.out.println("Nome da Empresa: " + this.listPessoaJuridica.get(i).getNomeDaEmpresa());
				System.out.println();
				
			}
			
			System.out.println();
			System.out.println();
			
		}else{
			System.out.println("Opção invalida senhor(a)");
		}
		
		
	}
	
	public void listaContrato(int tipoContrato){
		
		int i = 0;
		int j = 0;
		
		if(tipoContrato == 1){
			
			System.out.println();
			System.out.println();
			System.out.println("------------ Lista de Contratos Residenciais ------------");
			
			for( i = 0; i < this.listPessoaFisica.size(); i++){
				for( j = 0; j < this.listPessoaFisica.get(i).getListResidencial().size(); j++){
					
					System.out.println();
					System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getListResidencial().get(j).getPessoaFisica().getNome());
					System.out.println("Tipo de Residencia: " + this.listPessoaFisica.get(i).getListResidencial().get(j).getTipoDeResidencia());
					System.out.println("Endereço da Residencia: " + this.listPessoaFisica.get(i).getListResidencial().get(j).getEndereco());
					System.out.println();
					
				}
				
			}
			
			System.out.println();
			System.out.println();
			
		}else if(tipoContrato == 2){
			
			System.out.println();
			System.out.println();
			System.out.println("------------ Lista de Contratos Empresariais ------------");
			
			for( i = 0; i < this.listPessoaJuridica.size(); i++){
				for( j = 0; j < this.listPessoaJuridica.get(i).getListEmpresarial().size(); j++){
			   
				System.out.println();
				System.out.println("Nome Cliente: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(j).getpessoaJuridica().getNome());
				System.out.println("Nome da Empresa: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(j).getpessoaJuridica().getNomeDaEmpresa());
				System.out.println();
				
				}
				
			}
			
			System.out.println();
			System.out.println();
			
		}else if(tipoContrato == 3){
			
			System.out.println();
			System.out.println();
			System.out.println("------------ Lista de Todos os Contratos ------------");
			
			for( i = 0; i < this.listPessoaFisica.size(); i++){
				for( j = 0; j < this.listPessoaFisica.get(i).getListResidencial().size(); j++){
					
					System.out.println();
					System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getListResidencial().get(j).getPessoaFisica().getNome());
					System.out.println("Tipo de Residencia: " + this.listPessoaFisica.get(i).getListResidencial().get(j).getTipoDeResidencia());
					System.out.println("Emdereço da Residencia: " + this.listPessoaFisica.get(i).getListResidencial().get(j).getEndereco());
					System.out.println();
					
				}
				
			}
			for( i = 0; i < this.listPessoaJuridica.size(); i++){
				for( j = 0; j < this.listPessoaJuridica.get(i).getListEmpresarial().size(); j++){
			   
				System.out.println();
				System.out.println("Nome Cliente: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(j).getpessoaJuridica().getNome());
				System.out.println("Nome da Empresa: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(j).getpessoaJuridica().getNomeDaEmpresa());
				System.out.println();
				
				}
				
			}
			
			System.out.println();
			System.out.println();
			
		}else{
			System.out.println("Opção invalida senhor(a)");
		}
		
		
	}
	
	public static float calcularPorcentagem(float valor, float porcentagem){
		
		valor = (porcentagem / 100) * valor;
		
		return valor;
	}
	
	public float calcularSeguroResidencial(Residencial contrato){
		
		float valorSeguro;
		
		
		valorSeguro = calcularPorcentagem(contrato.getValorDoImovel(), 2);
		
		if(contrato.getZonaDoImovel().compareToIgnoreCase("urbana") == 0){
			
			valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 1); 
		
		}else if(contrato.getZonaDoImovel().compareToIgnoreCase("suburbana") == 0){
			
			valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 0.5f);
		
		}else{
			
			System.out.println("Sua zona está errada, corrija por favor. ex:(urbana,suburbana)");
			return 0;
		
		}
		
		
		if(contrato.getTipoDeResidencia().compareToIgnoreCase("casa") == 0){
		
			valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 0.5f);
		
		}
		
		return valorSeguro;
	}
	
	public float calcularSeguroEmpresarial(Empresarial contrato){
		
		float valorSeguro;
		
		valorSeguro = calcularPorcentagem(contrato.getValorDoImovel(), 4);
		valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 0.2f) * (contrato.getNumeroDeFuncionarios() / 10);
		valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 0.3f) * (contrato.getNumedoDeVisitantes() / 200);
		
		if(contrato.getRamo().compareToIgnoreCase("industria") == 0){
			
			valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 1);
			
		}else if(contrato.getRamo().compareToIgnoreCase("comercio") == 0){
			
			valorSeguro += calcularPorcentagem(contrato.getValorDoImovel(), 0.5f);
			
		}else{
			
			System.out.println("Tipo de Empresa invalido, corrija por favor. ex:(Industria, Comercio)");
			return 0;
			
		}
		
		
		return valorSeguro;
	}
	
	public void cadastrarSinistroResidencial(Residencial contrato, float porcentagemPerca, String data){
		
		Sinistro sinistro = new Sinistro(porcentagemPerca, data);
		
		contrato.getListSinistro().add(sinistro);
	}
	
	public void cadastrarSinistroEmpresarial(Empresarial contrato, float porcentagemPerca, String data){
		
		Sinistro sinistro = new Sinistro(porcentagemPerca, data);
		
		contrato.getListSinistro().add(sinistro);
	}

	public void listContratoComSinistro(){
		
		int i;
		int j;
		int k;
		
		
		System.out.println();
		System.out.println();
		System.out.println("------------ Lista de Sinistros de Contratos Residenciais ------------");
		System.out.println();
		System.out.println();
		
		for(i = 0; i < this.listPessoaFisica.size(); i++){
			for(j = 0; j < this.listPessoaFisica.get(i).getListResidencial().size(); j++){
				for(k = 0; k < this.listPessoaFisica.get(i).getListResidencial().get(j).getListSinistro().size(); k++){
					
					System.out.println();
					System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getNome());
					System.out.println("Data: " + this.listPessoaFisica.get(i).getListResidencial().get(i).getListSinistro().get(k).getData());
					System.out.println("Porcentagem de Perca: " + this.listPessoaFisica.get(i).getListResidencial().get(i).getListSinistro().get(k).getPorcentagemPerca());
					System.out.println();
					
				}
				
			}
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("------------ Lista de Sinistros de Contratos Empresariais ------------");
		System.out.println();
		System.out.println();
		
		for(i = 0; i < this.listPessoaJuridica.size(); i++){
			for(j = 0; j < this.listPessoaJuridica.get(i).getListEmpresarial().size(); j++){
				for(k = 0; k < this.listPessoaJuridica.get(i).getListEmpresarial().get(j).getListSinistro().size(); k++){
					
					System.out.println();
					System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getNome());
					System.out.println("Data: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(i).getListSinistro().get(k).getData());
					System.out.println("Porcentagem de Perca: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(i).getListSinistro().get(k).getPorcentagemPerca());
					System.out.println();
					
				}
				
			}
			
		}
		System.out.println();
		System.out.println();
		
	}
	
	public void listContratoSemSinstro(){
		
		int i;
		int j;
		
		
		System.out.println();
		System.out.println();
		System.out.println("------------ Lista de Contratos Sem Sinistro------------");
		System.out.println();
		System.out.println();
		
		for(i = 0; i < this.listPessoaFisica.size(); i++){
			for(j = 0; j < this.listPessoaFisica.get(i).getListResidencial().size(); j++){
				
				if(this.listPessoaFisica.get(i).getListResidencial().get(j).getListSinistro().size() == 0){
					
					System.out.println();
					System.out.println("Nome Cliente: " + this.listPessoaFisica.get(i).getListResidencial().get(i).getPessoaFisica().getNome());
					System.out.println("Tipo de Residencia: " + this.listPessoaFisica.get(i).getListResidencial().get(i).getTipoDeResidencia());
					System.out.println();
					
				}
				
			}
			
		}
		for(i = 0; i < this.listPessoaJuridica.size(); i++){
			for(j = 0; j < this.listPessoaJuridica.get(i).getListEmpresarial().size(); j++){
				
				if(this.listPessoaFisica.get(i).getListResidencial().get(j).getListSinistro().size() == 0){
					
					System.out.println();
					System.out.println("Nome Cliente: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(i).getpessoaJuridica().getNome());
					System.out.println("Ramo Da Empresa: " + this.listPessoaJuridica.get(i).getListEmpresarial().get(i).getRamo());
					System.out.println();
					
				}
				
			}
			
		}
		System.out.println();
		System.out.println();
		
	}
	
	public int prorucarCliente(String cliente, int tipoCliente){
		
		int i;
		
		if(tipoCliente == 1){
			
			for(i = 0; i < this.listPessoaFisica.size(); i++){
				
				
				if(this.listPessoaFisica.get(i).getNome().compareToIgnoreCase(cliente) == 0){
					return i;
				}
				
			}
			System.out.println("Cliente com nome " + cliente + " não Existe");
			
		}
		else if(tipoCliente == 2){
			
			for(i = 0; i < this.listPessoaJuridica.size(); i++){
				
				if(this.listPessoaJuridica.get(i).getNome().compareToIgnoreCase(cliente) == 0){
					return i;
				}
				
			}
			System.out.println("Cliente com nome " + cliente + " não Existe");
			
		}
		else{
			
			System.out.println("Tipo de cliente invalido. ex:[1]-Pessoa Fisica  [2]-Pessoa Juridica");
			
		}
		return -1;
				
	}
	
	public PessoaFisica getPessoaFisica(int posicao){
		
		return this.listPessoaFisica.get(posicao);
		
	}
	
	public PessoaJuridica getPessoaJuridica(int posicao){
		
				return this.listPessoaJuridica.get(posicao);
	
	}

	public Residencial getContratoResidencial(String cliente, int posicaoContrato){
		
			int posicao = this.prorucarCliente(cliente, 1);
				
			if(this.getPessoaFisica(posicao).getListResidencial().size() >= posicaoContrato){
				return this.getPessoaFisica(posicao).getListResidencial().get(posicaoContrato);
			}
			
			System.out.println("Contrato não existe");
			
			
		return null;
				
	}
	
	public Empresarial getContratoEmpresarial(String cliente, int posicaoContrato){
		
		int posicao = this.prorucarCliente(cliente, 1);
			
		if(this.getPessoaJuridica(posicao).getListEmpresarial().size() >= posicaoContrato){
			return this.getPessoaJuridica(posicao).getListEmpresarial().get(posicaoContrato);
		}
		
		System.out.println("Contrato não existe");
		
		
	return null;
			
	}
	
}

