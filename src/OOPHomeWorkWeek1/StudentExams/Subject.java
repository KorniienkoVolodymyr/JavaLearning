package OOPHomeWorkWeek1.StudentExams;

/**
 * Created by volodymyrkorniienko on 08.04.17.
 */
public class Subject {

    private String name;
    private int hoursInSemester;
    private int studentHoursWas;
    private int mark;

    public Subject(String name, int hoursInSemester, int studentHoursWas, int mark) {
        this.name = name;
        this.hoursInSemester = hoursInSemester;
        this.studentHoursWas = studentHoursWas;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public static void showSubjectInformation(Subject subject) {
        System.out.println(subject.toString());
    }

    public String toString() {
        return String.format("Subject name: %s\nSubject hours in semester: %d\n",
                name, hoursInSemester);
    }

    public int getMark() {
        return mark;
    }
}
