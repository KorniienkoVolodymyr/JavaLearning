package OOPHomeWorkWeek1.StudentExams;

/**
 * Created by volodymyrkorniienko on 08.04.17.
 */
public class TestStudent {
    public static void main(String[] args) {

        Address address1 = new Address("Kyiv", "Komarova", 10);
        Student student1 = new Student("Vova", address1, 5);
        Subject subject1 = new Subject("Math", 150, 150, 4);
        student1.addSubject(subject1);
        Subject subject2 = new Subject("Math1", 150, 150, 5);
        student1.addSubject(subject2);
        Subject subject3 = new Subject("Math2", 150, 150, 3);
        student1.addSubject(subject3);
        Subject subject4 = new Subject("Math3", 150, 150, 5);
        student1.addSubject(subject4);
        Subject subject5 = new Subject("Math4", 150, 150, 5);
        student1.addSubject(subject5);

        //Subject.showSubjectInformation(subject1);
        //student1.showAllInformationAboutSubject("Math");
        //student1.removeLastSubject();
        //student1.showInformationAboutSubjects();
        student1.avgMark();
    }
}
