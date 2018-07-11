package com.sochnev.bonus;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        hen.getDescription();
        System.out.println(hen.getDescription());

        Hen hen2 = HenFactory.getHen(Country.UKRAINE);
        hen2.getCountOfEggsPerMonth();
        hen2.getDescription();
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen(Country.RUSSIA);
        hen3.getCountOfEggsPerMonth();
        hen3.getDescription();
        System.out.println(hen3.getDescription());

        Hen hen4 = HenFactory.getHen(Country.MOLDOVA);
        hen4.getCountOfEggsPerMonth();
        hen4.getDescription();
        System.out.println(hen4.getDescription());
    }

    static class HenFactory implements Country{

//        Метод getHen должен быть реализован в классе HenFactory и должен возвращать тип кур для переданной в него страны.

        static Hen getHen(String country) {
            Hen hen = null;
            switch(country)
            {
                case Country.RUSSIA: hen = new RussianHen(); break;
                case Country.UKRAINE: hen = new UkrainianHen(); break;
                case Country.MOLDOVA: hen = new MoldovanHen(); break;
                case Country.BELARUS: hen = new BelarusianHen(); break;
            }

            return hen;
        }
    }
}
