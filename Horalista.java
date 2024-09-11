package atividadedia04;

public class Horalista implements Funcionario {

	int quanthoras = 150;
	int valorhora = 10;
	
		@Override
		public String nome() {
			System.out.println("Luiza");
			return "a";
		}
		
		@Override
		public long id() {
			System.out.println(867251);
			return 0;
		}
		
		@Override
		public String fone() {
			System.out.println("15996732861");
			return "a";
		}
		@Override
		public String endereco() {
			System.out.println("vila regina");
			return "a";
		}
		@Override
		public int matricula() {
			System.out.println(7363937);
			return 0;
		}
		@Override
		public void calcsalario() {
			System.out.println(quanthoras*valorhora);
		}
}
