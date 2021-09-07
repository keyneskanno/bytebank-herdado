
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario keynes = new Gerente();
		keynes.setNome("Keynes Kanno");
		keynes.setCpf("022030202-2");
		keynes.setSalario(2600.00);
		
		System.out.println(keynes.getNome());
		System.out.println(keynes.getBonificacao());

	}

}
