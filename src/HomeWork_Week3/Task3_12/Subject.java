package HomeWork_Week3.Task3_12;

/**
 * Created by volodymyrkorniienko on 26.03.17.
 */
public class Subject {

    public String name;
    public int hoursSemester;
    public int studentHours;
    public int studentMark;

    public static Subject init (String name, int hoursSemester, int studentHours, int studentMark) {
        Subject subject = new Subject();
        subject.name = name;
        subject.hoursSemester = hoursSemester;
        subject.studentHours = studentHours;
        subject.studentMark = studentMark;
        return subject;
    }
}
