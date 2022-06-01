package com.marcusvbrangel.calculo;

abstract class Veiculo {
    String tipo;
    String placa;

    abstract void setTipo(String tipo);

    abstract String getTipo();

    abstract void setPlaca(String placa);

    abstract String getPlaca();

}
