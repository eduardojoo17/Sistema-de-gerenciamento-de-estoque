package trabalho;
import java.util.Scanner;


public class Menu {
   
    public static Produto MenuDeCadastro() {
        Produto novo;
        Scanner leia = new Scanner(System.in);

       
            System.out.println("Digite o produto");
            String nome = leia.nextLine();

            System.out.println("Digite o codigo");
            long codigo = leia.nextLong();
            leia.nextLine();

            System.out.println("Digite o preco");
            double preco = leia.nextDouble();
            leia.nextLine();

            System.out.println("Digite a categoria");
            String categoria = leia.nextLine();

            System.out.println("Digite a quantidade do seu estoque");
            int QuantidadeEmEstoque = leia.nextInt();
            leia.nextLine();


            
          
            novo = new Produto(codigo, nome, categoria, preco, QuantidadeEmEstoque);
            
        
        return novo;
             
    }
 
     
    public static Produto buscaPorCodigo(Produto[] vetor, long Busca) {
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i].codigo == Busca) {
            return vetor[i]; // achou o produto
        }
    }
    return null; // não encontrou
}


public static void selectionSortPorNome(Produto[] vetor){
    int n = vetor.length;
    for(int i = 0; i<n -1; i++){
        int indiceDoMenor = i;
        for(int j = i+1; j<n;j++){
            if(vetor[j].nome.compareToIgnoreCase(vetor[indiceDoMenor].nome) < 0){
                indiceDoMenor = j;
            }
        }
        Produto temp = vetor[indiceDoMenor];
        vetor[indiceDoMenor] = vetor[i];
        vetor[i] = temp;
    }
}
public static Produto buscaBinariaPorNome(Produto[] vetor, String busca){
    int inicio = 0;
    int fim = vetor.length - 1;
    while(inicio <= fim){
        int meio = inicio + (fim - inicio) /2;
        int comparacao = busca.compareToIgnoreCase(vetor[meio].nome);
        if(comparacao == 0){
            return vetor[meio];
        }
        if(comparacao < 0){
            fim = meio - 1;
        }else{
            inicio = meio + 1;
        }
    }
    return null;
}


public static void selectionSortPorPreco(Produto[] vetor){
    int n = vetor.length;
    for(int i = 0; i < n - 1; i++){
        int indiceDoMenor = i;
        for(int j = i + 1; j < n; j++){
            // Compara os preços. Usamos '>' para ordem decrescente.
            if(vetor[j].preco > vetor[indiceDoMenor].preco){
                indiceDoMenor = j;
            }
        }
        Produto temp = vetor[indiceDoMenor];
        vetor[indiceDoMenor] = vetor[i];
        vetor[i] = temp;
    }
}







      
    }

   
    
    
