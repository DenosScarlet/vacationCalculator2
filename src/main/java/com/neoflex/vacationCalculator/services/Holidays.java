package com.neoflex.vacationCalculator.services;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Holidays {

    public Set<MonthDay> holidays = new HashSet<>();

    public Holidays(){
        holidays.add(MonthDay.of(Month.JANUARY, 1));
        holidays.add(MonthDay.of(Month.JANUARY, 2));
        holidays.add(MonthDay.of(Month.JANUARY, 3));
        holidays.add(MonthDay.of(Month.JANUARY, 4));
        holidays.add(MonthDay.of(Month.JANUARY, 5));
        holidays.add(MonthDay.of(Month.JANUARY, 6));
        holidays.add(MonthDay.of(Month.JANUARY, 7));
        holidays.add(MonthDay.of(Month.JANUARY, 8));
        holidays.add(MonthDay.of(Month.FEBRUARY, 23));
        holidays.add(MonthDay.of(Month.MARCH, 8));
        holidays.add(MonthDay.of(Month.MAY, 1));
        holidays.add(MonthDay.of(Month.MAY, 9));
        holidays.add(MonthDay.of(Month.JUNE, 12));
        holidays.add(MonthDay.of(Month.NOVEMBER, 4));
    }

    public boolean isHoliday(LocalDate localDate){
        return holidays.contains(MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth()));
    }
}