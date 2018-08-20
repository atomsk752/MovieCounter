package org.atomsk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {


//        MovieLoader loader = new KoreanMovieLoader();
//        MovieLoader loader = new SimpleMovieLoader();
        MovieLoader loader = new NetworkLoader();

        MovieUI ui = new MovieUI(loader);

        ui.printList();


    }
}
