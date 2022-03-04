package academia;

import java.text.NumberFormat;
import java.util.Locale;

/*
PARA AS DATAS DO PLANO, UTILIZAR O LOCALDATE
para calcular o tempo restante de plano, utilizar period!
*/
public class Aluno extends Pessoa{
    private String matricula;
    private String senha;
    private String plano;
    private String data_adesao_plano;
    private String data_expiracao_plano;
    private String tipo_treino;
    private double valor_mensalidade;
    private static NumberFormat FORMATADOR_PRECO = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    
    //experimentar usar SUPER para acessar o construtor de pessoa e definir nome e os outros atributos que ela possui.
    public Aluno(String nome, String endereco, String telefone, String cpf, String rg, String data_nascimento, String matricula, String senha, String plano, String data_adesao_plano, String data_expiracao_plano, String tipo_treino, double valor_mensalidade) {
        super(nome, endereco, telefone, cpf, rg, data_nascimento);
        this.matricula = matricula;
        this.senha = senha;
        this.plano = plano;
        this.data_adesao_plano = data_adesao_plano;
        this.data_expiracao_plano = data_expiracao_plano;
        this.tipo_treino = tipo_treino;
        this.valor_mensalidade = valor_mensalidade;
    }


    public String getMatricula() {
        return matricula;
    }

    public String getSenha() {
        return senha;
    }

    public String getPlano() {
        return plano;
    }

    public String getData_adesao_plano() {
        return data_adesao_plano;
    }

    public String getData_expiracao_plano() {
        return data_expiracao_plano;
    }

    public String getTipo_treino() {
        return tipo_treino;
    }

    public double getValor_mensalidade() {
        return valor_mensalidade;
    }
    
    @Override
    public String toString(){
        return "==== ALUNO ===="+
                "\nNome: " + getNome() + 
                "\nEndereco: " + getEndereco() + 
                "\nTelefone: " + getTelefone() + 
                "\nCPF: " + getCpf() +
                "\nRG: " + getRg() + 
                "\nData de Nascimento: " + getData_nascimento() +
                "\nMatricula: " + getMatricula() +
                "\nPlano: " + getPlano() +
                "\nTipo de treino: " + getTipo_treino() +
                "\nData de adesão ao plano: " + getData_adesao_plano() +
                "\nData de expiração do plano: " + getData_expiracao_plano() +
                "\nValor da mensalidade: " + FORMATADOR_PRECO.format(getValor_mensalidade()) ;           
    }
    /*
    public void calculaExpPlano(String data_adesao){
        String[] data = data_adesao.split("/");
    }*/
}
