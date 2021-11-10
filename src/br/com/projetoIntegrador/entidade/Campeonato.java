
package br.com.projetoIntegrador.entidade;

import java.util.Date;


public class Campeonato {
    private Integer id;
    private String nomeCampeonato;
    private Date dataCampeonato;
    
    private Equipe equipe;
    private Endereco endereco;

    
    public Campeonato() {
    }

    public Campeonato(String nomeCampeonato, Date dataCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
        this.dataCampeonato = dataCampeonato;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public Date getDataCampeonato() {
        return dataCampeonato;
    }

    public void setDataCampeonato(Date dataCampeonato) {
        this.dataCampeonato = dataCampeonato;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
     
}
