//NOME WILLIAM DA CRUZ PIRES    RA:2313707
//ENGENHARIA DE SOFTWARE    2021/2

public abstract class Console {
    private int Teraflops = 0;
    private int ram = 0;
    private String cpu = "";
    private String gpu = "";
    private String Armazena = "";
    private String marca = "";
    private Empresa dev = new Empresa();
//================================================
    public int getTeraflops () {
        return Teraflops;
    }
    public void setTeraflops (int teraflops) {
        Teraflops = teraflops;
    }

//================================================
    public int getRam () {
        return ram;
    }
    public void setRam (int ram) {
        this.ram = ram;
    }
//================================================
    public String getCpu () {
        return cpu;
    }
    public void setCpu (String cpu) {
        this.cpu = cpu;
    } 

//================================================
    public String getGpu () {
        return gpu;
    }
    public void setGpu (String gpu) {
        this.gpu = gpu;
    }

//================================================
    public String getArmazena () {
        return Armazena;
    }
    public void setArmazena (String armazena) {
        Armazena = armazena;
    }

//================================================
    public String getMarca () {
        return marca;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
//================================================
    public Empresa getDev () {
        return dev;
    }
    public void setDev (Empresa dev) {
        this.dev = dev;
    }
}