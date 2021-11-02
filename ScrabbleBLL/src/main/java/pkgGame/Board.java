package pkgGame;

import java.util.ArrayList;

import eNum.eBonusType;

public class Board {

	private Space[][] puzzle;
	private ArrayList<BonusSquare> bonuses = new ArrayList<BonusSquare>();

	/**
	 * Board - Constructor. Create the board, set the Space / Bonus Square for each
	 * square in the board
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	public Board() {
		SetBonus();
		puzzle = new Space[15][15];
	
		// TODO: Call SetBonus() to set the original bonus setup
		// TODO: Create the default puzzle
		// TODO: Loop through each place in the puzzle, insert a 'space' object, value
		// the BonusSquare
		for (int i =0; i<15;i++) {
			for(int j =0; j<15; j++) {
				puzzle[i][j]=new Space(findBonus(i,j));
			}
		}
		// object if there's a bonus in that cell.
	}

	public Space[][] getPuzzle() {
		return puzzle;
	}

	/**
	 * findBonus - interrogate the bonuses ArrayList and return the bonus square if
	 * there is one
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 * @param Row
	 * @param Col
	 * @return
	 */
	private BonusSquare findBonus(int Row, int Col) {
		for (BonusSquare bs : this.bonuses) {
			if (bs.getRow() == Row && bs.getCol() == Col) {
				return bs;
			}
		}
		return null;
	}

	/**
	 * SetBonus - This method will set the bonuses ArrayList with all the bonus
	 * squares in the game
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @param TripleWord 
	 * @since Lab #6
	 */
	private void SetBonus() {
		// TODO: Set the bonus squares. Use the default / class Scrabble settings.
		
		int b[][] =
				  {{4, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 4,},
				  {0, 3, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 3, 0,},
				  {0, 0, 3, 0, 0, 0, 1, 0, 1, 0, 0, 0, 3, 0, 0,},
				  {1, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 1,},
				  {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0,},
				  {0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0,},
				 {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0,},
				 {4, 0, 0, 1, 0, 0, 0, 5, 0, 0, 0, 1, 0, 0, 4,},
				 {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0,},
				 {0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0,},
				 {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0,},
				  {1, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 1,},
				  {0, 0, 3, 0, 0, 0, 1, 0, 1, 0, 0, 0, 3, 0, 0,},
				 {0, 3, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 3, 0,},
				 {4, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 4,}
				  };
		for (int i =0; i<15;i++) {
			for(int j =0; j<15; j++) {
				switch(b[i][j]) {
				case 1: 
					bonuses.add(new BonusSquare(i,j,eBonusType.DoubleLetter));
					break;
				case 2:
					bonuses.add(new BonusSquare(i,j,eBonusType.TripleLetter));
					break;
				case 3:
					bonuses.add(new BonusSquare(i,j,eBonusType.DoubleWord));
					break;
				case 4:
					 bonuses.add(new BonusSquare(i,j,eBonusType.TripleWord));
					 break;
				case 5:
					bonuses.add(new BonusSquare(i,j,eBonusType.Star));
					break;
				default:
					bonuses.add(new BonusSquare(i,j,null));
			
				}
			}
		} 
	}


}
