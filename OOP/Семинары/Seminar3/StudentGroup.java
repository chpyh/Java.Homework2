package Семинары.Seminar3;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    int id;
    
    public StudentGroup(List<Student> students, int id){
        this.students = new ArrayList<>();
        this.id = id;
    }

    public int getGroupId(){
        return id;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(String name){
        for (Student student : students) {
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Студенты группы " + id + " :" + students;
    }
    
    public void removeStudent(Student student){
        students.remove(student);
    }
    @Override
    public Iterator<Student> iterator(){
        return new StudentGroupIterator(students);
    }
    
}


class StudentGroupIterator implements Iterator <Student>{
    private int index = 0;

    List<Student> students = new ArrayList<>();
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext(){
        return index< students.size();
    }
    @Override
    public Student next(){
        return students.get(index++);

    }

    @Override
        public void remove() {
            if (index > 0) {
                students.remove(--index);
            } else {
                throw new IllegalStateException("next должен быть вызван перед remove");
            }
        }
}


    

