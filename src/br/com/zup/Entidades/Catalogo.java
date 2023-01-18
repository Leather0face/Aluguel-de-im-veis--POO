package br.com.zup.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private static List<Imovel> listaDeImoveis = new ArrayList<>();

    public static void adicionarImovelAoCatalogo(Imovel imovel) {

        listaDeImoveis.add(imovel);
    }


    public static void exibirCatalogo() {

        System.out.println("ESTE É O CATÁLOGO");

        System.out.println("IMÓVEIS DISPONÍVEIS");

        for (Imovel imovelDaLista : listaDeImoveis) {

            System.out.println(imovelDaLista);
        }

    }

    public static void excluirMoradorDeUmImovel(String endereco, String cpf) {

        for (Imovel elementoDaLista : listaDeImoveis) {

            if (elementoDaLista.getEndereco().equals(endereco)) {

                elementoDaLista.excluirMoradorDoImovel(cpf);
            }
        }
    }

    public static Imovel pesquisarImovel (String endereco) {

        for (Imovel elementoDaLista : listaDeImoveis) {

            if (elementoDaLista.getEndereco().equals(endereco)) {

                return elementoDaLista;
            }
        }

        return null;
    }



}

// Um catálogo é uma lista de imóveis.

// Métodos para adicionar imóvel ao catálogo, exibir a lista de imóveis e procurar um morados específico dentro do imóvel.




