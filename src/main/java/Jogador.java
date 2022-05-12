//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

public class Jogador {

    private String nome;
    private int idade;
    private String estilo;
    private String gosto;
    private String qualidade;

    public Jogador () {
        nome = "";
        idade = 0;
        estilo = "";
        gosto = "";
        qualidade = "";
    }

//================================
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getIdade () {
        return idade;
    } 
    public void setIdade (int idade) throws erroIdadeException {
        if (idade > 17) {
            this.idade = idade;
        } else {
            throw new erroIdadeException ();
        }
        
    }

    public String getEstilo () {
        return estilo;
    }
    public void setEstilo (String estilo) throws erroEstiloException {
        if (estilo.equals("CASUAL") || estilo.equals("COMPETITIVO")) {
            this.estilo = estilo;
        } else {
            throw new erroEstiloException ();
        }
    }

    public String getGosto () {
        return gosto;
    }
    public void setGosto (String gosto) throws erroGostoException {
        if (gosto.equals("SINGLEPLAYER") || gosto.equals("MULTIPLAYER")) {
            this.gosto = gosto;
        } else {
            throw new erroGostoException();
        }
    }

    public String getQualidade () {
        return qualidade;
    }
    public void setQualidade (String qualidade) throws erroQualidadeException {
        if (qualidade.equals("FPS") || qualidade.equals("RESOLUCAO")) { 
            this.qualidade = qualidade;
        } else {
            throw new erroQualidadeException ();
        }
    }
//================================
}