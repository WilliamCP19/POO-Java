//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JogCad extends javax.swing.JFrame {
    
    private Jogador pesquisador;
    private BDJog bdJ = BDJog.getGerJog();
    private static JogCad gamer;
    
    private JogCad() {
        initComponents();
    }

    public void cadTab () {
        DefaultTableModel model = (DefaultTableModel) tblJogCad.getModel();
        
        int posLin = 0;
        model.setRowCount (posLin);
        
        for (Jogador pes : bdJ.getGerencia()) {
            model.insertRow(posLin, new Object[] {pes.getNome(), pes.getIdade(), pes.getEstilo(), pes.getGosto(), pes.getQualidade()}); posLin++;
        }
    }
    
    public static JogCad getJogCad (){
        if (gamer == null)
            gamer = new JogCad ();
        gamer.cadTab();
        return gamer;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJogCad = new javax.swing.JTable();
        msgInfo = new javax.swing.JLabel();
        rtNomeJog = new javax.swing.JLabel();
        rtIdadeJog = new javax.swing.JLabel();
        cxNomeJog = new javax.swing.JTextField();
        cxIdadeJog = new javax.swing.JTextField();
        btAltJog = new javax.swing.JButton();
        btExcJog = new javax.swing.JButton();
        btConJog = new javax.swing.JButton();
        btNovoJog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblJogCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOME", "IDADE", "ESTILO DE JOGO", "TIPO DE JOGO", "PREFERÊNCIA EM JOGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJogCad);

        msgInfo.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        msgInfo.setText("* A busca é feita através do nome e  idade");

        rtNomeJog.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        rtNomeJog.setText("NOME:");

        rtIdadeJog.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        rtIdadeJog.setText("IDADE:");

        cxNomeJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeJogActionPerformed(evt);
            }
        });

        btAltJog.setText("Alterar Jogador");
        btAltJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltJogActionPerformed(evt);
            }
        });

        btExcJog.setText("Excluir Jogador");
        btExcJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcJogActionPerformed(evt);
            }
        });

        btConJog.setText("Consultar Jogador");
        btConJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConJogActionPerformed(evt);
            }
        });

        btNovoJog.setText("Cadastrar Novo Jogador");
        btNovoJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoJogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAltJog, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(btConJog)
                                .addGap(84, 84, 84)
                                .addComponent(btNovoJog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcJog, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rtIdadeJog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxIdadeJog, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtNomeJog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxNomeJog, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(msgInfo)
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcJog)
                    .addComponent(btAltJog)
                    .addComponent(btConJog)
                    .addComponent(btNovoJog))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtNomeJog)
                            .addComponent(cxNomeJog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtIdadeJog)
                            .addComponent(cxIdadeJog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(msgInfo)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAltJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltJogActionPerformed
        alterarJogador ();
    }//GEN-LAST:event_btAltJogActionPerformed

    private void btExcJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcJogActionPerformed
        excluirJogador();
    }//GEN-LAST:event_btExcJogActionPerformed

    private void btConJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConJogActionPerformed
        consultarJogador ();
    }//GEN-LAST:event_btConJogActionPerformed

    private void cxNomeJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeJogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeJogActionPerformed

    private void btNovoJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoJogActionPerformed
        this.dispose();
    }//GEN-LAST:event_btNovoJogActionPerformed

    public void consultarJogador () {
        pesquisador = new Jogador ();
        
        try {
            pesquisador.setNome(cxNomeJog.getText().toUpperCase());
            pesquisador.setIdade(Integer.parseInt(cxIdadeJog.getText()));
           
            pesquisador =  bdJ.buscaJogador(pesquisador);
            int esc;
             if (pesquisador != null) {
                 CadJog.getCadJog().setVisible(true);
                 CadJog.getCxNomeJog().setText(pesquisador.getNome().toUpperCase());
                 CadJog.getCxIdadeJog().setText(Integer.toString(pesquisador.getIdade()));
                 CadJog.getCxGostoJog().setText(pesquisador.getGosto().toUpperCase());
                 CadJog.getCxEstiloJog().setText(pesquisador.getEstilo().toUpperCase());
                 CadJog.getCxQualidadeJog().setText(pesquisador.getQualidade().toUpperCase());
                 CadJog.getCxNomeJog().requestFocus();
             } else {
                     JOptionPane.showMessageDialog (null, "Não existe jogador com esses dados!", "Erro de Exclusão", 1);
                     esc = JOptionPane.showConfirmDialog(null, "Deseja cadastrar este jogador?", "Cadastramento", 1);
                     if (esc == 0) {
                         CadJog.getCadJog().setVisible(true);
                         CadJog.getCxNomeJog().setText(this.cxNomeJog.getText().toUpperCase());
                         CadJog.getCxIdadeJog().setText(this.cxIdadeJog.getText());
                         CadJog.getCxEstiloJog().requestFocus();
                     }
                 }
    } catch (erroIdadeException t) {
            erroIdadeException.idadeCerta(0);
        } catch (NumberFormatException e) {
            erroIdadeException.idadeCerta(1);
        }
}
    
    public void excluirJogador () {
        pesquisador = new Jogador ();
        try{
            pesquisador.setNome(cxNomeJog.getText().toUpperCase());
            pesquisador.setIdade(Integer.parseInt(cxIdadeJog.getText()));
           
            pesquisador =  bdJ.buscaJogador(pesquisador);
            int esc;
             if (pesquisador != null) {
                 esc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a Pessoa!", "Exclusão de Pessoa", JOptionPane.YES_NO_CANCEL_OPTION);
                 if (esc == 0) {
                     gamer.bdJ.getGerencia().remove(pesquisador);
                     gamer.cadTab();
                 }
             } else {
                     JOptionPane.showMessageDialog (null, "Não existe jogador com esses dados!", "Erro de Exclusão", 1);
                     esc = JOptionPane.showConfirmDialog(null, "Deseja cadastrar este jogador?", "Cadastramento", 1);
                     if (esc == 0) {
                         CadJog.getCadJog().setVisible(true);
                         CadJog.getCxNomeJog().setText(this.cxNomeJog.getText().toUpperCase());
                         CadJog.getCxIdadeJog().setText(this.cxIdadeJog.getText());
                         CadJog.getCxEstiloJog().requestFocus();
                     }
                 }
        } catch (erroIdadeException id) {
            erroIdadeException.idadeCerta(0);
        } catch (NumberFormatException e) {
            erroIdadeException.idadeCerta(1);
        }
    }
    public void alterarJogador () {
        pesquisador = new Jogador ();
        try{
            pesquisador.setNome(cxNomeJog.getText().toUpperCase());
            pesquisador.setIdade(Integer.parseInt(cxIdadeJog.getText()));
           
            pesquisador =  bdJ.buscaJogador(pesquisador);

            if (pesquisador != null) {
                 CadJog.getCadJog().setVisible(true);
                 CadJog.getCxNomeJog().setText(pesquisador.getNome());
                 CadJog.getCxIdadeJog().setText(Integer.toString(pesquisador.getIdade()));
                 CadJog.getCxEstiloJog().setText(pesquisador.getEstilo());
                 CadJog.getCxGostoJog().setText(pesquisador.getGosto());
                 CadJog.getCxQualidadeJog().setText(pesquisador.getQualidade());
                 bdJ.atualizar(pesquisador);
                 gamer.cadTab();
            } else {
                     JOptionPane.showMessageDialog (null, "Não existe jogador com esses dados!", "Erro de Exclusão", 1);
                     int esc = JOptionPane.showConfirmDialog(null, "Deseja cadastrar este jogador?", "Cadastramento", 1);
                     if (esc == 0) {
                         CadJog.getCadJog().setVisible(true);
                         CadJog.getCxNomeJog().setText(this.cxNomeJog.getText().toUpperCase());
                         CadJog.getCxIdadeJog().setText(this.cxIdadeJog.getText());
                         CadJog.getCxEstiloJog().requestFocus();
                     }
                 }
        } catch (erroIdadeException id) {
            erroIdadeException.idadeCerta(0);
        } catch (NumberFormatException e) {
            erroIdadeException.idadeCerta(1);
        }
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
            java.util.logging.Logger.getLogger(JogCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltJog;
    private javax.swing.JButton btConJog;
    private javax.swing.JButton btExcJog;
    private javax.swing.JButton btNovoJog;
    private javax.swing.JTextField cxIdadeJog;
    private javax.swing.JTextField cxNomeJog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgInfo;
    private javax.swing.JLabel rtIdadeJog;
    private javax.swing.JLabel rtNomeJog;
    private javax.swing.JTable tblJogCad;
    // End of variables declaration//GEN-END:variables
}
