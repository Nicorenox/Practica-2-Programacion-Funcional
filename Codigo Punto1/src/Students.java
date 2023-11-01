public class Students {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private boolean partTimeJob;
    private int absenceDays;
    private boolean extracurricularActivities;
    private int weeklySelfStudyHours;
    private String careerAspiration;
    private int mathScore;
    private int historyScore;
    private int physicsScore;
    private int chemistryScore;
    private int biologyScore;
    private int englishScore;
    private int geographyScore;

    public Students(int id, String firstName, String lastName, String email, String gender, boolean partTimeJob, int absenceDays, boolean extracurricularActivities, int weeklySelfStudyHours, String careerAspiration, int mathScore, int historyScore, int physicsScore, int chemistryScore, int biologyScore, int englishScore, int geographyScore) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.partTimeJob = partTimeJob;
        this.absenceDays = absenceDays;
        this.extracurricularActivities = extracurricularActivities;
        this.weeklySelfStudyHours = weeklySelfStudyHours;
        this.careerAspiration = careerAspiration;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
        this.englishScore = englishScore;
        this.geographyScore = geographyScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPartTimeJob() {
        return partTimeJob;
    }

    public void setPartTimeJob(boolean partTimeJob) {
        this.partTimeJob = partTimeJob;
    }

    public int getAbsenceDays() {
        return absenceDays;
    }

    public void setAbsenceDays(int absenceDays) {
        this.absenceDays = absenceDays;
    }

    public boolean isExtracurricularActivities() {
        return extracurricularActivities;
    }

    public void setExtracurricularActivities(boolean extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
    }

    public int getWeeklySelfStudyHours() {
        return weeklySelfStudyHours;
    }

    public void setWeeklySelfStudyHours(int weeklySelfStudyHours) {
        this.weeklySelfStudyHours = weeklySelfStudyHours;
    }

    public String getCareerAspiration() {
        return careerAspiration;
    }

    public void setCareerAspiration(String careerAspiration) {
        this.careerAspiration = careerAspiration;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(int historyScore) {
        this.historyScore = historyScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    public int getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(int chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public int getBiologyScore() {
        return biologyScore;
    }

    public void setBiologyScore(int biologyScore) {
        this.biologyScore = biologyScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getGeographyScore() {
        return geographyScore;
    }

    public void setGeographyScore(int geographyScore) {
        this.geographyScore = geographyScore;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", partTimeJob=" + partTimeJob +
                ", absenceDays=" + absenceDays +
                ", extracurricularActivities=" + extracurricularActivities +
                ", weeklySelfStudyHours=" + weeklySelfStudyHours +
                ", careerAspiration='" + careerAspiration + '\'' +
                ", mathScore=" + mathScore +
                ", historyScore=" + historyScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore +
                ", biologyScore=" + biologyScore +
                ", englishScore=" + englishScore +
                ", geographyScore=" + geographyScore +
                '}';
    }
}
