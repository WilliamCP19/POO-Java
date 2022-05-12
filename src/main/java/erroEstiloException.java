//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JOptionPane;

public class erroEstiloException extends Exception {

    public void impEst () {
        JOptionPane.showMessageDialog(null, "Em <ESTILO DE JOGO>:\nVoce deve escrever se é um jogador CASUAL ou COMPETITIVO!", "Erro Estilo", 1);
    }

    public void estiloCerto () {
        impEst ();
        CadJog.getCxEstiloJog().requestFocus();
        
    }
}
