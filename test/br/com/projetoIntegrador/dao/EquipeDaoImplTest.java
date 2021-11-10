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
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

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
        equipeDaoImpl.salvar(equipe);
    }
    
    //@Test
    public void testeAlterar() throws SQLException {
        System.out.println("alterar");
        equipe = equipeDaoImpl.pesquisarPorNome("Ankha satsuki");
        equipe.setNome("Nome equipe");
        equipeDaoImpl.alterar(equipe);
        mostrarEquipe(equipe);
    }
    
    //@Test
    public void testExcluir()throws Exception {
        System.out.println("excluir");
//        buscarEquipeBD();
//        equipeDaoImpl.excluir(equipe.getId());
          equipeDaoImpl.excluir(1);
    }
    
    
    //@Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisarPorId");
//        buscarEquipeBD();
//        Equipe equipePesquisada = (Equipe) equipeDaoImpl.pesquisarPorId(equipe.getId());
//        mostrarEquipe(equipePesquisada);
        equipe = equipeDaoImpl.pesquisarPorId(1);
        mostrarEquipe(equipe);
    }
    
    //@Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("Pesquisar por nome");
        String nome = "Nome equipe";
        equipe = equipeDaoImpl.pesquisarPorNome(nome);
        mostrarEquipe(equipe);        
        
       
    }
    
//    
    //metodo auxiliar 
    private void mostrarEquipe(Equipe equipe){
        System.out.println("Id: "+ equipe.getId());
        System.out.println("Nome: "+ equipe.getNome());
        System.out.println("Id do campeonato: "+ equipe.getCampeonato().getId());
        System.out.println("Nome campeonato: "+ equipe.getCampeonato().getNomeCampeonato());
        System.out.println("Data campeonato: "+ equipe.getCampeonato().getDataCampeonato());
        
    }
    
//     public Equipe buscarEquipeBD() throws SQLException{
//        String sql = "SELECT * FROM equipe";
//        Connection conexao = null;
//        PreparedStatement preparaSql = null;
//        ResultSet resultado = null;
//        try {
//            conexao = FabricaConexao.abrirConexao();
//             preparaSql= conexao.prepareStatement(sql);
//            resultado = preparaSql.executeQuery();
//            
//            if(resultado.next()){
//                equipe = new Equipe();
//                equipe.setId(resultado.getInt("id"));
//                equipe.setNome(resultado.getString("nome"));
//                
//            }else{
//                testSalvar();
//            }
//        } catch (Exception e) {
//            System.out.println("Erro ao pesquisar buscarEquipe "+ e.getMessage());
//        }finally{
//            conexao.close();
//            preparaSql.close();
//            resultado.close();
//        
//        }
//        return equipe;
//    }
//    
    
    
    
}

    
    
    