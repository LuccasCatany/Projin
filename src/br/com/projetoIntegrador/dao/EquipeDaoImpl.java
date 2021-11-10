/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Equipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author maria
 */
public class EquipeDaoImpl {

    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;

    public void salvar(Equipe equipe) throws SQLException{
        String sql = "INSERT INTO equipe(nome, campeonato_id) VALUES(?, 1) ";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            
            preparaSql.setString(1, equipe.getNome());
            preparaSql.setInt(2, equipe.getCampeonato().getId());
            preparaSql.executeUpdate();
            
            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            equipe.setId(resultado.getInt(1));
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar a equipe " + e.getMessage());
        }finally{
            conexao.close();
            preparaSql.close();
        }
    }

    
    public void alterar(Equipe equipe) throws SQLException{
            String sql = "UPDATE equipe SET nome = ? WHERE id = ?";
            try {
                conexao = FabricaConexao.abrirConexao();
                preparaSql = conexao.prepareStatement(sql);
                
            } catch (Exception e) {
                 System.out.println("Erro ao alterar produto " + e.getMessage());
            }finally{
                conexao.close();
                preparaSql.close();
                resultado.close();
            }
        }
}
