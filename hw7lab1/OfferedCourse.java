/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw7lab1;

/**
 *
 * @author Johan
 */
public class OfferedCourse extends Course {

        private String instructorName;

        private String term;

        private String classTime;

        public String getInstructorName() {
                return instructorName;
        }

        public void setInstructorName(String instructorName) {
                this.instructorName = instructorName;
        }

        public String getTerm() {
                return term;
        }

        public void setTerm(String term) {
                this.term = term;
        }

        public String getClassTime() {
                return classTime;
        }

        public void setClassTime(String classTime) {
                this.classTime = classTime;
        }

}
