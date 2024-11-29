import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Console{
  private Scanner leitor = new Scanner(System.in);

    public Parcela obterParcela(){
        System.out.println("Por favor, sr usuario, digite o seus dados da pessoa");
        System.out.print("NOME DA PARCELA         : ");   String nomeParcela = leitor.nextLine();
        System.out.print("TEMPO DE CRESCIMENTO    : ");   String tempoDeCescimento = leitor.nextLine();
        System.out.print("CLIMA IDEAL PARA PARCELA: ");   int climaIdeal = leitor.nextInt();
        Parcela p = new Parcela(nomeParcela,tempoDeCescimento,climaIdeal);
        return(p);
    }



  public int menu(){
    
    System.out.println("1 - Adicionar Parcela");
    System.out.println("2 - Regar Parcela");
    System.out.println("3 - Adubar Parcela");
    System.out.println("4 - Marcar Tratamento Especial");
    System.out.println("5 - Sugerir Acoes");
    System.out.println("6 - Gerar Relatório");
    System.out.println("0 - Sair");
    int resposta = leitor.nextInt();
    leitor.nextLine();
    return(resposta);



    
  }


}
