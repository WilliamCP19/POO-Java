//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import javax.swing.JOptionPane;

public class erroIdadeException extends Exception {
   
    public static void impiIdade () {
        JOptionPane.showMessageDialog (null, "Em <IDADE DO JOGADOR>:\nVoce deve ter acima de 18 anos de idade!\n\n\tDigite a idade do adulto responsavel!", "Erro de Maioridade", 1);
    }
    public static void impIdade02 () {
        JOptionPane.showMessageDialog (null, "Em <IDADE DO JOGADOR>:\nA entrada deve ser um numero!", "Erro Formato de Idade", 1);
    }

    public static void idadeCerta (int Validator) {   
        if (Validator == 0) {
           impiIdade ();
        } else {
           impIdade02 ();
        }
        CadJog.getCxIdadeJog().requestFocus();
    }
}
