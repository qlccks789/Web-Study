// 단축URL 사용 연습하기
package net03.openapi;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Test03 {
	public static void main(String[] args) {
        String clientId = "xxx";
        String clientSecret = "xxx";
        try {
        	String orgUrl = URLEncoder.encode("http://sports.chosun.com/news/ntype5.htm?id=201803220100165250012095&ServiceDate=20180321", "utf-8");
//        	String orgUrl = URLEncoder.encode("http://sports.chosun.com/news/ntype5.htm?id=201803220100165250012095&ServiceDate=20180321", "utf-8");
//            String apiURL = "https://openapi.naver.com/v1/util/shorturl";
            String apiURL = "https://openapi.naver.com/v1/util/shorturl.xml";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String postParams = "url=" + orgUrl;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
