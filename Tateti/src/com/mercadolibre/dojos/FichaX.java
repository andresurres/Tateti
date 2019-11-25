package com.mercadolibre.dojos;

public class FichaX implements Ficha{
    final String figura = " X ";

    @Override
    public String toString() {
        return figura;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((figura == null) ? 0 : figura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaX other = (FichaX) obj;
		if (figura == null) {
			if (other.figura != null)
				return false;
		} else if (!figura.equals(other.figura))
			return false;
		return true;
	}
    
    
}
