/* Copyright (C) 2024 
Jirawat	Ornsri, Chonthicha Preecharak
Preyaporn Tangsri, Sukkamit Sinarpa
Unchitta Aryuyong, Aorakanya Intrapreeda 
- All Rights Reserved * You may use, distribute and modify this code under the terms of the MIT license. */

package com.github.salif.tetris;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Arrays;

public class TetrominoTest {

    private Tetromino tetromino;
    @BeforeEach
    public void setUp() {
        tetromino = new Tetromino();
    }

    /*------------------------------------------------Test suit1: testSetRandomShape------------------------------------------------*/
    // Interface-based
    @Test
    public void testSetRandomShape() {
        int x = 8;
        // ตรวจสอบว่าเกิดข้อผิดพลาด
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.setShape(Tetrominoes.values()[x]);
        }, "Test T2 Failed: Expected an ArrayIndexOutOfBoundsException for x = 8");
    }

    // Functionality-based
    @Test
    public void testSetRandomShape_T1() {
        int x = 1;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.Z_SHAPE, tetromino.getShape());
    }

    @Test
    public void testSetRandomShape_T2() {
        int x = 2;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.S_SHAPE, tetromino.getShape());
    }

    @Test
    public void testSetRandomShape_T3() {
        int x = 3;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.I_SHAPE, tetromino.getShape());
    }

    @Test
    public void testSetRandomShape_T4() {
        int x = 4;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.T_SHAPE, tetromino.getShape());
    }

    @Test
    public void testSetRandomShape_T5() {
        int x = 5;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.O_SHAPE, tetromino.getShape());
    }

    @Test
    public void testSetRandomShape_T6() {
        int x = 6;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.L_SHAPE, tetromino.getShape());
    }

    @Test
    public void testSetRandomShape_T7() {
        int x = 7;
        tetromino.setShape(Tetrominoes.values()[x]);
        assertEquals(Tetrominoes.J_SHAPE, tetromino.getShape());
    }

    /*------------------------------------------------Test suit2: testGetShape------------------------------------------------*/
    @Test
    public void testGetShape() {
        // Interface-based
        // Test Case T1: ไม่เซ็ทค่า tetrominoes
        assertEquals(Tetrominoes.NO_BLOCK, tetromino.getShape());

        // Test Case T1: เซ็ทค่า tetrominoes
        tetromino.setShape(Tetrominoes.T_SHAPE);
        assertEquals(Tetrominoes.T_SHAPE, tetromino.getShape(), "T2 Failed: Expected T_SHAPE");


        // Functionality-based
        // Test Case T1: NO_BLOCK
        tetromino.setShape(Tetrominoes.NO_BLOCK);
        assertEquals(Tetrominoes.NO_BLOCK, tetromino.getShape(), "T1 Failed: Expected NO_BLOCK");

        // Test Case T2: Z_SHAPE
        tetromino.setShape(Tetrominoes.Z_SHAPE);
        assertEquals(Tetrominoes.Z_SHAPE, tetromino.getShape(), "T2 Failed: Expected Z_SHAPE");

        // Test Case T3: S_SHAPE
        tetromino.setShape(Tetrominoes.S_SHAPE);
        assertEquals(Tetrominoes.S_SHAPE, tetromino.getShape(), "T3 Failed: Expected S_SHAPE");

        // Test Case T4: I_SHAPE
        tetromino.setShape(Tetrominoes.I_SHAPE);
        assertEquals(Tetrominoes.I_SHAPE, tetromino.getShape(), "T4 Failed: Expected I_SHAPE");

        // Test Case T5: T_SHAPE
        tetromino.setShape(Tetrominoes.T_SHAPE);
        assertEquals(Tetrominoes.T_SHAPE, tetromino.getShape(), "T5 Failed: Expected T_SHAPE");

        // Test Case T6: O_SHAPE
        tetromino.setShape(Tetrominoes.O_SHAPE);
        assertEquals(Tetrominoes.O_SHAPE, tetromino.getShape(), "T6 Failed: Expected O_SHAPE");

        // Test Case T7: L_SHAPE
        tetromino.setShape(Tetrominoes.L_SHAPE);
        assertEquals(Tetrominoes.L_SHAPE, tetromino.getShape(), "T7 Failed: Expected L_SHAPE");

        // Test Case T8: J_SHAPE
        tetromino.setShape(Tetrominoes.J_SHAPE);
        assertEquals(Tetrominoes.J_SHAPE, tetromino.getShape(), "T8 Failed: Expected J_SHAPE");
    }
    /*------------------------------------------------Test suit 3: testSetX------------------------------------------------*/
    // Function to check setting X of Tetromino
    private void checkSetX(Tetromino tetromino, int idx, int x, Integer expectedX, boolean shouldThrowException) {
        if (shouldThrowException) {
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                tetromino.setX(idx, x);
            });
        } else {
            tetromino.setX(idx, x);
            assertEquals(expectedX, tetromino.getCoords()[idx][0], "Failed to set x at index " + idx);
        }
    }

    // Interface-based tests
    @Test
    public void testSetX_Interface() {
        Tetromino tetromino = new Tetromino();

        // Test T1: Set x to 0 at index 0
        checkSetX(tetromino, 0, 0, 0, false);

        // Test T2: Set x to -1 at index 0
        checkSetX(tetromino, 0, -1, -1, false);

        // Test T3: Set x to 3 at index 0
        checkSetX(tetromino, 0, 3, 3, false);

        // Test T4: Set x at index -1 (should throw exception)
        checkSetX(tetromino, -1, 0, 0, true);

        // Test T5: Set x at index 2 (assuming coords has at least 3 elements, should set without exception)
        checkSetX(tetromino, 2, 0, 0, false);
    }

    // Functionality-based tests
    @Test
    public void testSetX_Functionality() {
        Tetromino tetromino = new Tetromino();

        // Test T1: Set x at index 0 (valid index)
        checkSetX(tetromino, 0, 5, 5, false);

        // Test T2: Set x at index 5 (invalid index, assuming coords length is <= 4)
        checkSetX(tetromino, 5, 0, null, true);
    }
    /*------------------------------------------------Test suit 4: testSetY------------------------------------------------*/
    // Function to check setting Y of Tetromino
    private void checkSetY(Tetromino tetromino, int idx, int y, Integer expectedY, boolean shouldThrowException) {
        if (shouldThrowException) {
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                tetromino.setY(idx, y);
            });
        } else {
            tetromino.setY(idx, y);
            assertEquals(expectedY, tetromino.getCoords()[idx][1], "Failed to set y at index " + idx);
        }
    }

    // Interface-based tests
    @Test
    public void testSetY_Interface() {
        Tetromino tetromino = new Tetromino();

        // Test T1: Set y to 0 at index 0
        checkSetY(tetromino, 0, 0, 0, false);

        // Test T2: Set y to -1 at index 0
        checkSetY(tetromino, 0, -1, -1, false);

        // Test T3: Set y to 3 at index 0
        checkSetY(tetromino, 0, 3, 3, false);

        // Test T4: Set y at index -1 (should throw exception)
        checkSetY(tetromino, -1, 0, 0, true);

        // Test T5: Set y at index 2 (assuming coords has at least 3 elements, should set without exception)
        checkSetY(tetromino, 2, 0, 0, false);
    }

    // Functionality-based tests
    @Test
    public void testSetY_Functionality() {
        Tetromino tetromino = new Tetromino();

        // Test T1: Set y at index 0 (valid index)
        checkSetY(tetromino, 0, 5, 5, false);

        // Test T2: Set y at index 5 (invalid index, assuming coords length is <= 4)
        checkSetY(tetromino, 5, 0, null, true);
    }
    /*------------------------------------------------Test suit 5: testGetX------------------------------------------------*/
