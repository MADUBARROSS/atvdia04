package atividadedia04;

public class PessoaJuridica implements Funcionario {
	
	int valorbruto = 150;
	int imposto = 5;
	
	@Override
	public String nome() {
		System.out.println("roberta");
		return "a";
	}
	
	@Override
	public long id() {
		System.out.println(898251);
		return 0;
	}
	
	@Override
	public String fone() {
		System.out.println("15976332861");
		return "a";
	}
	@Override
	public String endereco() {
		System.out.println("vila isaura");
		return "a";
	}
	@Override
	public int matricula() {
		System.out.println(7367937);
		return 0;
	}
	@Override
	public void calcsalario() {
		System.out.println(valorbruto-imposto);
	}
}
