/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.dao;

import br.com.projetoIntegrador.entidade.Campeonato;
import br.com.projetoIntegrador.entidade.Equipe;
import br.com.projetoIntegrador.util.GeradorUtil;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luccas.espinola
 */
public class EquipeDaoImplTest {

    private Equipe equipe;
    EquipeDaoImpl equipeDaoImpl = new EquipeDaoImpl();
    private Campeonato campeonato;

    public EquipeDaoImplTest() {
    }

    //@Test
    public void testSalvar() throws SQLException {
        System.out.println("salvar");
        equipe = new Equipe(
                GeradorUtil.gerarNome() + " Equipe"
        );
        equipeDaoImpl.salvar(equipe);
    }
    
    
    
    
    
}

    
    
    