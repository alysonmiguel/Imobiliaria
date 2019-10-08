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
public class Comercial extends Imovel{
    private double areaUtil;

    public Comercial(double areaUtil, int codigo, String ragiao, double valor, boolean disponivel) {
        super(codigo, ragiao, valor, disponivel);
        this.areaUtil = areaUtil;
    }

    public double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil;
    }

    @Override
    public String toString() {
         return "Imovel Comercial \n Codigo = "+ super.getCodigo()+ "\n Regiao = "  + super.getRagiao()+ "\n Valor = "+ super.getValor()+ "\nArea Util = " + areaUtil;
    }
    
    
    
}
