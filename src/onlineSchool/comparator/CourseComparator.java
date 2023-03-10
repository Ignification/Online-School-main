package onlineSchool.comparator;

import onlineSchool.models.Course;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
            return o1.getCourseName().compareToIgnoreCase(o2.getCourseName());
    }
}
