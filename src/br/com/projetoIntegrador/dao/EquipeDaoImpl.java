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
import java.sql.Statement;

/**
 *
 * @author maria
 */
public class EquipeDaoImpl {

    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;

    //salvando a equipe, associaçao um pra muitos, ao campeonato, pois o campeonato já foi salvo
    public void salvar(Equipe equipe) throws SQLException{
        String sql = "INSERT INTO equipe(nome, campeonato_id) VALUES(?, 1) ";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS  );
            
            preparaSql.setString(1, equipe.getNome());
            preparaSql.setInt(2, equipe.getCampeonato().getId());
            preparaSql.executeUpdate();
            
            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            equipe.setId(resultado.getInt(1));
            
            
            CampeonatoDaoImpl campeonatoDaoImpl = new CampeonatoDaoImpl();
            //campeonatoDaoImpl.salvar(equipe.getCampeonato().getId());
            
            
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar a equipe " + e.getMessage());
        }finally{
            conexao.close();
            preparaSql.close();
            resultado.close();
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
    
     public void excluir(int id) {
        String sql = "DELETE FROM equipe WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Erro ao excluir o equipe" + e.getMessage());
        }
    }
     
      public Equipe pesquisarPorId(int id) {
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
                
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por id do participante " + e.getMessage());
        }
        return equipe;
    }
     
    
}
