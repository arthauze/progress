package com.sochnev.bonus;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        int count = 25;
        return count;
    }

/*    <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
    где Sssss - название страны
    где N - количество яиц в месяц*/

    @Override
    String getDescription() {
        String full = String.format("%s Моя страная - %s. Я несу %s яиц в месяц", super.getDescription(), Country.BELARUS ,getCountOfEggsPerMonth() );
        return full;
    }
}
