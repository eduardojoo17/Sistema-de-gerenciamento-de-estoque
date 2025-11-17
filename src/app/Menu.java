package app;
import model.Produto;
import repository.Repositorio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    Scanner ler = new Scanner(System.in);
    Repositorio repo = new Repositorio();
    ArrayList<Produto> pro = new ArrayList<>();   
    

    public void menuPrincipal(){

        int n;
        do{

      System.out.println("\n--- Gerenciador de Estoque ---");
              System.out.println("1. Cadastrar Produtos");
             System.out.println("2. Remover produto");
             System.out.println("2. Buscar Produto por Código");
              System.out.println("4. Listar por preço");
              System.out.println("5. listar por nome");
              System.out.println("6. Sair");
              System.out.print("Digite a opção desejada: -->  ");
     n = ler.nextInt();
     ler.nextLine();

     switch (n) {
        case 1:
            cadastro();
            break;
        case 2:
            Remover();
        break;
        default:
        System.out.println("opção invalida!!");
            break;
     }



    }while(n!=6);
     
     
    }
    
    public void cadastro(){
        
         
        
       
            System.out.println("Digite o produto");
            String nome = ler.nextLine();

            System.out.println("Digite o codigo");
            long codigo = ler.nextLong();
            ler.nextLine();

            System.out.println("Digite o preco");
            double preco = ler.nextDouble();
            ler.nextLine();

            System.out.println("Digite a categoria");
            String categoria = ler.nextLine();

            System.out.println("Digite a quantidade do seu estoque");
            int QuantidadeEmEstoque = ler.nextInt();
            ler.nextLine();
        
        Produto pro = new Produto(codigo, nome, categoria, preco, QuantidadeEmEstoque);
         repo.adicionar(pro);   
         System.out.println(pro);
    }

    public void Remover(){

   
        for (int i = 0;i<pro.size();i++){
            System.out.println("indice: "+i+ " - "+pro.get(i));
        }
         System.out.println("qual produto deseja remover?: ");
        int r = ler.nextInt();
        boolean remo = repo.remover(r);

        if (remo==false) {
            System.out.println("indice não encontrado");
        }else{
            System.out.println("produto removido");
        }
    }
}
