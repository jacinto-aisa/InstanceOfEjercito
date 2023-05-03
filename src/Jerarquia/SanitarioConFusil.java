package Jerarquia;

public class SanitarioConFusil implements IMilitar, ISanitario, IDisparable{
    @Override
    public float damePotenciaDeFuego() {
        return 3;
    }

    @Override
    public String dameTipo() {
        return "sanitario con fusil";
    }

    @Override
    public float dameCura() {
        return 20;
    }
}
