import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 5:11 PM
    
    ProjectName: Bai4
*/public class Town {
    List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }
    // insert data family of town
    public void insertData(int n){
        for (int i = 0; i<n; i++){
            Family family = new Family();
            Family family1 = family.insertFamily();
            this.families.add(family1);
        }
    }
    // show information
    public void show(){
        this.families.forEach(o -> System.out.println(o.toString()));
    }
    // add family
    public void addFamily(Family family){
        this.families.add(family);
    }
}
