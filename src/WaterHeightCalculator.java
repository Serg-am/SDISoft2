import java.util.*;

public class WaterHeightCalculator {

    public int[][] calculateWaterHeights(int[][] heightMap) {

        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return new int[0][0];
        }

        int m = heightMap.length;
        int n = heightMap[0].length;
        int[][] waterMap = new int[m][n];
        PriorityQueue<Cell> queue = new PriorityQueue<>();
        boolean[][] visited = new boolean[m][n];

        // Добавляем граничные клетки
        for (int i = 0; i < m; i++) {
            queue.offer(new Cell(i, 0, heightMap[i][0])); // Добавляем левую границу
            queue.offer(new Cell(i, n - 1, heightMap[i][n - 1])); // Добавляем правую границу
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int j = 1; j < n - 1; j++) {
            queue.offer(new Cell(0, j, heightMap[0][j])); // Добавляем верхнюю границу
            queue.offer(new Cell(m - 1, j, heightMap[m - 1][j])); // Добавляем нижнюю границу
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        // Обход в ширину
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        while (!queue.isEmpty()) {
            Cell cell = queue.poll(); // Извлекаем клетку с наименьшей высотой
            for (int[] dir : dirs) {
                int newRow = cell.row + dir[0]; // Вычисляем координату строки соседней клетки
                int newCol = cell.column + dir[1]; // Вычисляем координату столбца соседней клетки
                // Находится ли новая клетка в пределах карты и была ли она уже посещена
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    int height = Math.max(cell.height, heightMap[newRow][newCol]);
                    if (height > heightMap[newRow][newCol]) {
                        // Если максимальная высота больше высоты текущей клетки, вычисляем высоту воды
                        waterMap[newRow][newCol] = height - heightMap[newRow][newCol] + 1;
                    }
                    queue.offer(new Cell(newRow, newCol, height));
                }
            }
        }

        // Проверяем наличие "дырок"
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (heightMap[i][j] == 0) {
                    if (flooding(waterMap, i, j)) {
                        return new int[m][n];
                    }
                }
            }
        }

        return waterMap;
    }

    // Затопление
    private boolean flooding(int[][] waterMap, int row, int column) {
        // Проверяем, не вышли ли мы за границы карты
        if (row < 0 || row >= waterMap.length || column < 0 || column >= waterMap[0].length) {
            return true; // Достигли границы
        }
        if (waterMap[row][column] == 0) {
            return false; // Уже посещена или нет воды
        }

        waterMap[row][column] = 0; // Удаляем воду
        // Рекурсивно заливаем соседние клетки
        boolean reachesBorder = flooding(waterMap, row - 1, column) ||
                flooding(waterMap, row + 1, column) ||
                flooding(waterMap, row, column - 1) ||
                flooding(waterMap, row, column + 1);
        return reachesBorder; // Возвращаем true, если достигли границы
    }

    public void printHeightMap(int[][] map) {
        for (int[] row : map) {
            for (int height : row) {
                System.out.print(height + " ");
            }
            System.out.println();
        }
    }

    private class Cell implements Comparable<Cell> {
        int row, column, height;

        Cell(int row, int column, int height) {
            this.row = row;
            this.column = column;
            this.height = height;
        }

        @Override
        public int compareTo(Cell other) {
            return this.height - other.height;
        }
    }
}