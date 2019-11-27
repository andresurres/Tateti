package com.mercadolibre.dojos;

public class TableroArrays implements Tablero,Seteable {
    Presenter presenter;

    Ficha grid[][]=new Ficha [3][3];

    public TableroArrays(Presenter presenter) {
        this.presenter = presenter;
        init();
    }

    private void init() {
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j] = new FichaVacia();            }
        }
    }

    @Override
    public void render() {
        presenter.render(grid);
    }

    @Override
    public Estado jugar(Jugada jugada){

        return jugada.jugar(this);

        /*
        Ubicacion ubicacion = jugada.getUbicacion();
        Ficha ficha = jugada.getFicha();

        grid[ubicacion.getX()][ubicacion.getY()] = ficha;

        return new EstadoTexto("Ok");
        */
    }

    public Estado set(int x, int y, Ficha ficha){
        /*grid[x][y] = ficha;

        return new EstadoTexto("Ok");*/
    	//if(new FichaVacia().equals(grid[x][y])) {
    	if(grid[x][y].asignable()) {
        	grid[x][y] = ficha;
        	return new EstadoTexto("Ok");
        }else {
        	return new EstadoTexto("NotOk");
        }
    }

	@Override
	public Estado evaluar(IResolutor resolutor) {
		return resolutor.evaluar(grid);
	}

	@Override
	public boolean has(Ubicacion ubicacion, Ficha ficha) {
		 return grid[ubicacion.getX()][ubicacion.getY()].equals(ficha);		
	}

}
