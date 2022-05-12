//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisCon extends javax.swing.JFrame {
    private BDCon videoGame = BDCon.getGerCon();
    Portatil mao;
    Mesa console;
    DadCon dad;
    private int inter, posFin;

    private static VisCon tabela;
    
    private VisCon() {
        initComponents();
        preencheTabela ();
    }
    
    public static VisCon getVisCon () {
        if (tabela == null)
            tabela = new VisCon ();
        return tabela;
    }

    public void preencheTabela () {
        DefaultTableModel tab = (DefaultTableModel) tblFab.getModel();
        
        int pos = 0;
        tab.setRowCount (pos);
        
        for (Mesa con : videoGame.getXbos()) {
            tab.insertRow(pos, new Object []{con.getDev().getFantasia(), con.getDev().getSede(), con.getDev().getAno(),con.getDev().getCnpj(), con.getDev().getArea(), con.getDev().getSituacao()});
            pos++;
        }
        inter = pos;
        for (Portatil swi : videoGame.getNin()) {
            tab.insertRow(pos, new Object[] {swi.getDev().getFantasia(), swi.getDev().getSede(), swi.getDev().getAno(),swi.getDev().getCnpj(), swi.getDev().getArea(), swi.getDev().getSituacao()});
            pos++; 
        }
        posFin = pos;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblFab = new javax.swing.JTable();
        btExcCon = new javax.swing.JButton();
        btAdCon = new javax.swing.JButton();
        btAltCon = new javax.swing.JButton();
        btConsCon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblFab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fabricante", "Sede", "Ano de Fundação", "Nº Identificação", "Área de Atuação", "Situação da Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFab);

        btExcCon.setText("Excluir Console");
        btExcCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcConActionPerformed(evt);
            }
        });

        btAdCon.setText("Adicionar Console");
        btAdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdConActionPerformed(evt);
            }
        });

        btAltCon.setText("Alterar Console");
        btAltCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltConActionPerformed(evt);
            }
        });

        btConsCon.setText("Consultar Console");
        btConsCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btConsCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAltCon)
                        .addGap(123, 123, 123)
                        .addComponent(btExcCon)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdCon)
                    .addComponent(btConsCon)
                    .addComponent(btAltCon)
                    .addComponent(btExcCon))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcConActionPerformed
        excluiConsole ();
    }//GEN-LAST:event_btExcConActionPerformed

    private void btAdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdConActionPerformed
        cadastraConsole ();
    }//GEN-LAST:event_btAdConActionPerformed

    private void btAltConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltConActionPerformed
        alteraConsole ();
    }//GEN-LAST:event_btAltConActionPerformed

    private void btConsConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsConActionPerformed
        consultaConsole ();
    }//GEN-LAST:event_btConsConActionPerformed

    
    public void cadastraConsole () {
        String dec = JOptionPane.showInputDialog (null, "Deseja Cadastrar console 'DE MESA' ou 'PORTÁTIL':", "Dados para Consulta", 1).toUpperCase();
    
        switch (dec) {
            case "DE MESA":
                console = new Mesa ();
                console = videoGame.buscaMesa(posFin + 1);
                if (console == null) {
                    videoGame.adicionaMesa(console);
                    tabela.preencheTabela();
                } else {
                    JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Exclusão", 1);
                }   break;
            case "PORTÁTIL":
            case "PORTATIL":
                mao = new Portatil ();
                mao = videoGame.buscaPortatil(posFin + 1);
                if (mao == null) {
                    videoGame.adicionaPortatil(mao);
                    tabela.preencheTabela();
                } else {
                    JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Exclusão", 1);
                }   break;
            default:
                JOptionPane.showMessageDialog (null, "Este tipo de console não existe!", "Erro de Cadastramento", 0);
                break; 
        }
    
    }
    
    public void consultaConsole () {
        int id = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite o Nº Identificação do Console:", "Dados para Consulta", 1));
        dad = new DadCon ();
        
        if (id <= inter) {
            console = new Mesa ();    
            console = videoGame.buscaMesa(id);
            if (console != null) {
                dad.setVisible(true);
                dad.getCxNomeCon().setText(console.getMarca());
                dad.getCxCpuCon().setText(console.getCpu());
                dad.getCxGpuCon().setText(console.getGpu());
                dad.getCxRamCon().setText(Integer.toString(console.getRam()));
                dad.getCxArmCon().setText(console.getArmazena());
                dad.getCxTeraCon().setText(Integer.toString(console.getTeraflops()));
                dad.getCxFormCon().setText(console.getFormato_SSD());
                dad.getCxTecAudCon().setText(console.getAudio());
                dad.getCxBluCon().setText(console.getBlu());
            } else {
                JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Consulta", 0);
            } 
        } else {
                mao = new Portatil ();
                mao = videoGame.buscaPortatil(id);
                if (mao != null) {
                    dad.setVisible(true);
                    dad.getCxNomeCon().setText(mao.getMarca());
                    dad.getCxCpuCon().setText(mao.getCpu());
                    dad.getCxGpuCon().setText(mao.getGpu());
                    dad.getCxRamCon().setText(Integer.toString(mao.getRam()));
                    dad.getCxArmCon().setText(mao.getArmazena());
                    dad.getCxTeraCon().setText(Integer.toString(mao.getTeraflops()));
                    dad.getCxPolTelCon().setText(Integer.toString(mao.getTela()));
                    dad.getCxCapBatCon().setText(Integer.toString(mao.getBateria()));
                    dad.getCxFalCon().setText(mao.getFalante());
                    dad.getCxCamCon().setText(mao.getCamera());
                } else {
                    JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Consulta", 0);
                } 
            }
    }
    
    public void excluiConsole () {
        int id = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite o Nº Identificação do Console:", "Dados para exclusão", 1));
        int esc;
        
        if (id <= inter) {
            console = new Mesa ();
            console = videoGame.buscaMesa(id);    
            if (console != null) {
                esc = JOptionPane.showConfirmDialog (null, "Deseja mesmo excluir o console:", "Confirmação de Exclusão", 1);
                if (esc == 0) {
                    videoGame.getXbos().remove(console);
                    videoGame.numeraMesa(1);
                    if (videoGame.getXbos().size() > 0) {
                        videoGame.getXbos().get(0).getDev().setCnpj(1);
                    }
                    videoGame.numeraPortatil(1);
                    tabela.preencheTabela();
                }
            } else {
                JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Exclusão", 0); 
            }
        } else {
            mao = new Portatil ();
            mao = videoGame.buscaPortatil(id);
            if (mao != null) {
                esc = JOptionPane.showConfirmDialog (null, "Deseja mesmo excluir o console:", "Confirmação de Exclusão", 1);
                if (esc == 0) {
                    videoGame.getNin().remove(mao);
                    if (mao.getDev().getCnpj() == inter + 1) {
                        videoGame.numeraPortatil(1);
                    }
                    tabela.preencheTabela();
                }
            } else {
                JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Exclusão", 0); 
            }
        }
    }
    
    public void alteraConsole () {
        int id = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite o Nº Identificação do Console:", "Dados para exclusão", 1));
        
        if (id <= inter) {
            console = new Mesa ();
            console = videoGame.buscaMesa(id);    
            if (console != null) {
                videoGame.atualizarMesa (console);
                tabela.preencheTabela();
            } else {
                JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Alteração", 0); 
            }
        } else {
            mao = new Portatil ();
            mao = videoGame.buscaPortatil(id);
            if (mao != null) {
                videoGame.atualizarPortatil(mao);
                tabela.preencheTabela();
            } else {
                JOptionPane.showMessageDialog (null, "Este console não existe!", "Erro de Exclusão", 0); 
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
            java.util.logging.Logger.getLogger(VisCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdCon;
    private javax.swing.JButton btAltCon;
    private javax.swing.JButton btConsCon;
    private javax.swing.JButton btExcCon;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFab;
    // End of variables declaration//GEN-END:variables

}
