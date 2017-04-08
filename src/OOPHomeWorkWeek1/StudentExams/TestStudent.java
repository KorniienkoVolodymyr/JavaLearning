package OOPHomeWorkWeek1.StudentExams;

/**
 * Created by volodymyrkorniienko on 26.03.17.
 */
public class TestStudent {
    public static void main(String[] args) {

        Student student = Student.init("Vova",
                Address.init("Kyiv", "Komarova", 10), 7);

        student.addSubject(Subject.init("Math", 150, 150, 5));
        student.addSubject(Subject.init("Math1", 151, 156, 4));
        student.addSubject(Subject.init("Math2", 152, 155, 3));
        student.addSubject(Subject.init("Math3", 153, 154, 5));
        student.addSubject(Subject.init("Math4", 154, 153, 5));
        student.addSubject(Subject.init("Math5", 155, 152, 4));
        student.addSubject(Subject.init("Math6", 156, 151, 3));

        //student.showInformationAboutSubjects();
        //student.removeLastSubject();
        //student.showInformationAboutSubjects();
        //student.avgMarks();
    }
}
