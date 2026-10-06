package com.udea.aerolinea.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Flight {
    @NotNull(message = "Los minutos de retraso son obligatorios")
    @Min(value = 0, message = "Los minutos de retraso no pueden ser negativos")
    @Max(value = 1440, message = "El retraso no puede superar las 24 horas (1440 minutos)")
    private int delayMinutes;

    @NotNull(message = "La duración del vuelo es obligatoria")
    @Min(value = 0, message = "La duración no puede ser negativa")
    @Max(value = 1440, message = "La duración no puede superar las 24 horas (1440 minutos)")
    private int durationMinutes;

    private boolean emergencyExitSeatAvailable;

    public Flight() {
    }

    public Flight(int delayMinutes, int durationMinutes, boolean emergencyExitSeatAvailable) {
        this.delayMinutes = delayMinutes;
        this.durationMinutes = durationMinutes;
        this.emergencyExitSeatAvailable = emergencyExitSeatAvailable;
    }

    public int getDelayMinutes() {
        return delayMinutes;
    }

    public void setDelayMinutes(int delayMinutes) {
        this.delayMinutes = delayMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public boolean isEmergencyExitSeatAvailable() {
        return emergencyExitSeatAvailable;
    }

    public void setEmergencyExitSeatAvailable(boolean emergencyExitSeatAvailable) {
        this.emergencyExitSeatAvailable = emergencyExitSeatAvailable;
    }
}