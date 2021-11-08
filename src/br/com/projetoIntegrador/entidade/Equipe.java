/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.entidade;

/**
 *
 * @author maria
 */
public class Equipe {
    private Integer id;
    private String nome;
    
    private Participante participante;

    
    public Equipe(){
        
    }
    
    public Equipe(Integer id, String nome, Participante participante) {
        this.id = id;
        this.nome = nome;
        this.participante = participante;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
    

}
