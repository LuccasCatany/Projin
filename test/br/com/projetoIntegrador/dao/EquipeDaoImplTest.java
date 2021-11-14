/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Campeonato;
import br.com.projetoIntegrador.entidade.Equipe;
import br.com.projetoIntegrador.util.GeradorUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;


/**
 *
 * @author luccas.espinola
 */
public class EquipeDaoImplTest {

    private Equipe equipe;
    private EquipeDaoImpl equipeDaoImpl;
    private Campeonato campeonato;

    public EquipeDaoImplTest() {
         equipeDaoImpl = new EquipeDaoImpl();
    }

//    @Test 
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        equipe = new Equipe(
                GeradorUtil.gerarNome() + " Equipe"
        );
        CampeonatoDaoImpl campeonatoDaoImpl = new CampeonatoDaoImpl();
        Campeonato camp = campeonatoDaoImpl.pesquisarPorNome("Zoe cinnabar");
        equipe.setCampeonato(camp);
        
        equipeDaoImpl.salvar(equipe);
    } 
    
    //@Test 
    public void testeAlterar() throws SQLException {
        System.out.println("alterar");
        equipe = equipeDaoImpl.pesquisarEquipePorNome("Ankha satsuki");
        equipe.setNome("Nome equipe");
//        equipe.getCampeonato().setId(1); //na verdade essa linha simularia se a pessoa quer trocar o campeonato da equipe
        equipeDaoImpl.alterar(equipe);
        mostrarEquipe(equipe);
    }
    
    //@Test
    public void testExcluir()throws Exception {
        System.out.println("excluir");
        mostrarEquipe(equipe);
        equipeDaoImpl.excluir(1);
    }
    
    
    //@Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisar por id");
        equipe = equipeDaoImpl.pesquisarEquipePorId(1);
        mostrarEquipe(equipe);
    }
    
    //@Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("Pesquisar por nome");
        String nome = "Nome equipe";
        equipe = equipeDaoImpl.pesquisarEquipePorNome(nome);
        mostrarEquipe(equipe);             
    }
    
  
    //metodo auxiliar 
    private void mostrarEquipe(Equipe equipe){
        System.out.println("Id: "+ equipe.getId());
        System.out.println("Nome: "+ equipe.getNome());
        System.out.println("Id do campeonato: "+ equipe.getCampeonato().getId());
        System.out.println("Nome campeonato: "+ equipe.getCampeonato().getNomeCampeonato());
        System.out.println("Data campeonato: "+ equipe.getCampeonato().getDataCampeonato());
        
    }
    
    
}

    
    
    