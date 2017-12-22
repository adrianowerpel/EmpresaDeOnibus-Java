import java.util.ArrayList;

public class CadastrarLinha
{
    private String numeroLinha;
    private String cidadePartida;
    private String cidadeDestino;
    private double valorPassagem;
    private String dataSaida;
    private String horaSaida;
    private String dataChegada;
    private String horaChegada;
    private boolean[] assento;
    
    private Onibus onibus;
    
    public CadastrarLinha(String cidadePartida, double valorPassagem)
    {
        this.cidadePartida = cidadePartida;
        this.valorPassagem = valorPassagem;
        this.assento = new boolean[100];
    }
    
    public void setNumeroLinha(String numeroLinha)
    {
        this.numeroLinha = numeroLinha;
    }
    public String getNumeroLinha()
    {
        return numeroLinha;
    }
    
    public void setCidadePartida(String cidadePartida)
    {
        this.cidadePartida = cidadePartida;
    }
    public String getCidadePartida()
    {
        return cidadePartida;
    }
    
     public void setCidadeDestino(String cidadeDestino)
    {
        this.cidadeDestino = cidadeDestino;
    }
    public String getCidadeDestino()
    {
        return cidadeDestino;
    }
    
    public void setValorPassagem(double valorPassagem)
    {
        this.valorPassagem = valorPassagem;        
    }
    public double getValorPassagem()
    {
        return valorPassagem;
    }
    
    public void setDataSaida(String dataSaida)
    {
        this.dataSaida = dataSaida;
    }
    public String getDataSaida()
    {
        return dataSaida;
    }
    
    public void setHoraSaida(String horaSaida)
    {
        this.horaSaida = horaSaida;
    }
    public String getHoraSaida()
    {
        return horaSaida;
    }
    
    public void setDataChegada(String dataChegada)
    {
        this.dataChegada = dataChegada;
    }
    public String getDataChegada()
    {
        return dataChegada;
    }
    
    public void setHoraChegada(String horaChegada)
    {
        this.horaChegada = horaChegada;
    }
    public String getHoraChegada()
    {
        return horaChegada;
    }
    
    public void setOnibus(Onibus onibus)
    {
        this.onibus = onibus;
    }    
    public Onibus getOnibus()
    {
        return onibus;
    }
    
     public void setAssento(int lugar)
    {
        if(assento[lugar] == false)
        {
            assento[lugar] = true;
            System.out.println("Compra efetuada com Sucesso");
        }
        else
        {
            System.out.println("Assento ocupado");
        }
    }
}
