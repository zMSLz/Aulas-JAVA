
public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + getSexo() +
				", Rua: " + endereco.getRua() + ", Número: " + endereco.getNum() + 
				", Bairro: " + endereco.getBairro();
	}
	
	public Pessoa(String texto) {
		String rua, bairro = "";
		int num =  0;
		
		String[] arrayAux1 = texto.split(",");
		String[] arrayAux2 = arrayAux1[0].split(":");
		this.nome = arrayAux2[1].trim();
		
		String [] arrayAux3 = arrayAux1[1].split(":");
		this.idade = Integer.parseInt(arrayAux3[1].trim());
		
		String[] arrayAux4 = arrayAux1[2].split(":");
		this.sexo = Sexo.valueOf(arrayAux4[1].trim());
		
		String[] arrayAux5 = arrayAux1[3].split(":");
		rua = arrayAux5[1].trim();
		this.endereco = new Endereco(rua, num, bairro);
		
		String[] arrayAux6 = arrayAux1[4].split(":");
		num = Integer.parseInt(arrayAux6[1].trim());
		this.endereco = new Endereco(rua, num, bairro);
		
		String[] arrayAux7 = arrayAux1[5].split(":");
		bairro = arrayAux7[1].trim();
		this.endereco = new Endereco(rua, num, bairro);
		
		
	}

	public Pessoa() {
		
	}


	
	
	
}
