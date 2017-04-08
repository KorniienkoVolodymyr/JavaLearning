package OOPHomeWorkWeek1.StudentExams;

/**
 * Created by volodymyrkorniienko on 08.04.17.
 */
public class Student {

    private String name;
    private Address address;
    private Subject[] subjects;

    public Student(String name, Address address, int countOfSubjects) {
        this.name = name;
        this.address = address;
        this.subjects = new Subject[countOfSubjects];
    }

    public boolean addSubject(Subject subject) {
            for (int i = 0; i < subjects.length; i++) {
                if (subjects[i] == null) {
                subjects[i] = subject;
                return true;
            }
        }
        return false;
    }

    public boolean showAllInformationAboutSubject(String name) {
        if (subjects == null) return false;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].getName().equals(name)) {
                System.out.println(subjects[i].toString());
            }
        }
        return true;
    }

    public boolean removeLastSubject() {
        for (int i = subjects.length - 1; i >= 0 ; i--) {
            if (subjects[i] != null) {
                subjects[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean showInformationAboutSubjects() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println(subjects[i].toString());
            }
        }
        return true;
    }

    public boolean avgMark() {
        float mark = 0;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                mark += subjects[i].getMark();
            }
        }
        System.out.println("Student avarage mark: " + mark / subjects.length);
        return true;
    }
}
