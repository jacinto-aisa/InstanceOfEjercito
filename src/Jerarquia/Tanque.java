package Jerarquia;

public class Tanque implements IMilitar, IDisparable{
    @Override
    public float damePotenciaDeFuego() {
        return 10;
    }

    @Override
    public String dameTipo() {
        return "Tanque";
    }
}
