import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Console{
  private Scanner leitor = new Scanner(System.in);





  public int menu(){
    
    System.out.println("1 - adicionar Parcela");
    System.out.println("2 - Remover pessoa");
    System.out.println("3 - Alterar pessoa");
    System.out.println("4 - Obter pessoa");
    System.out.println("5 - ListarPessoas");
    System.out.println("6 - Sair");
    int resposta = leitor.nextInt();
    leitor.nextLine();
    return(resposta);



    
  }


}
