
public class PlanoSaude extends Cadastro{
	private String cnpj;
	public PlanoSaude(String razaoSocial,String endereco, String telefone,String cnpj){
		super(razaoSocial,telefone,endereco);
		this.cnpj = cnpj;
	}
}
