package OOPHomeWorkWeek1.StudentExams;

/**
 * Created by volodymyrkorniienko on 26.03.17.
 */
public class Student {
    public String name;
    Subject[] subjects;
    Address address;

    public static Student init(String name, Address address, int countOfSubjects) {
        Student student = new Student();
        student.name = name;
        student.subjects = new Subject[countOfSubjects];
        student.address = address;
        return student;
    }

    public boolean addSubject(Subject subject) {
        if (subjects == null) return false;
        for (int i = 0; i < subjects.length; i++) {
                subjects[i] = subject;
            }
            return true;
        }

    public boolean removeLastSubject() {
        for (int i = subjects.length - 1; i >= 0; i--) {
            if (subjects[i] != null) {
                subjects[i] = null;
                break;
            }
        }
        return true;
    }

    public void showInformationAboutSubjects() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i].name + " " + subjects[i].hoursSemester + " " +
                    subjects[i].studentHours + " " + subjects[i].studentMark);
        }
    }

    public void avgMarks() {
        float avg = 0;
        for (int i = 0; i < subjects.length; i++) {
            avg += subjects[i].studentMark;
        }
        System.out.println(avg / subjects.length);
    }
}
