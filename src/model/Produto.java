package model;

public class Produto {
private long codigo;
private String nome;
private String categoria;
private double preco;
private int QuantidadeEmEstoque;

 public Produto(long codigo,String nome,String categoria,double preco,int QuantidadeEmEstoque){
    this.codigo=codigo;
    this.nome=nome;
    this.categoria=categoria;
    this.preco=preco;
    this.QuantidadeEmEstoque=QuantidadeEmEstoque;
 }

 public long getCodigo() {
   return codigo;
 }

 public void setCodigo(long codigo) {
   this.codigo = codigo;
 }

 public String getNome() {
   return nome;
 }

 public void setNome(String nome) {
   this.nome = nome;
 }

 public String getCategoria() {
   return categoria;
 }

 public void setCategoria(String categoria) {
   this.categoria = categoria;
 }

 public double getPreco() {
   return preco;
 }

 public void setPreco(double preco) {
   this.preco = preco;
 }

 public int getQuantidadeEmEstoque() {
   return QuantidadeEmEstoque;
 }

 public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
   QuantidadeEmEstoque = quantidadeEmEstoque;
 }

 @Override
 public String toString() {
   return "Produto [codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco
         + ", QuantidadeEmEstoque=" + QuantidadeEmEstoque + "]";
 }
}
