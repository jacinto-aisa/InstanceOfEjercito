package Coleccion;
import Jerarquia.*;
import java.util.ArrayList;

public class EjercitoDeTierra implements IColeccionMilitar{
    private ArrayList<IMilitar> tropa;


    public EjercitoDeTierra() {
        this.tropa = new ArrayList<IMilitar>();
    }


    @Override
    public void add(IMilitar elemento) {
        tropa.add(elemento);
    }

    @Override
    public float sanacionTotal() {
        float acumulado=0;
        for(IMilitar unidad: tropa)
        {
            if (unidad instanceof ISanitario)
                acumulado+=((ISanitario)unidad).dameCura();
        }
        return acumulado;
    }

    @Override
    public float poteniaTotal() {
        float acumulado=0;
        for(IMilitar unidad: tropa)
        {
            if (unidad instanceof IDisparable)
                acumulado+=((IDisparable)unidad).damePotenciaDeFuego();
        }
        return acumulado;
    }

    @Override
    public String descripcionTotal() {
        StringBuilder acumulado= new StringBuilder();
        for(IMilitar unidad: tropa)
        {
                acumulado.append(unidad.dameTipo()).append("\n");
        }
        return acumulado.toString();
    }
}
