package com.mercadolibre.dojos;

public class TableroBuilder {
    Presenter presenter;

    public TableroBuilder withPresenter(Presenter presenter) {
        this.presenter = presenter;
        return this;
    }

    public Tablero build() {
        return new TableroArrays(presenter);
    }
}
