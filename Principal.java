package atividadedia04;

public class Principal {

	public static void main(String[] args) {
		Jornada jor = new Jornada();
		System.out.println("Dados do Fun Jornada");
		jor.id();
		jor.nome();
		jor.fone();
		jor.matricula();
		jor.endereco();
		Horalista hor = new Horalista();
		
		System.out.println("Dados do Fun Horista");
		hor.id();
		hor.nome();
		hor.fone();
		hor.matricula();
		hor.endereco();
		PessoaJuridica pes = new PessoaJuridica();
		
		System.out.println("Dados Fun Pessoa Juridica");
		pes.id();
		pes.nome();
		pes.fone();
		pes.matricula();
		pes.endereco();

	}

}
