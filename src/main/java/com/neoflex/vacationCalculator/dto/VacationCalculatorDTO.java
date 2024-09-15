package com.neoflex.vacationCalculator.dto;

import java.time.LocalDate;

public class VacationCalculatorDTO {
    private Double averageSalary;
    private LocalDate startDate;
    private LocalDate endDate;

    public VacationCalculatorDTO(Double averageSalary, LocalDate startDate, LocalDate endDate) {
        this.averageSalary = averageSalary;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
