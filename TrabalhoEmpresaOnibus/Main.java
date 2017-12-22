import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
   static Scanner ler = new Scanner(System.in);
   static ArrayList<CadastrarLinha> guardarLinha = new ArrayList<>();
   static ArrayList<Onibus> guardarOnibus = new ArrayList<>();
   static ArrayList<Venda> guardarVenda = new ArrayList<>();
   
   public static void main(String[] args)
   {
       System.out.println("-----   Empresa VrumTil de transportes  -----");
       
       montarMenu();
       int resp = ler.nextInt();
       while(true)
       {
           if(resp == 0)
           {
               break;
           }
           else if(resp == 1)
           {
               cadastrarOnibus();
           }
           else if(resp == 2)
           {
               consultarOnibus();
           }
           else if(resp == 3)
           {
               cadastrarLinha();
           }
           else if(resp == 4)
           {
               consultarLinha();
           }
           else if(resp == 5)
           {
               realizarVenda();
           }
           else if(resp == 6)
           {
               consultarVenda();
           } 
           else if(resp == 7)
           {
               LucroViagem();
           }
           
           montarMenu();
           resp = ler.nextInt();
       }
    }
   
   private static void montarMenu()
   {
       System.out.println("\n  ***********  MENU  ************   ");
       System.out.println(" Tecle 1 para Cadastrar um Onibus   ");
       System.out.println(" Tecle 2 para Consultar um Onibus   ");
       System.out.println(" Tecle 3 para Cadastrar uma Linha   ");
       System.out.println(" Tecle 4 para Consulta uma linha    ");
       System.out.println(" Tecle 5 para Realizar uma Venda   ");
       System.out.println(" Tecle 6 para Consultar uma Venda   ");
       System.out.println(" Tecle 7 para Lucro e Passagens Vendidas   ");
       System.out.println(" Tecle 0 para Sair  "); 
   }
   
   private static void cadastrarOnibus()
   {
       String resposta = " ";
       do
       {
           System.out.println("  ********** Cadastrar Onibus **********  ");           
                      
           Onibus onibus = new Onibus("",0,0);
               
           System.out.print("Número do Onibus: "); onibus.setNumero(ler.next());
           System.out.print("Tipo de Onibus: "); onibus.setTipo(ler.next());
           System.out.print("Capacidade de Passageiros: "); onibus.setCapacidade(ler.nextInt());
           guardarOnibus.add(onibus);        
           
           System.out.print("Deseja Cadastrar outro Onibus? (S)im (N)ão: ");
           resposta = ler.next();
       }while(resposta.equalsIgnoreCase("s"));
   }
   
   private static void consultarOnibus()
   {
       System.out.println("  ********** Consultar Onibus **********  ");
       
       String bus = "";
       do{
          System.out.print("Número do Onibus: "); bus = ler.next();
       
          for(Onibus o: guardarOnibus)
          {
              if(bus.equals(o.getNumero()))
              {
                  System.out.println("Onibus: "+o.getNumero()+"\nCapacidade: "+o.getCapacidade()+"\nTipo de Onibus: "+o.getTipo());
              }
          }
          
          System.out.print("Pesquisar outro Onibus: (S)im, (N)ão"); bus = ler.next();
       }while(bus.equalsIgnoreCase("s"));
   }
        
   private static void cadastrarLinha()
   {
      System.out.println("  ********** Cadastrar Linha **********  ");
      String bus,resp;
      
      do{
     
      CadastrarLinha linha = new CadastrarLinha("",0);
      
      System.out.print("Onibus: "); bus = ler.next();
      
          for(Onibus o: guardarOnibus)
          {
              if(bus.equals(o.getNumero()))
              {
                  System.out.println("Onibus: "+o.getNumero()+"\nCapacidade: "+o.getCapacidade()+"\nTipo de Onibus: "+o.getTipo());
                  linha.setOnibus(o);
                  break;
              }
          }
              System.out.print("Numero da Linha: "); linha.setNumeroLinha(ler.next());
              System.out.print("Valor da Passagem: "); linha.setValorPassagem(ler.nextDouble());
              System.out.print("Cidade de Partida: "); linha.setCidadePartida(ler.next());
              System.out.print("Cidade de Destino: "); linha.setCidadeDestino(ler.next());
              System.out.print("Data de Saida: "); linha.setDataSaida(ler.next());
              System.out.print("Hora de Saida: "); linha.setHoraSaida(ler.next());
              System.out.print("Data de Chegada: "); linha.setDataChegada(ler.next());
              System.out.print("Hora de Chegada: "); linha.setHoraChegada(ler.next());
          
      
      guardarLinha.add(linha);
      
      System.out.print("Cadastrar outra Linha: (S)im, (N)ão"); resp = ler.next();
      }while(resp.equalsIgnoreCase("s"));
   }
   
   private static void consultarLinha()
   {
       System.out.println("  ********** Consultar Linha **********  ");
       
       String linha = "";
       String cidadePartida;
       String cidadeDestino;
       String horaSaida;
       String dataSaida;
       
       do{
          System.out.println("****    Digite os Dados da Linha que Deseja Consultar    ****");
          
           System.out.print("Escolha a cidade de Partida: "); cidadePartida = ler.next();
           System.out.print("Escolha a cidade de Destino; "); cidadeDestino = ler.next();
           System.out.print("Escolha o horário de saida: "); horaSaida = ler.next();
           System.out.print("Escolha o data de saida: "); dataSaida = ler.next();
       
          for(CadastrarLinha l: guardarLinha)
          {
              if(cidadePartida.equalsIgnoreCase(l.getCidadePartida()) && cidadeDestino.equalsIgnoreCase(l.getCidadeDestino()) && 
              horaSaida.equalsIgnoreCase(l.getHoraSaida()) && dataSaida.equalsIgnoreCase(l.getDataSaida()))
              {
                  System.out.println("Onibus: "+l.getOnibus().getNumero()+"\nCapacidade: "+l.getOnibus().getCapacidade()+"\nTipo de Onibus: "+l.getOnibus().getTipo()+
                  "\nNumero da linha: "+l.getNumeroLinha()+"\nValor da passagem: "+l.getValorPassagem()+"\nCidade de Partida: "+l.getCidadePartida()+
                  "\nCidade de destino: "+l.getCidadeDestino()+"\nData de saida: "+l.getDataSaida()+"\nHora da saida: "+l.getHoraSaida()+"\nData de chegada: "
                  +l.getDataChegada()+"\nHora da chegada: "+l.getHoraChegada());
              }
          }
          
          System.out.print("Pesquisar outra linha: (S)im, (N)ão"); linha = ler.next();
       }while(linha.equalsIgnoreCase("s"));
   }
       
   private static void realizarVenda()
   {
       String cidadePartida,cidadeDestino,horaSaida,dataSaida;
       String ven = "";
       int pas = 0, pasi = 0;
       int cap = 0;
       
       Venda venda = new Venda("","",0,0,0,0);
       
       System.out.println("  ********** Venda de Passagem **********  ");
       
       do{
           
           System.out.print("Nome: "); venda.setNome(ler.next());
           System.out.print("CPF: "); venda.setCPF(ler.next());
           System.out.print("Idade: "); venda.setIdade(ler.nextInt());
       
           System.out.print("Escolha a cidade de Partida: "); cidadePartida = ler.next();
           System.out.print("Escolha a cidade de Destino; "); cidadeDestino = ler.next();
           System.out.print("Escolha o horário de saida: "); horaSaida = ler.next();
           System.out.print("Escolha o data de saida: "); dataSaida = ler.next();
       
           for(CadastrarLinha linha : guardarLinha)
           {
               if(cidadePartida.equalsIgnoreCase( linha.getCidadePartida()) && cidadeDestino.equalsIgnoreCase(linha.getCidadeDestino())
               && horaSaida.equalsIgnoreCase(linha.getHoraSaida()) && dataSaida.equalsIgnoreCase(linha.getDataSaida()))
               {
                       Onibus o = linha.getOnibus();
                       
                       if(venda.getIdade() >= 60 && o.getCapacidadeIdoso() >= 0)
                       {
                           System.out.println("Numero da Linha: "+linha.getNumeroLinha()+"\nOnibus: "+o.getNumero()+"\nCapacidade para Idosos: "+o.getCapacidadeIdoso()+
                           "\nValor da Passagem: R$0,00 \nTipo de Onibus: "+o.getTipo()); 
                           o.setCapacidadeIdoso(o.getCapacidadeIdoso()-1);
                           pasi++;
                           venda.setPassagensVendidasIdoso(pasi);
                           
                           System.out.println("Cidade Partida: "+linha.getCidadePartida()+"\nCidadedestino: "
                           +linha.getCidadeDestino()+"\nData Saida: "+linha.getDataSaida()+"\nHora Saida: "+linha.getHoraSaida()+"\nData Chegada: "
                           +linha.getDataChegada()+"\nHora Chegada: "+linha.getHoraChegada()); 
                       
                           cap = o.getCapacidade();
                           String resp = "";
                           do{
                                 int lugar;
                                 System.out.print("Escolha o assento: "); lugar = ler.nextInt();
                                 if(lugar <= cap)
                                 {
                                     linha.setAssento(lugar);
                                 }
                                 else
                                 {
                                     System.out.println("Assento inexistente nesta linha");
                                 }
                                 System.out.println("Deseja Selecionar outro Assento: (S)im ou (N)ão"); resp = ler.next();
                           }while(resp.equalsIgnoreCase("s"));
                           
                           guardarVenda.add(venda);
                       }                       
                       else if(venda.getIdade() < 60 && o.getCapacidade() >= 0)
                       {
                          System.out.println("Numero da Linha: "+linha.getNumeroLinha()+"\nOnibus: "+o.getNumero()+"\nCapacidade: "+o.getCapacidade()+"\nValor da Passagem: "
                          +linha.getValorPassagem()+"\nTipo de Onibus: "+o.getTipo());
                          o.setCapacidade(o.getCapacidade()-1);
                          pas++;
                          venda.setPassagensVendidas(pas);
                          
                          System.out.println("Cidade Partida: "+linha.getCidadePartida()+"\nCidadedestino: "
                          +linha.getCidadeDestino()+"\nData Saida: "+linha.getDataSaida()+"\nHora Saida: "+linha.getHoraSaida()+"\nData Chegada: "
                          +linha.getDataChegada()+"\nHora Chegada: "+linha.getHoraChegada()); 
                       
                          cap = o.getCapacidade();
                          String resp = "";
                          do{
                             int lugar;
                             System.out.print("Escolha o assento: "); lugar = ler.nextInt();
                             if(lugar <= cap)
                             {
                                 linha.setAssento(lugar);
                             }
                             else
                             {
                                 System.out.println("Assento inexistente nesta linha");
                             }
                             System.out.println("Deseja Selecionar outro Assento: (S)im ou (N)ão"); resp = ler.next();
                          }while(resp.equalsIgnoreCase("s"));
                          
                          guardarVenda.add(venda);
                       } 
                       else
                       {
                           System.out.println("Não há mais acentos disponíveis para este tipo de passageiro.");
                       }
              }
           }
       
        System.out.print("Realizar outra Venda: (S)im, (N)ão"); ven = ler.next();
       }while(ven.equalsIgnoreCase("s"));
   }
   
   private static void consultarVenda()
   {
       String cpf = "";
       
       do{
          System.out.print("Digite o CPF do Passageiro: "); cpf = ler.next();
       
          for(Venda v: guardarVenda)
          {
              if(cpf.equals(v.getCPF()))
              {
                  System.out.println("Nome: "+v.getNome()+"\nCPF: "+v.getCPF()+"\nIdade: "+v.getIdade());
                
                    for(CadastrarLinha linha: guardarLinha)
                    {
                    System.out.println("Valor da Passagem: "+linha.getValorPassagem()+"\nCidade Partida: "+linha.getCidadePartida()+"\nCidadedestino: "
                    +linha.getCidadeDestino()+"\nData Saida: "+linha.getDataSaida()+"\nHora Saida: "+linha.getHoraSaida()+"\nData Chegada: "
                    +linha.getDataChegada()+"\nHora Chegada: "+linha.getHoraChegada());
                    }
              }
          }
       
          System.out.print("Consultar outra venda: (S)im, (N)ão"); cpf = ler.next();
       }while(cpf.equalsIgnoreCase("s"));
   }
   
   private static void LucroViagem()
   {
       String numLinha, cidadePartida, cidadeDestino,horaSaida,horaChegada, resp;
       double soma = 0;
       int pas = 0, pasi = 0;
       
          System.out.print("Numero da Linha: "); numLinha = ler.next();
          System.out.print("Cidade de Partida: "); cidadePartida = ler.next();
          System.out.print("Cidade de Destino: "); cidadeDestino = ler.next();
          System.out.print("Hora da Saida: "); horaSaida = ler.next();
          System.out.print("Hora da Chegada: "); horaChegada = ler.next();
       
       
          for(Venda v: guardarVenda)
          {
             
              for(CadastrarLinha l: guardarLinha)
              {
                  if(numLinha.equals(l.getNumeroLinha()) && cidadePartida.equalsIgnoreCase(l.getCidadePartida()) && cidadeDestino.equalsIgnoreCase(l.getCidadeDestino()) &&
                  horaSaida.equals(l.getHoraSaida()) && horaChegada.equals(l.getHoraChegada()))
                  {
                     soma = v.getPassagensVendidas() * l.getValorPassagem();
                     pas = v.getPassagensVendidas();
                     pasi = v.getPassagensVendidasIdoso();
                  }
                  else
                  {
                      System.out.println("Não existe nenhuma viagem cadastrada com as informações digitadas!");
                  }
               } 
          }
       
       System.out.println("Lucro de "+soma+" nesta viagem");
       System.out.println(pas+" passagens vendidas.");
       System.out.println(pasi+" passagens vendidas para idosos.");
   }
}

//tratar o erro do assento que deixa um usuário pegar mais de um asseno
//tratar erro do idoso que esta setando meu getPassagens para 0