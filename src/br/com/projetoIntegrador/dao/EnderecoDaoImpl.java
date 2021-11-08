/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.projetoIntegrador.entidade.Endereco;

/**
 *
 * @author luccas.espinola
 */
public class EnderecoDaoImpl {
    ParticipanteDaoImpl participanteDaoImpl = new ParticipanteDaoImpl();
    
    public void salvarParticipante(Endereco endereco, int id, Connection conexao) {
        String sql = "INSERT INTO endereco(logradouro, bairro, cidade, estado, cep, complemento, idParticipante) VALUES(?, ?, ?, ?, ?, ?, ?)";
        salvar(endereco, id, sql, conexao);

    }
    
    public void salvarCampeonato(Endereco endereco, int id, Connection conexao) {
        String sql = "INSERT INTO endereco(logradouro, bairro, cidade, estado, cep, complemento, idCampeonato) VALUES(?, ?, ?, ?, ?, ?, ?)";
        salvar(endereco, id, sql, conexao);

    }

    
    private void salvar(Endereco endereco, int id, String sql, Connection conexao) {
        PreparedStatement preparaInstrucao;
        try {
            preparaInstrucao = conexao.prepareStatement(sql);
            preparaInstrucao.setString(1, endereco.getLogradouro());
            preparaInstrucao.setString(2, endereco.getBairro());
            preparaInstrucao.setString(3, endereco.getCidade());
            preparaInstrucao.setString(4, endereco.getEstado());
            preparaInstrucao.setString(5, endereco.getCep());
            preparaInstrucao.setString(6, endereco.getComplemento());
            preparaInstrucao.setInt(7, id);
            preparaInstrucao.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar o endereço " + e.getMessage());
        }
    }

}
