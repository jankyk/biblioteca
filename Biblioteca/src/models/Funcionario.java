/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Janquiel Kappler
 */
public class Funcionario {
    
    private String id;
    private String nomefuncionario;
    private String emailfuncionario;
    private String telefonefuncionario;
    private String cpffuncionario;
    private String ruafuncionario;
    private String bairrofuncionario;
    private String login;
    private String senha;
    private String nivelacesso;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getEmailfuncionario() {
        return emailfuncionario;
    }

    public void setEmailfuncionario(String emailfuncionario) {
        this.emailfuncionario = emailfuncionario;
    }

    public String getTelefonefuncionario() {
        return telefonefuncionario;
    }

    public void setTelefonefuncionario(String telefonefuncionario) {
        this.telefonefuncionario = telefonefuncionario;
    }

    public String getCpffuncionario() {
        return cpffuncionario;
    }

    public void setCpffuncionario(String cpffuncionario) {
        this.cpffuncionario = cpffuncionario;
    }

    public String getRuafuncionario() {
        return ruafuncionario;
    }

    public void setRuafuncionario(String ruafuncionario) {
        this.ruafuncionario = ruafuncionario;
    }

    public String getBairrofuncionario() {
        return bairrofuncionario;
    }

    public void setBairrofuncionario(String bairrofuncionario) {
        this.bairrofuncionario = bairrofuncionario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(String nivelacesso) {
        this.nivelacesso = nivelacesso;
    }
}
