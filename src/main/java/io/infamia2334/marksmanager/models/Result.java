package io.infamia2334.marksmanager.models;

public class Result {
    private String resultName;
    private Double marks;
    private String grade;
    private String remarks;

    public Result() {
    }

    public Result(String resultName, Double marks, String grade, String remarks) {
        this.resultName = resultName;
        this.marks = marks;
        this.grade = grade;
        this.remarks = remarks;
    }

    public String getResultName() {
        return this.resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public Double getMarks() {
        return this.marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "{" +
            " resultName='" + getResultName() + "'" +
            ", marks='" + getMarks() + "'" +
            ", grade='" + getGrade() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }
}
