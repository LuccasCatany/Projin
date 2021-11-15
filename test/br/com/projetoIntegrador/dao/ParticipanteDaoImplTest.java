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
 * @author maria
 */
public class ParticipanteDaoImplTest {

    private ParticipanteDaoImpl participanteDaoImpl;
    private Participante participante;

    public ParticipanteDaoImplTest() {
        participanteDaoImpl = new ParticipanteDaoImpl();
    }

//    @Test
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        Equipe equipe = new Equipe();

        participante = new Participante(
                GeradorUtil.gerarNome(),
                GeradorUtil.gerarCpf(),
                GeradorUtil.gerarTelefone(),
                new Date()
        );
        Endereco endereco = new Endereco(
                GeradorUtil.gerarLogradouro(),
                GeradorUtil.gerarBairro(),
                GeradorUtil.gerarCidade(),
                GeradorUtil.gerarEstado(),
                GeradorUtil.gerarCep(),
                "Teste do ice"
        );
        participante.setEndereco(endereco);
//        participante.setEquipe(equipe);
        participanteDaoImpl.salvar(participante);
    }

//    @Test
    public void testExcluir() {
        System.out.println("excluir");

    }

    
    @Test
    public void testePesquisarPorNome() throws SQLException {
        System.out.println("Pesquisar por nome");
        participante = participanteDaoImpl.pesquisarPorNome("Roberto satsuki");
        mostrarParticipanteEndereco(participante);
    }

    public void mostrarParticipanteEndereco(Participante participante) {
        System.out.println("ID " + participante.getId());
        System.out.println("Nome " + participante.getNome());
        System.out.println("Cpf " + participante.getCpf());
        System.out.println("Telefone " + participante.getTelefone());
        System.out.println("Data Nascimento " + participante.getNascimento());
        System.out.println("Logradouro " + participante.getEndereco().getLogradouro());
        System.out.println("Bairro " + participante.getEndereco().getBairro());
        System.out.println("Cidade " + participante.getEndereco().getCidade());
        System.out.println("Estado " + participante.getEndereco().getEstado());
        System.out.println("Cep " + participante.getEndereco().getCep());
        System.out.println("Complemento " + participante.getEndereco().getComplemento());
    }

}
