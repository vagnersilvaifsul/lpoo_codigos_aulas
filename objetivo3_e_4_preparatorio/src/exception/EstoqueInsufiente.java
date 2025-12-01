package exception;

public class EstoqueInsufiente extends RuntimeException{

    //i
     //Crie uma classe de Exceção, a classe EstoqueInsuficiente, que emita a seguinte mensagem
    //de exceção “Estoque Insuficiente”, e faça o programa lançar essa exceção, ao baixar o
    //estoque, toda vez que a quantidade de produto for insuficiente.
    public EstoqueInsufiente(String message) {
        super(message);
    }
}
