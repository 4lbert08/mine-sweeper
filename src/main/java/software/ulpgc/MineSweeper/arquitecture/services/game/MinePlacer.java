package software.ulpgc.MineSweeper.arquitecture.services.game;

import software.ulpgc.MineSweeper.arquitecture.model.Cell;

import java.util.Random;

public class MinePlacer {

    public Cell[][] placeMines(Cell[][] cells, int mineCount) {
        int rows = cells.length;
        int columns = cells[0].length;
        Random random = new Random();

        int placedMines = 0;
        while (placedMines < mineCount) {
            int x = random.nextInt(rows);
            int y = random.nextInt(columns);

            if (!cells[x][y].hasMine()) {
                cells[x][y] = new Cell(true, false, false, 0);
                placedMines++;
            }
        }

        return cells;
    }
}
