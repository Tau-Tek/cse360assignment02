package cse360assignment02;

/**
 * Describes an object that has a value that can be added to and subtracted from
 * The counting machine keeps a history of transactions
 */
public class AddingMachine {
  /**
   * the total value
   * accessed with getTotal()
  */
  private int total;
  /**
   * the history of the adding machine. starts as "0", adding value appends " + value", subtracting value appends " + value"
   * accessed with toString()
  */
  private string history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
	history = "0";
  }
  /**
   * get the total value of the adding machine
   * @return the total value of the adding machine
  */
  public int getTotal () {
    return total;
  }
  /**
   * add a value to the total of the adding machine, adds the transaction to the history
   * @param value the value to be added to the total
  */
  public void add (int value) {
	  total += value;
	  history = history + " + " + value;
  }
  /**
   * subtract a value from the total of the adding machine, adds the transaction to the history
   * @param value the value to be subtract from the total
  */
  public void subtract (int value) {
	  total -= value;
	  history = history + " - " + value;
  }
  /**
   * prints the history of the adding machine
   * @return history of adding machine
  */
  public String toString () {
    return history;
  }
  /**
   * resets the counting machine, setting total to 0 and history to "0"
  */
  public void clear() {
	  total = 0;
	  history = "0";
  }
}