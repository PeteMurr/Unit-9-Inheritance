//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	public Card(String suit, int face) {
    this.suit = suit;
    this.face = face;
}
public String getSuit() {
    return suit;
}

public void setSuit(String suit) {
    this.suit = suit;
}

public void setFace(int face) {
    this.face = face;
}

public String toString() {
    return FACES[face] + " of " + suit;
}

@Override
public boolean equals(Object obj) {
    if (obj instanceof Card) {
        Card other = (Card) obj;
        return this.suit.equals(other.suit) && this.face == other.face;
    }
    return false;
}

  	public int getValue()
  	{
  		return face;
  	}

	public boolean equals(Object obj)
	{
		return false;
	}

  	//toString
  	
 }
