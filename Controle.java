import java.util.ArrayList;
public class Controle{
  private Banco banco = null;
  private Console console = null;
  public Controle(){
    console = console();
    banco = banco();
  }
  public void executar(){
    int resposta = null;
    Parcela P;
    ArrayList<Parcela> lista = new ArrayList<>();
  
    while(resposta != 0){
      resposta = console.menu();
      switch(resposta){
        case 1:
          adicionarParcela();
          break;
        case 2:
          regarParcela();
          break;
        case 3:
          adubarParcela();
          break;
        case 4:
          marcarTratamentoEspecial();
          break;
        case 5:
          sugerirAcoes();
          break;
        case 6:
          gerarRelatorio();
          break;
        case 0:
          console.MensagemDeFinalizacao();
          break;
        default:
          break;
      }    
    }
  
  }


}
