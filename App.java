
/**
 * Modela o cálculo de IMC
 * 
 * @author marceloakira 
 * @version 0.01
 */
public class App
{
    // escolher o produto
    // informa valor do produto e quantidade.
    static String[] Produtos = {"bateria","escapamento","pneu"};
    static double[] valores = {100,50,70};
    String cliente = "Não Informado";
    int[] quantidades = {0,0,0};
    double total = 0;
    
    public App() {
        for(int i =0;i<3;i++){ //zera todos os quantidades
            this.quantidades[i] = 0;
        }
    }

    /**
     * Construtor para objetos da classe CalculadoraIMC
     */
    public App(String nome,int baterias, int escapamento, int pneu)
    {
        nome = this.cliente;
        baterias = this.quantidades[0];
        escapamento = this.quantidades[1];
        pneu = this.quantidades[2];
    }

    /**
     * Calcula o IMC
     * 
     * @return o total de todo 
     */
    public double calcularTotal(){
        this.total = this.quantidades[0]+this.quantidades[1]+this.quantidades[2];
        return total;
    }
    //produto 1 bateria
    //produto 2 escapamento
    //produto 3 pneu
    public void addProdutos(int quantidade, int produto){
        this.quantidades[produto] = quantidade;
    }
    
    public void mudarNome(String nome){
        this.cliente = nome;
    }
}
