import java.util.Date;

public class Viagem
{
    private int idViagem;
    private String destino;
    private Date dataInicial;
    private Date dataFinal;
    private int kmPercorrido;
    Veiculo veiculo;

    public Viagem(int idViagem, String destino)
    {
        super();
        this.idViagem = idViagem;
        this.destino = destino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public int getIdViagem()
    {
        return idViagem;
    }
    public String getDestino()
    {
        return destino;
    }
    public Date getDataInicial()
    {
        return dataInicial;
    }
    public Date getDataFinal()
    {
        return dataFinal;
    }
    public int getKmPercorrido()
    {
        return kmPercorrido;
    }

    public Boolean iniciarViagem(Veiculo veiculo)
    {
        if(this.veiculo != null && veiculo.getStatus() == 'V')
        {
            return false;
        }
        this.veiculo = veiculo;
        this.dataInicial = new Date();
        veiculo.registrarViagem();
        return true;

    }

    public void finalizarViagem(int kmOdometro)
    {
        this.dataFinal = new Date();
        veiculo.registrarRetorno(kmOdometro);
    }

    public int calcularKmPercorrido (int kmOdometro)
    {
        return this.kmPercorrido = kmOdometro + veiculo.getKmOdometro();
    }

    @Override
    public String toString() {
        return  "\nId viagem....: " + this.idViagem +
                "\nDestino......: " + this.destino  +
                "\nData Inicial.: " + this.dataInicial +
                "\nData Final...: " + this.dataFinal +
                "\nKm Percorrido: " + this.kmPercorrido;
    }
}