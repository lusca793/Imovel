package ex04herpoli;

import javax.swing.JOptionPane;

public class Imovel {

    public double preco;
    public String endereco;
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void imprime(){
        
        JOptionPane.showMessageDialog(null, "CASA"
                + "\n\nLocalização: " + this.getEndereco()
                + "\nCondição: "
                + "\nValor Final: R$" + this.preco);
        
    }
    
    
    
}
