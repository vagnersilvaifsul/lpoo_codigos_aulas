package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Long id;
    private String email;
    private String nome;
    private String urlFoto;

    //associação com o Enum Perfil
    private Perfil perfil;

    //associação com a classe Curso
    private Curso curso;

    //associação com a classe Empresa
    private Empresa empresa;

    //associação com a classe Usuario
    private List<Usuario> contatos = new ArrayList<>();

}
