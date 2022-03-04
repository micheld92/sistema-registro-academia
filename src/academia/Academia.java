package academia;
import java.util.ArrayList;
import java.util.Scanner;


public class Academia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        String nome;
        String endereco;
        String telefone;
        String cpf;
        String rg;
        String data_nascimento;
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        
        do{
            System.out.println("Deseja inserir:\nAluno (1) ou Funcionário (2)");
            resp = sc.nextInt();
            sc.nextLine();
            if(resp == 1){
                System.out.println("Digite o nome: ");
                nome = sc.nextLine();
                System.out.println("Digite o endereco: ");
                endereco = sc.nextLine();
                System.out.println("Digite o telefone: ");
                telefone = sc.nextLine();
                System.out.println("Digite o CPF: ");
                cpf = sc.nextLine();
                System.out.println("Digite o RG: ");
                rg = sc.nextLine();
                System.out.println("Digite a data de nascimento dd/mm/aaaa: ");
                data_nascimento = sc.nextLine();
                System.out.println("Digite a matricula: ");
                String matricula = sc.nextLine();
                System.out.println("Digite a senha: ");
                String senha = sc.nextLine();
                System.out.println("Digite o plano: ");
                String plano = sc.nextLine();
                System.out.println("Digite a data de adesao do plano dd/mm/aaaa: ");
                String data_adesao_plano = sc.nextLine();
                System.out.println("Digite a data de expiracao do plano dd/mm/aaaa: : ");
                String data_expiracao_plano = sc.nextLine();
                System.out.println("Digite o tipo de treino: ");
                String tipo_treino = sc.nextLine();
                System.out.println("Digite o valor da mensalidade: ");
                double valor_mensalidade = sc.nextDouble();
                Pessoa p;
                p = new Aluno(nome, endereco, telefone, cpf, rg, data_nascimento, matricula, senha, plano, data_adesao_plano, data_expiracao_plano, tipo_treino, valor_mensalidade);
                listaPessoas.add(p);
                
            }
            else{
                System.out.println("instanciar funcionario");
            }
            System.out.println("Deseja inserir outro registro? :\n Sim (1) Não (0)");
            resp = sc.nextInt();
        }while(resp!=0);
        
        listaPessoas.forEach(p -> {
            System.out.println(p.toString());
        });
        
        sc.close();
    }
    
}
