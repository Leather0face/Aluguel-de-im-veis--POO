package br.com.zup.Entidades;

public class Morador extends Pessoa {

    private String cpf;
    private int quantidadeDeMoradores;

    public Morador () {}

    public Morador(String nome, String cpf, int quantidadeDeMoradores) {
        super(nome);
        this.cpf = cpf;
        this.quantidadeDeMoradores = quantidadeDeMoradores;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantidadeDeMoradores() {
        return quantidadeDeMoradores;
    }

    public void setQuantidadeDeMoradores(int quantidadeDeMoradores) {
        this.quantidadeDeMoradores = quantidadeDeMoradores;
    }



    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n_____________________________");
        exibir.append("\nO nome do morador é: " + getNome());
        exibir.append("\nO CPF do morador é : " + cpf);
        exibir.append("\n_____________________________");
        return exibir.toString();

    }

}
