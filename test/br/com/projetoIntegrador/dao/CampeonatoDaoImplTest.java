/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Campeonato;
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

    @Test
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        campeonato = new Campeonato(
                GeradorUtil.gerarNome(), new Date()
        );
        campeonatoDaoImpl.salvar(campeonato);
    }

}
