public class Main {
    public static void main(String[] args) {
        WaterHeightCalculator calculator = new WaterHeightCalculator();

        // Пример 1
        int[][] heightMap1 = {
                {2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 2, 2}
        };
        System.out.println("Пример 1:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap1));

        // Пример 2
        int[][] heightMap2 = {
                {1, 3, 4, 5},
                {4, 1, 1, 4},
                {5, 6, 7, 2}
        };
        System.out.println("\nПример 2:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap2));

        // Пример 3
        int[][] heightMap3 = {
                {1, 3, 4, 5},
                {4, 1, 0, 4},
                {5, 6, 7, 2}
        };
        System.out.println("\nПример 3:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap3));

        // Пример 4
        int[][] heightMap4 = {
                {1, 2, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 3, 1, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println("\nПример 4:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap4));


        // Пример 5
        int[][] heightMap5 = {
                {1, 1, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 3, 1, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println("\nПример 5:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap5));

        // Пример 6
        int[][] heightMap6 = {
                {1, 2, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 1, 1, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 2, 1, 1, 1}
        };
        System.out.println("\nПример 6:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap6));

        // Пример 7
        int[][] heightMap7 = {
                {1, 2, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 1, 0, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 2, 1, 1, 1}
        };
        System.out.println("\nПример 7:");
        calculator.printHeightMap(calculator.calculateWaterHeights(heightMap7));
    }
}