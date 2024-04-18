package Семинары.Seminar3;
//Создать класс Поток, содержащий в себе список 
//УчебныхГрупп и реализующий интерфейс Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> groups;
    private String name;
    
    public Stream(String name, List<StudentGroup> groups){
        this.groups = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGroup(StudentGroup group){
        groups.add(group);
    }

    public Integer getSize(){
        return groups.size();
    }

    @Override
    public String toString() {

        return name.toString() + " " + groups.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(groups);
    }

    
    
}

class StreamIterator implements Iterator <StudentGroup>{
    private int index = 0;
    private List<StudentGroup> groups;
    ;
    public StreamIterator( List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext(){
        return index< groups.size();
    }
    @Override
    public StudentGroup next(){
        return groups.get(index++);

    }

    // @Override
    //     public void remove() {
    //         if (index > 0) {
    //             groups.remove(--index);
    //         } else {
    //             throw new IllegalStateException("next должен быть вызван перед remove");
    //         }
    //     }
    }


    


