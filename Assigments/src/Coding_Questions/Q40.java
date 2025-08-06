package Coding_Questions;

import java.util.*;

class CD implements Comparable<CD> {
    private String title;
    private String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public int compareTo(CD other) {
        return this.singer.compareToIgnoreCase(other.singer);
    }

   
    public String toString() {
        return "CD [Title: " + title + ", Singer: " + singer + "]";
    }
}

public class Q40 {
    public static void main(String[] args) {
        List<CD> cdList = new ArrayList<>();

        cdList.add(new CD("Love Story", "Taylor Swift"));
        cdList.add(new CD("Thriller", "Michael Jackson"));
        cdList.add(new CD("Shape of You", "Ed Sheeran"));
        cdList.add(new CD("Hello", "Adele"));

     
        Collections.sort(cdList);

        System.out.println("CDs sorted by Singer Name:");
        for (CD cd : cdList) {
            System.out.println(cd);
        }
    }
}
