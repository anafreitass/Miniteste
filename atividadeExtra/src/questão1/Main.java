package questão1;

public class Main {

	public static void main(String[] args) {
	Acao acao = new Acao(new BubbleSort());
	System.out.println(acao.ordenar());
	acao = new Acao(new MergeSort());
	System.out.println(acao.ordenar());
	acao = new Acao(new QuickSort());
	System.out.println(acao.ordenar());
	acao = new Acao(new InsertionSort());
	System.out.println(acao.ordenar());

	}

}