// Function to check the X coordinate of Tetromino at the given index
    private void checkGetX(Tetromino tetromino, int idx, int expected) {
        int actual = tetromino.getX(idx);
        System.out.println("Index: " + idx + ", Expected X: " + expected + ", Actual X: " + actual);
        assertEquals(expected, actual);
    }

    // Interface-based tests
    @Test
    public void testGetX_Interface() {
        Tetromino tetromino = new Tetromino();
        tetromino.setShape(Tetrominoes.Z_SHAPE);

        // Test T1: idx < 0 (out of bounds)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.getX(-1);
        });

        // Test T2: idx = 2 (in bounds)
        checkGetX(tetromino, 2, tetromino.getCoords()[2][0]);

        // Test T3: idx > max index (out of bounds)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.getX(5);
        });
    }

    // Functionality-based tests
    @Test
    public void testGetX_Functionality() {
        Tetromino tetromino = new Tetromino();

        // Test T1: idx within bounds (idx = 2)
        tetromino.setShape(Tetrominoes.O_SHAPE);
        checkGetX(tetromino, 2, tetromino.getCoords()[2][0]);

        // Test T2: idx out of bounds (idx = 5)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.getX(5);
        });
    }

    /*------------------------------------------------Test suit 6: testGetY------------------------------------------------*/
