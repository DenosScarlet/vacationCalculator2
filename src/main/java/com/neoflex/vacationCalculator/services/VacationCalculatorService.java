package com.neoflex.vacationCalculator.services;

import com.neoflex.vacationCalculator.dto.VacationCalculatorDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.DayOfWeek;

@Service
public class VacationCalculatorService {

    public double calculateVacationSum(VacationCalculatorDTO calculator){
        double averageWorkDays = 29.3;
        double workdays = 0;

        Holidays holiday = new Holidays();

        final Double averageSalary = calculator.getAverageSalary();
        final LocalDate startDate = calculator.getStartDate();
        final LocalDate endDate = calculator.getEndDate();

        System.out.println(averageSalary);
        System.out.println(startDate);
        System.out.println(endDate);

        LocalDate today = startDate;

        while(!today.isEqual(endDate)){
            if(!holiday.isHoliday(today) && !isWeekend(today)){
                workdays++;
            }
            today = today.plusDays(1);
        }
        System.out.println(workdays);
        System.out.println(averageSalary / averageWorkDays * workdays);


        return averageSalary / averageWorkDays * workdays;
    }

    public boolean isWeekend(LocalDate localDate){
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}