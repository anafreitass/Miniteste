package questao2;

public class SanduicheCG implements Sanduiche{

	@Override
	public PaoIF criarPao() {
		// TODO Auto-generated method stub
		return new PaoFrances();
	}

	@Override
	public QueijoIF criarQueijo() {
		// TODO Auto-generated method stub
		return new Prato();
	}

	@Override
	public PresuntoIF criarPresunto() {
		// TODO Auto-generated method stub
		return new PresuntoFrango();
	}

	@Override
	public SaladaIF criarSalada() {
		// TODO Auto-generated method stub
		return new ComVerdura();
	}

}
