package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Campeonato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CampeonatoDaoImpl {
    
    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;
    
    public void salvar(Campeonato campeonato)throws SQLException{
        String sql = "INSERT INTO campeonato(nome, data) VALUES(?, ?) ";
        
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, campeonato.getNomeCampeonato());
            preparaSql.setDate(2, new Date(campeonato.getDataCampeonato().getTime()));
            preparaSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar o campeonato " + e.getMessage());
        }finally {
            conexao.close();
            preparaSql.close();
        }
        
        
    }
    
    
    
}

