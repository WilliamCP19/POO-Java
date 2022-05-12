//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JOptionPane;

public class erroQualidadeException extends Exception {
    
    public void impQuali () {
        JOptionPane.showMessageDialog (null, "Em <PREFERENCIA EM JOGO>:\nA gameplay é boa com resolução maior ou taxa de quadros maior?\n\t\tVoce prefere 'fps' ou 'resolução'", "Erro na Preferencia", 1);
    }

    public void qualidadeCerta () {
        impQuali ();
        CadJog.getCxQualidadeJog().requestFocus();
    }
}
