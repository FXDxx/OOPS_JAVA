package Music;

public class Date {
    private int date;
    private int month;
    private int year;

     Date(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getdate() {
        return date;
    }

    public void setdate(int date) {
        this.date = date;
    }

    public int getmonth() {
        return month;
    }

    public void setmonth(int month) {
        this.month = month;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }
    public String toString(){
        String dateDetail = String.format("%d/%d/%d",date,month,year);
        return dateDetail;
    }
}