// Function to check the Y coordinate of Tetromino at the given index
    private void checkGetY(Tetromino tetromino, int idx, int expected) {
        int actual = tetromino.getY(idx);
        System.out.println("Index: " + idx + ", Expected Y: " + expected + ", Actual Y: " + actual);
        assertEquals(expected, actual);
    }

    // Interface-based tests
    @Test
    public void testGetY_Interface() {
        Tetromino tetromino = new Tetromino();
        tetromino.setShape(Tetrominoes.Z_SHAPE);

        // Test T1: idx < 0 (out of bounds)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.getY(-1);
        });

        // Test T2: idx = 2 (in bounds)
        checkGetY(tetromino, 2, tetromino.getCoords()[2][1]);

        // Test T3: idx > max index (out of bounds)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.getY(5);
        });
    }

    // Functionality-based tests
    @Test
    public void testGetY_Functionality() {
        Tetromino tetromino = new Tetromino();

        // Test T1: idx within bounds (idx = 2)
        tetromino.setShape(Tetrominoes.O_SHAPE);
        checkGetY(tetromino, 2, tetromino.getCoords()[2][1]);

        // Test T2: idx out of bounds (idx = 5)
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tetromino.getY(5);
        });
    }

    /*------------------------------------------------Test suit 7: testMinX------------------------------------------------*/
