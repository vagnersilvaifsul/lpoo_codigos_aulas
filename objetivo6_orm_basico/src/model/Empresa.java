package model;

import java.util.ArrayList;
import java.util.List;


public class Empresa {

    private Long id;
    private String nome;
    private String tecnologias;
    private String endereco;
    private Double latitude;
    private Double longitude;
    private String urlLogo;

    //associação com a classe Usuario
    private List<Usuario> usuarios = new ArrayList<>();
}
