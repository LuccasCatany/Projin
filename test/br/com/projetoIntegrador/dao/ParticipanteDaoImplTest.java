/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Endereco;
import br.com.projetoIntegrador.entidade.Equipe;
import br.com.projetoIntegrador.entidade.Participante;
import br.com.projetoIntegrador.util.GeradorUtil;
import java.sql.SQLException;
import org.junit.Test;
import java.util.Date;

/**
 *
 * @author Famility
 */
public class ParticipanteDaoImplTest {

    private ParticipanteDaoImpl participanteDaoImpl;
    private Participante participante;

    public ParticipanteDaoImplTest() {
        participanteDaoImpl = new ParticipanteDaoImpl();
    }

    @Test
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        Equipe equipe = new Equipe();
        
        participante = new Participante(
                GeradorUtil.gerarNome(), GeradorUtil.gerarCpf(), GeradorUtil.gerarTelefone(), new Date()
        );
        Endereco endereco = new Endereco(
                "Rua " + GeradorUtil.gerarNome(), "Bairro " + GeradorUtil.gerarNome(), "Cidade " + GeradorUtil.gerarNome(), "Estado " + GeradorUtil.gerarNome(), "88888-888", "casa"
        );
        participante.setEndereco(endereco);
        participante.setEquipe(equipe);
        participanteDaoImpl.salvar(participante);
    }

//    @Test
    public void testExcluir() {
        System.out.println("excluir");

    }

    private Equipe pesquisarEquipeDb(){
        return null;
    }
    //TODO Test do CRUD
}
