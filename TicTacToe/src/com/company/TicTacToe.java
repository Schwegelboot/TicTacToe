public class TicTacToe {

	private int ROWS = 3;
	private int COLS = 3;

	public enum Player {
		Unknown, X, O
	}

	public Player[][] board;
	private Player currentPlayer;
	private Player winner; //X, O, Unknown, null

	public TicTacToe() {
		initialiazeBoard();
		this.currentPlayer = Player.X;
		this.winner = null;
	}

	public void initialiazeBoard() {
		this.board = new Player[ROWS][COLS];
		for(int i=0; i<ROWS; i++){
			for(int j=0; j<COLS; j++){
				this.board[i][j] = Player.Unknown;
			}
		}
	} 

	public boolean isBoardEmpty(){
		boolean result = true;
		for(int i=0; i<ROWS; i++){
			for(int j=0; j<COLS; j++){
				if(this.board[i][j] != Player.Unknown){
					result = false;
				}
			}
		}
		return result;
	}
	
	public boolean isGameWon() {
		if(this.winner == null || this.winner == Player.Unknown) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isDraw() {
		boolean result = false;
		
		//Überprüfung ob Board voll, wenn Ergebnis true liefert ist Board voll
		for(int i=0; i<this.board.length; i++){
			for(int j=0; j<this.board[i].length; j++){
				if(this.board[i][j] == Player.Unknown){
					result = false;
				} else {
					result = true;
				}
			}
		}
		
		
		//Überprüfung ob ein Spieler gewonnen hat -> falls true -> result = false;
		
		//Überprüfung ob Reihe gewonnen
		for(int i=0; i<this.board.length; i++) {
			
			if(this.board[i][0] == this.board[i][1] && this.board[i][0] == this.board[i][2] && this.board[i][0] != Player.Unknown) {
				result = false;
				
			} else {
				result = true;
			}
			
		}
		
		//Überprüfung ob Spalte gewonnen
		for(int i=0; i<board.length; i++) {
			if(this.board[i][0] == this.board[i][1] && this.board[i][0] == this.board[i][2] && this.board[i][0] != Player.Unknown) {
				result = false;
			} else {
				result = true;
			}
		}
		
		//Überprüfung ob diagonal gewonnen
		if(this.board[0][0] == this.board[1][1] && this.board[0][0] == this.board[2][2] && this.board[0][0] != Player.Unknown) {
			result = false;
		} else {
			result = true;
		}
		
		if(this.board[0][2] == this.board[1][1] && this.board[0][2] == this.board[2][0] && this.board[0][2] != Player.Unknown) {
			result = false;
		} else {
			result = true;
		}
		
		
		return result;
	}

	public Player getWinner() {
		return winner;		
	}

	public boolean isGameOver() {
		/*Itariert über Gitter und überprüft ob ein Spieler gewonnen hat, setzt Gewinner. Falls alle Felder besetzt aber kein Gewinner: winner = Unknown;
		*return = exisitiert Gewinnner? ja/nein if(winner)== null -> false (isGameWon())
		*
		*
		*
		*
		*
		*
		*
		*/
		
		
		
		
		
		

		return true;
	}

	public void play(int row, int col) {
		
		//Überprüfen ob noch gespielt werden kann
		if(isGameOver() == false) {
			
			//Überprüfen ob gewählte Koordinaten nicht Gittergröße übersteigen
			if(row < 4 && col < 4){
				
				//spielen
				//Überprüfen ob Platz bereits belegt
				if(this.board[row][col] == Player.Unknown) {
					this.board[row][col] = this.currentPlayer;
				} else {
					throw new RuntimeException("Dieses Feld ist bereits belegt, bitte wähle ein anderes.");
				}
				
				//Falls Methode nicht verlassen wird wenn RuntimeException("Dieses Feld ist bereits belegt, bitte wähle ein anderes.") geworfen 
				//wird muss zusätzliche Logik eingebaut werden, die Methode an dieser Stelle verlässt
				
				//Überprüfen ob Zug Spiel beendet hat
				if(isGameOver() == false) {
					//switch Player
					if(this.currentPlayer == Player.X) {
						this.currentPlayer = Player.O;
					} else {
						this.currentPlayer = Player.X;
					}
				} else {
					/*Spiel wurde gewonnen:
					 * Falls durch den Zug eine Zeile, eine Spalte oder eine Diagonale des Gitters 3 Zeichen des gleichen Spielers enthält, 
					 * hat der aktuelle Spieler gewonnen. Dann muss der Spielstand aktualisiert werden (X hat ge-wonnen, O hat gewonnen, 
					 * unentschieden).
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 */
					
					
					
					
				}
				
	
			} else {
				throw new RuntimeException("Koordinaten liegen außerhalb des Gitters.");
			}
			
		} else {
			throw new RuntimeException("Das Spiel wurde bereits beendet!");
		}
			
	}

	public Player getCurrentPlayer() {
		return this.currentPlayer;		
	}
	
	/*
	 * Zusätzliche Methoden
	 */
	
	 public String printBoard(){
	        String strBoard = "";
	        for (int i= 0; i<ROWS;i++){
	            for (int j=0;j<COLS;j++){
	                if (j !=COLS-1)
	                    strBoard += board[i][j] + "|";
	                else
	                    strBoard += board[i][j];
	            }
	            strBoard += "\n---+---+---\n";
	        }
	        return strBoard;
	    }
}
