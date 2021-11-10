package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Participante;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ParticipanteDaoImpl {

    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;

    //TODO CRUD ( Salvar, Pesquisar por id/nome , Alterar, Excluir)
    public void salvar(Participante participante) throws SQLException {
        String sql = "INSERT INTO participante(nome, cpf, telefone, dataNascimnto, Equipe_id) VALUES(?, ?, ?, ?, ?) ";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparaSql.setString(1, participante.getNome());
            preparaSql.setString(2, participante.getCpf());
            preparaSql.setString(3, participante.getTelefone());
            preparaSql.setDate(4, new Date(participante.getNascimento().getTime()));
            preparaSql.setInt(5, 1);
            preparaSql.executeUpdate();
            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            participante.setId(resultado.getInt(1));

            EnderecoDaoImpl enderecoDaoImpl = new EnderecoDaoImpl();
            enderecoDaoImpl.salvarParticipante(participante.getEndereco(), participante.getId(), conexao);
        } catch (Exception e) {
            System.out.println("Erro ao salvar o participante " + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
            resultado.close();
        }

    }

    public void excluir(int id) {
        String sql = "DELETE FROM participante WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao excluir o participante" + e.getMessage());
        }
    }

//        public Participante pesquisarPorId(int id) {
//        String sql = "SELECT * FROM participante WHERE id = ?";
//        Participante participante = null;
//        try {
//            conexao = FabricaConexao.abrirConexao();
//            preparaSql = conexao.prepareStatement(sql);
//            preparaSql.setInt(1, id);
//            resultado = preparaSql.executeQuery();
//            if (resultado.next()) {
//                participante = new Participante();
//                participante.setId(id);
//                participante.setNome(resultado.getString("nome"));
//                participante.setCpf(resultado.getString("cpf"));
//                participante.setTelefone(resultado.getString("telefone"));
//                participante.setNascimento(resultado.getDate("nascimento"));
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro ao pesquisar por id do participante " + e.getMessage());
//        }
//        return participante;
//    }
}
