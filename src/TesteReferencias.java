import java.beans.DesignMode;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		g1.setNome("Joao");
		g1.setSalario(5000.0);

		String nome = g1.getNome();

		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.00);
		
		Designer d = new Designer();
		d.setSalario(2000.0);

		ControleBonificacao controle = new ControleBonificacao();
		 controle.registra(g1);		 
		 controle.registra(ev);
		 controle.registra(d);

		System.out.println(nome);
		System.out.println(controle.getSoma());
	}

}
