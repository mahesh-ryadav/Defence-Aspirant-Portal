package com.defence.portal.notification.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;

public class NotificationDto {

    private Long id;
    @NotBlank(message = "Exam name is required")
    private String examName;

    @NotBlank(message = "Conducting authority is required")
    private String conductingAuthority;

    @NotBlank(message = "Status is required")
    private String status;   // UPCOMING / ACTIVE / CLOSED

    private LocalDate notificationDate;

    /* ===== IMPORTANT DATES ===== */

    private LocalDate applicationStartDate;
    private LocalDate applicationEndDate;
    private LocalDate examDate;
    private LocalDate admitCardDate;
    private LocalDate resultDate;

    /* ===== OVERVIEW ===== */

    @NotBlank(message = "Overview is required")
    private String overview;

    /* ===== ELIGIBILITY ===== */

    @NotBlank(message = "Educational qualification is required")
    private String educationalQualification;

    @Min(value = 18, message = "Minimum age must be at least 18")
    private Integer minAge;

    @Min(value = 18, message = "Maximum age must be at least 18")
    private Integer maxAge;

    private String ageRelaxation;

    @NotBlank(message = "Nationality is required")
    private String nationality;

    /* ===== VACANCY ===== */

    @Min(value = 0, message = "Total vacancies cannot be negative")
    private Integer totalVacancies;

    private String vacancyDetails;

    /* ===== APPLICATION FEE ===== */

    @DecimalMin(value = "0.0", inclusive = true, message = "General fee cannot be negative")
    private Double feeGeneral;

    @DecimalMin(value = "0.0", inclusive = true, message = "SC/ST fee cannot be negative")
    private Double feeScSt;

    private String paymentMode;

    /* ===== DYNAMIC LIST DATA ===== */

    @NotEmpty(message = "Selection process must contain at least one step")
    private List<@NotBlank(message = "Selection step cannot be blank") String> selectionProcess;

    @NotEmpty(message = "Exam pattern must contain at least one item")
    private List<@NotBlank(message = "Exam pattern item cannot be blank") String> examPattern;

    @NotEmpty(message = "Syllabus must contain at least one topic")
    private List<@NotBlank(message = "Syllabus topic cannot be blank") String> syllabus;

    private List<@NotBlank(message = "Physical standard cannot be blank") String> physicalStandards;

    /* ===== IMPORTANT LINKS ===== */

    @Pattern(
            regexp = "^(http|https)://.*$",
            message = "Apply online link must be a valid URL"
    )
    private String applyOnlineLink;

    @Pattern(
            regexp = "^(http|https)://.*$",
            message = "Notification PDF link must be a valid URL"
    )
    private String officialNotificationPdf;

    @Pattern(
            regexp = "^(http|https)://.*$",
            message = "Official website must be a valid URL"
    )
    private String officialWebsite;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getExamName() { return examName; }
    public void setExamName(String examName) { this.examName = examName; }
    public String getConductingAuthority() { return conductingAuthority; }
    public void setConductingAuthority(String conductingAuthority) { this.conductingAuthority = conductingAuthority; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getNotificationDate() { return notificationDate; }
    public void setNotificationDate(LocalDate notificationDate) { this.notificationDate = notificationDate; }
    public LocalDate getApplicationStartDate() { return applicationStartDate; }
    public void setApplicationStartDate(LocalDate applicationStartDate) { this.applicationStartDate = applicationStartDate; }
    public LocalDate getApplicationEndDate() { return applicationEndDate; }
    public void setApplicationEndDate(LocalDate applicationEndDate) { this.applicationEndDate = applicationEndDate; }
    public LocalDate getExamDate() { return examDate; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }
    public LocalDate getAdmitCardDate() { return admitCardDate; }
    public void setAdmitCardDate(LocalDate admitCardDate) { this.admitCardDate = admitCardDate; }
    public LocalDate getResultDate() { return resultDate; }
    public void setResultDate(LocalDate resultDate) { this.resultDate = resultDate; }
    public String getOverview() { return overview; }
    public void setOverview(String overview) { this.overview = overview; }
    public String getEducationalQualification() { return educationalQualification; }
    public void setEducationalQualification(String educationalQualification) { this.educationalQualification = educationalQualification; }
    public Integer getMinAge() { return minAge; }
    public void setMinAge(Integer minAge) { this.minAge = minAge; }
    public Integer getMaxAge() { return maxAge; }
    public void setMaxAge(Integer maxAge) { this.maxAge = maxAge; }
    public String getAgeRelaxation() { return ageRelaxation; }
    public void setAgeRelaxation(String ageRelaxation) { this.ageRelaxation = ageRelaxation; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public Integer getTotalVacancies() { return totalVacancies; }
    public void setTotalVacancies(Integer totalVacancies) { this.totalVacancies = totalVacancies; }
    public String getVacancyDetails() { return vacancyDetails; }
    public void setVacancyDetails(String vacancyDetails) { this.vacancyDetails = vacancyDetails; }
    public Double getFeeGeneral() { return feeGeneral; }
    public void setFeeGeneral(Double feeGeneral) { this.feeGeneral = feeGeneral; }
    public Double getFeeScSt() { return feeScSt; }
    public void setFeeScSt(Double feeScSt) { this.feeScSt = feeScSt; }
    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }
    public List<String> getSelectionProcess() { return selectionProcess; }
    public void setSelectionProcess(List<String> selectionProcess) { this.selectionProcess = selectionProcess; }
    public List<String> getExamPattern() { return examPattern; }
    public void setExamPattern(List<String> examPattern) { this.examPattern = examPattern; }
    public List<String> getSyllabus() { return syllabus; }
    public void setSyllabus(List<String> syllabus) { this.syllabus = syllabus; }
    public List<String> getPhysicalStandards() { return physicalStandards; }
    public void setPhysicalStandards(List<String> physicalStandards) { this.physicalStandards = physicalStandards; }
    public String getApplyOnlineLink() { return applyOnlineLink; }
    public void setApplyOnlineLink(String applyOnlineLink) { this.applyOnlineLink = applyOnlineLink; }
    public String getOfficialNotificationPdf() { return officialNotificationPdf; }
    public void setOfficialNotificationPdf(String officialNotificationPdf) { this.officialNotificationPdf = officialNotificationPdf; }
    public String getOfficialWebsite() { return officialWebsite; }
    public void setOfficialWebsite(String officialWebsite) { this.officialWebsite = officialWebsite; }
}
