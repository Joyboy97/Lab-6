package pkgGame;

public class Letter {

	private Character chLetter;
	private int iScore;
	
	public Letter(Character chLetter) {
		super();
		this.chLetter = chLetter;
		SetDefaultScore(chLetter);
	}
	
	public Character getChLetter() {
		return chLetter;
	}

	public int getiScore() {
		return iScore;
	}

	private void SetDefaultScore(Character letter)
	{

		switch(iScore) {
		case 'A': case 'E': case 'I': case 'L': case 'N': case 'O': case 'R': case 'S': case 'T': case 'U':
			iScore = 1;
			break;
		case 'D': case 'G':
			iScore = 2;
			break;
		case 'B': case 'C': case 'M': case 'P':
			iScore = 3;
			break;
		case 'F': case 'H': case 'V': case 'W': case 'Y':
			iScore = 4;
			break;
		case 'K':
			iScore = 5;
			break;
		case 'J': case 'X':
			iScore = 8;
			break;
		case 'Q': case 'Z':
			iScore = 10;
			break;
		default:
			iScore = 0;
		}
	}
	
	
	
}
