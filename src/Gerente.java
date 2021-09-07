
public class Gerente extends FuncionarioAutenticavel {
	
		
	public double getBonificacao() {
		System.out.println("Chamando método de bonificacao do gerente");
		return getSalario(); //indica que a variável é da classe mae - fica mais facil de entender
	}

}
