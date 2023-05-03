import Coleccion.EjercitoDeTierra;
import Jerarquia.Antiaereo;
import Jerarquia.Sanitario;
import Jerarquia.SanitarioConFusil;
import Jerarquia.Tanque;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EjercitoDeTierra SuperPuma = new EjercitoDeTierra();
        SuperPuma.add(new Tanque());
        SuperPuma.add(new Sanitario());
        SuperPuma.add(new Antiaereo());
        SuperPuma.add(new SanitarioConFusil());

        System.out.println(SuperPuma.descripcionTotal());
        System.out.println("potencia: "+SuperPuma.poteniaTotal());
        System.out.println("sanacion: "+SuperPuma.sanacionTotal());
        }
    }
