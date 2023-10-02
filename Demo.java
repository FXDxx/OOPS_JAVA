package Music;
import java.util.*;

public class Demo {
    public static void main(String args[]){

        Music music1 = new Music("Free Bird","Rock Classics","Classic",200,new Date(9, 10, 2023),new Artist("Baller", "American", 9.0));
        System.out.println(music1);
        Music music2 =  new Music("Rap Cavier","Slime You out","Modern",300,new Date(10,11,2023),new Artist("Fahad", "Pakistani", 9.7));
        System.out.println(music2);
        Music music3 =  new Music("Dead or Alive","Dead","Modern",250,new Date(22,01,1990),new Artist("Lil Tecca", "Francis", 9.5));
        System.out.println(music3);
        Music music4 =  new Music("greedy","Slime","Modern",300,new Date(1,06,2009),new Artist("Fawad Al", "Pakistani", 6.7));
        System.out.println(music4);
        Music music5 =  new Music("Roackabye","Clock","Modern",400,new Date(12,11,2003),new Artist("Camillo", "Portugese", 9.9));
        System.out.println(music5);


         //input 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter albumName: ");
        String albumName = sc.nextLine();
        System.out.print("Enter Genre: ");
        String Genre = sc.nextLine();
        System.out.print("Enter duration: ");
        int duration = sc.nextInt();
        //releaseDate
        System.out.println("--Enter Date--");
        System.out.print("Enter Day:");
        int date = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        //Artist
        System.out.println("----Enter Details of Artist----");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Nationality: ");
        String nationality = sc.nextLine();
        System.out.print("Rating: ");
        double rating = sc.nextDouble();
        Music music6 = new Music(title, albumName,Genre, duration, new Date(date,month,year), new Artist(name,nationality,rating));
        System.out.println(music6);
        
    
        Music list[] = new Music[20];
            list[0] = music1;
            list[1] = music2;
            list[2] = music3;
            list[3] = music4;
            list[4] = music5;
            list[5] = music6;

        for(int i = 0; i<=5;i++){
            Music mooro = list[i];
            System.out.println(mooro);
        }


        // Music List[] = {music1,music2,music3,music4,music5};

        // for(int i = 0; i<=5;i++){
        //     System.out.println(List[i]);
        // }


        Boolean m = music2.equals(music6);
        System.out.println(m);
        System.out.println("Record does not match with other record so edit is possible");
}
}

