//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JTextField;


public class DadCon extends javax.swing.JFrame {

    BDCon vet = BDCon.getGerCon();
    
    public DadCon() {
        initComponents();
    }

    public JTextField getCxArmCon() {
        return cxArmCon;
    }

    public JTextField getCxBluCon() {
        return cxBluCon;
    }

    public JTextField getCxCamCon() {
        return cxCamCon;
    }

    public JTextField getCxCapBatCon() {
        return cxCapBatCon;
    }

    public JTextField getCxCpuCon() {
        return cxCpuCon;
    }

    public JTextField getCxFalCon() {
        return cxFalCon;
    }

    public JTextField getCxFormCon() {
        return cxFormCon;
    }

    public JTextField getCxGpuCon() {
        return cxGpuCon;
    }

    public JTextField getCxNomeCon() {
        return cxNomeCon;
    }

    public JTextField getCxPolTelCon() {
        return cxPolTelCon;
    }

    public JTextField getCxRamCon() {
        return cxRamCon;
    }

    public JTextField getCxTecAudCon() {
        return cxTecAudCon;
    }

    public JTextField getCxTeraCon() {
        return cxTeraCon;
    }
    
    
    
    /*public void cadastraDados (int cnpj) {
        int i = 2;
        if (cnpj == 1 || cnpj == 3) {
            i = 0;
        } else if (cnpj == 2) {
            i = 1;
        }
        
        if (cnpj == 1 || cnpj == 2) {
            cxNomeCon.setText (vet.getXbos().get(i).getMarca());
            cxCpuCon.setText(vet.getXbos().get(i).getCpu());
            cxGpuCon.setText(vet.getXbos().get(i).getGpu());
            cxRamCon.setText(Integer.toHexString(vet.getXbos().get(i).getRam()));
            cxArmCon.setText(vet.getXbos().get(i).getArmazena());
            cxTeraCon.setText(Integer.toString(vet.getXbos().get(i).getTeraflops()));
        
            cxFormCon.setText(vet.getXbos().get(i).getFormato_SSD());
            cxTecAudCon.setText(vet.getXbos().get(i).getAudio());
            cxBluCon.setText(vet.getXbos().get(i).getBlu());
        } else if (cnpj == 3) {
            cxNomeCon.setText (vet.getNin().get(i).getMarca());
            cxCpuCon.setText(vet.getNin().get(i).getCpu());
            cxGpuCon.setText(vet.getNin().get(i).getGpu());
            cxRamCon.setText(Integer.toHexString(vet.getNin().get(i).getRam()));
            cxArmCon.setText(vet.getNin().get(i).getArmazena());
            cxTeraCon.setText(Integer.toString(vet.getNin().get(i).getTeraflops()));

            cxPolTelCon.setText(Integer.toString(vet.getNin().get(i).getTela()));
            cxCapBatCon.setText(Integer.toString(vet.getNin().get(i).getBateria()));
            cxFalCon.setText(vet.getNin().get(i).getFalante());
            cxCamCon.setText(vet.getNin().get(i).getCamera());
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgIni = new javax.swing.JLabel();
        rtNomeCon = new javax.swing.JLabel();
        rtCpuCon = new javax.swing.JLabel();
        rtGpuCon = new javax.swing.JLabel();
        rtRamCon = new javax.swing.JLabel();
        rtArmCon = new javax.swing.JLabel();
        rtTeraCon = new javax.swing.JLabel();
        msgPorCon = new javax.swing.JLabel();
        msgMesaCon = new javax.swing.JLabel();
        rtTecAudCon = new javax.swing.JLabel();
        rtBluCin = new javax.swing.JLabel();
        rtPolTelCon = new javax.swing.JLabel();
        rtCapBatCon = new javax.swing.JLabel();
        rtFalCon = new javax.swing.JLabel();
        rtCamCon = new javax.swing.JLabel();
        cxNomeCon = new javax.swing.JTextField();
        cxCpuCon = new javax.swing.JTextField();
        cxGpuCon = new javax.swing.JTextField();
        cxRamCon = new javax.swing.JTextField();
        cxArmCon = new javax.swing.JTextField();
        cxTeraCon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cxTecAudCon = new javax.swing.JTextField();
        cxBluCon = new javax.swing.JTextField();
        cxPolTelCon = new javax.swing.JTextField();
        cxCapBatCon = new javax.swing.JTextField();
        cxFalCon = new javax.swing.JTextField();
        cxCamCon = new javax.swing.JTextField();
        cxFormCon = new javax.swing.JTextField();

        msgIni.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        msgIni.setText("DADOS DO CONSOLE");

        rtNomeCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtNomeCon.setText("NOME COMERCIAL DO CONSOLE:");

        rtCpuCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtCpuCon.setText("CPU DO CONSOLE:");

        rtGpuCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtGpuCon.setText("GPU DO CONSOLE:");

        rtRamCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtRamCon.setText("MEMÓRIA RAM:");

        rtArmCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtArmCon.setText("ARMAZENAMENTO INTERNO:");

        rtTeraCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtTeraCon.setText("QUANT. TERAFLOPS:");

        msgPorCon.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        msgPorCon.setText("CONSOLES PORTÁTEIS");

        msgMesaCon.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        msgMesaCon.setText("CONSOLES DE MESA");

        rtTecAudCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtTecAudCon.setText("TECNOLOGIA DE ÁUDIO:");

        rtBluCin.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtBluCin.setText("LEITOR BLU-RAY:");

        rtPolTelCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtPolTelCon.setText("POLEGADA DE TELA:");

        rtCapBatCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtCapBatCon.setText("CAPACIDADE DA BATERIA:");

        rtFalCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtFalCon.setText("TIPO DE AUTO-FALANTE:");

        rtCamCon.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        rtCamCon.setText("TIPO DE CÂMERA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtCamCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxCamCon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtFalCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxFalCon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtCapBatCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxCapBatCon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtPolTelCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxPolTelCon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtBluCin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxBluCon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtTecAudCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxTecAudCon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtRamCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxRamCon))
                            .addComponent(rtArmCon, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxArmCon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxFormCon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msgMesaCon)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtGpuCon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxGpuCon))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtCpuCon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxCpuCon))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtNomeCon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTeraCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxTeraCon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(msgPorCon)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(msgIni)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgIni)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxNomeCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtNomeCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCpuCon)
                    .addComponent(cxCpuCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtGpuCon)
                    .addComponent(cxGpuCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtRamCon)
                    .addComponent(cxRamCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtArmCon)
                    .addComponent(cxArmCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxFormCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTeraCon)
                    .addComponent(cxTeraCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgMesaCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTecAudCon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cxTecAudCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtBluCin)
                    .addComponent(jLabel3)
                    .addComponent(cxBluCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msgPorCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPolTelCon)
                    .addComponent(cxPolTelCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCapBatCon)
                    .addComponent(cxCapBatCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtFalCon)
                    .addComponent(cxFalCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCamCon)
                    .addComponent(cxCamCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DadCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cxArmCon;
    private javax.swing.JTextField cxBluCon;
    private javax.swing.JTextField cxCamCon;
    private javax.swing.JTextField cxCapBatCon;
    private javax.swing.JTextField cxCpuCon;
    private javax.swing.JTextField cxFalCon;
    private javax.swing.JTextField cxFormCon;
    private javax.swing.JTextField cxGpuCon;
    private javax.swing.JTextField cxNomeCon;
    private javax.swing.JTextField cxPolTelCon;
    private javax.swing.JTextField cxRamCon;
    private javax.swing.JTextField cxTecAudCon;
    private javax.swing.JTextField cxTeraCon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel msgIni;
    private javax.swing.JLabel msgMesaCon;
    private javax.swing.JLabel msgPorCon;
    private javax.swing.JLabel rtArmCon;
    private javax.swing.JLabel rtBluCin;
    private javax.swing.JLabel rtCamCon;
    private javax.swing.JLabel rtCapBatCon;
    private javax.swing.JLabel rtCpuCon;
    private javax.swing.JLabel rtFalCon;
    private javax.swing.JLabel rtGpuCon;
    private javax.swing.JLabel rtNomeCon;
    private javax.swing.JLabel rtPolTelCon;
    private javax.swing.JLabel rtRamCon;
    private javax.swing.JLabel rtTecAudCon;
    private javax.swing.JLabel rtTeraCon;
    // End of variables declaration//GEN-END:variables
}
