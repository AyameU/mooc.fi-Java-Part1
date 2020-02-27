public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int differenceInYears = 0;

        // if compared date is NOT earlier, get diff of years
        if(!earlier(comparedDate)) {
            differenceInYears = this.year - comparedDate.year;

            // months is less than compared month, minus year
            if(this.month < comparedDate.month) {
                differenceInYears -= 1;
            }

            // months is equal to compared month, check if days are less than
            if(this.month == comparedDate.month) {
                if(this.day < comparedDate.day) {
                    differenceInYears -= 1;
                }
            }
        }

        // if compared date is earlier, get diff of years
        if(earlier(comparedDate)) {
            differenceInYears =  comparedDate.year - this.year;

            // months is greater than compared month, minus year
            if(this.month > comparedDate.month) {
                differenceInYears -= 1;
            }

            // months is equal to compared month, check if days are greater
            if(this.month == comparedDate.month) {
                if(this.day > comparedDate.day) {
                    differenceInYears -= 1;
                }
            }
        }
        return differenceInYears;
    }
}