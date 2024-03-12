package de.stefanet.javachesskit.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void testSymbolParsing(){
        Piece blackQueen = Piece.fromSymbol('q');
        assertEquals('q', blackQueen.getSymbol());

        Piece whitePawn = Piece.fromSymbol('P');
        assertEquals('P', whitePawn.getSymbol());

    }

    @Test
    void testEquality(){
        Piece whiteBishop1 = new Piece(PieceType.BISHOP, Color.WHITE);
        Piece blackKing = new Piece(PieceType.KING, Color.BLACK);
        Piece whiteKing = new Piece(PieceType.KING, Color.WHITE);
        Piece whiteBishop2 = new Piece(PieceType.BISHOP, Color.WHITE);

        assertEquals(whiteBishop1, whiteBishop2);
        assertNotEquals(whiteKing, blackKing);
        assertNotEquals(whiteKing, whiteBishop1);
    }

    @Test
    void testSimpleProperties(){
        Piece whiteKnight = new Piece(PieceType.KNIGHT, Color.WHITE);

        assertEquals(Color.WHITE, whiteKnight.getColor());
        assertEquals(PieceType.KNIGHT, whiteKnight.getType());
    }

}