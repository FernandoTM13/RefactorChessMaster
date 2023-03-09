package chessboard_entities;

import junit.framework.TestCase;
import controllerchess.*;

public class testChessMaster extends TestCase{

private ChessGameBoard chessgameboard;
	
	private ChessGameLog chessgameLog;
	
	public void instanciaTest() {
		chessgameboard = new ChessGameBoard();
		
		chessgameLog = new ChessGameLog();
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
