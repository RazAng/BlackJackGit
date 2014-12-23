package model;

public interface ButtonInterface {

	public void StartNewGame();
	public void deal();
	public Hand stand();
	public Card hit(Hand participant);
	public String winner();
}

