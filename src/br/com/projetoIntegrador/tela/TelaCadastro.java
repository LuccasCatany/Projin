/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.tela;

import br.com.projetoIntegrador.dao.CampeonatoDaoImpl;
import br.com.projetoIntegrador.entidade.Campeonato;
import br.com.projetoIntegrador.entidade.Endereco;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author harisson.castro
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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

        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbTituloPrincipal = new javax.swing.JLabel();
        lbNomeCamp = new javax.swing.JLabel();
        varNomeCamp = new javax.swing.JTextField();
        lbDataCamp = new javax.swing.JLabel();
        varSalvarCamp = new javax.swing.JButton();
        varPesquisarCamp = new javax.swing.JButton();
        lbLogradouroCamp = new javax.swing.JLabel();
        varLogradouroCamp = new javax.swing.JTextField();
        lbCidadeCamp = new javax.swing.JLabel();
        varCidadeCamp = new javax.swing.JTextField();
        lbBairroCamp = new javax.swing.JLabel();
        varBairroCamp = new javax.swing.JTextField();
        lbCepCamp = new javax.swing.JLabel();
        lbEstadoCamp = new javax.swing.JLabel();
        varEstadoCamp = new javax.swing.JTextField();
        lbComplementoCamp = new javax.swing.JLabel();
        varComplementoCamp = new javax.swing.JTextField();
        varCepCamp = new javax.swing.JFormattedTextField();
        varDataCamp = new javax.swing.JFormattedTextField();
        btLimpar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 400));

        lbTituloPrincipal.setFont(new java.awt.Font("Ink Free", 0, 50)); // NOI18N
        lbTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloPrincipal.setText("Cadastro Campeonato");

        lbNomeCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbNomeCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNomeCamp.setText("Nome Do Campeonato:");

        lbDataCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbDataCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbDataCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDataCamp.setText("Data Do Campeonato:");

        varSalvarCamp.setText("Salvar");
        varSalvarCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSalvarCampActionPerformed(evt);
            }
        });

        varPesquisarCamp.setText("Pesquisar");

        lbLogradouroCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbLogradouroCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbLogradouroCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLogradouroCamp.setText("Logradouro:");

        lbCidadeCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbCidadeCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbCidadeCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCidadeCamp.setText("Cidade:");

        lbBairroCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbBairroCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbBairroCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBairroCamp.setText("Bairro:");

        lbCepCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbCepCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbCepCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCepCamp.setText("Cep:");

        lbEstadoCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbEstadoCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbEstadoCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEstadoCamp.setText("Estado:");

        lbComplementoCamp.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        lbComplementoCamp.setForeground(new java.awt.Color(102, 102, 102));
        lbComplementoCamp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbComplementoCamp.setText("Complemento:");

        try {
            varCepCamp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            varDataCamp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(varSalvarCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(varPesquisarCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCidadeCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varCidadeCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbComplementoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varComplementoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varNomeCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEstadoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varEstadoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDataCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varDataCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbBairroCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbLogradouroCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varLogradouroCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCepCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varCepCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varBairroCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloPrincipal)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCamp)
                    .addComponent(varNomeCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstadoCamp)
                    .addComponent(varEstadoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataCamp)
                    .addComponent(varDataCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBairroCamp)
                    .addComponent(varBairroCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varCepCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCepCamp)
                    .addComponent(varLogradouroCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogradouroCamp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varComplementoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbComplementoCamp)
                    .addComponent(varCidadeCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCidadeCamp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varSalvarCamp)
                    .addComponent(varPesquisarCamp)
                    .addComponent(btLimpar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varSalvarCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSalvarCampActionPerformed

        if (!validarFormulario()) {
            CampeonatoDaoImpl campeonatoDaoImpl = new CampeonatoDaoImpl();
            Campeonato campeonato = new Campeonato();

            campeonato.setNomeCampeonato(varNomeCamp.getText().trim());
            campeonato.setDataCampeonato(converterDateCampeonato(varDataCamp.getText()));
            
            Endereco endereco = new Endereco();
            endereco.setLogradouro(varLogradouroCamp.getText().trim());
            endereco.setBairro(varBairroCamp.getText().trim());
            endereco.setCidade(varCidadeCamp.getText().trim());
            endereco.setEstado(varEstadoCamp.getText().trim());
            endereco.setCep(varCepCamp.getText().trim());
            endereco.setComplemento(varComplementoCamp.getText().trim());
            
            campeonato.setEndereco(endereco);
            
            try {
                campeonatoDaoImpl.salvar(campeonato);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
                limpar();
            } catch (SQLException ex) {
                System.out.println("Erro ao salvar campeonato: " + ex);
            }
            
        }

    }//GEN-LAST:event_varSalvarCampActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void limpar() {
        varNomeCamp.setText("");
        varDataCamp.setText("");
        varBairroCamp.setText("");
        varLogradouroCamp.setText("");
        varEstadoCamp.setText("");
        varCidadeCamp.setText("");
        varCepCamp.setText("");
        varComplementoCamp.setText("");

    }

    private boolean validarFormulario() {

        if (validandoQuaseTodosCamposVazios()) {
            return true;
        }

        if (validarCepVazio()) {
            JOptionPane.showMessageDialog(null, "Cep inválido!!");
            return true;
        }
        if (validarData()) {
            JOptionPane.showMessageDialog(null, "Data invalida, informe outra!!");
            return true;
        }

        return false;
    }

    private boolean validandoQuaseTodosCamposVazios() {

        String nome = varNomeCamp.getText().trim();
        String logradouro = varLogradouroCamp.getText().trim();
        String estado = varEstadoCamp.getText().trim();
        String cidade = varCidadeCamp.getText().trim();
        String bairro = varBairroCamp.getText().trim();
        String cep = varCepCamp.getText().trim();
        String complemento = varComplementoCamp.getText().trim();

        if (validarCampoVazio(nome)) {
            System.out.println("O campo Nome está vazio ou tem componentes faltando");
            return true;
        }
        if (validarCampoVazio(logradouro)) {
            System.out.println("O campo Logradouro está vazio ou tem componentes faltando");
            return true;
        }
        if (validarCampoVazio(estado)) {
            System.out.println("O campo Estado está vazio ou tem componentes faltando");
            return true;
        }
        if (validarCampoVazio(cidade)) {
            System.out.println("O campo Cidade está vazio ou tem componentes faltando");
            return true;
        }
        if (validarCampoVazio(bairro)) {
            System.out.println("O campo Bairro está vazio ou tem componentes faltando");
            return true;
        }
        if (validarCampoVazio(cep)) {
            System.out.println("O campo CEP está vazio ou tem componentes faltando");
            return true;
        }
        if (validarCampoVazio(complemento)) {
            System.out.println("O campo Complemento está vazio ou tem componentes faltando");
            return true;
        }

        return false;
    }

    private boolean validarCampoVazio(String valorCampo) {
        return valorCampo.equals("");
    }

    private boolean validarCepVazio() {
        String valorCampo = varCepCamp.getText().trim();
        return valorCampo.trim().equals("-");
    }

    private boolean validarData() {
        String data = varDataCamp.getText().trim();
        return data.equals("/  /");

    }

    private Date converterDateCampeonato(String dateParaConverter) {
        String[] dateSeparado = dateParaConverter.split("/");
        LocalDate stringConvertidoParaLocalDate = LocalDate.of(
                Integer.parseInt(dateSeparado[2]),
                Integer.parseInt(dateSeparado[1]),
                Integer.parseInt(dateSeparado[0]));
        
        ZonedDateTime localConvertidoParaZoned = stringConvertidoParaLocalDate.atStartOfDay(ZoneId.systemDefault());
        
        Date zonedConvertidoParaDate = Date.from(localConvertidoParaZoned.toInstant());
                
        return zonedConvertidoParaDate;

    }

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBairroCamp;
    private javax.swing.JLabel lbCepCamp;
    private javax.swing.JLabel lbCidadeCamp;
    private javax.swing.JLabel lbComplementoCamp;
    private javax.swing.JLabel lbDataCamp;
    private javax.swing.JLabel lbEstadoCamp;
    private javax.swing.JLabel lbLogradouroCamp;
    private javax.swing.JLabel lbNomeCamp;
    private javax.swing.JLabel lbTituloPrincipal;
    private javax.swing.JTextField varBairroCamp;
    private javax.swing.JFormattedTextField varCepCamp;
    private javax.swing.JTextField varCidadeCamp;
    private javax.swing.JTextField varComplementoCamp;
    private javax.swing.JFormattedTextField varDataCamp;
    private javax.swing.JTextField varEstadoCamp;
    private javax.swing.JTextField varLogradouroCamp;
    private javax.swing.JTextField varNomeCamp;
    private javax.swing.JButton varPesquisarCamp;
    private javax.swing.JButton varSalvarCamp;
    // End of variables declaration//GEN-END:variables
}
