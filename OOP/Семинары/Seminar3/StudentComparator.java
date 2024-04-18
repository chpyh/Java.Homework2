package Семинары.Seminar3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.getName() + o1.getId();
        String s2 = o2.getName() + o2.getId();

        return s1.compareTo(s2);
    }
    
}

