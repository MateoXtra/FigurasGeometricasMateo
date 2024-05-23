public class Circulo extends FigurasGeometricas{
    double radio;
    public Circulo(Double radio) {}
    public Circulo() {}


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
