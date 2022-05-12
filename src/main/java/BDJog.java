//NOME: WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

public class BDJog {
    private List <Jogador> gerencia = new ArrayList <Jogador> ();
    private static BDJog vetor;

    private BDJog() {}

    public List<Jogador> getGerencia() {
        return gerencia;
    }
    
    
    public static BDJog getGerJog () {
        if (vetor == null) {
            vetor = new BDJog ();
            return vetor;
        } 
        return vetor;
    }
    
    public Jogador buscaJogador (Jogador pes) {
        for (int i = 0;i < vetor.gerencia.size();i++) {
            if (pes.getNome().equals(vetor.gerencia.get(i).getNome()) && pes.getIdade() == vetor.gerencia.get(i).getIdade()) {
                return vetor.gerencia.get(i);
            }
        }
        return null;
    }
    
    public Jogador adicionaArray (Jogador pes) {
        if (buscaJogador(pes) == null) {
            vetor.gerencia.add(pes);
            return pes;
        }
        return null;
    }
    
    public void atualizar (Jogador escolhido)  {
        int i;
        for (i = 0;i < gerencia.size();i++) {
            if (escolhido.getNome().equals (gerencia.get(i).getNome()) && escolhido.getIdade() == gerencia.get(i).getIdade()) {
                break;
            }
        }
        String nome = JOptionPane.showInputDialog(null, "Digite o nome:", "Atualização", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade:", "atualização", JOptionPane.QUESTION_MESSAGE).toUpperCase(Locale.ITALY));
        String estilo = JOptionPane.showInputDialog(null, "Digite o novo ESTILO DE JOGO:", "Atualização", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        String gosto = JOptionPane.showInputDialog(null, "Digite o novo TIPO DE JOGO:", "Atualização", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        String qualidade = JOptionPane.showInputDialog(null, "Digite o novo 'PREFERÊNCIA DE JOGO'", "Atualização", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        
        escolhido.setNome(nome.toUpperCase());
        try {
            escolhido.setIdade(idade);
            escolhido.setEstilo(estilo.toUpperCase());
            escolhido.setGosto(gosto.toUpperCase());
            escolhido.setQualidade(qualidade.toUpperCase());
            CadJog.getCadJog().dispose();
            gerencia.set(i, escolhido);
        } catch (erroIdadeException e) {
            e.idadeCerta(3);
            atualizar (escolhido);
        } catch (erroEstiloException e){
            e.estiloCerto();
            atualizar (escolhido);
        } catch (erroGostoException e){
            e.gostoCerto();
            atualizar (escolhido);
        } catch (erroQualidadeException e) {
            e.qualidadeCerta();
            atualizar (escolhido);
        } catch (NumberFormatException e) {
            erroIdadeException.idadeCerta(3);
            atualizar (escolhido);
        }
    }
}