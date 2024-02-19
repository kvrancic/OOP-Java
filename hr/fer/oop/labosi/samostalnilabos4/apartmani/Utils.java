package hr.fer.oop.labosi.samostalnilabos4.apartmani;

import java.util.HashMap;

public class Utils {
    public static double getAveragePricePerDay(HashMap<Integer, ApartmentInfo> apartments)
    {
        if(apartments.isEmpty()) return 0;
        double sum = 0;
        for(ApartmentInfo ai : apartments.values())
        {
            for(int i = 0; i < 7; i++){
                sum += ai.getDailyPrice()[i];
            }
        }
        return sum / (apartments.size() * 7);
    }

    public static double getAveragePricePerDay(
            HashMap<Integer, ApartmentInfo> apartments, Integer apartmentID){
        ApartmentInfo specificApartment = apartments.get(apartmentID);
        double sum = 0;
        for(int i = 0; i < 7; i++){
            sum += specificApartment.getDailyPrice()[i];
        }
        return sum / 7.0;
    }

    public static int getTotalCapacity(
            HashMap<Integer, ApartmentInfo> apartments, Integer apartmentID){
        ApartmentInfo specificApartment = apartments.get(apartmentID);
        return specificApartment.getDoubleBedsNum() * 2 + specificApartment.getSingleBedsNum();
    }

    public static ApartmentInfo getByName(HashMap<Integer, ApartmentInfo> apartments, String name){
        for(ApartmentInfo ai : apartments.values())
        {
            if(ai.getName().equals(name))
                return ai;
        }
        return null;
    }

    public static void main(String[] args) {
        Double[] examplePrices = {1d, 1d, 1d, 1d, 1d, 1d, 1d};
        ApartmentInfo exampleApartment = new ApartmentInfo(
                examplePrices,
                1,
                1,
                "A1"
        );
        HashMap<Integer, ApartmentInfo> apartments = new HashMap<>();
        apartments.put(0, exampleApartment);

        // 1.0
        System.out.println(Utils.getAveragePricePerDay(apartments));
        // 1.0
        System.out.println(Utils.getAveragePricePerDay(apartments, 0));
        // 3
        System.out.println(Utils.getTotalCapacity(apartments, 0));
        // ApartmentInfo{name='A1'}
        System.out.println(Utils.getByName(apartments, "A1"));
    }
}
