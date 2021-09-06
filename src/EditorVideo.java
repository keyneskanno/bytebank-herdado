
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando método de bonificacao do editor de video");
		return super.getBonificacao() + 100;
	}

}
