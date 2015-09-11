
public class Paciente extends Cadastro{
	private String dataNascimento;
	private String profissao;
	public Paciente(String nome,String telefone,String endereco,String profissao,String dataNascimento){
		super(nome,telefone,endereco);
		this.dataNascimento = dataNascimento;
		this.profissao = profissao;
	}
}
