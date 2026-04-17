public class Apartment {

  private int rooms;
  private int squares;
  private int pricePerSquare;

  public Apartment(int rooms, int squares, int pricePerSquare) {
    this.rooms = rooms;
    this.squares = squares;
    this.pricePerSquare = pricePerSquare;
  }

  public boolean largerThan(Apartment compared) {
    return (this.squares > compared.squares) ? true : false;
  }

  public int priceDifference(Apartment compared) {
    int apartmentA = this.squares * this.pricePerSquare;
    int apartmentB = compared.squares * compared.pricePerSquare;

    return Math.abs(apartmentA - apartmentB);
  }

  public boolean moreExpensiveThan(Apartment compared) {
    int apartmentA = this.squares * this.pricePerSquare;
    int apartmentB = compared.squares * compared.pricePerSquare;

    return apartmentA > apartmentB;
  }
}
