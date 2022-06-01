package Exercicio11;

public class Exercicio11 {

    private double valorDesconto;

    public String calcDesconto(int nParcelas, double valorCompra){
        switch(nParcelas){
            case 1:
                this.valorDesconto = 0.1;
                break;
            case 2:
                this.valorDesconto = 0.08;
                break;
            case 3:
                this.valorDesconto = 0.06;
                break;
            case 4:
                this.valorDesconto = 0.04;
                break;
            case 5:
                this.valorDesconto = 0.02;
                break;
            default:
                this.valorDesconto = 0;
        }

        double valorComDesconto = valorCompra - (valorCompra * valorDesconto);

        return "O valor da compra com desconto foi: R$:" + valorComDesconto + ", a porcentagem de desconto é: "
                + valorDesconto*100 ;
    }


}
