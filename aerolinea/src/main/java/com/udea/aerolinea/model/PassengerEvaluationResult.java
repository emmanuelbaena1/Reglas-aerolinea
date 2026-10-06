package com.udea.aerolinea.model;

public class PassengerEvaluationResult {
    private boolean upgradedToBusiness;
    private boolean priorityCheckIn;
    private double discountPercentage;
    private boolean eligibleForUpgrade;
    private boolean emergencyExitSeatAssigned;
    private double compensationAmount;
    private int loyaltyPointsAdded;
    private boolean luggageAllowed;
    private boolean vipLoungeAccess;
    private boolean preferentialSeatAssigned;
    private String validationMessage;

    public PassengerEvaluationResult() {
        this.eligibleForUpgrade = true;
        this.luggageAllowed = true;
    }

    public boolean isUpgradedToBusiness() {
        return upgradedToBusiness;
    }

    public void setUpgradedToBusiness(boolean upgradedToBusiness) {
        this.upgradedToBusiness = upgradedToBusiness;
    }

    public boolean isPriorityCheckIn() {
        return priorityCheckIn;
    }

    public void setPriorityCheckIn(boolean priorityCheckIn) {
        this.priorityCheckIn = priorityCheckIn;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public boolean isEligibleForUpgrade() {
        return eligibleForUpgrade;
    }

    public void setEligibleForUpgrade(boolean eligibleForUpgrade) {
        this.eligibleForUpgrade = eligibleForUpgrade;
    }

    public boolean isEmergencyExitSeatAssigned() {
        return emergencyExitSeatAssigned;
    }

    public void setEmergencyExitSeatAssigned(boolean emergencyExitSeatAssigned) {
        this.emergencyExitSeatAssigned = emergencyExitSeatAssigned;
    }

    public double getCompensationAmount() {
        return compensationAmount;
    }

    public void setCompensationAmount(double compensationAmount) {
        this.compensationAmount = compensationAmount;
    }

    public int getLoyaltyPointsAdded() {
        return loyaltyPointsAdded;
    }

    public void setLoyaltyPointsAdded(int loyaltyPointsAdded) {
        this.loyaltyPointsAdded = loyaltyPointsAdded;
    }

    public boolean isLuggageAllowed() {
        return luggageAllowed;
    }

    public void setLuggageAllowed(boolean luggageAllowed) {
        this.luggageAllowed = luggageAllowed;
    }

    public boolean isVipLoungeAccess() {
        return vipLoungeAccess;
    }

    public void setVipLoungeAccess(boolean vipLoungeAccess) {
        this.vipLoungeAccess = vipLoungeAccess;
    }

    public boolean isPreferentialSeatAssigned() {
        return preferentialSeatAssigned;
    }

    public void setPreferentialSeatAssigned(boolean preferentialSeatAssigned) {
        this.preferentialSeatAssigned = preferentialSeatAssigned;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }
}