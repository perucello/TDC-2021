package br.com.tdc;

public class TheDeveloperConference {
	
	private String nome;
	private String evento;
	private String descoberta;
	private String resultado;
		

	public TheDeveloperConference() {
		super();
	}
	
	public TheDeveloperConference(String nome, String evento, String descoberta, String resultado) {
		super();
		this.nome = nome;
		this.evento = evento;
		this.descoberta = descoberta;
		this.resultado = resultado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getDescoberta() {
		return descoberta;
	}

	public void setDescoberta(String descoberta) {
		this.descoberta = descoberta;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void TheDeveloperConference2021(String senha, String acesso) {
		
		this.nome = acesso;
		this.evento = "TDC-2021";
		this.descoberta = " ' PESSOA COM DETERMINAÇÃO ' ";
	
		String resultado = "Você que está participando do " 
				+ evento 
				+ " , já sabe que a partir de agora, que o verdadeiro conceito de PCD é " 
				+ descoberta 
				+ " !!!!";
		
		if (acesso.equals("TDC") && (senha.equals("2021")) ) 
		{
			System.out.println();
			System.out.println("OBRIGADO !!");
			System.out.println(resultado); 
		} else 
		{
			System.err.println("Tente novamente");
		}
	
	}
}


