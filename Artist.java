package Music;

public class Artist {
    
private String name;
private String nationality;
private double rating;


Artist(String name,String nationality,double rating){
    this.name = name;
    this.nationality = nationality;
    this.rating = rating;
}


public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getNationality() {
    return nationality;
}

public void setNationality(String nationality) {
    this.nationality = nationality;
}

public double getRating() {
    return rating;
}

public void setRating(double rating) {
    this.rating = rating;
}

public String toString(){
    String artistDetail = String.format("%-10s%-15s%-5f",name,nationality,rating);
    return artistDetail;
}

}
