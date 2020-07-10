package ex04herpoli;

import javax.swing.JOptionPane;

public class Novo extends Imovel{

    private double adicional;
    private String condicao = "Novo";

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    
    
    public double calcAdicional(){
        
        this.preco = this.preco * this.adicional;
        return this.preco;
        
    }
    
    @Override
    public void imprime(){
        
        JOptionPane.showMessageDialog(null, "CASA"
                + "\n\nLocalização: " + this.getEndereco()
                + "\nCondição: " + this.getCondicao()
                + "\nValor Final: R$" + this.preco);
        
    }
    
}