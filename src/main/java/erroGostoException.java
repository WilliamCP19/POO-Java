//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JOptionPane;

public class erroGostoException extends Exception {
    

    public void impGos () {
        JOptionPane.showMessageDialog (null, "Em <TIPO DE JOGO>:\nDeve-se digitar somente:\n\tSINGLEPLAYER ou MULTIPLAYER!", "Erro em Gosto", 1);
    } 
    public void gostoCerto () {
        impGos ();
        CadJog.getCxGostoJog().requestFocus();
    }
}