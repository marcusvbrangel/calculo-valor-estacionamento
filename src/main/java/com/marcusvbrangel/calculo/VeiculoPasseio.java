package com.marcusvbrangel.calculo;

public class VeiculoPasseio extends Veiculo {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(String tipo) {
        tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

}
