package questao2;

public class LanchoneteRT extends Lanchonete  {

	public Sanduiche criarSanduiche(Sanduiche sanduiche) {
		sanduiche = new SanduicheRT(); 
		System.out.println("Ingredientes: ");
		System.out.println(sanduiche.criarPao().tipoDePao());
		System.out.println(sanduiche.criarQueijo().tipoDeQueijo());
		System.out.println(sanduiche.criarPresunto().tipoDePresunto());
		System.out.println(sanduiche.criarSalada().tipoSalada());
		return null;
	}

}
