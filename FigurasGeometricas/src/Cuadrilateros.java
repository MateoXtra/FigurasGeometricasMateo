public class Cuadrilateros extends FigurasGeometricas{
    double lado;
    double altura;


    public Cuadrilateros(double lado, double altura){}
    public Cuadrilateros(){}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * altura;
    }

}
