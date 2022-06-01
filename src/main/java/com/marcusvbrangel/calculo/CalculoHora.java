package com.marcusvbrangel.calculo;

public class CalculoHora implements Calculo{

    private double valorHora;

    public CalculoHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcular(long periodo, Veiculo veiculo) {
        return valorHora * periodo;
    }

}
