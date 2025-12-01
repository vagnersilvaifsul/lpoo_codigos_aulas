package model;

import exception.EstoqueInsufiente;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
    private String sku;
    private String nome;
    private String descricao;
    private Integer estoque;
    private BigDecimal precoDeCusto;
    private BigDecimal precoDeVenda;

    //Associação
    private List<Fornecedor> fornecedor;

    public Produto() {
    }

    public Produto(String sku, String nome, String descricao, Integer estoque, BigDecimal precoDeCusto, BigDecimal precoDeVenda, List<Fornecedor> fornecedor) {
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
        this.fornecedor = fornecedor;
    }

    public Produto(String sku , String nome, BigDecimal precoDeVenda, int estoque, BigDecimal precoDeCusto) {
        this.sku = sku;
        this.nome = nome;
        this.precoDeVenda = precoDeVenda;
        this.estoque = estoque;
        this.precoDeCusto = precoDeCusto;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public BigDecimal getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(BigDecimal precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public BigDecimal getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(BigDecimal precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public List<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }

    public static void baixarEstoqueComException(List<Item> itens) throws EstoqueInsufiente { //o throws orienta o chamador a tratar com try-cath
        itens.forEach(i -> {
            if(i.getProduto().getEstoque() >= i.getQuantidade()){ //se tem estoque faz a baixa
                i.getProduto().setEstoque(i.getProduto().getEstoque() - i.getQuantidade());
            } else { //senão, lança uma exceção
                throw new EstoqueInsufiente("Estoque insuficiente de " + i.getProduto().getNome());
            }
        });
    }


    @Override
    public String toString() {
        return "\nProduto{" +
                "sku='" + sku + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", estoque=" + estoque +
                ", precoDeCusto=" + precoDeCusto +
                ", precoDeVenda=" + precoDeVenda +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
