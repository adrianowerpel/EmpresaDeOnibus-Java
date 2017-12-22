import java.util.ArrayList;

public class Onibus
{
   private String numero;
   private String tipo;
   private int capacidade;
   private int capacidadeIdoso;
   
   private ArrayList<Venda> venda;
   
   public Onibus(String numero, int capacidadeIdoso, int capacidade)
   {
       this.numero = numero;
       this.capacidade = capacidade;
       this.capacidadeIdoso = 2;
   }
   
   public void setNumero(String numero)
   {
       this.numero = numero;
   }
   public String getNumero()
   {
       return numero;
   }
   
    public void setTipo(String tipo)
   {
       this.tipo = tipo;
   }
   public String getTipo()
   {
       return tipo;
   }
   
   public void setCapacidade(int capacidade)
   {
       this.capacidade = capacidade;
   }
   public int getCapacidade()
   {
       return capacidade;
   }
   
   public void setCapacidadeIdoso(int capacidadeIdoso)
   {
       this.capacidadeIdoso = capacidadeIdoso;
   }
   public int getCapacidadeIdoso()
   {
          return capacidadeIdoso;       
   }
   
   public ArrayList<Venda> getVenda()
   {
       return venda;
   }
   public void addVenda(Venda v)
   {
       venda.add(v);
   }
}
