package com.marcusvbrangel.calculo;

public class CalculoDiaria implements Calculo {

    private double valorDiaria;
    private double hora = 3;

    public CalculoDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public double calcular(long periodo, Veiculo veiculo) {
        return valorDiaria * (periodo / hora);
    }
}
