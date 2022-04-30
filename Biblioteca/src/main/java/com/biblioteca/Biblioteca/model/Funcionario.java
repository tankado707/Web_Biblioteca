package com.biblioteca.Biblioteca.model;

import javax.persistence.*;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "Nome")
    private String nome;
    @Column(name = "Apelido")
    private String apelido;
    @Column(name = "Email")
    private String email;
    @Column(name = "Area")
    private String area;

    public Funcionario(){

    }

    public Funcionario(String nome, String apelido, String email, String area) {
        super();
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.area = area;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
