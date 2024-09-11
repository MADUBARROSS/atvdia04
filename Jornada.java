package atividadedia04;

public class Jornada implements Funcionario {

	int horatrabalho = 150;
	int valorhora = 10;
	
		@Override
		public String nome() {
			System.out.println("Maria");
			return "a";
		}
		
		@Override
		public long id() {
			System.out.println(657851);
			return 0;
		}
		
		@Override
		public String fone() {
			System.out.println("15998635681");
			return "a";
		}
		@Override
		public String endereco() {
			System.out.println("vila santana");
			return "a";
		}
		@Override
		public int matricula() {
			System.out.println(7363793);
			return 0;
		}
		@Override
		public void calcsalario() {
			System.out.println(horatrabalho*valorhora);
		}
	
}
