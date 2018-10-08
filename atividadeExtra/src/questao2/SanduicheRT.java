package questao2;

public class SanduicheRT implements Sanduiche{

	@Override
	public PaoIF criarPao() {
		// TODO Auto-generated method stub
		return new PaoIntegral();
	}

	@Override
	public QueijoIF criarQueijo() {
		
		// TODO Auto-generated method stub
		return new Cheddar();
	}

	@Override
	public PresuntoIF criarPresunto() {
		// TODO Auto-generated method stub
		return new PresuntoPeru();
	}

	@Override
	public SaladaIF criarSalada() {
		// TODO Auto-generated method stub
		return new ComVerdura();
	}

}
