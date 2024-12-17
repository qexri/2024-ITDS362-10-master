/* Copyright (C) 2024 
Jirawat	Ornsri, Chonthicha Preecharak
Preyaporn Tangsri, Sukkamit Sinarpa
Unchitta Aryuyong, Aorakanya Intrapreeda 
- All Rights Reserved * You may use, distribute and modify this code under the terms of the MIT license. */

package com.github.salif.tetris;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


import static org.junit.jupiter.api.Assertions.*;

public class GameBoardPanelTest {

    private static final int BoardWidth = 10;
    private static final int BoardHeight = 20;
    private GameBoardPanel gameBoardPanel;

    @BeforeEach
    void setUp() {
        gameBoardPanel = new GameBoardPanel(null, null, 300);
    }

    // Method to access the private method atomIsMovable using reflection
    private boolean invokeAtomIsMovable(Tetromino chkBlock, int chkX, int chkY, boolean flag) throws Exception {
        Method method = GameBoardPanel.class.getDeclaredMethod("atomIsMovable", Tetromino.class, int.class, int.class, boolean.class);
        method.setAccessible(true);
        return (boolean) method.invoke(gameBoardPanel, chkBlock, chkX, chkY, flag);
    }

    /*------------------------------------------------Test suit10: testAtomIsMovable------------------------------------------------*/
    // Interface-based
    @Test
    void testAtomIsMovableWithNoBlockOutOfBoundsNegativeXandY() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.NO_BLOCK);
        int chkX = -1;
        int chkY = -1;
        boolean flag = true;

        assertFalse(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: false
    }

    @Test
    void testAtomIsMovableWithZShapeAtOrigin() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.Z_SHAPE);
        int chkX = 0;
        int chkY = 0;
        boolean flag = false;

        assertFalse(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: false
    }

    @Test
    void testAtomIsMovableWithSShapeInBounds() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.S_SHAPE);
        int chkX = 1;
        int chkY = 1;
        boolean flag = false;

        assertTrue(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: true
    }

    @Test
    void testAtomIsMovableWithIShapeOutOfBoundsNegativeX() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.I_SHAPE);
        int chkX = -1;
        int chkY = 0;
        boolean flag = true;

        assertFalse(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: false
    }

    @Test
    void testAtomIsMovableWithTShapeOutOfBoundsNegativeY() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.T_SHAPE);
        int chkX = 0;
        int chkY = -1;
        boolean flag = true;

        assertFalse(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: false
    }

    @Test
    void testAtomIsMovableWithOShapeInBoundsPositiveY() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.O_SHAPE);
        int chkX = 0;
        int chkY = 1;
        boolean flag = true;

        assertTrue(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: true
    }

    @Test
    void testAtomIsMovableWithLShapeInBoundsPositiveX() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.L_SHAPE);
        int chkX = 1;
        int chkY = 0;
        boolean flag = false;

        assertFalse(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: false
    }

    @Test
    void testAtomIsMovableWithJShapeInBounds() throws Exception {
        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.J_SHAPE);
        int chkX = 1;
        int chkY = 1;
        boolean flag = true;

        assertTrue(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: true
    }

    // Method to set a block in gameBoard using reflection
    private void setGameBoardBlock(int x, int y, Tetrominoes shape) throws Exception {
        Field field = GameBoardPanel.class.getDeclaredField("gameBoard");
        field.setAccessible(true);
        Tetrominoes[] gameBoard = (Tetrominoes[]) field.get(gameBoardPanel);
        gameBoard[x + y * BoardWidth] = shape;
    }

    // Functionality-based
    @Test
    void testAtomIsMovableWithBlockInPositionT1() throws Exception {
        // กำหนดบล็อกที่ตำแหน่ง (5,5) เป็นบล็อกประเภท I_SHAPE
        setGameBoardBlock(5, 5, Tetrominoes.I_SHAPE);

        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.T_SHAPE);
        int chkX = 5;
        int chkY = 5;
        boolean flag = true;

        assertFalse(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: false
    }

    @Test
    void testAtomIsMovableWithoutBlockInPositionT2() throws Exception {
        // ตรวจสอบให้แน่ใจว่าไม่มีบล็อกที่ตำแหน่ง (5,5)
        setGameBoardBlock(5, 5, Tetrominoes.NO_BLOCK);

        Tetromino chkBlock = new Tetromino();
        chkBlock.setShape(Tetrominoes.T_SHAPE);
        int chkX = 5;
        int chkY = 5;
        boolean flag = true;

        assertTrue(invokeAtomIsMovable(chkBlock, chkX, chkY, flag)); // Expected: true
    }

}
