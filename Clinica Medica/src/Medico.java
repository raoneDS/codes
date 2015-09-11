import java.util.*;

public class Medico extends Cadastro {
	private int crm;
	private List<Especialidade> especialidade;
	private List<PlanoSaude> planoSaude;
	
	public Medico(String nome,String telefone,String endereco,int crm, List<Especialidade> especialidades, List<PlanoSaude> planos){
		super(nome,telefone,endereco);
		this.crm = crm;	
		this.especialidade = especialidades;
		this.planoSaude = planos;
	}
	
	void setEspecialidade(Especialidade e){
		this.especialidade.add(e);
	}
	
	void removeEspecialidade(Especialidade e){
		this.especialidade.remove(e);
	}
	
	void inserirObervacao(Consulta c){
		Scanner ler = new Scanner(System.in);
		int n = 0;
		
		while(n<=0 || n>3){
			System.out.println("Entre com o tipo de observacao\n "
					+ "1 para Queixa - 2 para solicitar remedio ou exame - 3 para resultado: ");
			n = ler.nextInt();
		}
		System.out.println("Entre com a observação: ");
		String obs = ler.next();
	
		if(n==1) c.setQueixas(obs);
		else if(n==2) c.setRemedioExame(obs);
		else c.setResultado(obs);
	}
	
	void listarObervacao(Paciente p){
	}
}
