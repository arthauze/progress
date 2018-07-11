package com.sochnev.bonus;

public class UkrainianHen extends  Hen {
    @Override
    int getCountOfEggsPerMonth() {
        int count = 13;
        return count;
    }
    @Override
    String getDescription() {
        //String full = "Hi";
        String full = String.format("%s Моя страна - %s. Я несу %s яиц в месяц", super.getDescription(), Country.UKRAINE ,getCountOfEggsPerMonth() );
        return full;
        //return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
