import java.util.ArrayList;

public class Venda
{
    private String nome;
    private String CPF;
    private int idade;
    private double lucroViagem;
    private int passagensVendidas;
    private int passagensVendidasIdoso;
    private Onibus onibus;
    private CadastrarLinha linha;
    
    
    public void setLinha(CadastrarLinha linha)
    {
        this.linha = linha;
    }
    public CadastrarLinha getLinha()
    {
        return linha;
    }
    
    public void setOnibus(Onibus onibus)
    {
        this.onibus = onibus;
    }
    public Onibus getOnibus()
    {
        return onibus;
    }
    
    public Venda(String nome , String CPF, int idade, double lucroViagem, int passagensVendidas, int passagensVendidasIdoso)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.lucroViagem = lucroViagem;
        this.passagensVendidas = passagensVendidas;
        this.passagensVendidasIdoso = passagensVendidasIdoso;
    }
    
    public void setNome(String nome)
    {
        if(nome != " ")
        {
            this.nome = nome;
        }
        else
        {
            System.out.println("Nome não digitado!");
        }
    }
    public String getNome()
    {
        return nome;
    }
    
    public void setCPF(String CPF)
    {
        if(CPF != " ")
        {
        this.CPF = CPF;
        }
        else
        {
            System.out.println("CPF não digitado!");
        }
    }
    public String getCPF()
    {
        return CPF;
    }
    
    public void setIdade(int idade)
    {
          if(idade > 0)
          {
          this.idade = idade;
          }
          else            
          {
          System.out.println("Idade incorreta!");
          }
    }
    public int getIdade()
    {
        return idade;
    }
    
    public void setPassagensVendidas(int passagensVendidas)
    {
        this.passagensVendidas += passagensVendidas;
    }
    public int getPassagensVendidas()
    {
        return passagensVendidas;
    }
    
    public void setPassagensVendidasIdoso(int passagensVendidasIdoso)
    {
        this.passagensVendidasIdoso += passagensVendidasIdoso;
    }
    public int getPassagensVendidasIdoso()
    {
        return passagensVendidasIdoso;
    }
}
