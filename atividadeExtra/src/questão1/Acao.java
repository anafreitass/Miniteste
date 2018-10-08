package questão1;

public class Acao {
	private EstrategiaOrdenacao estrategiaOrdenacao;
	
	public Acao(EstrategiaOrdenacao estrategiaOrdenacao) {
		this.estrategiaOrdenacao = estrategiaOrdenacao;
	}
	public String ordenar() {
		
		return estrategiaOrdenacao.estrategia();
		
	}


}
