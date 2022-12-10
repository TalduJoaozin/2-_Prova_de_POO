
public class Veiculo
{
    private int idVeiculo;
    private String placa;
    private char status;
    private int kmOdometro;



    public Veiculo(int idVeiculo, String placa)
    {
        super();
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.status = 'D';
    }


    public String getPlaca()
    {
        return placa;
    }
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }


    public int getIdVeiculo()
    {
        return idVeiculo;
    }
    public char getStatus()
    {
        return status;
    }
    public int getKmOdometro()
    {
        return kmOdometro;
    }



    public void  registrarViagem()
    {
        this.status = 'V';
    }

    public void registrarRetorno(int kmOdometro)
    {
        this.status = 'D';
        this.kmOdometro = kmOdometro;
    }

    public void revisar()
    {
        this.status = 'M';
    }

    @Override
    public String toString() {
        return  "\nId veiculo.: " + this.idVeiculo +
                "\nPlaca......: " + this.placa  +
                "\nStatus.....: " + this.status +
                "\nKm Odometro: " + this.kmOdometro;
    }
}