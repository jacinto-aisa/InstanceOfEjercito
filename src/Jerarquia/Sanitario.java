package Jerarquia;

public class Sanitario implements IMilitar, ISanitario{
    @Override
    public String dameTipo() {
        return "sanitario";
    }

    @Override
    public float dameCura() {
        return 10;
    }
}
