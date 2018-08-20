package org.atomsk;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class FileCopy1 {

    public static void main(String[] args) throws Exception{

 // jpg      String str ="https://blogfiles.pstatic.net/MjAxODA4MDJfNiAg/MDAxNTMzMTk1MTEyMjQz.vN_Tzt2gWkm65mJzBxjMOh8KVgKoHfTs8Dga5yA2rwUg._yuBpMPgdrsEN_QFgKVW-F4W0jVUAGU1pg0BQk0sN4Ag.JPEG.scolor22/DSC03797.JPG";
        String str = "https://cdn.videofarm.daum.net/vod/ve993eUudeUxhXIdVWIh9LV/mp4_1280_720_2M/movie.mp4?px-time=1534763327&px-hash=b1a220714533d960a02338a8e8a5c2b4&px-bps=2850599&px-bufahead=10";
        URL url = new URL(str);
        InputStream in = url.openStream();
//        InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");
        OutputStream out = new FileOutputStream("C:\\zzz\\copy.mp4");

        while (true){

            //1byte data
            int data = in.read();
            System.out.println(data);
            out.write(data);
            if (data == -1){

                break;
            }//end if
        }//end wile


    }



}
