public class Course {

  private String courseName;

    private Instructor instructor;

    private TextBook textBook;

    

    public Course(String name, Instructor instr, TextBook text) {

        //Assign the courseName

        courseName = name;

        

        //Create a new Instructor object, passing

        //instr as an argument to the copy instructor,

        instructor = new Instructor(instr);

        

        //create a new textbook object, passing

        //text as an argument to the copy instructor

        textBook = new TextBook(text);

    }

    /**

     * getName method

     * @return 

     */

    public String getName() {

        return courseName;

    }

    

    public Instructor getInstructor() {

        return new Instructor(instructor);

    }

    

    public TextBook getTextBook() {

        return new TextBook(textBook);

    }

    

    public String toString() {

        String str = "Course name: " + courseName +

                "\nInstructor Information: \n" + instructor +

                "\nTextBook information: \n" + textBook;

        

                return str;

    }

    

    public class Instructor {

    private String lastName;

    private String firstName;

    private String officeNumber;

    

    public Instructor(String lname, String fname, String office) {

        lastName = lname;

        firstName = fname;

        officeNumber = office;

    }

    

    public Instructor(Instructor object2) {

        lastName = object2.lastName;

        firstName = object2.firstName;

        officeNumber = object2.officeNumber;

    }

    

    public void set(String lname, String fname, String office) {

        lastName = lname;

        firstName = fname;

        officeNumber = office;

    }

    

    public String toString() {

        String str = "Last Name: " + lastName + 

                "\nFirst Name: " + firstName + 

                "\nOffice Number: " + officeNumber;

        return str;

    }

}

public class TextBook {

    private String title;

    private String author;

    private String publisher;

    

    public TextBook(String textTitle, String auth, String pub) {

        title = textTitle;

        author = auth;

        publisher = pub;

    }

    

    public TextBook(TextBook object2) {

        title = object2.title;

        author = object2.author;

        publisher = object2.publisher;

    }

    

    public void set(String textTitle, String auth, String pub) {

        title = textTitle;

        author = auth;

        publisher = pub;

    }

    

    public String toString() {

        String str = "Title: " + title +

                "\nAuthor: " + author +

                "\nPublisher: " + publisher;

        return str;

    }

}



public class CourseDemo {



    public static void main(String[] args) {

       Instructor myInstructor = new Instructor("Patrick", "Bukan INI", "AG2310BF");
       
       TextBook myTextBook = new TextBook("How to be Normal", "fish", "flow");
       
       Course myCourse = new Course("Self Motivation", myInstructor, myTextBook);
       
       System.out.println(myCourse);

    }

    

}



}
