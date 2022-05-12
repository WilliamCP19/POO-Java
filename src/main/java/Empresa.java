//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

public class Empresa {

    private String fantasia;
    private String situacao;
    private int cnpj;
    private int ano;
    private String sede;
    private String area;
//===========================================
    public Empresa () {
        fantasia = "";
        situacao = "";
        cnpj = 0;
        ano = 0;
        sede = "";
        area = ""; 
    }

    //O MÉTODO CONSTRUTOR ABAIXO UTILIZA O CONCEITO DE POLIMORFISMO POR SOBRECARGA.
    public Empresa (String play) {
        fantasia = "SONY";
        situacao = "ATIVA";
        cnpj = 1;
        ano = 1946;
        sede = "Minato - Japao";
        area = "DIVERSAS";
    }

    //O MÉTODO CONSTRUTOR ABAIXO UTILIZA O CONCEITO DE POLIMORFISMO POR SOBRECARGA.
    public Empresa (String xbox, int fund) {
        fantasia = "MICROSOFT";
        situacao = "ATIVA";
        cnpj = 2;
        ano = fund;
        sede = "Redmond - EUA"; 
        area = "DIVERSAS";
    }

    //O MÉTODO CONSTRUTOR ABAIXO UTILIZA O CONCEITO DE POLIMORFISMO POR SOBRECARGA.
    public Empresa (String nintendo, int id, int ano_fund) {
        fantasia = "NINTENDO";
        situacao = "ATIVA";
        cnpj = id;
        ano = ano_fund;
        sede = "Quioto - Japao";
        area = "VIDEO GAMES";
    }
//===========================================
    
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String getFantasia () {
        return fantasia;
    }
    public void setFantasia (String fantasia) {
        this.fantasia = fantasia;
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public int getCnpj () {
        return cnpj;
    }
    public void setCnpj (int cnpj) {
        this.cnpj = cnpj;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public int getAno () {
        return ano;
    }
    public void setAno (int ano) {
        this.ano = ano;
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public String getSituacao () {
        return situacao;
    }
    public void setSituacao (String situacao) {
        this.situacao = situacao;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String getSede () {
        return sede;
    }
    public void setSede (String sede) {
        this.sede = sede;
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public String getArea () {
        return area;
    }
    public void setArea (String area) {
        this.area = area;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}