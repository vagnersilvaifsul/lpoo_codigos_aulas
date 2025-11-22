package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Corrida {

    private BigDecimal valor;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    //relações
    private Usuario usuario;
    private FormaDePagamento formaDePagamento;
    private Situacao situacao;
    private Motorista motorista;

    public Corrida() {
    }

    public Corrida(BigDecimal valor, LocalDateTime dataInicio, LocalDateTime dataFim, Usuario usuario, FormaDePagamento formaDePagamento, Situacao situacao, Motorista motorista) {
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.usuario = usuario;
        this.formaDePagamento = formaDePagamento;
        this.situacao = situacao;
        this.motorista = motorista;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "valor=" + valor +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", usuario=" + usuario +
                ", formaDePagamento=" + formaDePagamento +
                ", situacao=" + situacao +
                ", motorista=" + motorista +
                '}';
    }
}
