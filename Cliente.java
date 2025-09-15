package PCmania;

public class Cliente {
    private String nome;
    private String curso;
    private String matricula;

    public Cliente(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public String getCurso() { return curso; }
    public String getMatricula() { return matricula; }
}
