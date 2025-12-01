package controller;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VendasController {
    public static void main(String[] args) {

        //c Faça a aplicação realizar um pedido. Um pedido compreende:
        //i. Registrar o Vendedor, os Produtos, e o Carrinho (uma lista de Item);
        //ii. Registrar os detalhes de Pedido, como, número do pedido, total do pedido e a data do
        //pedido;
        //iii. Baixar o estoque de Produto;
        //iv. Imprimir o Pedido com seus detalhes, como, os Itens, o total de cada Item, o total do
        //Pedido, e os demais atributos do Pedido;
        Vendedor vendedor1 = new Vendedor(1L, "Ana");
        Produto produto1 = new Produto("1L", "Notebook", BigDecimal.valueOf(1000.0), 100, BigDecimal.valueOf(800.00));
        Produto produto2 = new Produto("2L", "Mouse", BigDecimal.valueOf(100.0), 100, BigDecimal.valueOf(80.00));

        Item item1 = new Item(
                1,
                produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(1)),
                produto1,
                Situacao.ATIVO);
        Item item2 = new Item(
                1,
                produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(1)),
                produto2,
                Situacao.ATIVO);

        List<Item> carrinho = new ArrayList<>();
        carrinho.add(item1);
        carrinho.add(item2);

        BigDecimal totalPedido = BigDecimal.ZERO;
        for (Item item : carrinho) {
            totalPedido = totalPedido.add(item.getTotal());
        }

        Produto.baixarEstoqueComException(carrinho);

        Pedido pedido1 = new Pedido(
                "fjalskj",
                LocalDateTime.now(),
                totalPedido,
                carrinho,
                Estado.ABERTO,
                vendedor1
        );
        System.out.println(pedido1);

        //d
        //Faça a aplicação realizar outro pedido, no mesmo formato, variando apenas a quantidade
        //de cada Item;
        item1 = new Item(
                2,
                produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(2)),
                produto1,
                Situacao.ATIVO);
        item2 = new Item(
                2,
                produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(2)),
                produto2,
                Situacao.ATIVO);
        carrinho.clear();
        carrinho.add(item1);
        carrinho.add(item2);

        totalPedido = BigDecimal.ZERO;
        for (Item item : carrinho) {
            totalPedido = totalPedido.add(item.getTotal());
        }

        Produto.baixarEstoqueComException(carrinho);

        Pedido pedido2 = new Pedido(
                "yriuewqy",
                LocalDateTime.now(),
                totalPedido,
                carrinho,
                Estado.ABERTO,
                vendedor1
        );
        System.out.println(pedido2);

        //e
        //Faça a aplicação registrar os dois pedidos (os realizados nos itens c e d) em uma coleção de
        //pedidos;
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        //f
        //Faça o programa imprimir o Relatório de Vendas, isto é, todos os pedidos realizados, bem
        //como, o total de vendas;
        BigDecimal totalVendas = BigDecimal.ZERO;
        for (Pedido pedido : pedidos) {
            totalVendas = totalVendas.add(pedido.getTotal());
        }
        System.out.println("Total de vendas: " + totalVendas);

        //g
        //Faça o programa realizar a entrada de produtos no estoque. Garanta que o programa registre,
        //o Fornecedor, o Fornecimento, e o Produto, bem como, atualize o estoque. Imprima a nova
        //posição de estoque;
        Fornecedor fornecedor1 = new Fornecedor(
                "fjaslk",
                "TutoVendas",
                "fornecedor1@email",
                "5355551223"
                );
        Fornecimento fornecimento1 = new Fornecimento(
                LocalDateTime.now(),
                3,
                produto1.getPrecoDeCusto().multiply(BigDecimal.valueOf(3)),
                produto1,
                fornecedor1
        );
        Fornecimento fornecimento2 = new Fornecimento(
                LocalDateTime.now(),
                3,
                produto2.getPrecoDeCusto().multiply(BigDecimal.valueOf(3)),
                produto2,
                fornecedor1
        );
        System.out.println("\n\n----- Estoque -----");
        produto1.setEstoque(fornecimento1.getQuantidade() + produto1.getEstoque());
        produto2.setEstoque(fornecimento2.getQuantidade() + produto2.getEstoque());
        System.out.println(produto1.getEstoque());
        System.out.println(produto2.getEstoque());

        //h
        //Faça o programa registrar os fornecimentos em uma coleção de Fornecimento. Depois, faça
        //o programa imprimir o Relatório de Fornecimentos, isto é, todos os fornecimentos
        //realizados, bem como, o total fornecido;
        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);
        BigDecimal totalFornecimentos = BigDecimal.ZERO;
        for(Fornecimento f : fornecimentos){
            totalFornecimentos = totalFornecimentos.add(f.getTotal());
        }
        System.out.println("----- Fornecimentos -----");
        System.out.println(fornecimentos);
        System.out.println("Total fornecido: " + totalFornecimentos);

    }
}
