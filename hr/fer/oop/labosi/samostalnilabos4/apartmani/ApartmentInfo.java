package hr.fer.oop.labosi.samostalnilabos4.apartmani;

import java.util.Arrays;
import java.util.Objects;

/**
 * The type Apartment info holds info about apartments.
 */
class ApartmentInfo {
    /**
     * Instantiates a new Apartment info.
     *
     * @param dailyPrice    the daily price
     * @param singleBedsNum the single beds num
     * @param doubleBedsNum the double beds num
     * @param name          the name
     */
    public ApartmentInfo(
            Double[] dailyPrice, int singleBedsNum, int doubleBedsNum,
            String name
    ) {
        this.dailyPrice = dailyPrice;
        this.singleBedsNum = singleBedsNum;
        this.doubleBedsNum = doubleBedsNum;
        this.name = name;
    }

    /**
     * Renting price for individual days - index 0 meaning Monday.
     */
    private final Double[] dailyPrice;
    /**
     * Number of single beds found in the apartment.
     */
    private final int singleBedsNum;
    /**
     * Number of double beds found in the apartment.
     */
    private final int doubleBedsNum;
    /**
     * The name of the apartment.
     */
    private final String name;

    /**
     * Get the daily price as an array, index 0 meaning Monday and 6 meaning Sunday.
     *
     * @return the price as a double array
     */
    public Double[] getDailyPrice() {
        return dailyPrice;
    }

    public int getSingleBedsNum() {
        return singleBedsNum;
    }

    /**
     * Gets the number of double beds.
     *
     * @return the double beds num
     */
    public int getDoubleBedsNum() {
        return doubleBedsNum;
    }

    /**
     * Gets the apartment name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ApartmentInfo{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApartmentInfo that = (ApartmentInfo) o;
        return singleBedsNum == that.singleBedsNum &&
                doubleBedsNum == that.doubleBedsNum &&
                Arrays.equals(dailyPrice, that.dailyPrice) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(singleBedsNum, doubleBedsNum, name);
        result = 31 * result + Arrays.hashCode(dailyPrice);
        return result;
    }
}