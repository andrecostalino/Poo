
/**
 * Escreva uma descrição da classe Imóvel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Imóvel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int IPTU;
    private String tipo, utilizacao;
    private Enderecos endereco;

    /**
     * Construtor para objetos da classe Imóvel
     */
    public Imóvel(int IPTU, String tipo, String utilizacao, Enderecos endereco)
    {
        // inicializa variáveis de instância
        this.IPTU = IPTU;
        this.tipo = tipo;
        this.utilizacao = utilizacao;
        this.endereco = endereco;
    }
    public String toString()
    {
        return "IPTU: " + this.IPTU + " Tipo: " + this.tipo + " Utilizacao: " + this.utilizacao + this.endereco.toString();
    }
    public String getTipo()
    {
        return this.tipo;
    }
    public String getUtilizacao()
    {
        return this.utilizacao;
    }
    public int getIPTU()
    {
        return this.IPTU;
    }
    public Enderecos getEndereco()
    {
        return this.endereco;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public void setUtilizacao(String utilizacao)
    {
        this.utilizacao = utilizacao;
    }
    public void setIPTU(int IPTU)
    {
        this.IPTU = IPTU;
    }
    public void setEndereco(Enderecos endereco)
    {
        this.endereco = endereco;
    }
}
