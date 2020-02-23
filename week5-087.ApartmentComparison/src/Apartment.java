
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    // constructor

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // methods

    public boolean larger(Apartment otherApartment) {
        // check if the number of rooms is larger than the compared rooms
        if(this.rooms > otherApartment.rooms) {
            return true;
        }

        // if the same num of rooms, check if square meters is greater
        else if(this.rooms == otherApartment.rooms && this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        // return false if non of those things
        return false;
    }
    
}
