package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		// A posição por padrão no java ja é null, porém para ficar didatico foi expecificada. 
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}
