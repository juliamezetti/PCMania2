package PCmania;

public class HardwareBasico {
    private String nome;
    private int capacidade;
    private int ram;

    public HardwareBasico(String nome, int capacidade , int ram) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.ram = ram;
    }
    public String getNome() { return nome; }
    public int getCapacidade() { return capacidade; }
    public int getram() { return ram; }
}
