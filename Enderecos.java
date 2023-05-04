

/**
 * Escreva uma descrição da classe Enderecos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Enderecos
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numero, cep;
    private String estado, cidade, rua;
    String[] estadosBrasil = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO"};

    /**
     * Construtor para objetos da classe Enderecos
     */
    public Enderecos(int numero, int cep, String rua, String estado, String cidade)
    {
        // inicializa variáveis de instância
        this.numero = numero;
        this.cep = cep;
        this.rua = rua;
        if(verificarEstado(estado) == true)
        {
            this.estado = estado;
        }
        else
        {
            System.out.println("Erro");
            this.estado = null;
        }
        
        this.cidade = cidade;   
    }
    public Enderecos(int numero, int cep, String rua)
    {
        // inicializa variáveis de instância
        this.numero = numero;
        this.cep = cep;
        this.rua = rua;
        this.estado = "BA";
        this.cidade = "Salvador";   
    }
    public String toString()
    {
        return " Numero: " + this.numero + " CEP: " + this.cep + " Estado: " + this.estado + " Cidade: " + this.cidade + " Rua: " + this.rua;
    }
    public boolean verificarEstado(String estado)
    {
        for(int i = 0; i < estadosBrasil.length; i++)
        {
            if(estado == estadosBrasil[i])
            {
                return true;
            }
        }
        return false;
    }
    public String getEstado()
    {
        return this.estado;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public String getRua()
    {
        return this.rua;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public int getCep()
    {
        return this.cep;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    public void setCep(int cep)
    {
        this.cep = cep;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */

}
