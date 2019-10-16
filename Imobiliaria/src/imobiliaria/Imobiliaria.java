/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alyson
 */
public class Imobiliaria {

    private ArrayList<Imovel> imoveis = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    int codigo = 10;

    public void menu() {
        int op;
        do {
            System.out.println("-------Menu Imobiliária-------------\n"
                    + "1 - Cadastrar Imóvel\n"
                    + "2 - Alugar Imóvel\n"
                    + "3 - Sair\n"
                    + "-------------------------------------");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    cadastrarImoveis();
                    break;
                case 2:
                    if (listarImoveis()) {
                        System.out.println("Digite o código do imóvel desejado.");
                        alugarImovel(entrada.nextInt());
                    }else{
                        System.out.println("Não tem imovel disponivel para alugar.");
                    }
          
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (op != 3);

    }

    private void cadastrarImoveis() {
        Imovel i = null;
        String regiao = null;
        double valor = 0;
        System.out.println("---------Cadastrar Imóvel--------\n"
                + "1-Residencial\n"
                + "2-Comercial\n"
                + "-------------------------------");

        int op = entrada.nextInt();

        if (op == 1 || op == 2) {
            System.out.println("Qual a região do imóvel? ");
            regiao = entrada.next();
            System.out.println("Qual o valor do imóvel? ");
            valor = entrada.nextDouble();
        }

        switch (op) {
            case 1:
                System.out.println("Qual a quantidade de quartos");
                i = new Residencial(entrada.nextInt(), codigo++, regiao, valor, true);
                imoveis.add(i);
                break;
            case 2:
                System.out.println("Qual a area util do imovel?");
                i = new Comercial(entrada.nextDouble(), codigo++, regiao, valor, true);
                imoveis.add(i);
                break;
            case 3:
                break;
            default:
                System.out.println("Opção invalida!");
        }

    }
    
    private boolean listarImoveis() {
        if (!imoveis.isEmpty()) {
            for (Imovel imovei : imoveis) {
                System.out.println("--------------------");
                System.out.println(imovei.toString());
                return true;
            }
        }
        return false;
    }

    private void alugarImovel(int codigo) {
        for (Imovel imovei : imoveis) {
            if (imovei.getCodigo() == codigo) {
                if (imovei.isDisponivel()) {
                    System.out.println("Imóvel alugado com sucesso");
                    imovei.setDisponivel(false);
                } else {
                    System.out.println("Imóvel nao esta mais disponivel");
                }

            }
        }

    }

}
