import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 5:10 PM
    
    ProjectName: Bai4
*/public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        while(true){
            System.out.println("Application manager families");
            System.out.println("Enter 1: To Insert family");
            System.out.println("Enter 2: To show information");
            System.out.println("Enter 3: Exit");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch(choice){
                case "1":{
                    System.out.println("Number family of town: ");
                    int numberFamilies = scanner.nextInt();
                    scanner.nextLine();
                    town.insertData(numberFamilies);
                    break;
                }
                case "2":{
                    town.show();
                    break;
                }
                case "3":{
                    System.out.println("Exit");
                    System.exit(0);
                }
                default:
                    break;
            }
        }
    }
}
