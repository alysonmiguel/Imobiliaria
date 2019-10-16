/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

/**
 *
 * @author Alyson
 */
public class Residencial extends Imovel{
    private int numeroQuartos;

    public Residencial(int numeroQuartos, int codigo, String ragiao, double valor, boolean disponivel) {
        super(codigo, ragiao, valor, disponivel);
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    @Override
    public String toString() {
        return "Imovel Residencial \n Codigo = "+ super.getCodigo()+ "\n Regiao = "  + super.getRagiao()+ "\n Valor = "+ super.getValor()+ "\n Numero de quartos " + numeroQuartos;
    }
    
    
    
}
