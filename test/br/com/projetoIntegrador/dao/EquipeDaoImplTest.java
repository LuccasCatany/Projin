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
import java.util.List;
import junit.framework.Assert;
import static junit.framework.Assert.assertNotNull;
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

//@Test 
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        equipe = new Equipe(
                GeradorUtil.gerarNome() + " Equipe"
        );
        CampeonatoDaoImpl campeonatoDaoImpl = new CampeonatoDaoImpl();
        //pesquisar por nome esta puxando um ID de um campeonato que já existe no banco, By - ice
        Campeonato camp = campeonatoDaoImpl.pesquisarPorNome("Junior alterado");
        equipe.setCampeonato(camp);
        mostrarEquipe(equipe);
        equipeDaoImpl.salvar(equipe);
    } 
    
    //@Test //não funciona ainda, dá muitas voltas 
    public void testeAlterar() throws SQLException {
        System.out.println("alterar");
        equipe = equipeDaoImpl.pesquisarEquipePorIdEquipe(2);
        equipe.setNome("Name alterTest");
        equipe.getCampeonato().setId(1); //na verdade essa linha simularia se a pessoa quer trocar o campeonato da equipe
        equipeDaoImpl.alterar(equipe, 1);
        mostrarEquipe(equipe);
    }
    
    //@Test
    public void testExcluir()throws Exception {
        System.out.println("excluir");
        mostrarEquipe(equipe);
        equipeDaoImpl.excluir(1);
    }
    
    
    //@Test
    public void testPesquisarEquipePorIdEquipe() throws Exception {
        System.out.println("pesquisar por id");
        equipe = equipeDaoImpl.pesquisarEquipePorIdEquipe(1);
        mostrarEquipe(equipe);
        
    }
    
    //@Test
    public void testPesquisarPorNomeEquipe() throws Exception {
        System.out.println("Pesquisar por nome");
        List<Equipe> equipes = equipeDaoImpl.pesquisarEquipePorNomeEquipe("Roberto");
        for (Equipe equipe1 : equipes) {
            mostrarEquipe(equipe1);
        }
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

    
    
    