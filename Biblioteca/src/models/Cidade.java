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
public class Cidade {
    
    private int idcidade;
    private String nome;
    private String idestado;

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        this.idestado = idestado;
    }
    
}
