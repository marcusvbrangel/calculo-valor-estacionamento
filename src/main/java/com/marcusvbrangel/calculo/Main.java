package com.marcusvbrangel.calculo;

public class Main {

    public static void main(String[] args) {
        System.out.println("teste de funcionamento...");

        ContaEstacionamento conta = new ContaEstacionamento();

        VeiculoPasseio veiculoPasseio = new VeiculoPasseio();
        veiculoPasseio.setPlaca("KNZ4572");
        veiculoPasseio.setNome("Honda Fit");
        veiculoPasseio.setTipo("passeio");

        conta.setVeiculo(veiculoPasseio);
        conta.setInicio(10l);
        conta.setFim(20l);

        Calculo calculoHora = new CalculoHora(4);

        conta.setCalculo(calculoHora);
        double valor = conta.valorConta();

        System.out.println("Valor: " + valor);

    }
}
