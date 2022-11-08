import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 5:11 PM
    
    ProjectName: Bai4
*/public class Family {
    private List<Person> family;
    private String address;

    public Family() {
        this.family = new ArrayList<>();
    }

    public Family(String address) {
        this.address = address;
        this.family = new ArrayList<>();
    }

    public Family(List<Person> family, String address) {
        this.family = family;
        this.address = address;
    }

    public List<Person> getFamily() {
        return family;
    }

    public void setFamily(List<Person> family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // insert data person
    public List<Person> insertPerson(Scanner scanner, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter person " + i+1 + " : " );
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter job: ");
            String job = scanner.nextLine();
            System.out.println("Enter passport: ");
            String passport = scanner.nextLine();
            this.family.add(new Person(name, age, job, passport));
        }
        return this.family;
    }
    // insert data 1 family
    public Family insertFamily(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter address: ");
        this.address = scanner.nextLine();
        System.out.println("Enter number person of family");
        int numberPerson = scanner.nextInt();
        scanner.nextLine();
        Family family = new Family(address);
        family.insertPerson(scanner, numberPerson);
        return family;
    }


        @Override
    public String toString() {
        return "Family{" +
                "family=" + family +
                ", address='" + address + '\'' +
                '}';
    }
}
