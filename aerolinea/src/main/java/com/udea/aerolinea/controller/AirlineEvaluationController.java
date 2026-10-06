package com.udea.aerolinea.controller;

import com.udea.aerolinea.model.AirlineRequest;
import com.udea.aerolinea.model.PassengerEvaluationResult;
import com.udea.aerolinea.service.AirlineEvaluationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline")
public class AirlineEvaluationController {

    @Autowired
    private AirlineEvaluationService evaluationService;

    @PostMapping("/api/evaluate")
    public PassengerEvaluationResult evaluateAirline(@Valid @RequestBody AirlineRequest request,
                                                     BindingResult result) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors()
                    .stream()
                    .map(error -> error.getDefaultMessage())
                    .reduce((msg1, msg2) -> msg1 + "; " + msg2)
                    .orElse("Errores de validación");

            PassengerEvaluationResult errorResult = new PassengerEvaluationResult();
            errorResult.setEligibleForUpgrade(false);
            errorResult.setValidationMessage("Error de validación: " + errorMessage);
            return errorResult;
        }
        return evaluationService.evaluate(request);
    }
}