// Function to check the minX of Tetromino
    private void checkMinX(Tetromino tetromino, String shapeName, int expected) {
        tetromino.setShape(Tetrominoes.valueOf(shapeName));
        int actual = tetromino.minX();
        assertEquals(expected, actual);
    }

    // Interface-based tests
    @Test
    public void testMinX_Interface() {
        Tetromino tetromino = new Tetromino();

        // Test T1: NO_BLOCK
        tetromino.setShape(Tetrominoes.NO_BLOCK);
        checkMinX(tetromino, "NO_BLOCK", -1);

        // Test T2: Z_SHAPE
        tetromino.setShape(Tetrominoes.Z_SHAPE);
        checkMinX(tetromino, "Z_SHAPE", -1);

        // Test T3: S_SHAPE
        tetromino.setShape(Tetrominoes.S_SHAPE);
        checkMinX(tetromino, "S_SHAPE", 0);

        // Test T4: I_SHAPE
        tetromino.setShape(Tetrominoes.I_SHAPE);
        checkMinX(tetromino, "I_SHAPE", 0);

        // Test T5: T_SHAPE
        tetromino.setShape(Tetrominoes.T_SHAPE);
        checkMinX(tetromino, "T_SHAPE", -1);

        // Test T6: O_SHAPE
        tetromino.setShape(Tetrominoes.O_SHAPE);
        checkMinX(tetromino, "O_SHAPE", 0);

        // Test T7: L_SHAPE
        tetromino.setShape(Tetrominoes.L_SHAPE);
        checkMinX(tetromino, "L_SHAPE", -1);

        // Test T8: J_SHAPE
        tetromino.setShape(Tetrominoes.J_SHAPE);
        checkMinX(tetromino, "J_SHAPE", 0);
    }


    // Functionality-based tests
    @Test
    public void testMinX_Functionality() {
        Tetromino tetromino = new Tetromino();

        // Test T1: O_SHAPE (Symmetrical shape)
        checkMinX(tetromino, "O_SHAPE", 0);
        // Test T2: Z_SHAPE (Asymmetrical shape)
        checkMinX(tetromino, "Z_SHAPE", -1);
        // Test T3: NO_BLOCK (Invalid shape)
        checkMinX(tetromino, "NO_BLOCK", -1);
    }


    /*------------------------------------------------Test suit8: testRotateLeft------------------------------------------------*/
    // ฟังก์ชันที่ใช้เพื่อเข้าถึงฟิลด์ private 'coords'
    private int[][] getPrivateCoords(Tetromino tetromino) {
        try {
            Field coordsField = Tetromino.class.getDeclaredField("coords");
            coordsField.setAccessible(true);
            return (int[][]) coordsField.get(tetromino);
        } catch (Exception e) {
            throw new RuntimeException("Unable to access private field 'coords'", e);
        }
    }

    // ฟังก์ชันที่ใช้ตรวจสอบการหมุนและพิกัดที่คาดหวัง
    private void checkLeftRotation(Tetrominoes shape, int[][] expectedCoords, String message) {
        Tetromino tetromino = new Tetromino();
        tetromino.setShape(shape);
        Tetromino rotatedTetromino = tetromino.rotateLeft();
        assertArrayEquals(expectedCoords, getPrivateCoords(rotatedTetromino), message);
    }

    //Interface-based and Functionality-based
    @Test
    public void testRotateLeft() {
        checkLeftRotation(Tetrominoes.NO_BLOCK, new int[][]{{0, 0}, {0, 0}, {0, 0}, {0, 0}}, "NO_BLOCK should not change after rotation");
        checkLeftRotation(Tetrominoes.Z_SHAPE, new int[][]{{-1, 0}, {0, 0}, {0, 1}, {1, 1}}, "Z_SHAPE rotated coordinates are incorrect");
        checkLeftRotation(Tetrominoes.S_SHAPE, new int[][]{{-1, 0}, {0, 0}, {0, -1}, {1, -1}}, "S_SHAPE rotated coordinates are incorrect");
        checkLeftRotation(Tetrominoes.I_SHAPE, new int[][]{{-1, 0}, {0, 0}, {1, 0}, {2, 0}}, "I_SHAPE rotated coordinates are incorrect");
        checkLeftRotation(Tetrominoes.T_SHAPE, new int[][]{{0, 1}, {0, 0}, {0, -1}, {1, 0}}, "T_SHAPE rotated coordinates are incorrect");
        checkLeftRotation(Tetrominoes.O_SHAPE, new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}}, "O_SHAPE should not change after rotation");
        checkLeftRotation(Tetrominoes.L_SHAPE, new int[][]{{-1, 1}, {-1, 0}, {0, 0}, {1, 0}}, "L_SHAPE rotated coordinates are incorrect");
        checkLeftRotation(Tetrominoes.J_SHAPE, new int[][]{{-1, -1}, {-1, 0}, {0, 0}, {1, 0}}, "J_SHAPE rotated coordinates are incorrect");
    }

    /*------------------------------------------------Test suit9: testRotateRight------------------------------------------------*/
    // ฟังก์ชันที่ใช้ตรวจสอบการหมุนและพิกัดที่คาดหวัง
    private void checkRotation(Tetrominoes shape, int[][] expectedCoords, String message) {
        Tetromino tetromino = new Tetromino();
        tetromino.setShape(shape);
        Tetromino rotatedTetromino = tetromino.rotateRight();
        assertArrayEquals(expectedCoords, getPrivateCoords(rotatedTetromino), message);
    }

    //Interface-based and Functionality-based
    @Test
    public void testRotateRight() {
        checkRotation(Tetrominoes.NO_BLOCK, new int[][]{{0, 0}, {0, 0}, {0, 0}, {0, 0}}, "NO_BLOCK should not change after rotation");
        checkRotation(Tetrominoes.Z_SHAPE, new int[][]{{1, 0}, {0, 0}, {0, -1}, {-1, -1}}, "Z_SHAPE rotated coordinates are incorrect");
        checkRotation(Tetrominoes.S_SHAPE, new int[][]{{1, 0}, {0, 0}, {0, 1}, {-1, 1}}, "S_SHAPE rotated coordinates are incorrect");
        checkRotation(Tetrominoes.I_SHAPE, new int[][]{{1, 0}, {0, 0}, {-1, 0}, {-2, 0}}, "I_SHAPE rotated coordinates are incorrect");
        checkRotation(Tetrominoes.T_SHAPE, new int[][]{{0, -1}, {0, 0}, {0, 1}, {-1, 0}}, "T_SHAPE rotated coordinates are incorrect");
        checkRotation(Tetrominoes.O_SHAPE, new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}}, "O_SHAPE should not change after rotation");
        checkRotation(Tetrominoes.L_SHAPE, new int[][]{{1, -1}, {1, 0}, {0, 0}, {-1, 0}}, "L_SHAPE rotated coordinates are incorrect");
        checkRotation(Tetrominoes.J_SHAPE, new int[][]{{1, 1}, {1, 0}, {0, 0}, {-1, 0}}, "J_SHAPE rotated coordinates are incorrect");
    }

}



