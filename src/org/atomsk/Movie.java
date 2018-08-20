package org.atomsk;

public class Movie implements Comparable<Movie> {

    String title;
    int count;

    public Movie(String title, int count) {
        this.title = title;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Movie o){
        return o.count - this.count;

    }

}
