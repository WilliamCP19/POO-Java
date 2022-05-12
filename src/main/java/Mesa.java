//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

public class Mesa extends Console implements Diferencial {
    private String formato_SSD;
    private String blu;
    private String audio;

    public Mesa () {
        setTeraflops(0);
        setRam(0);
        setCpu("");
        setGpu("");
        setArmazena("");
        setMarca("");
        setDev(new Empresa ());
        setFormato_SSD("");
        setBlu("");
        setAudio("");
    }
    //O MÉTODO CONSTRUTOR ABAIXO UTILIZA O CONCEITO DE POLIMORFISMO POR SOBRECARGA.
    public Mesa (String play) {
        setTeraflops(10);
        setRam(16);
        setCpu("AMD Zen 2 - Personalizado");
        setGpu("AMD 36 UC's com ate 2.23 GHz - Personalizada");
        setArmazena("SSD - 825 GB");
        setMarca(play);
        setFormato_SSD("SSD NVMe Generico - Compativel com PC's.");
        setBlu("Blu-ray 4k");
        setAudio("Tempest 3D AudioTech");
        setDev(new Empresa(play));
    }
    //O MÉTODO CONSTRUTOR ABAIXO UTILIZA O CONCEITO DE POLIMORFISMO POR SOBRECARGA.
    public Mesa (String xbox, int teraflops) {
        setTeraflops(teraflops);
        setRam(16);
        setCpu("AMD Zen 2 - Personalizado");
        setGpu("AMD 52 UC's com ate 1.85 GHz - Personalizada");
        setArmazena("SSD - 1TB");
        setMarca(xbox);
        setFormato_SSD("SSD Proprio - Especifico de Xbox Series.");
        setBlu("Blu-ray UHD");
        setAudio("Dolby Atmos");
        setDev(new Empresa(xbox, 1975));
    }
    public String getFormato_SSD () {
        return formato_SSD;
    }
    public void setFormato_SSD (String formato) {
        formato_SSD = formato;
    }
    public String getBlu () {
        return blu;
    }
    public void setBlu (String blu) {
        this.blu = blu;
    }
    public String getAudio () {
        return audio;
    }
    public void setAudio (String audio) {
        this.audio = audio;
    }

    // O MÉTODO ABAIXO UTILIZA O POLIMORFISMO POR SOBRESCRITA.
    public String exclusivo () {
        if (getMarca() == "PLAYSTATION") {
            return "Gatilhos Adaptativos no Dualsense";
        } else if (getMarca() == "XBOX SERIES") {
            return "Tecnologia Quick Resume - Mais jogos na Memoria Principal";
        }
        return "NENHUMA"; 
    }
}