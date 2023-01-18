package br.com.zup.Aplication;

import br.com.zup.Entidades.Catalogo;
import br.com.zup.Entidades.Imovel;
import br.com.zup.Entidades.Morador;


import java.util.ArrayList;
import java.util.List;

public class Sistema {


    public static void cadastrarImovel() {

        System.out.println("Agora vamos cadastrar um imóvel");

        System.out.println("Qual é o endereço do imóvel?");

        String endereco = IO.criaScanner().nextLine();

        System.out.println("Data de cadastro");

        String codigoDoImovel = IO.criaScanner().nextLine();

        System.out.println("Qual é o valor do aluguel?");

        String valorDoAluguel = IO.criaScanner().nextLine();

        Imovel imovel = new Imovel(endereco, codigoDoImovel, valorDoAluguel);

        Catalogo.adicionarImovelAoCatalogo(imovel);

        Catalogo.exibirCatalogo();
    }


    public static void cadastrarMorador() {

        List<Morador> listaDeMoradores = new ArrayList<>();

        System.out.println("Agora vamos cadastrar os moradores");

        System.out.println("Em qual dos imóveis ele vai morar? Digite o endereço");

        String endereco = IO.criaScanner().nextLine();

        System.out.println("Qual é o nome?");

        String nome = IO.criaScanner().nextLine();

        System.out.println("Qual é o CPF do morador?");

        String cpf = IO.criaScanner().nextLine();

        System.out.println("Você deseja cadastrar outro morador?");

        System.out.println("Digite SIM ou NÃO");

        String opcao = IO.criaScanner().next();

        Imovel imovel = Catalogo.pesquisarImovel(endereco);

        Morador morador = new Morador(nome, cpf, listaDeMoradores.size());
        imovel.adicionarMorador(morador);

        imovel.exibirListaDeMoradores();

        if (opcao.equals("SIM")) {

          listaDeMoradores.add(morador);
        }

        else {

            menu();

        }
    }


    public static void excluirMorador() {

        System.out.println("Vamos excluir um morador de um dos imóveis");

        System.out.println("Digite o endereço do imóvel ");

        String endereco = IO.criaScanner().nextLine();

        System.out.println("Agora digite o CPF do morador que você quer excluir");

        String cpf = IO.criaScanner().nextLine();

        Catalogo.excluirMoradorDeUmImovel(endereco, cpf);
    }


    public static void menu() {

        System.out.println("SEJA BEM VINDO (a) À IMOBILIÁRIA");

        System.out.println("Digite 1 para cadastrar um imóvel: ");
        System.out.println("Digite 2 para cadastrar morador ");
        System.out.println("Digite 3 para exibir a lista de imóveis: ");
        System.out.println("Digite 4 para exibir a lista de moradores: ");
        System.out.println("Digite 5 para excluir um morador de um imóvel: ");
        System.out.println("Digite 99 para sair do programa: ");
    }


    public static void executarSistema() {

        boolean executar = true;

        while (executar == true) {

            menu();

            String opcoesMenu = IO.criaScanner().nextLine();

            switch (opcoesMenu) {

                case "1":

                    cadastrarImovel();

                    break;

                case "2":

                    cadastrarMorador();

                    break;

                case "3":

                    Catalogo.exibirCatalogo();

                    break;

                case "4":

                    System.out.println("Digite o endereço do imóvel que você quer ver os moradores. ");

                    String endereco = IO.criaScanner().nextLine();

                    Imovel imovel = Catalogo.pesquisarImovel(endereco);

                    System.out.println(imovel.toString());

                    imovel.exibirListaDeMoradores();

                    break;

                case "5":

                    excluirMorador();

                    break;

                case "99":

                    executar = false;

                    System.out.println("PROGRAMA FINALIZADO");

                    break;

                default:

                    System.out.println("OPÇÃO INVÁLIDA");
            }
        }
    }
}


// Métodos para receber dos dados do usuário, cadastrar e executar o sistema











