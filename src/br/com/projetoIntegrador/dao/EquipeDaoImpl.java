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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class EquipeDaoImpl {

    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;

    public void salvar(Equipe equipe) throws SQLException{
        String sql = "INSERT INTO equipe(nome, campeonato_id) VALUES(?, ?) ";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, equipe.getNome());
            preparaSql.setInt(2, equipe.getCampeonato().getId());
            preparaSql.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar a equipe " + e.getMessage());
        }finally{
            conexao.close();
            preparaSql.close();
        }
    }

    
    public void alterar(Equipe equipe, int oqueAlterar) throws SQLException{
            String sql = "UPDATE equipe SET nome = ? WHERE id = ?";
            try {
                conexao = FabricaConexao.abrirConexao();
                preparaSql = conexao.prepareStatement(sql);
                preparaSql.setString(1, equipe.getNome());
                preparaSql.setInt(2, equipe.getCampeonato().getId());
                preparaSql.setInt(3, oqueAlterar);
                preparaSql.executeUpdate();
                
            } catch (Exception e) {
                 System.out.println("Erro ao alterar equipe " + e.getMessage());
            }finally{
                conexao.close();
                preparaSql.close();
                resultado.close();
            }
        }
    
     public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM equipe WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Erro ao excluir o equipe" + e.getMessage());
        }finally{
            conexao.close();
            preparaSql.close();
        }
    }
     
      public Equipe pesquisarEquipePorId(int id) throws SQLException {
        String sql = "SELECT * FROM equipe WHERE id = ?";
        Equipe equipe = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setInt(1, id);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
                equipe = new Equipe();
                equipe.setId(id);
                equipe.setNome(resultado.getString("nome"));
                equipe.getCampeonato().setId(resultado.getInt("campeonato_id"));
                
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por id do participante " + e.getMessage());
        }finally{
            conexao.close();
            preparaSql.close();
            resultado.close();
        }
        
        return equipe;
    }
     
    public List<Equipe> pesquisarEquipePorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM equipe WHERE nome LIKE ?";
        Equipe equipe;
        List<Equipe> equipes = new ArrayList<>();
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, "%" + nome + "%");
            resultado = preparaSql.executeQuery();
            while(resultado.next()){
                equipe = new Equipe();
                equipe.setId(resultado.getInt("id"));
                equipe.setNome(resultado.getString("nome"));
                equipe.getCampeonato().setId(resultado.getInt("campeonato_id"));
                equipes.add(equipe);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por nome de equipe " + e.getMessage());
        }
        return equipes;
    }
}
