public class Person {
    public String lastName;
    public String firstName;
    public int birthYear;
    public int age;

    public void computeAge(int year) {
        age = year - birthYear;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + " (" + age + " ans)");
    }
    public Person (String fName,String lName,int bYear){
        lastName = lName;
        firstName = fName;
        birthYear = bYear;
        computeAge(2023);
    }
}
