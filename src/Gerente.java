
public class Gerente extends FuncionarioAutenticavel {
	
		
	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonificacao do gerente");
		return getSalario(); //indica que a vari�vel � da classe mae - fica mais facil de entender
	}

}
