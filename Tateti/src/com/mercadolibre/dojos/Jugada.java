package com.mercadolibre.dojos;

public class Jugada {
    Ficha ficha;
    Ubicacion ubicacion;

    public Jugada(Ficha ficha, Ubicacion ubicacion) {
        this.ficha = ficha;
        this.ubicacion = ubicacion;
    }

    /*
    public Ficha getFicha() {
        return ficha;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    */

    public Estado jugar(Seteable seteable){
       // return seteable.set(this.ubicacion.getX(), this.ubicacion.getY(), this.ficha);
        return ubicacion.setear(seteable,ficha);
    }
}
