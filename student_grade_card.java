import java.util.*;

class student {
    String name;
    int roll;

    student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name of the student.." + name);
        System.out.println("Roll of the student.." + roll);

    }
}

// .............................................
class arts extends student {
    int st1, st2;

    arts(String n, int r) {
        super(n, r);

    }

    void data() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of History...");
        st1 = sc.nextInt();
        System.out.println("Please enter the number of Bengali...");
        st2 = sc.nextInt();

    }

    void show() {
        System.out.println("name of the Student.." + name);
        System.out.println("roll of the student..." + roll);
        System.out.println("Marks gets in History.." + st1);
        System.out.println("Marks gets in Bengali.." + st2);

    }

    void total() {
        // int i1;
        // int i2;
        int sum;

        // i1=st1;
        // i2=st2;
        sum = st1 + st2;
        System.out.println("The Total marks Obtain is ..." + sum);

    }

    void avg() {
        int sum;
        sum = st1 + st2;
        int avg = sum / 2;

        System.out.println("Average is " + avg);

        if (avg > 90) {
            System.out.println("Grade is O ");
        } else if (avg > 80 && avg < 90) {
            System.out.println("Grade is E ");
        } else if (avg > 70 && avg < 80) {
            System.out.println("Grade is A ");
        } else if (avg > 60 && avg < 70) {
            System.out.println("Grade is B");
        } else if (avg > 60 && avg < 50) {
            System.out.println("Grade is C ");
        } else {
            System.out.println("Grade is F...Better Luck Next Time ");
        }
    }
}

class science extends student {
    int chem, phy;

    science(String n, int r) {
        super(n, r);

    }

    void data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Chemistry...");
        chem = sc.nextInt();
        System.out.println("enter the no. of Physics....");
        phy = sc.nextInt();
    }

    void show() {
        System.out.println("name of the Student.." + name);
        System.out.println("roll of the student..." + roll);
        System.out.println("Marks gets in Chemistry.." + chem);
        System.out.println("Marks gets in Physics.." + phy);

    }

    void total() {
        int sum;

        sum = chem + phy;
        System.out.println("The Total marks Obtain is ..." + sum);

    }

    void avg() {
        int sum;
        sum = chem + phy;
        int avg = sum / 2;
        System.out.println("Average is " + avg);

        if (avg > 90) {
            System.out.println("Grade is O ");
        } else if (avg > 80 && avg < 90) {
            System.out.println("Grade is E ");
        } else if (avg > 70 && avg < 80) {
            System.out.println("Grade is A ");
        } else if (avg > 60 && avg < 70) {
            System.out.println("Grade is B");
        } else if (avg > 60 && avg < 50) {
            System.out.println("Grade is C ");
        } else {
            System.out.println("Grade is F...Better Luck Next Time ");
        }

    }
}

public class student_grade_card {
    public static void main(String[] args) {
        int number1 = 0, number2 = 0, option = 0, example = 0;
        while (true) {
            {
                Scanner sc = new Scanner(System.in);
                // Asking the user to enter the choice
                System.out.println("Input your choice from the following menu:");
                System.out.println(" 1.Arts_Record \n 2.Science_record \n 3.Check The Rules of the Test....\n 4.Exit ");
                System.out.println(" ");

                option = sc.nextInt();

                switch (option) {
                    case 1:
                        arts obj = new arts("Ram Ratan Sarkar", 99);
                        obj.display();
                        obj.data();
                        obj.show();
                        obj.total();
                        obj.avg();

                        System.out.println(" ");

                        break;
                    case 2:
                        science obj1 = new science("Samiran Kumar Maity", 32);

                        obj1.display();
                        obj1.data();
                        obj1.show();
                        obj1.total();
                        obj1.avg();
                        break;

                    case 3:
                        System.out.println(
                                "Condition ---- Below Percentage is 50 you will be fail in the Test............");
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Invalid choice...Exit from the DataBase...");
                }
            }
        }
    }
}

// arts obj = new arts("Ram Ratan Sarkar",99);
// science obj1= new science("Samiran Kumar Maity",32);
// obj.display();
// obj.data();
// obj.show();
// obj.total();
//
// System.out.println(" ");
// System.out.println("For Science Students");
// System.out.println(" ");
//
//
// obj1.display();
// obj1.data();
// obj1.show();
// obj1.total();

// }
// }
