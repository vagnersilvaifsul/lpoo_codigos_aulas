package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Long id;
    private String nome;
    private String sigla;

    //associação com a classe Usuario
    private List<Usuario> usuarios = new ArrayList<>();

}
