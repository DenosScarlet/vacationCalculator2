package com.neoflex.vacationCalculator.controllers;

import com.neoflex.vacationCalculator.dto.VacationCalculatorDTO;
import com.neoflex.vacationCalculator.services.VacationCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacation")
public class VacationCalculatorController {

    private final VacationCalculatorService vacationCalculatorService;

    @Autowired
    public VacationCalculatorController(VacationCalculatorService vacationCalculatorService) {
        this.vacationCalculatorService = vacationCalculatorService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<String> calculateVacation(@RequestBody VacationCalculatorDTO calculator) {
        Double vacationSum = vacationCalculatorService.calculateVacationSum(calculator);
        return ResponseEntity.ok("Сумма отпускных сотрудника: " + vacationSum);
    }

}
