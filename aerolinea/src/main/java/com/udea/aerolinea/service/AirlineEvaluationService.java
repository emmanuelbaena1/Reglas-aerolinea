package com.udea.aerolinea.service;

import com.udea.aerolinea.model.AirlineRequest;
import com.udea.aerolinea.model.PassengerEvaluationResult;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineEvaluationService {

    @Autowired
    private KieContainer kieContainer;

    public PassengerEvaluationResult evaluate(AirlineRequest request) {
        PassengerEvaluationResult result = new PassengerEvaluationResult();
        KieSession kieSession = kieContainer.newKieSession();
        try {
            kieSession.insert(request.getPassenger());
            kieSession.insert(request.getFlight());
            kieSession.insert(result);
            kieSession.fireAllRules();
        } finally {

            kieSession.dispose();
        }
        return result;
    }
}