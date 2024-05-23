//Herencia: clase padre a clase hija hereda tidis los campos y métodos de la superclase
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        figurasGeometricas miFigura1 = new figurasGeometricas();
        Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros();

        Circulos miFigura5 = new Circulos(3.00);
        Triangulos miFigura6 = new Triangulos(6.00, 8.00);
        Cuadrilateros miFigura7 = new Cuadrilateros(5.00,5.00);
        Cuadrilateros miFigura8 = new Cuadrilateros(5.00,10.00);


        System.out.println("   /--- Sistema de figuras ---/ \n/ (Areas/ perimetros / Apotemas ) /");
        System.out.println("----------------------------------------------------");
        System.out.println("Circulos");
        miFigura2.setNombre("wola");
        System.out.println(miFigura2.getNombre());
        System.out.println("La pileta del sur tendra un radio de: ");
        miFigura2.setRadio(4.0);
        System.out.println(miFigura2.getRadio());
        System.out.println("Y su area sera de: ");
        System.out.println((double)Math.round(miFigura2.calcularArea() * 100.0) / 100.0);
        System.out.println("----------------------------------------------------");
        System.out.println("Triangulos");
        miFigura3.setNombre("triangulo de encebollados");
        System.out.println(miFigura3.getNombre());
        System.out.println("La altura es: ");
        miFigura3.setAltura(5.0);
        System.out.println(miFigura3.getAltura());
        System.out.println("La base es de: ");
        miFigura3.setBase(3.0);
        System.out.println(miFigura3.getBase());
        System.out.println("Y su area sera de: ");
        System.out.println((double)Math.round(miFigura3.calcularArea() * 100.0) / 100.0);
        System.out.println("---------------------------------------------------");
        System.out.println("Cuadrilateros");
        miFigura4.setNombre("cuadrilateros del sur");
        System.out.println(miFigura4.getNombre());
        System.out.println("Su altura es de: ");
        miFigura4.setAltura(6.0);
        System.out.println(miFigura4.getAltura());
        System.out.println("Su largo es de: ");
        miFigura4.setLargo(7.0);
        System.out.println(miFigura4.getLargo());
        System.out.println("Su area es de: ");
        System.out.println((double)Math.round(miFigura4.calcularArea() * 100.0) / 100.0);
        System.out.println("--------------------------------------------------");
        System.out.println("Circulo_Figura5");
        miFigura5.setNombre("Woola.");
        System.out.println(miFigura5.getNombre());
        System.out.println(miFigura5.getRadio());
        System.out.println("Y su area sera de: ");
        System.out.println((double)Math.round(miFigura5.calcularArea() * 100.0) / 100.0);
        System.out.println("--------------------------------------------------");
        System.out.println("Triangulo_Figura6");
        miFigura6.setNombre("Woola");
        System.out.println(miFigura6.getNombre());
        System.out.println("Su base es: ");
        System.out.println(miFigura6.getBase());
        System.out.println("Su altura es: ");
        System.out.println(miFigura6.getAltura());
        System.out.println("Su area es de: ");
        System.out.println((double)Math.round(miFigura6.calcularArea() * 100.0) / 100.0);
        System.out.println("--------------------------------------------------");
        System.out.println("Cuadrilatero_Figura7");
        miFigura7.setNombre("Woola x2");
        System.out.println(miFigura7.getNombre());
        System.out.println("Su largo es: ");
        System.out.println(miFigura7.getLargo());
        System.out.println("Su Altura es: ");
        System.out.println(miFigura7.getAltura());
        System.out.println("Su area es: ");
        System.out.println((double)Math.round(miFigura7.calcularArea() * 100.0) / 100.0);
        System.out.println("--------------------------------------------------");
        System.out.println("Cuadrilatero_Figura8");
        miFigura8.setNombre("Woola x3");
        System.out.println(miFigura8.getNombre());
        System.out.println("Su largo es: ");
        System.out.println(miFigura8.getLargo());
        System.out.println("Su Altura es: ");
        System.out.println(miFigura8.getAltura());
        System.out.println("Su area es: ");
        System.out.println((double)Math.round(miFigura8.calcularArea() * 100.0) / 100.0);
        System.out.println("--------------------------------------------------");


    }
}