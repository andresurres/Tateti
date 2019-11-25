package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {

    @Before
    public void setup() {

    }

    @Test
    public void test_case_tablero_vacio_usando_constructor() {
        Presenter presenter = new ConsolePresenter();
        Tablero tablero = new TableroArrays(presenter);
        tablero.render();
    }


    @Test
    public void test_case_tablero_vacio_usando_builder() {
        Presenter presenter = new ConsolePresenter();

        Tablero tablero = new TableroBuilder()
                .withPresenter(presenter)
                .build();

        tablero.render();


    }

    @Test
    public void test_case_tablero_vacio_usando_nuevo_presenter() {
        Presenter presenter = new ConsolePresenterMejorado();
        Tablero tablero = new TableroArrays(presenter);
        tablero.render();
    }

    @Test
    public void test_case_tablero_con_una_ficha() {
        Presenter presenter = new ConsolePresenterMejorado();
        Tablero tablero = new TableroArrays(presenter);
        Ficha ficha = new FichaX();
        Ubicacion ubicacion = new Ubicacion(0, 0);
        Jugada jugada = new Jugada(ficha, ubicacion);
        Estado estado = tablero.jugar(jugada);
        estado.render();
        tablero.render();


    }

    @Test
    public void test_case_tablero_con_una_ficha_O() {
        Presenter presenter = new ConsolePresenterMejorado();
        Tablero tablero = new TableroArrays(presenter);
        Ficha ficha = new Ficha0();
        Ubicacion ubicacion = new Ubicacion(0, 0);
        Jugada jugada = new Jugada(ficha, ubicacion);
        Estado estado = tablero.jugar(jugada);
        estado.render();
        tablero.render();
    }

    @Test
    public void test_case_tablero_con_una_ficha_X_O() {
        Presenter presenter = new ConsolePresenterMejorado();
        Tablero tablero = new TableroArrays(presenter);
        Ficha ficha = new Ficha0();
        Ubicacion ubicacion = new Ubicacion(0, 0);
        Jugada jugada = new Jugada(ficha, ubicacion);
        Estado estado = tablero.jugar(jugada);

        ficha = new FichaX();
        ubicacion = new Ubicacion(0, 1);
        jugada = new Jugada(ficha, ubicacion);
        estado = tablero.jugar(jugada);

        tablero.render();

        Assert.assertEquals(new EstadoTexto("OK"), estado);
    }

    
    @Test
    public void test_case_tablero_con_una_ficha_X_O_fail() {
        Presenter presenter = new ConsolePresenterMejorado();
        Tablero tablero = new TableroArrays(presenter);
        Ficha ficha = new Ficha0();
        Ubicacion ubicacion = new Ubicacion(0, 0);
        Jugada jugada = new Jugada(ficha, ubicacion);
        Estado estado = tablero.jugar(jugada);

        Assert.assertEquals(new EstadoTexto("OK"), estado);

        ficha = new FichaX();
        ubicacion = new Ubicacion(0, 0);
        jugada = new Jugada(ficha, ubicacion);
        estado = tablero.jugar(jugada);

        tablero.render();

        Assert.assertEquals(new EstadoTexto("NotOk"), estado);
    }

    //gana jugador X con 3 en línea superior

    //Assert.assertEquals(new EstadoTexto("GANO X"), estado);
    //interfaz de resolutor, yo implemento el resolutor que sea la linea de arriba solamente. El tablero ejecuta el resolutor para ver si esta en estaso gano X
    
    @Test
    public void test_case_tablero_Resolutor_3X_LineaSuperior() {
        Presenter presenter = new ConsolePresenterMejorado();
        Tablero tablero = new TableroArrays(presenter);
        
        Ficha ficha = new FichaX();
        Ubicacion ubicacion = new Ubicacion(0, 0);
        Jugada jugada = new Jugada(ficha, ubicacion);
        IResolutor resolutor = new ResolutorLineaSuperiorX();
        Estado estado = tablero.jugar(jugada);
        Assert.assertEquals(new EstadoTexto("OK"), estado);
        estado = tablero.evaluar(resolutor);
        Assert.assertEquals(new EstadoTexto("SIGA JUGANDO"), estado);

        ficha = new FichaX();
        ubicacion = new Ubicacion(0, 1);
        jugada = new Jugada(ficha, ubicacion);
        estado = tablero.jugar(jugada);
        Assert.assertEquals(new EstadoTexto("OK"), estado);
        estado = tablero.evaluar(resolutor);
        Assert.assertEquals(new EstadoTexto("SIGA JUGANDO"), estado);
        
        ficha = new FichaX();
        ubicacion = new Ubicacion(0, 2);
        jugada = new Jugada(ficha, ubicacion);
        estado = tablero.jugar(jugada);
        Assert.assertEquals(new EstadoTexto("OK"), estado);
        estado = tablero.evaluar(resolutor);
        Assert.assertEquals(new EstadoTexto("GANO X"), estado);
        
        tablero.render();

        
    }
    
    /*
     * Esta horrible como solucione
     * Los equals y hashCode me bajan la cobertura, como mejorar eso 
     */
    
}
