package trabalho;

public class Produto {
 long codigo;
 String nome;
 String categoria;
 double preco;
 int QuantidadeEmEstoque;

 public Produto(long codigo,String nome,String categoria,double preco,int QuantidadeEmEstoque){
    this.codigo=codigo;
    this.nome=nome;
    this.categoria=categoria;
    this.preco=preco;
    this.QuantidadeEmEstoque=QuantidadeEmEstoque;

 }
}
