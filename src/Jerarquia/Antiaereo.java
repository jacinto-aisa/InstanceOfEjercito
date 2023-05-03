package Jerarquia;

public class Antiaereo implements IMilitar, IDisparable{
    @Override
    public float damePotenciaDeFuego() {
        return 89;
    }

    @Override
    public String dameTipo() {
        return "Antiaereo";
    }
}
