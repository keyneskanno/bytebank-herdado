
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando método de bonificacao do gerente");
		return super.getBonificacao() + super.salario; //indica que a variável é da classe mae - fica mais facil de entender
	}

}
