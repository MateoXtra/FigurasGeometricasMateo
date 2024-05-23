public class Cuadrado extends FigurasGeometricas{
    double lado;
    double lado2;

    public Cuadrado(double lado, double lado2) {}
    public Cuadrado() {}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return lado * lado2;
    }
}
