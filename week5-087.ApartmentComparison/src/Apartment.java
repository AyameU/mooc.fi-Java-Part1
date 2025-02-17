
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

    public int priceDifference(Apartment otherApartment) {
        int priceDifference = 0;
        if(this.squareMeters * this.pricePerSquareMeter >= otherApartment.squareMeters * otherApartment.pricePerSquareMeter) {
            priceDifference = (this.squareMeters * this.pricePerSquareMeter) - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        }
        else {
            priceDifference = (otherApartment.squareMeters * otherApartment.pricePerSquareMeter) - (this.squareMeters * this.pricePerSquareMeter);
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if(this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter) {
            return true;
        }
        return false;
    }
}
