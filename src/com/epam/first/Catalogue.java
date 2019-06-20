package com.epam.first;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    public static void main(String[] args) {
        List<Car> carList=new ArrayList<>();
        Car mers = new S600("Sedan", 6000, "Black", 350,"");
        Car toyota = new Camry("Sedan", 3500, "White", 220,"");
        Car honda = new CivicH("Hatchback", 1600, "Green",180,"");
        Car suzuki = new Vitara("SUV", 2000, "Blue", 170,"Kazakh");
        //System.out.println(mers);
        mers.move();

       // System.out.println(honda);
        honda.move();

        //System.out.println(toyota);
        toyota.move();

        //System.out.println(suzuki);
        suzuki.move();

        tellAboutMe(mers);
        tellAboutMe(honda);
        tellAboutMe(toyota);
        tellAboutMe(suzuki);
        System.out.println("===============");
        ((Camry) toyota).setColor("Blue");
        tellAboutMe(toyota);
        System.out.println("===============");
        carList.add(mers);
        carList.add(honda);
        carList.add(toyota);
        carList.add(suzuki);
        System.out.println("Get information using List");
        for (Car car :carList) {
            System.out.println(car);

        }
        


    }
    public static void tellAboutMe(Car car){
        System.out.println(car);
    }
}
