
import java.util.Scanner;

public class PanelDeControle {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Seguradora seguradora = new Seguradora();
		String opcao;
		int voltarMenu = 1;
		
		
		
		while(voltarMenu == 1){
			
		System.out.println("SEGURADORA");
		System.out.println("[1]-Cadastro de Clientes");
		System.out.println("[2]-Cadastro de Contratos");
		System.out.println("[3]-Lista de Clientes");
		System.out.println("[4]-Lista de Contratos");
		System.out.println("[5]-Cadastro de Sinistro");
		System.out.println("[6]-Lista de Sinistro");
		System.out.println("[7]-Lista de Contratos Sem Sinistro");
		System.out.print("Escolha uma das opções:");
		
		opcao=teclado.next();
		
		switch(opcao){
			case "1":
				System.out.println("Digite o nome do cliente");
				String nomeCliente = teclado.next();
				
				System.out.println("Digite o Email do cliente");
				String email = teclado.next();
				System.out.println();
				
				System.out.println("escolha o tipo do cliente");
				System.out.println("[1]-Pessoa Fisica");
				System.out.println("[2]-Pessoa Juridica");
				opcao=teclado.next();		
				System.out.println();
				
				if(opcao.equalsIgnoreCase("1")){
					System.out.println("Digite o cpf do cliente");
					String cpf = teclado.next();
					
					System.out.println("Digite a data de nascimento do cliente");
					String dataNascimento = teclado.next();
					
					seguradora.cadastrarClientePessoaFisica(nomeCliente, email, cpf, dataNascimento);
					
				}else if(opcao.equalsIgnoreCase("2")){
					System.out.println("Digite o nome da empresa");
					String nomeDaEmpresa = teclado.next();
					
					System.out.println("Digite o cnpj da empresa");
					String cnpj = teclado.next();
					
					System.out.println("Digite a inscrição estadual da empresa");
					String inscricaoEstadual = teclado.next();
					
					seguradora.cadastrarClientePessoaJuridica(nomeCliente, email, nomeDaEmpresa, cnpj, inscricaoEstadual);
				
				}else{
					System.out.println("opcao invalida");
				}
				break;
				
			case "2":
				System.out.println("Escolha que tipo de Contrato deseja cadastrar");
				System.out.println("[1]-Contrato Residencial");
				System.out.println("[2]-Contrato Empresarial");
				opcao = teclado.next();
				System.out.println();
				
				if(opcao.equalsIgnoreCase("1")){
					
					int posicao;
					PessoaFisica cliente;
					
					System.out.println("Digite o nome do cliente");
					String nomeClienteF = teclado.next();
					
					if(seguradora.prorucarCliente(nomeClienteF, 1) < 0){
						break;
					}
						
					posicao = seguradora.prorucarCliente(nomeClienteF, 1);
					cliente = seguradora.getPessoaFisica(posicao);
					
					System.out.println("Digite o endereco da residencia:");
					String endereco = teclado.next();
					
					System.out.println("Digite o tipo da residencia: ex[casa, apartamento]");
					String tipoDeResidencia = teclado.next();
					
					System.out.println("Digite o valor da residencia");
					float valorDoImovel = teclado.nextFloat();
					
					System.out.println("Digite a zona da residencia: ex[urbana, suburbana]");
					String zonaDoImovel = teclado.next();
					
					seguradora.cadastrarContratoResidencial(cliente, endereco, tipoDeResidencia, valorDoImovel, zonaDoImovel);
					
				}else if(opcao.equalsIgnoreCase("2")){
					
					int posicao;
					PessoaJuridica cliente;
					
					System.out.println("Digite o nome do cliente");
					String nomeClienteJ = teclado.next();
					
					
					if(seguradora.prorucarCliente(nomeClienteJ, 2) < 0){
						break;
					}
						
					posicao = seguradora.prorucarCliente(nomeClienteJ, 2);
					cliente = seguradora.getPessoaJuridica(posicao);
					
					
					System.out.println("Digite o numero de Funcionarios da Empresa:");
					int numeroDeFuncionarios = teclado.nextInt();
					
					System.out.println("Digite o numero de visitantes da empresa");
					int numedoDeVisitantes = teclado.nextInt();
					
					System.out.println("Digite o valor da empresa");
					float valorDoImovel = teclado.nextFloat();
					
					System.out.println("Digite o ramo da sua empresa: ex[comercio, industria]");
					String ramo = teclado.next();
					
					seguradora.cadastrarContratoEmpresarial(cliente, numeroDeFuncionarios, numedoDeVisitantes, valorDoImovel, ramo);;
				
				}else{
					System.out.println("opcao invalida");
				}
				
				break;
			case "3":
				System.out.println("Escolha o tipo de lista que deseja ver");
				System.out.println("[1]-Lista de Cliente Pessoa Fisica");
				System.out.println("[2]-Lista de Cliente Pessoa Juridica");
				int tipoCliente = teclado.nextInt();
				
				if(tipoCliente == 1){
					seguradora.listaClientes(1);
				}else if(tipoCliente == 2){
					seguradora.listaClientes(2);
				}else{
					System.out.println("Tipo de Cliente Invalildo!");
				}
				
				
				break;
			case "4":
				System.out.println("Escolha o tipo de lista que deseja ver");
				System.out.println("[1]-Lista de Cliente Residencial");
				System.out.println("[2]-Lista de Contrato Empresarial");
				int tipoContrato = teclado.nextInt();
				
				if(tipoContrato == 1){
					seguradora.listaContrato(1);
				}else if(tipoContrato == 2){
					seguradora.listaContrato(2);
				}else{
					System.out.println("Tipo de Contrato Invalildo!");
				}
				
				break;
			case "5":
				System.out.println("Digite o nome do cliente");
				String cliente = teclado.next();
				System.out.println("escolha o tipo do cliente");
				System.out.println("[1]-Pessoa Fisica");
				System.out.println("[2]-Pessoa Juridica");
				opcao = teclado.next();
				System.out.println("Digite o numero de um contrato");
				int posicaoContrato = teclado.nextInt();
				System.out.println("Digite a data do contrato");
				String data = teclado.next();
				
				if(opcao.equalsIgnoreCase("1")){
					float porcentagemPerca = seguradora.calcularSeguroResidencial(seguradora.getContratoResidencial(cliente, posicaoContrato));
					seguradora.cadastrarSinistroResidencial(seguradora.getContratoResidencial(cliente, posicaoContrato), porcentagemPerca, data);
				}else if(opcao.equalsIgnoreCase("2")){
					float porcentagemPerca = seguradora.calcularSeguroEmpresarial(seguradora.getContratoEmpresarial(cliente, posicaoContrato));
					seguradora.cadastrarSinistroEmpresarial(seguradora.getContratoEmpresarial(cliente, posicaoContrato), porcentagemPerca, data);
				}else{
					System.out.println("Tipo de Cliente Invalildo!");
				}
				
				break;
			case "6":
				seguradora.listContratoComSinistro();
				
				break;
			case "7":
				seguradora.listContratoSemSinstro();
				break;
			default:
				System.out.println("Opção invalida");
		}
		System.out.println("Deseja voltar para o menu?  [1]-SIM  [0]-NÃO");
		voltarMenu = teclado.nextInt();
		System.out.println();
		System.out.println();
		
		
		}
		teclado.close();

	}
	
}
