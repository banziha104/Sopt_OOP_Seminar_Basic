package Responsebilty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static Responsebilty.DataTransFiler.netWorkData;

// 데이터를 받아오는 책임만 짐;
public class DataReceiver {
    URL url = null;
    HttpURLConnection conn = null;
    String jsonData = "";
    BufferedReader br = null;
    StringBuffer sb = null;
    String data = "";

    // 네트워크 요청
    void receiveHttpData(){
        try {
            url = new URL("www.naver.com/server");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Accept", "application/json");
            conn.connect();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            sb = new StringBuffer();
            while ((jsonData = br.readLine()) != null) {sb.append(jsonData); }
            data = sb.toString();

            // 여기서 의존성주입
            new DataTransFiler().upperThisString(data);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
