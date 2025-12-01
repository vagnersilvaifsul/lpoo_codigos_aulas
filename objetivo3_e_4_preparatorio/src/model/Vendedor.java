package model;

import java.math.BigDecimal;
import java.util.List;

public class Vendedor extends Funcionario{

    private double taxaDeComissao;

    //associações
    private Regiao regiao;
    private List<Pedido> pedido;

    public Vendedor() {
    }

    public Vendedor(Long matricula, String nomeCompleto) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
    }

    public Vendedor(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, double taxaDeComissao, Regiao regiao, List<Pedido> pedido) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.taxaDeComissao = taxaDeComissao;
        this.regiao = regiao;
        this.pedido = pedido;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", regiao=" + regiao +
                ", pedido=" + pedido +
                ", matricula=" + matricula +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                '}';
    }
}
