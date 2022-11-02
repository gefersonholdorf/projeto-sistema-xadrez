package boardgame;

public class Board {
	
	Integer rows;
	Integer columns;
	
	private Piece [][] pieces;
	
	public Board() {
	}

	public Board(Integer rows, Integer columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
}
