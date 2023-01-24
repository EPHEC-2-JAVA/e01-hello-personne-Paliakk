import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comment vous-appelez vous?");
        String name = sc.nextLine();
        if(name.equals("Marc")){
            for(int i = 0;i <20;i++){
                System.out.println("Es-tu sûr de vouloir t'appeller 'Connard'?");
                System.out.println("Comment vous-appelez vous?");
                name = sc.nextLine();
                name = "Connard";

            }
        }
        System.out.println("Et votre nom de famille?");
        String fam = sc.nextLine();
        System.out.println("Et votre année de naissance?");
        int annee = sc.nextInt();
        Person user = new Person(name,fam,annee);
        user.display();
    }

}