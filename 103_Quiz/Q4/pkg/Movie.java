package pkg;
public class Movie{
    //variables
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    //constructors
    public Movie(){
        movieName = "Unknown";
        rating = 0.0;
        numRatings = 0;
        revenue = 0;
        return;
    }
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
        return;
    }
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of Ratings: "+numRatings);
        System.out.println("Revenue: "+revenue);
        System.out.println();
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public int getNumRating(){
        return numRatings;
    }
    public void addRating(double a){
        rating = ((numRatings*rating)+a)/(numRatings+1);
        numRatings = numRatings+1;

    }
    public boolean compareRatings(Movie a){
       if(a.getRating()>rating){
        return false;
       } else{
        if(a.getRating()<rating){
            return true;
        } else{
            if(a.getRating()==rating){
                return true;
            }
            }
        }
       }
    }