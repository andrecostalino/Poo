import java.util.ArrayList;
import java.util.Iterator;
/**
 * Escreva uma descrição da classe Proprietário aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Proprietário
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int cpf, identidade;
    private String nome;
    private ArrayList<Imóvel> imoveis;
    private Enderecos endereco;
    /**
     * Construtor para objetos da classe Proprietário
     */
    public Proprietário(int cpf, int identidade, String nome, Enderecos endereco)
    {
        // inicializa variáveis de instância
        this.cpf = cpf;
        this.identidade = identidade;
        this.nome = nome;
        this.endereco = endereco;
        this.imoveis = new ArrayList<Imóvel>();
    }
    public void adiocionarImovel(Imóvel imovel)
    {
        imoveis.add(imovel);
    }
    public void procuraPorTipo(String tipo)
    {
        for(int i = 0;i<this.imoveis.size();i++)
        {
            if(imoveis.get(i).getTipo().equals(tipo))
            {
                System.out.println(this.imoveis.get(i).toString());
            }
        }
    }
    public void atualiarEnderecos(Enderecos endereco){
        this.endereco = endereco;
    }
    public String getNome()
    {
        return this.nome;
    }
    public int getIdentidade()
    {
        return this.identidade;
    }
    public int getCpf()
    {
        return this.cpf;
    }
    public Enderecos getEndereco()
    {
        return this.endereco;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdentidade(int identidade)
    {
        this.identidade = identidade;
    }
    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }
}
