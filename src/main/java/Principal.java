//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Jogador escolhido;
    BDJog jogador;
    BDCon consoles;
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgIni = new javax.swing.JLabel();
        bjCadJog = new javax.swing.JButton();
        jVisCon = new javax.swing.JButton();
        btRes = new javax.swing.JButton();
        msgRes = new javax.swing.JLabel();
        msgCons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msgIni.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        msgIni.setText("QUAL CONSOLE DEU MATCH COM VOCÊ?");

        bjCadJog.setText("Cadastrar Jogador");
        bjCadJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjCadJogActionPerformed(evt);
            }
        });

        jVisCon.setText("Visualizar Consoles");
        jVisCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisConActionPerformed(evt);
            }
        });

        btRes.setText("Ver o seu Resultado");
        btRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResActionPerformed(evt);
            }
        });

        msgRes.setFont(new java.awt.Font("Gadugi", 1, 10)); // NOI18N
        msgRes.setText("*Cadastra ao menos 1 jogador antes de ver o seu resultado.");

        msgCons.setFont(new java.awt.Font("Gadugi", 1, 10)); // NOI18N
        msgCons.setText("*Há 3 consoles já cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bjCadJog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jVisCon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(btRes))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(msgIni)))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msgRes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(msgCons)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgIni)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bjCadJog)
                    .addComponent(jVisCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgRes)
                    .addComponent(msgCons))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bjCadJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjCadJogActionPerformed
        CadJog.getCadJog().setVisible(true);
    }//GEN-LAST:event_bjCadJogActionPerformed

    private void jVisConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisConActionPerformed
        VisCon.getVisCon().setVisible(true);
    }//GEN-LAST:event_jVisConActionPerformed

    private void btResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResActionPerformed
        mostraResultado ();
    }//GEN-LAST:event_btResActionPerformed

    public void mostraResultado ()  {
        if (BDJog.getGerJog().getGerencia().size() == 0) {
            JOptionPane.showMessageDialog(null, "Não há jogadores Cadastrados!!!", "Erro no Resultado", 0);
        } else {
            try {
                escolhido = new Jogador ();
                consoles = BDCon.getGerCon();
                escolhido.setNome(JOptionPane.showInputDialog(null, "Digite o nome do jogador a ter o seu resultado revelado:", "Nome do Jogador", 1).toUpperCase());
                escolhido.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite idade do jogador a ter o seu resultado revelado:", "Idade do Jogador", 1)));
                jogador = BDJog.getGerJog();
                
                escolhido = jogador.buscaJogador(escolhido);
                
                if (escolhido != null) {
                    if (escolhido.getEstilo().equals("CASUAL")) {
                        if (escolhido.getGosto().equals("SINGLEPLAYER")) {
                            if (escolhido.getQualidade().equals("FPS")) {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaPortatil(3).getMarca(), "Decisão Final", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaMesa(1).getMarca(), "Decisão Final", 1);
                            }
                        } else {
                            if (escolhido.getQualidade().equals("FPS")) {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaPortatil(3).getMarca(), "Decisão Final", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaMesa(2).getMarca(), "Decisão Final", 1);
                            }
                        }
                    } else {
                        if (escolhido.getGosto().equals("SINGLEPLAYER")) {
                            if (escolhido.getQualidade().equals("FPS")) {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaPortatil(3).getMarca(), "Decisão Final", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaMesa(1).getMarca(), "Decisão Final", 1);
                            }
                        } else {
                            if (escolhido.getQualidade().equals("FPS")) {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaPortatil(3).getMarca(), "Decisão Final", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "O CONSOLE PARA VOCÊ É:\n"+consoles.buscaMesa(2).getMarca(), "Decisão Final", 1);
                            }
                        }   
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este jogador não esta cadastrado!", "Erro na Busca pelo Jogador", 0);
                }
                
            } catch (erroIdadeException e) {
                erroIdadeException.idadeCerta(0);
            } catch (NumberFormatException e) {
                erroIdadeException.idadeCerta(1);
            }   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bjCadJog;
    private javax.swing.JButton btRes;
    private javax.swing.JButton jVisCon;
    private javax.swing.JLabel msgCons;
    private javax.swing.JLabel msgIni;
    private javax.swing.JLabel msgRes;
    // End of variables declaration//GEN-END:variables
}
