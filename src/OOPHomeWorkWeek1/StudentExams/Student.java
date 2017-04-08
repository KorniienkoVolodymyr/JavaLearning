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

    public void addSubject(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                break;
            }
        }
    }

    public void removeLastSubject() {
        for (int i = subjects.length - 1; i >= 0; i--) {
            if (subjects[i] != null) {
                subjects[i] = null;
                break;
            }
        }
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

    public void showInformationAboutSubject(String subjectName) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].name.equals(subjectName)) {
                System.out.println(subjects[i].name + " " + subjects[i].hoursSemester);
            }
        }
    }

    public void studentMark(String studentName, String subjectName) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].name.equals(subjectName) && this.name.equals(studentName)) {
                System.out.println(subjects[i].studentMark);
            }
        }
    }
}
