
package academia;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private String cargo;
    private String data_ingresso_empresa;
    private String data_ingresso_cargo;
    private double salario;
    private static NumberFormat FORMATADOR_PRECO = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public Funcionario(String nome, String endereco, String telefone, String cpf, String rg, String data_nascimento, String cargo, String data_ingresso_empresa, String data_ingresso_cargo, double salario){
        super(nome, endereco, telefone, cpf, rg, data_nascimento);
        this.cargo = cargo;
        this.data_ingresso_empresa = data_ingresso_empresa;
        this.data_ingresso_cargo = data_ingresso_cargo;
        this.salario = salario;
    }  
    
    public String getCargo() {
        return cargo;
    }

    public String getData_ingresso_empresa() {
        return data_ingresso_empresa;
    }

    public String getData_ingresso_cargo() {
        return data_ingresso_cargo;
    }

    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString(){
        return "==== FUNCIONARIO ===="+ 
                "\nNome: " + this.getNome() + 
                "\nEndereco: " + this.getEndereco() + 
                "\nTelefone: " + this.getTelefone() + 
                "\nCPF: " + this.getCpf() + 
                "\nData de Nascimento: " + this.getData_nascimento() + 
                "\nCargo: " + this.getCargo() + 
                "\nIngresso na empresa: " + this.getData_ingresso_empresa() + 
                "\nIngresso no cargo: " + this.getData_ingresso_cargo() + 
                "\nSalário: R$ " + FORMATADOR_PRECO.format(getSalario());
    }
}
