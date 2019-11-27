package com.mercadolibre.dojos;

public class Ubicacion {
    int x;
    int y;

    public Ubicacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    

    public Estado setear(Seteable seteable, Ficha ficha){
        return seteable.set(this.x, this.y,ficha);
    }
}
