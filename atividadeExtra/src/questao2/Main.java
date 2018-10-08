package questao2;

public class Main {
	public static void main(String[] args) {
		Lanchonete lanchonete = null;
		lanchonete = new LanchoneteRT();
		System.out.println("Lanchonete de Rio Tinto \n");
		lanchonete.criarSanduiche(new SanduicheRT());
		lanchonete = new LanchoneteJP();
		System.out.println("Lanchonete de João Pessoa \n");
		lanchonete.criarSanduiche(new SanduicheJP());
		lanchonete = new LanchoneteCG();
		System.out.println("Lanchonete de Campina Grande \n");
		lanchonete.criarSanduiche(new SanduicheCG());
		
		
	}

}
