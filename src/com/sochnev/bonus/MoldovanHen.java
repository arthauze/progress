package com.sochnev.bonus;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        int count = 24;
        return count;
    }
    @Override
    String getDescription() {
        String full = String.format("%s Моя страная - %s. Я несу %s яиц в месяц", super.getDescription(), Country.MOLDOVA ,getCountOfEggsPerMonth() );
        return full;
    }
}
