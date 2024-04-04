package banco12;

public class Cliente {
    private String nome;
    private byte idade;

    
    public Cliente(String nome, byte idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo.");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade deve ser positiva.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade deve ser positiva.");
        }
        this.idade = idade;
    }
}
