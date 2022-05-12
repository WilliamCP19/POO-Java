//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

public class Portatil extends Console {

    private int tela;
    private String falante;
    private String camera;
    private int bateria;

    public Portatil () {
        setTeraflops(0);
        setRam(0);
        setCpu("");
        setGpu("");
        setArmazena("");
        setMarca("");
        setDev(new Empresa ());
        tela = 0;
        bateria = 0;
        falante = "";
        camera = "";
    }
    //O MÉTODO CONSTRUTOR ABAIXO UTILIZA O CONCEITO DE POLIMORFISMO POR SOBRECARGA.
    public Portatil (String portable) {
        setTeraflops(1);
        setRam(4);
        setCpu("Tegra X1 768 MHz");
        setGpu("Integrada a CPU");
        setArmazena("HD - 32 GB");
        setMarca(portable);
        setDev(new Empresa(portable, 3, 1889));
        tela = 7;
        bateria = 4110;
        falante = "Estereo";
        camera = "Infra-Vermelho";
    }

    public int getTela () {
        return tela;
    }
    public void setTela (int tela) {
        this.tela = tela;
    }
    public String getFalante () {
        return falante;
    }
    public void setFalante (String falante) {
        this.falante = falante;
    }
    public String getCamera () {
        return camera;
    }
    public void setCamera (String camera) {
        this.camera = camera;
    }
    public int getBateria () {
        return bateria;
    }
    public void setBateria (int bateria) {
        this.bateria = bateria;
    }
}