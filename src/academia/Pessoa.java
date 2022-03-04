
package academia;

public abstract class Pessoa {
    protected String nome; //usa-se protected quando as classes filhas precisam acessar a propriedade
    protected String data_nascimento;
    protected String endereco;
    protected String telefone;
    protected String cpf;
    protected String rg;
    public Pessoa(String nome, String endereco, String telefone, String cpf, String rg, String data_nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento = data_nascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
    
    
}
