package chessboard_entities;

import junit.framework.TestCase;
import controllerchess.*;

public class Testchessmaster extends TestCase{

private ChessGameBoard chessgameboard;
		
	public void instanciaTest() {

		chessgameboard = new ChessGameBoard();
		
	}
	
	
	public void testgetCell(){
		instanciaTest();
		
		assertEquals(0, chessgameboard.getCell(0, 0).getRow());
	}
	
	public void testgetCell2(){
		instanciaTest();
		
		assertEquals(0, chessgameboard.getCell(0, 0).getColumn());
	}
	
	
	
}
