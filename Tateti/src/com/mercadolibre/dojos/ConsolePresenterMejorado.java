package com.mercadolibre.dojos;

public class ConsolePresenterMejorado  implements Presenter {
    @Override
    public void render(Ficha[][] grid) {
        System.out.println();
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print("|" + grid[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
