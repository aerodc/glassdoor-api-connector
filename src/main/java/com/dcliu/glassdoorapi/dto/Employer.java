package com.dcliu.glassdoorapi.dto;

public class Employer {

    private int id;

    private String name;

    private String industry;

    private String overallRating;

    private String cultureAndValuesRating;

    private String seniorLeadershipRating;

    private String compensationAndBenefitsRating;

    private String careerOpportunitiesRating;

    private String workLifeBalanceRating;

    private String recommendToFriendRating;

    public Employer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(String overallRating) {
        this.overallRating = overallRating;
    }

    public String getCultureAndValuesRating() {
        return cultureAndValuesRating;
    }

    public void setCultureAndValuesRating(String cultureAndValuesRating) {
        this.cultureAndValuesRating = cultureAndValuesRating;
    }

    public String getSeniorLeadershipRating() {
        return seniorLeadershipRating;
    }

    public void setSeniorLeadershipRating(String seniorLeadershipRating) {
        this.seniorLeadershipRating = seniorLeadershipRating;
    }

    public String getCompensationAndBenefitsRating() {
        return compensationAndBenefitsRating;
    }

    public void setCompensationAndBenefitsRating(String compensationAndBenefitsRating) {
        this.compensationAndBenefitsRating = compensationAndBenefitsRating;
    }

    public String getCareerOpportunitiesRating() {
        return careerOpportunitiesRating;
    }

    public void setCareerOpportunitiesRating(String careerOpportunitiesRating) {
        this.careerOpportunitiesRating = careerOpportunitiesRating;
    }

    public String getWorkLifeBalanceRating() {
        return workLifeBalanceRating;
    }

    public void setWorkLifeBalanceRating(String workLifeBalanceRating) {
        this.workLifeBalanceRating = workLifeBalanceRating;
    }

    public String getRecommendToFriendRating() {
        return recommendToFriendRating;
    }

    public void setRecommendToFriendRating(String recommendToFriendRating) {
        this.recommendToFriendRating = recommendToFriendRating;
    }

}
