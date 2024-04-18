package Семинары.Seminar3;

import java.util.Iterator;
//import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // создаем условные группы для потоков
        StudentGroup group1 = new StudentGroup(null, 1000);
        group1.addStudent(new Student("Иванов", 100));
        group1.addStudent(new Student("Петров", 102));
        group1.addStudent(new Student("Сидоров", 103));

        StudentGroup group2 = new StudentGroup(null, 2000);
        group2.addStudent(new Student("Васечкина", 201));
        group2.addStudent(new Student("Смирнова", 202));
        group2.addStudent(new Student("Алексеева", 203));

        StudentGroup group3 = new StudentGroup(null, 3000);
        group3.addStudent(new Student("Лялин", 301));
        group3.addStudent(new Student("Мамин", 302));

        StudentGroup group4 = new StudentGroup(null, 4000);
        group4.addStudent(new Student("Бурчу", 401));
        group4.addStudent(new Student("Ворчу", 402));
        group4.addStudent(new Student("Лечу", 403));

        StudentGroup group5 = new StudentGroup(null, 5000);
        group5.addStudent(new Student("Бабенко", 501));
        group5.addStudent(new Student("Папенко", 502));
        group5.addStudent(new Student("Диденко", 503));

        StudentGroup group6 = new StudentGroup(null, 6000);
        group6.addStudent(new Student("Хамидуллин", 601));

        // создаем потоки
        Stream stream1 = new Stream("Физика", null);
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream("Математика", null);
        stream2.addGroup(group3);
        stream2.addGroup(group4);
        stream2.addGroup(group5);

        Stream stream3 = new Stream("Химия", null);
        stream3.addGroup(group6);

        StreamComparator comparator = new StreamComparator();
        // сравним две группы с помщью компаратора, выведется разница в количестве групп
        // внутри потока
        System.out.println(comparator.compare(stream1, stream2));

        // тут конечно лучше отдельный метод написать не в Main для вывоа более понятной
        // информации, как ниже
        // но такой задачи по условию не было, оставим на следующий раз.
        // int result = comparator.compare(stream1, stream2);

        // if(result > 0){
        // System.out.println("В " + stream1 + " на " + result + " групп больше");
        // }
        // else if(result == 0){
        // System.out.println("Потоки одинаковые");
        // }
        // else{
        // System.out.println("В " + stream1 + " на " + Math.abs(result) + " групп
        // меньше");
        // }

        // отсортируем от потоки в зависимости от размеров (кол-во групп, входящих в
        // поток)
        TreeSet<Stream> set = new TreeSet<>(new StreamComparator());
        set.add(stream1);
        set.add(stream2);
        set.add(stream3);
        System.out.println(set);

        Iterator<StudentGroup> iterator = stream1.iterator();

        while (iterator.hasNext()) {
            StudentGroup gr = iterator.next();
            if (gr.getGroupId() == 1000) {
                System.out.println(gr);
            }
        }
    }
}

// Работа на семинаре - с группой студентов
// StudentGroup group = new StudentGroup(null, 001);
// group.addStudent(new Student("Иванов", 100));
// group.addStudent(new Student("Петров", 111));
// group.addStudent(new Student("Сидоров", 122));

// System.out.println(group);
// for (Student student : group) {
// System.out.println(student);
// }

// System.out.println(group.getStudent("Сидоров").compareTo(group.getStudent("Петров")));
// тут распечатается разница в id-шниках сравниваемых фамилий: если id с плюсом,
// то человек, которого мы ищем, находится дальше по списку,если с "-" то идти в
// с торону начала списка

// TreeSet<Student> set = new TreeSet<>(new StudentComparator());
// set.add(group.getStudent("Иванов"));
// set.add(group.getStudent("Петров"));
// set.add(group.getStudent("Сидоров"));

// System.out.println(set);

// Iterator<Student> iterator = group.iterator();
// while (iterator.hasNext()) {
// Student student = iterator.next();
// if (student.getName().equals("Сидоров")) {
// iterator.remove();// перегрузили в StudentGroupIterator метод remove,
// // иначе выдавало бы ошибку и тогда пришлось бы убирать из group:
// // group.removeStudent(student)

// }
// }
// System.out.println("Проверка после удаления");

// for (Student student : group) {
// System.out.println(student.getName());
// }
