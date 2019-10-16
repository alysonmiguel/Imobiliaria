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
public class Imovel {

    private int codigo;
    private String ragiao;
    private double valor;
    private boolean disponivel;

    public Imovel(int codigo, String ragiao, double valor, boolean disponivel) {
        this.codigo = codigo;
        this.ragiao = ragiao;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRagiao() {
        return ragiao;
    }

    public void setRagiao(String ragiao) {
        this.ragiao = ragiao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Imovel{" + "codigo=" + codigo + ", ragiao=" + ragiao + ", valor=" + valor + ", disponivel=" + disponivel + '}';
    }

}
