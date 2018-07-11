package com.sochnev.bonus;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        int count = 18;
        return count;
    }
    @Override
    String getDescription() {
        String full = String.format("%s Моя страная - %s. Я несу %s яиц в месяц", super.getDescription(), Country.RUSSIA ,getCountOfEggsPerMonth() );
        return full;
    }
}
