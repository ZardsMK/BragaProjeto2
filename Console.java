import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Console{
  private Scanner leitor = new Scanner(System.in);





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
