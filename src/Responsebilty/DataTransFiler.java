package Responsebilty;

public class DataTransFiler {
    public static String netWorkData;
    // 데이터를 전송
    void upperThisString(String str){
        if(str != null) {
            str.toUpperCase();
        }else{
            System.out.println("데이타가 없네");
            str = "";
        }
        netWorkData = str;
    }
}
