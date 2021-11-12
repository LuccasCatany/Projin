/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Campeonato;
import br.com.projetoIntegrador.entidade.Endereco;
import br.com.projetoIntegrador.util.GeradorUtil;
import java.sql.SQLException;
import java.util.Date;
import org.junit.Test;

/**
 *
 * @author luccas.espinola
 */
public class CampeonatoDaoImplTest {

    private CampeonatoDaoImpl campeonatoDaoImpl;
    private Campeonato campeonato;

    public CampeonatoDaoImplTest() {
        campeonatoDaoImpl = new CampeonatoDaoImpl();
    }

//    @Test
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        campeonato = new Campeonato(
                GeradorUtil.gerarNome(),
                new Date()
        );
        Endereco endereco = new Endereco(GeradorUtil.gerarLogradouro(),
                GeradorUtil.gerarBairro(),  
                GeradorUtil.gerarCidade(),
                GeradorUtil.gerarEstado(),
                GeradorUtil.gerarCep(),
                "Teste"
        );
        campeonato.setEndereco(endereco);
        campeonatoDaoImpl.salvar(campeonato);
        
        
    }
    
//    @Test
    public void testePesquisarPorNome(){
        System.out.println("Pesquisar por nome >w<");
        String nome = "Zoe cinnabar";
        campeonato = campeonatoDaoImpl.pesquisarPorNome(nome);
        mostrarCampeonato(campeonato);
    }
    
    
//    @Test
    public void testeExcluir() {
        System.out.println("Excluir :)");
        int i = 3;
        campeonatoDaoImpl.excluir(i);
    }
    
//    @Test
    public void testeAlterar() {
        System.out.println("Alterar :)");
        campeonato = campeonatoDaoImpl.pesquisarPorNome("Ankha satsuki");
        campeonato.setNomeCampeonato("Nome qualquer");
        campeonato.setDataCampeonato(new Date());
        campeonatoDaoImpl.alterar(campeonato);
        mostrarCampeonato(campeonato);
    }

    
    public void mostrarCampeonato(Campeonato campeonato){
        System.out.println("ID " + campeonato.getId());
        System.out.println("Nome " + campeonato.getNomeCampeonato());
        System.out.println("Data " + campeonato.getDataCampeonato());
    }
    
    
    
}
