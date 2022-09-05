/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw7lab1;

/**
 *
 * @author Johan
 */
public class Course {

        private String courseNumber;

        private String courseTitle;

        public String getCourseNumber() {
                return courseNumber;
        }

        public void setCourseNumber(String courseNumber) {
                this.courseNumber = courseNumber;
        }

        public String getCourseTitle() {
                return courseTitle;
        }

        public void setCourseTitle(String courseTitle) {
                this.courseTitle = courseTitle;
        }

        public void printInfo() {
                System.out.println("Course Information:");
                System.out.println("   Course Number: " + courseNumber);
                System.out.println("   Course Title: " + courseTitle);

        }
}
