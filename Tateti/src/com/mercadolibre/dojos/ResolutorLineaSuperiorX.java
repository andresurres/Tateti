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

}
