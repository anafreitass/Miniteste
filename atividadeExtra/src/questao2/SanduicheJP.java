package questao2;

public class SanduicheJP implements Sanduiche {

	@Override
	public PaoIF criarPao() {
		// TODO Auto-generated method stub
		return new PaoBola();
	}

	@Override
	public QueijoIF criarQueijo() {
		// TODO Auto-generated method stub
		return new Mussarela();
	}

	@Override
	public PresuntoIF criarPresunto() {
		// TODO Auto-generated method stub
		return new PresuntoFrango();
	}

	@Override
	public SaladaIF criarSalada() {
		// TODO Auto-generated method stub
		return new SemVerdura();
	}
	

}
