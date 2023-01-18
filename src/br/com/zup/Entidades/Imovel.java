package br.com.zup.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String endereco;
    private String codigoDoImovel;
    private String valorDoAluguel;
    private List<Morador> listaDeMoradores = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, String codigoDoImovel, String valorDoAluguel) {
        this.endereco = endereco;
        this.codigoDoImovel = codigoDoImovel;
        this.valorDoAluguel = valorDoAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoDoImovel() {
        return codigoDoImovel;
    }

    public void setCodigoDoImovel(String codigoDoImovel) {
        this.codigoDoImovel = codigoDoImovel;
    }

    public String getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(String valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }


    public void adicionarMorador(Morador moradores) {

        this.listaDeMoradores.add(moradores);
    }

    public void exibirListaDeMoradores() {

        System.out.println("ESTA É A LISTA DE MORADORES");

        for (Morador moradorDaLista : this.listaDeMoradores) {

            System.out.println(listaDeMoradores);
        }
    }


    public void excluirMoradorDoImovel(String cpf) {

        Morador moradorProcurado = null;

        for (Morador elementoDaListaDeMoradores : this.listaDeMoradores) {

            if (elementoDaListaDeMoradores.getCpf().equals(cpf)) {

                moradorProcurado = elementoDaListaDeMoradores;
            }
        }

        listaDeMoradores.remove(moradorProcurado);
    }

    public void verificarSeCpfExiste(String cpf) throws Exception {

        for (Morador elementoDaListaDeMoradores : this.listaDeMoradores) {

            if (elementoDaListaDeMoradores.getCpf().equals(cpf)) {

                throw new Exception("O morador já foi cadastrado porque o  CPF já consta na lista. Por favor, cadastre outro morador");
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n_____________________________");
        exibir.append("\nO endereço do imóvel é: " + endereco);
        exibir.append("\nO código do imóvel é: " + codigoDoImovel);
        exibir.append("\nO valor do aluguel é: " + valorDoAluguel);
        exibir.append("\n_____________________________");
        return exibir.toString();
    }
}

// Um imóvel contém moradores.

// Métodos para adicionar um morador ao imóvel, exibir a lista de moradores cadastrados, excluir um morador do imóvel e verificar se  o cpf já existe.

// Método para exibir a lista