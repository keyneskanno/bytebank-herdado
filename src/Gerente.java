//Gerente é um funcionario, gerente herda da classe funcionario, assina o contrato autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando método de bonificacao do gerente");
		return getSalario(); // indica que a variável é da classe mae - fica mais facil de entender
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
