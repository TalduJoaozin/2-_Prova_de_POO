import java.util.ArrayList;

public class AppViagem
{
    public static Viagem viagem;
    public static ArrayList <Veiculo> listaVeiculos = new ArrayList<>();

    public static void main(String[] args)
    {
        adicionarVeiculos();

        viagem = new Viagem(1, "Brasil");

        mostrarVeiculos();
        System.out.println(viagem);
        System.out.println();


        Veiculo foundVeiculo = pesquisarVeiculoPorId(3);
        if(foundVeiculo == null)
        {
            System.out.println("Veiculo nao encontrado");
        }
        else
        {
            viagem.iniciarViagem(foundVeiculo);
            System.out.println("Veiculo cadastrado com sucesso");
        }

        viagem.finalizarViagem(100);

        foundVeiculo = pesquisarVeiculoPorId(2);
        if(foundVeiculo == null)
        {
            System.out.println("Veiculo nao encontrado");
        }
        else
        {
            viagem.iniciarViagem(foundVeiculo);
            System.out.println("Veiculo cadastrado com sucesso");
            foundVeiculo.revisar();
        }
        System.out.println(foundVeiculo);

        System.out.println(viagem);
        System.out.println();
        mostrarVeiculos();

    }

    public static void adicionarVeiculos()
    {
        listaVeiculos.add(new Veiculo(2, "FBX1234"));
        listaVeiculos.add(new Veiculo(3, "FBX5678"));
        listaVeiculos.add(new Veiculo(4, "FBX1357"));
    }

    public static void mostrarVeiculos()
    {
        for(Veiculo veiculo : listaVeiculos)
        {
            System.out.println(veiculo.toString());
        }
    }

    public static Veiculo pesquisarVeiculoPorId(int idVeiculo)
    {
        for(Veiculo veiculo : listaVeiculos)
        {
            if(idVeiculo == veiculo.getIdVeiculo())
            {
                return veiculo;
            }
        }
        return null;
    }
}