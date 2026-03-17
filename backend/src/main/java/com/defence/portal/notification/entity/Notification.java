package com.defence.portal.notification.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* ===== BASIC INFO ===== */
    @Column(nullable = false)
    private String examName;

    private String conductingAuthority;
    private String status;
    private LocalDate notificationDate;

    /* ===== IMPORTANT DATES ===== */
    private LocalDate applicationStartDate;
    private LocalDate applicationEndDate;
    private LocalDate examDate;
    private LocalDate admitCardDate;
    private LocalDate resultDate;

    /* ===== OVERVIEW ===== */
    @Lob
    private String overview;

    /* ===== ELIGIBILITY ===== */
    @Lob
    private String educationalQualification;

    private Integer minAge;
    private Integer maxAge;

    @Lob
    private String ageRelaxation;

    private String nationality;

    /* ===== VACANCY ===== */
    private Integer totalVacancies;

    @Lob
    private String vacancyDetails;

    /* ===== APPLICATION FEE ===== */
    private Double feeGeneral;
    private Double feeScSt;
    private String paymentMode;

    /* ===== DYNAMIC LIST DATA ===== */

    @ElementCollection
    @CollectionTable(
            name = "notification_selection_process",
            joinColumns = @JoinColumn(name = "notification_id")
    )
    @Column(name = "step")
    private List<String> selectionProcess;

    @ElementCollection
    @CollectionTable(
            name = "notification_exam_pattern",
            joinColumns = @JoinColumn(name = "notification_id")
    )
    @Column(name = "pattern")
    private List<String> examPattern;

    @ElementCollection
    @CollectionTable(
            name = "notification_syllabus",
            joinColumns = @JoinColumn(name = "notification_id")
    )
    @Column(name = "topic")
    private List<String> syllabus;

    @ElementCollection
    @CollectionTable(
            name = "notification_physical_standards",
            joinColumns = @JoinColumn(name = "notification_id")
    )
    @Column(name = "standard")
    private List<String> physicalStandards;

    /* ===== IMPORTANT LINKS ===== */
    private String applyOnlineLink;
    private String officialNotificationPdf;
    private String officialWebsite;

    /* ===== METADATA ===== */
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDate.now();
    }

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
    public LocalDate getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDate createdAt) { this.createdAt = createdAt; }
    public LocalDate getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDate updatedAt) { this.updatedAt = updatedAt; }
}
