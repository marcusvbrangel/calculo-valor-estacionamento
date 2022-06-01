package com.marcusvbrangel.calculo;

public class ContaEstacionamento {

    private Calculo calculo;
    private Veiculo veiculo;
    private long inicio;
    private long fim;

    public void setCalculo(Calculo calculo) {
        this.calculo = calculo;
    }

    public double valorConta() {
        return calculo.calcular(fim - inicio, veiculo);
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setInicio(Long inicio) {
        this.inicio = inicio;
    }

    public void setFim(Long fim) {
        this.fim = fim;
    }
}
