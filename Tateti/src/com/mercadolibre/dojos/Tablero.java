package com.mercadolibre.dojos;

public interface Tablero {
    void render();
    Estado jugar(Jugada jugada);
    Estado evaluar(IResolutor resolutor);
}
