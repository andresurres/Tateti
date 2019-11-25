package com.mercadolibre.dojos;

public class EstadoTexto implements Estado {
    final String estado;

    public EstadoTexto(String estado) {
        this.estado = estado;
    }

    @Override
    public void render() {

    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		return result;
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadoTexto other = (EstadoTexto) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		return true;
	}
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoTexto that = (EstadoTexto) o;
        return estado.equalsIgnoreCase(that.estado);
    }
    /*
    @Override
    public int hashCode() {
        return Objects.hash(estado);
    }*/
    
}
