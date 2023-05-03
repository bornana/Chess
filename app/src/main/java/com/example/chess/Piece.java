package com.example.chess;

// Parent Class

public class Piece {
    private int i;
    private int j;
    public Piece(int i, int j){
        this.i = i;
        this.j = j;
    }
    public int GetI(){
        return this.i;
    }
    public int GetJ(){
        return this.j;
    }
    public void SetI(int i){
        this.i = i;
    }
    public boolean HasPiece(){
        return false;
    }
    public boolean CanMove(int i, int j){
        return false;
    }
}
