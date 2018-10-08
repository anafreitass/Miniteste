package questao2;

public class LanchoneteJP extends Lanchonete  {

	public Sanduiche criarSanduiche(Sanduiche sanduiche) {
		sanduiche = new SanduicheJP(); 
		System.out.println("Ingredientes: ");
		System.out.println(sanduiche.criarPao().tipoDePao());
		System.out.println(sanduiche.criarQueijo().tipoDeQueijo());
		System.out.println(sanduiche.criarPresunto().tipoDePresunto());
		System.out.println(sanduiche.criarSalada().tipoSalada());
		return null;
	}
	
}
