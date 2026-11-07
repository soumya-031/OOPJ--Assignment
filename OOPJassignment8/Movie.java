class Movie {

    String title;
    String director;
    String actor;
    String review;

    Movie(String t, String d, String a) {
        title = t;
        director = d;
        actor = a;
        review = "No review";
    }

    
    void addReview(String r) {
        review = r;
    }

    
    String getReview() {
        return review;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actor: " + actor);
        System.out.println("Review: " + getReview());
    }

    public static void main(String[] args) {

        Movie m = new Movie("The Dark Knight",
                            "Christopher Nolan",
                            "Christian Bale");

        m.addReview("Excellent movie");

        m.display();
    }
}

