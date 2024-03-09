package br.ulbra.poo;

public class Circulo {
    
    private double raio;
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double calcularPerimetro(){
        return 2*Math.PI*this.raio;
    }
    public double calcularArea(){
        return Math.PI * (this.raio*this.raio);
    }
    public double calcularDiametro(){
        return 2 * this.raio;
    }
    
}
