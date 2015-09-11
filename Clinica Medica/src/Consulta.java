
public class Consulta{
	private Paciente paciente;
	private Medico medico;
	private String dataHora;
	private PlanoSaude planoSaude;
	private String queixas;
	private String remedioExame;
	private String resultado;
	public Consulta(Paciente paciente, Medico medico, String dataHora, PlanoSaude planoSaude){
		this.paciente = paciente;
		this.medico = medico;
		this.dataHora = dataHora;
		this.planoSaude = planoSaude;
	}
	void setQueixas(String obs){
		this.queixas += obs;
	}
	void setRemedioExame(String obs){
		this.remedioExame += obs;
	}
	void setResultado(String obs){
		this.resultado += obs;
	}
}
