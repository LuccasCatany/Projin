/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.tela;

import br.com.projetoIntegrador.dao.CampeonatoDaoImpl;
import br.com.projetoIntegrador.dao.EquipeDaoImpl;
import br.com.projetoIntegrador.dao.ParticipanteDaoImpl;
import br.com.projetoIntegrador.entidade.Campeonato;
import br.com.projetoIntegrador.entidade.Equipe;
import br.com.projetoIntegrador.entidade.Participante;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class TelaPesquisa extends javax.swing.JFrame {

    private  List<Campeonato> campeonatos;
    /**
     * Creates new form TelaPesquisa
     */
    public TelaPesquisa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloPrincipal = new javax.swing.JLabel();
        lbPesquisa = new javax.swing.JLabel();
        varPesquisa = new javax.swing.JTextField();
        lbPesquisarEm = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTituloPrincipal.setFont(new java.awt.Font("Ink Free", 0, 50)); // NOI18N
        lbTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloPrincipal.setText("Pesquisa");

        lbPesquisa.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbPesquisa.setForeground(new java.awt.Color(102, 102, 102));
        lbPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPesquisa.setText("Pesquisa:");

        lbPesquisarEm.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbPesquisarEm.setForeground(new java.awt.Color(102, 102, 102));
        lbPesquisarEm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPesquisarEm.setText("Pesquisar em:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Campeonato", "Equipe", "Participante", " " }));

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lbPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbPesquisarEm)
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(lbTituloPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(btExcluir)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbTituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisa)
                    .addComponent(varPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPesquisarEm)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String nomePesquisado = varPesquisa.getText().trim();//não to usando por enquanto
        String grupoPesquisado = String.valueOf(jComboBox.getSelectedItem());
        if (grupoPesquisado.equals("Campeonato")) {
            try {
                leTabelaCampeonato(nomePesquisado);
            } catch (SQLException ex) {
                System.out.println("Erro ao preencher equipe " + ex.getMessage());
            }
        };
        if (grupoPesquisado.equals("Equipe")) {
            try {
                leTabelaEquipe(nomePesquisado);
            } catch (SQLException ex) {
                System.out.println("Erro ao preencher equipe " + ex.getMessage());
            }
        }
        if (grupoPesquisado.equals("Participante")) {
            try {
                leTabelaParticipante(nomePesquisado);
            } catch (SQLException ex) {
                System.out.println("Erro ao preencher participante " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String grupoPesquisado = String.valueOf(jComboBox.getSelectedItem());
        ModeloTabela modelo = new ModeloTabela();

        int linha = jTable1.getSelectedRow();
//        int indexLinha = jTable1.
        if (linha >= 0) {
           
            campeonatos.remove(linha);
            try {
                leTabelaEquipe("");
            } catch (SQLException ex) {
                Logger.getLogger(TelaPesquisa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Nenhuma linha selecionada.");
        }
        if (grupoPesquisado.equals("Campeonato")) {

            CampeonatoDaoImpl campeonatoDaoImpl = new CampeonatoDaoImpl();
            String nomeCampeonato = modelo.getValueAt(1, 1).toString();
            List<Campeonato> campeonatos;
            try {
                campeonatos = campeonatoDaoImpl.pesquisarCampeonatoPorNome(nomeCampeonato);
                for (Campeonato campeonato : campeonatos) {
                    campeonatoDaoImpl.excluir(campeonato.getId());
                }//Tomar cuidado pois aqui exclue todos os campeonatos com mesmo nome                       
            } catch (SQLException ex) {
                System.out.println("Erro ao excluir campeonato " + ex.getMessage());
            }            
            }
        
        
        if (grupoPesquisado.equals("Equipe")) {
            
            String nomeEquipe = modelo.getValueAt(linha, 1).toString();
            EquipeDaoImpl equipeDaoImpl = new EquipeDaoImpl();
            List<Equipe> equipes;
            try {
                equipes = equipeDaoImpl.pesquisarEquipePorNomeEquipe(nomeEquipe);
                for (Equipe equipe : equipes) {
                    equipeDaoImpl.excluir(equipe.getId());
                    
                }
                
            } catch (SQLException ex) {
                System.out.println("Erro ao excluir equipe " + ex.getMessage());
            }
        }
        
        if (grupoPesquisado.equals("Participante")) {

            String nomeParticipante = modelo.getValueAt(linha, 1).toString();
            ParticipanteDaoImpl participanteDaoImpl = new ParticipanteDaoImpl();
            List<Participante> participantes;
            
            try {
                participantes = participanteDaoImpl.pesquisarParticipantesPorNome(nomeParticipante);
                for (Participante participante : participantes) {
                    participanteDaoImpl.excluir(participante.getId());
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao excluir participante " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    public void leTabelaCampeonato(String nomePesquisado) throws SQLException {

        CampeonatoDaoImpl campeonatoDaoImpl = new CampeonatoDaoImpl();
        List<Campeonato> campeonatos = campeonatoDaoImpl.pesquisarCampeonatoPorNome(nomePesquisado);//retorna todos os campeonatos que tenho

        String[] coluna = new String[]{"Campeonato", "Data", "Logradouro", "Bairro", "Cidade", "Estado", "Cep", "Complemento"};
        ArrayList dados = new ArrayList();
        for (Campeonato campeonato : campeonatos) {

            dados.add(new Object[]{
                campeonato.getNomeCampeonato(),
                campeonato.getDataCampeonato(),
                campeonato.getEndereco().getLogradouro(),
                campeonato.getEndereco().getBairro(),
                campeonato.getEndereco().getCidade(),
                campeonato.getEndereco().getEstado(),
                campeonato.getEndereco().getCep(),
                campeonato.getEndereco().getComplemento()
            });

        }
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        jTable1.setModel(modelo);

    }

    public void leTabelaEquipe(String nomePesquisado) throws SQLException {
        EquipeDaoImpl equipeDaoImpl = new EquipeDaoImpl();
        List<Equipe> equipes = equipeDaoImpl.pesquisarEquipePorNomeEquipe(nomePesquisado);

        String[] coluna = new String[]{"Equipe", "Campeonato", "Data"};
        ArrayList dados = new ArrayList();

        for (Equipe equipe : equipes) {

            dados.add(new Object[]{
                equipe.getNome(),
                equipe.getCampeonato().getNomeCampeonato(),
                equipe.getCampeonato().getDataCampeonato()
            });
        }
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        jTable1.setModel(modelo);
    }

    public void leTabelaParticipante(String nomePesquisado) throws SQLException {
        ParticipanteDaoImpl participanteDaoImpl = new ParticipanteDaoImpl();
        List<Participante> participantes = participanteDaoImpl.pesquisarParticipantesPorNome(nomePesquisado);

        String[] coluna = new String[]{"Nome", "CPF", "Telefone", "Equipe", "Logradouro", "Bairro", "Cidade", "Estado", "Cep", "Complemento"};
        ArrayList dados = new ArrayList();

        for (Participante participante : participantes) {
            dados.add(new Object[]{
                participante.getNome(),
                participante.getCpf(),
                participante.getTelefone(),
                participante.getEquipe().getNome(),
                participante.getEndereco().getLogradouro(),
                participante.getEndereco().getBairro(),
                participante.getEndereco().getCidade(),
                participante.getEndereco().getEstado(),
                participante.getEndereco().getCep(),
                participante.getEndereco().getComplemento()
            }
            );
        }
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        jTable1.setModel(modelo);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbPesquisarEm;
    private javax.swing.JLabel lbTituloPrincipal;
    private javax.swing.JTextField varPesquisa;
    // End of variables declaration//GEN-END:variables
}
