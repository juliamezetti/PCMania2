package PCmania;

public class Computador {
    private String marca;
    private double preco;
    private HardwareBasico processador;
    private HardwareBasico memoria;
    private HardwareBasico hd;
    private SistemaOperacional sistema;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, double preco, HardwareBasico processador, HardwareBasico memoria, HardwareBasico hd, SistemaOperacional so, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.sistema = so;
        this.memoriaUSB = memoriaUSB;
    }

    public void mostraPCConfigs() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Processador: " + processador.getNome() + " (" + processador.getCapacidade() + " Mhz)");
        System.out.println("Memória RAM: " + memoria.getram() + " Gb");
        System.out.println("HD: " + hd.getCapacidade() + " Gb");
        System.out.println("Sistema Operacional: " + sistema.getNome() + " (" + sistema.getTipo() + " bits)");
        System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + " Gb");
    }

    public String getMarca() { return marca; }
    public double getPreco() { return preco; }
}
