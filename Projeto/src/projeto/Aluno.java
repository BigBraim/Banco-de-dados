package projeto;

public class Aluno {
    
    private int id;
    private String nome;
    private int matricula;
    private String turma;
    private byte[] foto;
    

    public Aluno() {
    }
    
    

    public Aluno(int id, int matricula, String nome, String turma, byte[] foto) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }


    
    public void exibirInformacoes(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Turma: "+ this.getTurma());
        System.out.println("Matricula: "+ this.getMatricula());
        System.out.println("Foto: "+ this.getFoto());
    }

    Aluno get(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
