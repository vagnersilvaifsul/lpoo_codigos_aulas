package controller;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UberController {
    public static void main(String[] args) {

        //a. Faça o programa realizar duas corridas para o mesmo usuário, com um mesmo
        //motorista e veículo;
        Usuario usuario = new Usuario("Ana", "ana@email", "5355551234");
        Veiculo veiculo = new Veiculo("123456", "123456", "123456", "123456", 2010);
        Motorista motorista = new Motorista("Ana", "motora@email", "53555123456", veiculo);
        Corrida corrida1 = new Corrida(
                BigDecimal.valueOf(20.00),
                LocalDateTime.of(2025, 11, 20, 10, 00),
                LocalDateTime.of(2025, 11, 20, 14, 00),
                usuario,
                FormaDePagamento.PIX,
                Situacao.EM_ANDAMENTO,
                motorista
        );
        Corrida corrida2 = new Corrida(
                BigDecimal.valueOf(20.00),
                LocalDateTime.of(2025, 11, 19, 10, 00),
                LocalDateTime.of(2025, 11, 19, 14, 00),
                usuario,
                FormaDePagamento.PIX,
                Situacao.EM_ANDAMENTO,
                motorista
        );
    }
}
