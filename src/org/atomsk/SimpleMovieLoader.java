package org.atomsk;

import java.util.ArrayList;

public class SimpleMovieLoader implements MovieLoader {




    @Override
    public ArrayList<Movie> getList() throws Exception {

        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("베태랑", 120));
        list.add(new Movie("명량", 150));
        list.add(new Movie("왕의남자", 110));

        return list;
    }
}
