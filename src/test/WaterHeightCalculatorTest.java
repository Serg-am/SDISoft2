import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WaterHeightCalculatorTest {

    private final WaterHeightCalculator calculator = new WaterHeightCalculator();

    @Test
    void testEmptyMap() {
        int[][] emptyMap = {};
        int[][] result = calculator.calculateWaterHeights(emptyMap);
        assertArrayEquals(new int[0][0], result);
    }

    @Test
    void test1() {
        int[][] heightMap = {
                {2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 2, 2}
        };
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test2() {
        int[][] heightMap = {
                {1, 3, 4, 5},
                {4, 1, 1, 4},
                {5, 6, 7, 2}
        };
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 3, 3, 0},
                {0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test3() {
        int[][] heightMap = {
                {1, 3, 4, 5},
                {4, 1, 0, 4},
                {5, 6, 7, 2}
        };
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test4() {
        int[][] heightMap = {
                {1, 2, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 3, 1, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 1, 1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0, 0, 0, 0},
                {0, 2, 0, 3, 3, 0},
                {0, 2, 0, 3, 3, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test5() {
        int[][] heightMap = {
                {1, 1, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 3, 1, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 1, 1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 3, 3, 0},
                {0, 0, 0, 3, 3, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test6() {
        int[][] heightMap = {
                {1, 2, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 1, 1, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 2, 1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0, 0, 0, 0},
                {0, 2, 0, 2, 2, 0},
                {0, 2, 2, 2, 2, 0},
                {0, 0, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test7() {
        int[][] heightMap = {
                {1, 2, 1, 4, 4, 1},
                {2, 1, 4, 1, 1, 4},
                {2, 1, 1, 0, 1, 4},
                {1, 2, 1, 4, 4, 1},
                {1, 1, 2, 1, 1, 1}
        };
        int[][] expected = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }

    @Test
    void test8() {
        int[][] heightMap = {
                {1, 7, 7, 7, 7, 1},
                {7, 1, 1, 1, 3, 7},
                {7, 1, 2, 4, 1, 7},
                {1, 7, 1, 1, 1, 7},
                {1, 7, 7, 7, 7, 0}
        };
        int[][] expected = {
                {0, 0, 0, 0, 0, 0},
                {0, 7, 7, 7, 7, 0},
                {0, 7, 7, 7, 7, 0},
                {0, 0, 7, 7, 7, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] result = calculator.calculateWaterHeights(heightMap);
        assertArrayEquals(expected, result);
    }




}