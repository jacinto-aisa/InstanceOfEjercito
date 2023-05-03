package Coleccion;

import Jerarquia.IMilitar;

public interface IColeccionMilitar {
    void add(IMilitar elemento);
    float sanacionTotal();

    float poteniaTotal();

    String descripcionTotal();
}
