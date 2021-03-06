package qa.cnabox.core;




import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import static qa.cnabox.core.DriverFactory.getDriver;

public class BasePage {
	
	
	
	// GERADOR CPF	
	private static String calcDigVerif(String num) {  
        Integer primDig, segDig;  
        int soma = 0, peso = 10;  
        for (int i = 0; i < num.length(); i++)  
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;  
        if (soma % 11 == 0 | soma % 11 == 1)  
            primDig = new Integer(0);  
        else  
            primDig = new Integer(11 - (soma % 11));  
        soma = 0;  
        peso = 11;  
        for (int i = 0; i < num.length(); i++)  
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;  
        soma += primDig.intValue() * 2;  
        if (soma % 11 == 0 | soma % 11 == 1)  
            segDig = new Integer(0);  
        else  
            segDig = new Integer(11 - (soma % 11));  
        return primDig.toString() + segDig.toString();  
    }  
    public static String geraCPF() {  
        String iniciais = "";  
        Integer numero;  
        for (int i = 0; i < 9; i++) {  
            numero = new Integer((int) (Math.random() * 10));  
            iniciais += numero.toString();  
        }  
        return iniciais + calcDigVerif(iniciais);  
    }  
    

    // GERADOR CNPJ
    public String geraCNPJ() throws Exception {
        int digito1 = 0, digito2 = 0, resto = 0;
        String  nDigResult;
        String numerosContatenados;
        Random numeroAleatorio = new Random();

        int n1 = numeroAleatorio.nextInt(10);
        int n2 = numeroAleatorio.nextInt(10);
        int n3 = numeroAleatorio.nextInt(10);
        int n4 = numeroAleatorio.nextInt(10);
        int n5 = numeroAleatorio.nextInt(10);
        int n6 = numeroAleatorio.nextInt(10);
        int n7 = numeroAleatorio.nextInt(10);
        int n8 = numeroAleatorio.nextInt(10);
        int n9 = numeroAleatorio.nextInt(10);
        int n10 = numeroAleatorio.nextInt(10); 
        int n11 = numeroAleatorio.nextInt(10); 
        int n12 = numeroAleatorio.nextInt(10); 
        int soma = n12*2 + n11*3 + n10*4 + n9*5 + n8*6 + n7*7 + n6*8 + n5*9 + n4*2 + n3*3 + n2*4 + n1*5;
        int valor = (soma / 11)*11;
        digito1 = soma-valor;
        resto = (digito1 % 11);
        if(digito1 < 2){
         digito1 = 0;
        }
        else {
          digito1 = 11-resto;
        }
        int soma2 =  digito1*2 + n12*3 + n11*4 + n10*5 + n9*6 + n8*7 + n7*8 + n6*9 + n5*2 + n4*3 + n3*4 + n2*5 + n1*6 ;
        int valor2 = (soma2 / 11)*11;
        digito2 = soma2-valor2;
        resto = (digito2 % 11);
        if(digito2 < 2){
         digito2 = 0;
        }
        else {
          digito2 = 11-resto;
        }

        numerosContatenados = String.valueOf(n1) + String.valueOf(n2) +"."+ String.valueOf(n3) + String.valueOf(n4) +
                              String.valueOf(n5) +"."+ String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)+"/"+
                              String.valueOf(n9) + String.valueOf(n10) + String.valueOf(n11) +
                              String.valueOf(n12)+"-";
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
        return numerosContatenados+nDigResult;
        
       }
 
	//======================================================================
    
    // GERADOR RG
    
    public String geraRG() throws Exception{
        String numerosContatenados;
        Random numeroAleatorio = new Random();
        
        int n1 = numeroAleatorio.nextInt(10);
        int n2 = numeroAleatorio.nextInt(10);
        int n3 = numeroAleatorio.nextInt(10);
        int n4 = numeroAleatorio.nextInt(10);
        int n5 = numeroAleatorio.nextInt(10);
        int n6 = numeroAleatorio.nextInt(10);
        int n7 = numeroAleatorio.nextInt(10);
        int n8 = numeroAleatorio.nextInt(10);
        int n9 = numeroAleatorio.nextInt(10);

        numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)  + String.valueOf(n4) +
                              String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)  +
                              String.valueOf(n9);
        return numerosContatenados;
        }
    //======================================================================
	 /***
	 * Gera Nomes e Sobrenomes aleatoriamente.
	 * 
	 * @return
	 */
	public String geraNomeAleatorio() {
		String[] nomes = { "Antonio", "Rafael", "Bruno", "Marcelo", "Alberto", "Pedro", "Anderson", "Airton", "Sidney",
				"Wilson", "Carlos", "Candido", "Hugo", "Joao", "Mauro", "Leonardo", "Natanael", "Reinaldo", "Orlando",
				"Tiago", "Gildo", "Alfredo", "Mauricio", "Jurandir", "Paulo", "Juvencio", "Daniel", "Jair", "Juvenal",
				"Jorge", "Agiliza", "Alessandro", "Alexandre", "Aline", "Paula", "Andressa", "Antonia", "Camila",
				"Carolina", "Cileia", "Debora", "Edna", "Ellen", "Eveline", "Fabio", "Fernanda", "Gesiele", "Hellen",
				"Isabela", "Joice", "Joseense", "Beatriz", "Laura", "Julia","Ana", "Alice", "Sofia", "Eduarda", "Larissa", 
				"Mariana", "Isabela", "Camila", "Valentina", "Lara", "Tatiana", "Guilherme" , "Ricardo", "Gustavo", "Pedro", 
				"Matheus", "Bernardo", "Davi", "Henrique", "Heitor" };
		
		String[] sobrenomes = { "Afonso", "Balera", "Seco", "Vieira", "Mendes", "Miyahira", "Garcia", "Cunha", "Santos",
				"Flavio","Silva","Almeida" };
		
		String[] ultimoNome = { "Magalhaes", "Alves", "Silva", "Pereira", "Mathias", "Camargo", "Moraes", "Rodrigues",
				"Fonseca", "Azevedo" };
		
		String[] tag = { "TARGET QA" };
		StringBuilder nomeAleatorio = new StringBuilder();
		nomeAleatorio.append(nomes[new Random().nextInt(77)]).append(" ").append(sobrenomes[new Random().nextInt(9)])
				.append(" de ").append(ultimoNome[new Random().nextInt(9)]).append(" ")
				.append(tag[new Random().nextInt(1)]).append(" ");
		return nomeAleatorio.toString();
	}

	/***
	 * Gera nome de empresas aleatoriamente
	 * 
	 * @return
	 */
	public String geraEmpresaAleatorio() {
		String[] empresa = { "Colegio Adventista de Sorocaba", "Colegio Vincere", "Colegio Politecnico de Sorocaba",
				"Objetivo Sorocaba - unidade Centro", "Colegio Talentos International", "Colegio Salesiano Sao Jose",
				"Colegio Dom Aguirre", "Colegio Primeiro Mundo", "Colegio Humanus", "Colegio Ser",
				"Colegio Tableau - Sorocaba", "Colegio Sorocaba", "Colegio Veritas", "Colegio Renascer",
				"Colegio Multiplo Sorocaba", "Colegio Ivo de Almeida", "Colegio Uirapuru", "COC Sorocaba",
				"Colegio O Farol" };
		String[] sociedade = { "LTDA", "ME", "EIRELI", "S/A", "EPP" };
		String[] tag = { "TARGET QA" };
		StringBuilder empresaAleatorio = new StringBuilder();
		empresaAleatorio.append(empresa[new Random().nextInt(18)]).append(" ")
				.append(sociedade[new Random().nextInt(4)]).append(" ").append(tag[new Random().nextInt(1)]).append("");
		return empresaAleatorio.toString();
	}

	/***
	 * Gera e-mail aleatoriamente
	 * 
	 * @return
	 */
	public String GeraEmailAleatorio() {
		
		String[] nomes = { "Antonio", "Rafael", "Bruno", "Marcelo", "Alberto", "Pedro", "Anderson", "Airton", "Sidney",
				"Wilson", "Carlos", "Candido", "Hugo", "Joao", "Mauro", "Leonardo", "Natanael", "Reinaldo", "Orlando",
				"Tiago", "Gildo", "Alfredo", "Mauricio", "Jurandir", "Paulo", "Juvencio", "Daniel", "Jair", "Juvenal",
				"Jorge", "Agiliza", "Alessandro", "Alexandre", "Aline", "Ana Paula", "Andressa", "Antonia", "Camila",
				"Carolina", "Cileia", "Debora", "Edna", "Ellen", "Eveline", "Fabio", "Fernanda", "Gesiele", "Hellen",
				"Isabela", "Joice", "Joseense","Beatriz", "Laura", "Maria Luiza", "Júlia","Ana", "Alice", "Sofia",  
				"Mariana", "Isabela", "Camila", "Valentina", "Lara", "Miguel", "lucas", "Guilherme" ,  	"Matheus", 
				"Bernardo", "Davi", "Henrique" };
		String[] arroba = { "@" };
		String[] tag = { "Gmail","hotmail","outlook" };
		String[] complemento = { ".com.br" };
		StringBuilder emailAleatorio = new StringBuilder();
		emailAleatorio.append(nomes[new Random().nextInt(74)]).append(arroba[new Random().nextInt(1)])
				.append(tag[new Random().nextInt(3)]).append(complemento[new Random().nextInt(1)]);
		return emailAleatorio.toString();
	}

	/***
	 * Gera estado aleatoriamente.
	 * 
	 * @return
	 */
	public String geraEstadoAleatorio() {
		String[] estados = { "Acre", "Alagoas", "Amapa", "Amazonas", "Bahia", "Ceara", "Distrito Federal",
				"Espirito Santo", "Goias", "Maranhao", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Parana",
				"Paraiba", "Para", "Pernambuco", "Piaui", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul",
				"Rondonia", "Roraima", "Santa Catarina", "Sergipe", "Sao Paulo", "Tocantins" };
		String[] tag = { "TARGET QA" };
		StringBuilder estadosAleatorio = new StringBuilder();
		estadosAleatorio.append(estados[new Random().nextInt(26)]).append(" ").append(tag[new Random().nextInt(1)])
				.append("");
		return estadosAleatorio.toString();
	}

	/**
	 * Gera municipio aleatoriamente.
	 * 
	 * @return
	 */
	public String GeraMunicipioAleatorio() {
		String[] municipio = { "Abadia dos Dourados", "Abaete", "Abre-Campo", "Acaiaca", "Acucena", "Agua Boa",
				"Agua Comprida", "Aguanil", "Aguas Formosas", "Aguas Vermelhas", "Aimores", "Aiuruoca", "Alagoa",
				"Albertina", "Alfenas", "Alfredo Vasconcelos", "Almenara", "Alpercata" };
		String[] tag = { "TARGET QA" };
		StringBuilder estadosAleatorio = new StringBuilder();
		estadosAleatorio.append(municipio[new Random().nextInt(26)]).append(" ").append(tag[new Random().nextInt(1)])
				.append("");
		return estadosAleatorio.toString();
	}

	/***
	 * Gera regiao aleatoriamente.
	 * 
	 * @return
	 */
	public String GeraRegiaoAleatorio() {
		String[] regiao = { "Norte", "Nordeste", "Centro-Oeste", "Sudeste", "Sul" };
		String[] tag = { "TARGET QA" };
		StringBuilder regiaoAleatorio = new StringBuilder();
		regiaoAleatorio.append(regiao[new Random().nextInt(5)]).append(" ").append(tag[new Random().nextInt(1)])
				.append("");
		return regiaoAleatorio.toString();
	}

	/***
	 * Gera departamento comercial aleatoriamente
	 * 
	 * @return
	 */
	public String GeraDepartamentoAleatorio() {
		String[] departamento = { "Financeiro", "RH", "Comercial", "Tecnologia", "Administrativo", "Producao",
				"Controladoria Auditoria", "Contas a Pagar", "Tesouraria", "Contas a Receber", "Orcamentos",
				"Analise de Credito", "Cobranca", "Relacoes com Mercadorias", "Manutencao", "Suprimentos", "PCP",
				"Engenharia Desenvolvimento de Novos Produtos", "Logistica estocagem prod. acabado",
				"Controle de Qualidade", "Planejamento / Controle", "Suporte a Clientes", "Marketing", "Contabilidade",
				"Faturamento Livros Fiscais", "Controle Patrimonial", "Importacao", "Relacoes Publicas", "Vendas",
				"Exportacao" };
		String[] tag = { "TARGET QA" };
		StringBuilder departamentoAleatorio = new StringBuilder();
		departamentoAleatorio.append(departamento[new Random().nextInt(30)]).append(" ")
				.append(tag[new Random().nextInt(1)]).append("");
		return departamentoAleatorio.toString();
	}

	/***
	 * Gera mesorregiao aleatoriamente.
	 * 
	 * @return
	 */
	public String GeraMesorregiaoAleatorio() {
		String[] mesorregiao = { "Agreste Alagoano", "Agreste Paraibano", "Agreste Pernambucano", "Agreste Potiguar",
				"Agreste Sergipano", "Araraquara/Central Paulista", "Aracatuba", "Assis", "Baixadas Litoraneas",
				"Baixo Amazonas", "Bauru", "Borborema", "Campinas", "Campo das Vertentes", "Central Espirito-Santense",
				"Central Mineira", "Central Potiguar", "Centro Amazonense", "Centro de Goias", "Centro Fluminense",
				"Centro Maranhense", "Centro Ocidental Paranaense", "Centro Ocidental Rio-Grandense",
				"Centro Oriental Paranaense", "Centro Oriental Rio-Grandense", "Centro-Norte Baiano",
				"Centro-Norte de Mato Grosso do Sul", "Centro - Norte Piauiense", "Centro - Sul Baiano",
				"Centro - Sul Cearense", "Centro - Sul Mato - Grossense", "Centro - Sul Paranaense", "Distrito Federal",
				"Extremo Oeste Baiano", "Grande Florianopolis", "Itapetininga", "Jaguaribe", "Jequitinhonha",
				"Leste Alagoano", "Leste de Goias", "Leste de Mato Grosso do Sul", "Leste Maranhense", "Leste Potiguar",
				"Leste Rondoniense", "Leste Sergipano", "Litoral Norte Espirito - Santense", "Litoral Sul Paulista",
				"Macro Metropolitana Paulista", "Madeira - Guapore", "Marajo", "Marilia", "Mata Paraibana",
				"Mata Pernambucana", "Metropolitana de Belo Horizonte", "Metropolitana de Belem",
				"Metropolitana de Curitiba", "Metropolitana de Fortaleza", "Metropolitana de Porto Alegre",
				"Metropolitana de Salvador", "Metropolitana de Sao Paulo", "Metropolitana do Recife",
				"Metropolitana do Rio de Janeiro", "Nordeste Baiano", "Nordeste Mato-Grossense", "Nordeste Paraense",
				"Nordeste Rio-Grandense", "Noroeste Cearense", "Noroeste de Goias", "Noroeste de Minas",
				"Noroeste Espirito-Santense", "Noroeste Fluminense", "Noroeste Paranaense", "Noroeste Rio-Grandense",
				"Norte Amazonense", "Norte Catarinense", "Norte Cearense", "Norte Central Paranaense", "Norte de Goias",
				"Norte de Minas", "Norte de Roraima", "Norte do Amapa", "Norte Fluminense", "Norte Maranhense",
				"Norte Mato-Grossense", "Norte Piauiense", "Norte Pioneiro Paranaense", "Ocidental do Tocantins",
				"Oeste Catarinense", "Oeste de Minas", "Oeste Maranhense", "Oeste Paranaense", "Oeste Potiguar",
				"Oriental do Tocantins", "Pantanais Sul - Mato - Grossenses", "Piracicaba", "Presidente Prudente",
				"Ribeirao Preto", "Serrana", "Sertao Alagoano", "Sertao Paraibano", "Sertao Pernambucano",
				"Sertao Sergipano", "Sertoes Cearenses", "Sudeste Mato-Grossense", "Sudeste Paraense",
				"Sudeste Paranaense", "Sudeste Piauiense", "Sudeste Rio-Grandense", "Sudoeste Amazonense",
				"Sudoeste de Mato Grosso do Sul", "Sudoeste Mato - Grossense", "Sudoeste Paraense",
				"Sudoeste Paranaense", "Sudoeste Piauiense", "Sudoeste Rio-Grandense", "Sul Amazonense", "Sul Baiano",
				"Sul Catarinense", "Sul Cearense", "Sul de Roraima", "Sul do Amapa", "Sul e Sudoeste de Minas",
				"Sul Espirito - Santense", "Sul Fluminense", "Sul Goiano", "Sul Maranhense",
				"Sao Francisco Pernambucano", "Sao Jose do Rio Preto", "Triangulo Mineiro e Alto Paranaiba",
				"Vale do Acre", "Vale do Itaji­", "Vale do Mucuri", "Vale do Paraiba Paulista",
				"Vale do Rio Doce", "Vale Sao - Franciscano da Bahia", "Zona da Mata", "Mataoo" };
		String[] tag = { "TARGET QA" };
		StringBuilder mesorregiaoAleatorio = new StringBuilder();
		mesorregiaoAleatorio.append(mesorregiao[new Random().nextInt(137)]).append(" ")
				.append(tag[new Random().nextInt(1)]).append("");
		return mesorregiaoAleatorio.toString();
	}

	/***
	 * Espera a página carregar conforme o tempo informado em milesegundos.
	 * 
	 * @param tempo
	 * @throws InterruptedException
	 */
	public void esperaCarregar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	/***
	 * Escreve no campo informado.
	 * 
	 * @param by
	 * @param texto
	 */
	public void escreveTexto(By by, String texto) {

		getDriver().findElement(by).sendKeys(texto);
	}

	/***
	 * Escreve no campo informado por id.
	 * 
	 * @param id_campo
	 * @param texto
	 */
	public void escreveId(String id_campo, String texto) {
		escreveTexto(By.id(id_campo), texto);
	}

	/***
	 * Clica no botÃ£o via comando By Ex By.xpath("campo").
	 * 
	 * @param by
	 */
	public void clicarBotaoBy(By by) {
		getDriver().findElement(by).click();
	}

	/***
	 * maximizar Browser
	 */
	public void maximizaJanela() {

		getDriver().manage().window().maximize();
	}

	/***
	 * Executa rolagem da página. Exemplo: RolarPagina("scroll(0,650)");
	 * 
	 * @param rolagem
	 */
	public void RolarPagina() {
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,1600)");
	}

	/***
	 * Gera títulos aleatorios.
	 * 
	 * @return
	 */
	public String GerarTituloAleatorio() {
		String[] Titulo = { "CNA na Escola Publica", "CNA Go", "Don't Be Loro", " CNA Portal Corporativo" };

		StringBuilder TituloAleatorio = new StringBuilder();
		TituloAleatorio.append(Titulo[new Random().nextInt(4)]).append(" ");
		return TituloAleatorio.toString();
	}
	
	public void clicarbotao(String id_botao) {
		getDriver().findElement(By.id(id_botao)).click();
	}
	
	public void abrirComboBox(String id_combobox) {
		getDriver().findElement(By.id(id_combobox)).click();
	}
	
	public void escreverClassName(String name_escola, String texto) {
		getDriver().findElement(By.className(name_escola)).sendKeys(texto);

	}
	
	public void selecionarResultadoEscola(String escola) {
		getDriver().findElement(By.className(escola)).click();

	}
	
	public void rolarParaCimaPageUP() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public String ObterTextoCampoId(String id_campo)
    {
        return getDriver().findElement(By.id(id_campo)).getText();
    }
	
	
	public void NameEscreveTexto(String name, String texto)
    {
        
        getDriver().findElement(By.name(name)).sendKeys(texto);
    }

	public String ObterTextoCampoIdvalue(String name)
    {
        return getDriver().findElement(By.tagName(name)).getText();}


	public String GeraCEP() {
		String[] Cep = { "18115760", "69099208", "60868717", "93544260", "29046552", "58401186",
				"74948060", "09894330", "13475294", "23510540", "77825100", "64090685", "68904395",
				"49008051", "18000560", "79005100", "88132013", "49042020" };
		StringBuilder CepAleatorio = new StringBuilder();
		CepAleatorio.append(Cep[new Random().nextInt(26)]).append(" ");
				
		return CepAleatorio.toString();
	}

	public String Geratelefone() {
		String[] telefone = { "112816-6989", "142981-6003", "133939-7305", "152680-7114", "112856-4188", "182837-8327",
				"192744-0990", "113794-2454", "122908-8195", "163846-2139", "112500-0095", "193951-8355", "193655-3846",
				"192889-7746", "193558-9118", "112776-8167", "112539-1454", "143707-5850" };
		StringBuilder telefoneAleatorio = new StringBuilder();
		telefoneAleatorio.append(telefone[new Random().nextInt(26)]).append(" ");
	
		return telefoneAleatorio.toString();
	}
	
	

}


