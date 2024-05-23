
public class Main {
    public static void main(String[] args) {

        FigurasGeometricas mifigura1 = new FigurasGeometricas();

        Circulo mifigura2 = new Circulo();
        Cuadrado mifigura3 = new Cuadrado();
        Cuadrilateros mifigura4 = new Cuadrilateros();

        Circulo mifigura5 = new Circulo(12.00);
        Cuadrado mifigura6 = new Cuadrado(12.33, 12.12);
        Cuadrilateros mifigura7 = new Cuadrilateros(23.32, 17.64);
        // xd

        System.out.println("CUADRADO");
        System.out.println("El nombre del Cuadrado es: " + mifigura3.getNombre());
        mifigura3.setNombre("Señor cuadrado");
        mifigura3.setLado(12.33);
        mifigura3.setLado2(23.32);
        System.out.println("El Area del cuadrado es: ");
        System.out.println(mifigura3.calcularArea());

        System.out.println("CUADRALITERO");
        mifigura4.setLado(12.33);
        mifigura4.setAltura(12.22);
        System.out.println("El Area del cuadrilatero es: ");
        System.out.println(mifigura4.calcularArea());
        mifigura4.setNumLados(4);
    }
}