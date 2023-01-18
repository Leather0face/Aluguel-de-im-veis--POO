package br.com.zup.Aplication;

public class Main {

    public static void main(String[] args) {

        try {

            Sistema.executarSistema();
        }

        catch (Exception cpfIgual) {

            System.out.println(cpfIgual.getMessage());

        }
    }
}

// Tratamento de exceção e método para executar toda a classe "Sistema".
















