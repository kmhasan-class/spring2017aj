/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.jsondemo;

/**
 *
 * @author kmhasan
 */
public class Section {
    private String courseCode;
    private String courseTitle;
    private int section;
    private String facultyCode;
    private int offeredId;

    public Section() {
    }

    public Section(String courseCode, String courseTitle, int section, String facultyCode, int offeredId) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.section = section;
        this.facultyCode = facultyCode;
        this.offeredId = offeredId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getSection() {
        return section;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public int getOfferedId() {
        return offeredId;
    }

    @Override
    public String toString() {
        return "Section{" + "courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", section=" + section + ", facultyCode=" + facultyCode + ", offeredId=" + offeredId + '}';
    }
}
