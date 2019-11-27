package com.mercadolibre.dojos;

public class ResolutorLineaSuperiorX implements IResolutor{

	@Override
	public Estado evaluar(Ficha [][] grid) {
		FichaX fichaX = new FichaX();
		if(fichaX.equals(grid[0][0]) && fichaX.equals(grid[0][1]) && fichaX.equals(grid[0][2])) {
			return new EstadoTexto("GANO X");
		}else {
			return new EstadoTexto("SIGA JUGANDO");
		}
	}
	
	
	public Estado evaluarcito(Tablero tablero) {
		Ubicacion upperLeft = new Ubicacion(0,0);
		Ubicacion upperMiddle = new Ubicacion(0,1);
		Ubicacion upperRigth = new Ubicacion(0,2);
		
		Ficha fichaX = new FichaX();
		if(tablero.has(upperLeft, fichaX) && tablero.has(upperMiddle, fichaX) && tablero.has(upperRigth, fichaX)) {
			return new EstadoTexto("GANO X");
		}else {
			return new EstadoTexto("SIGA JUGANDO");
		}
	}

}
