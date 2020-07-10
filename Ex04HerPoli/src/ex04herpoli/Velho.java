package ex04herpoli;

import javax.swing.JOptionPane;

public class Velho extends Imovel{

    private double desconto;
    private String condicao = "Velho";
    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double calcDesconto(){
    
        this.preco = this.preco * this.desconto;
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
