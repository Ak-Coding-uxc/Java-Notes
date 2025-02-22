/* Function Overloading is compile time Polymorphism
Same name different work.
 */
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public String printinfo(String name){
        return name;// Send element return if name attribute and parimeter name is same.
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }

}

public class OOPS2 {
    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Aman";
        s1.age = 21;

        s1.printInfo(s1.name,s1.age);

        System.out.println("The name is "+ s1.printinfo("AK"));
    }
}
