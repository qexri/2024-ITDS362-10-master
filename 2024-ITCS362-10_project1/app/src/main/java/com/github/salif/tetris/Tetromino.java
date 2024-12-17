package com.github.salif.tetris;

import java.util.Random;

public class Tetromino {

    private Tetrominoes tetrominoes;
    private final int coords[][]; // current shape of a tetromino
    private final int tetrominoTable[][][];

    public Tetromino() {
        coords = new int[4][2];
        tetrominoTable = new int[][][]{
            {{0, 0}, {0, 0}, {0, 0}, {0, 0}}, // NO_BLOCK
            {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}}, // Z_SHAPE
            {{0, -1}, {0, 0}, {1, 0}, {1, 1}}, // S_SHAPE
            {{0, -1}, {0, 0}, {0, 1}, {0, 2}}, // I_SHAPE
            {{-1, 0}, {0, 0}, {1, 0}, {0, 1}}, // T_SHAPE
            {{0, 0}, {1, 0}, {0, 1}, {1, 1}}, // O_SHAPE
            {{-1, -1}, {0, -1}, {0, 0}, {0, 1}}, // L_SHAPE
            {{1, -1}, {0, -1}, {0, 0}, {0, 1}} // J_SHAPE
        };

        setShape(Tetrominoes.NO_BLOCK);
    }

    // set tetromino shape
    final void setShape(Tetrominoes tetromino) {

        for (int i = 0; i < coords.length; i++) {
            System.arraycopy(tetrominoTable[tetromino.ordinal()][i], 0, coords[i], 0, coords[i].length);
        }

        tetrominoes = tetromino;
    }

    public void setRandomShape() {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;
        setShape(Tetrominoes.values()[x]);
    }

    public Tetrominoes getShape() {
        return tetrominoes;
    }

    // coordinate transform functions
    public void setX(int idx, int x) {
        coords[idx][0] = x;
    }

    public void setY(int idx, int y) {
        coords[idx][1] = y;
    }

    public int getX(int idx) {
        return coords[idx][0];
    } //test6

    public int getY(int idx) {
        return coords[idx][1];
    } //test7

    public int minX() {
        if (tetrominoes == Tetrominoes.NO_BLOCK) {
            return -1;  // ถ้า tetrominoes เป็น NO_BLOCK, คืนค่า -1
        }
        int ret = coords[0][0]; // เริ่มต้น ret ด้วยพิกัดแรก
        for (int[] coord : coords) {
            ret = Math.min(ret, coord[0]); // หาค่าต่ำสุด
        }
        return ret;
    }

    public int minY() {
        if (tetrominoes == Tetrominoes.NO_BLOCK) {
            return -1; // ถ้า tetrominoes เป็น NO_BLOCK, คืนค่า -1
        }
        int ret = coords[0][1]; // เริ่มต้น ret ด้วยพิกัดแรก
        for (int[] coord : coords) {
            ret = Math.min(ret, coord[1]); // หาค่าต่ำสุด
        }
        return ret;
    }

    // rotate a tetromino
    public Tetromino rotateLeft() {//test9
        if (tetrominoes == Tetrominoes.O_SHAPE) {
            return this;
        }

        Tetromino ret = new Tetromino();
        ret.tetrominoes = tetrominoes;

        for (int i = 0; i < coords.length; i++) {
            ret.setX(i, getY(i));
            ret.setY(i, -getX(i));
        }

        return ret;
    }

    public Tetromino rotateRight() { //test10
        if (tetrominoes == Tetrominoes.O_SHAPE) {
            return this;
        }

        Tetromino ret = new Tetromino();
        ret.tetrominoes = tetrominoes;

        for (int i = 0; i < coords.length; i++) {
            ret.setX(i, -getY(i));
            ret.setY(i, getX(i));
        }

        return ret;
    }
    public int[][] getCoords() {
        return this.coords; // หรือชื่อของอาร์เรย์ที่เก็บพิกัด
    }

}
