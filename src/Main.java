import Association.*;
import Composition.*;
import Aggregation.*;
import java.util.*;
/** The duty of this is to show off the differences between object ownership Association, Composition, and Aggregation.
 *
 */
class Main {

    public static void main(String[] args){

        //Three method calls to show the difference between the objects
        Association();
        Composition();
        Aggregation();

    }


    //In this example we are going to use a company and an employee.
    public static void Association(){

        Company Example_Company = new Company();
        Employee Example_Employee = new Employee();

        /*In this example we have Association.Company and Association.Employee. Since there is no clear ownership, the
         * relationship can be one-to-one, one-to-many or many-to-many. Each object can survive on its own as if
         * Association.Employee was destroyed Association.Company would still exist and vice versa.
         */
    }

    //In this example we will use Students and a Department
    public static void Composition(){

        Student st1, st2, st3, st4;

        st1 = new Student("Bob", 1);
        st2 = new Student("May", 2);
        st3 = new Student("Jill", 3);
        st4 = new Student("Chris", 4);

        Student[] Students = {st1, st2, st3, st4};

        Department Example_Department = new Department("Math", Students);
        /* In this example we have Composition.Department and Student. This is a unidirectional relationship because
         * there is a clear ownership. In this example the Department object has a clear ownership of the Students
         * objects. In Composition both objects will survive if one of them was to be destroyed. If a department was
         * removed the students would still be there and vice versa if the students were to leave there would still be
         * a department.
         */
    }

    //In this example we will use Book and Author
    public static void Aggregation(){

        Book bk1, bk2, bk3;


    }
}
