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

    public void salvar(Campeonato campeonato) throws SQLException {
        String sql = "INSERT INTO campeonato(nome, data) VALUES(?, ?) ";

        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparaSql.setString(1, campeonato.getNomeCampeonato());
            preparaSql.setDate(2, new Date(campeonato.getDataCampeonato().getTime()));
            preparaSql.executeUpdate();
            resultado = preparaSql.getGeneratedKeys();//essa parte e o return keys é pra quando for salvar ao mesmo tempo ≧◠‿●‿◠≦
            resultado.next();
            campeonato.setId(resultado.getInt(1));

            EnderecoDaoImpl enderecoDaoImpl = new EnderecoDaoImpl();
            enderecoDaoImpl.salvarCampeonato(campeonato.getEndereco(), campeonato.getId(), conexao);

        } catch (Exception e) {
            System.out.println("Erro ao salvar o campeonato " + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
        }
    }

    public void alterar(Campeonato campeonato) throws SQLException {
        String sql = "UPDATE campeonato SET nome = ?, data = ? WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparaSql.setString(1, campeonato.getNomeCampeonato());
            preparaSql.setDate(2, new Date(campeonato.getDataCampeonato().getTime()));
            preparaSql.setInt(3, campeonato.getId());
            preparaSql.executeUpdate();
            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            campeonato.setId(resultado.getInt(1));

            EnderecoDaoImpl enderecoDaoImpl = new EnderecoDaoImpl();
            enderecoDaoImpl.alterarEnderecoCampeonato(campeonato.getEndereco(), campeonato.getId(), conexao);

        } catch (Exception e) {
            System.out.println("Erro ao alterar o campeonato" + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM campeonato WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();

            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            id = resultado.getInt(1);//tenho serias duvidas se isso ta certo

            EnderecoDaoImpl enderecoDaoImpl = new EnderecoDaoImpl();
            enderecoDaoImpl.excluirEnderecoCampeonato(id, conexao);

        } catch (Exception e) {
            System.out.println("Erro ao excluir o campeonato" + e.getMessage());
        }
    }

    //Falta arrumar os pesquisar
    public Campeonato pesquisarPorNome(String Nome) throws SQLException {
        String sql = "SELECT * FROM campeonato WHERE nome LIKE ?";
        Campeonato campeonato = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparaSql.setString(1, Nome);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
                campeonato = new Campeonato();
                campeonato.setId(resultado.getInt("id"));
                campeonato.setNomeCampeonato(resultado.getString("nome"));
                campeonato.setDataCampeonato(resultado.getDate("data"));
                resultado = preparaSql.getGeneratedKeys();
//                campeonato.setId(resultado.getInt(1));

                EnderecoDaoImpl enderecoDaoImpl = new EnderecoDaoImpl();
                enderecoDaoImpl.pesquisarPorCampeonato(campeonato.getEndereco(), campeonato.getId(), conexao, resultado);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar produto por nome " + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
        }

        return campeonato;
    }

//     public Campeonato pesquisarPorId(int id) {
//        String sql = "SELECT * FROM campeonato WHERE id = ?";
//        Campeonato campeonato = null;
//        try {
//            conexao = FabricaConexao.abrirConexao();
//            preparaSql = conexao.prepareStatement(sql);
//            preparaSql.setInt(1, id);
//            resultado = preparaSql.executeQuery();
//            if (resultado.next()) {
//                campeonato = new Campeonato();
//                campeonato.setId(id);
//                campeonato.setNomeCampeonato(resultado.getString("nome"));
//                campeonato.setDataCampeonato(resultado.getDate("dataCampeonato"));
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro ao pesquisar por id do campeonato " + e.getMessage());
//        }
//        return campeonato;
//    }
}
