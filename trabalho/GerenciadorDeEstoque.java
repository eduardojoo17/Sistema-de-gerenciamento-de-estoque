package trabalho;
import java.util.Scanner;
public class GerenciadorDeEstoque {
     public static void main(String[] args){
          Produto[] produtos = new Produto[100];
          
          int num, contador=0;

          Scanner ler = new Scanner(System.in);
do{

      System.out.println("\n--- Gerenciador de Estoque ---");
              System.out.println("1. Cadastrar Produtos");
              System.out.println("2. Buscar Produto por Código");
              System.out.println("3. Buscar Produto por nome");
              System.out.println("4. Listar por preço");
              System.out.println("5. listar por nome");
              System.out.println("6. Sair");
              System.out.print("Digite a opção desejada: -->  ");
     num = ler.nextInt();
     ler.nextLine();
     
     
     
     switch (num) {
          case 1:
          produtos[contador] = Menu.MenuDeCadastro();
          contador++;
          break;
          case 2:
          if (contador == 0) {
               System.out.println("Nenhum produto foi cadastrado");
               
          } else {
               
               long busca;
               Produto encontrado;
               
                    System.out.println("digite o codigo do produto que deseja achar:");
                    busca = ler.nextLong();
                    encontrado = Menu.buscaPorCodigo(produtos,busca);
                   if ( encontrado != null) { 

                    System.out.println("| o Codigo -->"+encontrado.codigo+" | seu Produto --> "+encontrado.nome+ " | qtd em estoque --> "+ encontrado.QuantidadeEmEstoque);
               }else{
                    System.out.println("Produto não encontrado | Codigo digitado --> "+busca);
               } 
          }  
          break;
          case 3:
          if (contador == 0) {
               System.out.println("Nenhum produto foi cadastrado");
               break;
           }
           
           Produto[] produtosCadastrados = new Produto[contador];
           for (int i = 0; i < contador; i++) {
               produtosCadastrados[i] = produtos[i];
           }
           
           String buscaNome;
           Produto encontradoNome;
           
           System.out.println("digite o produto que deseja achar: ");
           buscaNome = ler.nextLine();
           
           Menu.selectionSortPorNome(produtosCadastrados);
           
           encontradoNome = Menu.buscaBinariaPorNome(produtosCadastrados, buscaNome);
           
           if(encontradoNome != null){
               System.out.println(" | seu Produto --> "+encontradoNome.nome+ "| o Codigo -->"+encontradoNome.codigo+" | qtd em estoque --> "+ encontradoNome.QuantidadeEmEstoque);
           }else{
               System.out.println("Produto não encontrado | Nome digitado --> "+buscaNome);
           }
       
          break;
          
          case 4:
          if (contador == 0) {
              System.out.println("Nenhum produto foi cadastrado");
          } else {
              
              Produto[] produtosParaListar = new Produto[contador];
              for (int i = 0; i < contador; i++) {
                  produtosParaListar[i] = produtos[i];
              }
      
              Menu.selectionSortPorPreco(produtosParaListar); 
              
              System.out.println("\n--- Lista de Produtos (Ordenada por Preço) ---");
              System.out.printf("%-10s %-20s %-15s %-10s %s\n", "CÓDIGO", "NOME", "CATEGORIA", "PREÇO", "QTD ESTOQ");
              
              for(int i = 0; i < produtosParaListar.length; i++){
                  Produto p = produtosParaListar[i];
                  System.out.printf("%-10d %-20s %-15s %-10.2f %d\n", 
                      p.codigo, p.nome, p.categoria, p.preco, p.QuantidadeEmEstoque);
              }
          }
          break;
     

         
          case 5:
    if (contador == 0) {
        System.out.println("Nenhum produto foi cadastrado");
    } else {
        
        Produto[] produtosParaListar = new Produto[contador];
        for (int i = 0; i < contador; i++) {
            produtosParaListar[i] = produtos[i];
        }

        Menu.selectionSortPorNome(produtosParaListar); 
        
        System.out.println("\n--- Lista de Produtos (Ordenada por Nome) ---");
        System.out.printf("%-10s %-20s %-15s %-10s %s\n", "CÓDIGO", "NOME", "CATEGORIA", "PREÇO", "QTD ESTOQ");
        
        for(int i = 0; i < produtosParaListar.length; i++){
            Produto p = produtosParaListar[i];
            System.out.printf("%-10d %-20s %-15s %-10.2f %d\n", 
                p.codigo, p.nome, p.categoria, p.preco, p.QuantidadeEmEstoque);
        }
    }
    break;
     
         
          
          
          
     
          
          default:System.out.println(" opção invalida");
          break;
     }



     
}while (num != 6);
     

     
        
       
        
     }  
}

 
