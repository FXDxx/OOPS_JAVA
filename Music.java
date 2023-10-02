package Music;

public class Music {
    private String title;
    private String albumName;
    private String Genre;
    private int duration;
    private Date releaseDate;
    private Artist artist;

    Music(String title,String albumName,String Genre,int duration,Date releaseDate,Artist artist){
        this.title = title;
        this.albumName = albumName;
        this.Genre = Genre;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getGenre() {
        return Genre;
    }
    public void setGenre(String genre) {
        Genre = genre;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        String MusicDetails = String.format("%-20s %-20s %-20s %-20d %-20s %-20s",title,albumName,Genre,duration,releaseDate,artist);
        return MusicDetails;
    }
   
    
    public boolean equals (Object o){
        Music m = (Music) o;
        if (m.getTitle().equals(this.title) && m.getAlbumName().equals(this.albumName))
        {
            return true;
        }
        else
            return false;
    }


}

