package ex04herpoli;

import javax.swing.JOptionPane;

public class Ex04HerPoli {

    public static void main(String[] args) {
        
        int operacao;
        
        Novo novo = new Novo();
        Velho velho = new Velho();
                
        velho.setPreco(2000000);
        velho.setEndereco("Leblon");        
        novo.setPreco(2000000);
        novo.setEndereco("Leblon");
        novo.setAdicional(1.2);
        velho.setDesconto(0.8);
        
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Para Imóvel novo\nDigite 2 para Imóvel Velho"));
        
        switch(operacao){
            
            case 1:
                novo.calcAdicional();
                novo.imprime();
                break;
            case 2:
                velho.calcDesconto();
                velho.imprime();
                break;
            default:
                break;
            
        }
        
        
    }
    
}
