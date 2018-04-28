package SRP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// 데이터 네트워크 요청과 가공의 책임 2가지를 가짐

public class DataController {

    URL url = null;
    HttpURLConnection conn = null;
    String jsonData = "";
    BufferedReader br = null;
    StringBuffer sb = null;
    String data;
    // 네트워크 요청
    void receiveHttpData(){
        try {
            url = new URL("www.naver.com/server");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestMethod("GET");
            conn.connect();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            sb = new StringBuffer();
            while ((jsonData = br.readLine()) != null) {sb.append(jsonData); }
            data = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 데이터를 가공
     String transHttpData(){
        if(data != null) {
            data.toUpperCase();
        }else{
            System.out.println("데이타가 없네");
            data = "";
        }
        return data;
    }

}
