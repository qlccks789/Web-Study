package net05.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import net05.json.GeoData.GeoPoint;

public class Quiz {
	public static void main(String[] args) {
		Quiz test02 = new Quiz();
		test02.service();
    }

	private static final String CLIENT_ID = "xxx";//애플리케이션 클라이언트 아이디값";
	private static final String CLIENT_SECRET = "xxx";//애플리케이션 클라이언트 시크릿값";
	private Scanner sc = new Scanner(System.in);
	
	public void service() {
        try {
        	while (true) {
        		System.out.print("주소를 입력하세요(예> 불정로 6) : ");
        		String searchAddr = sc.nextLine();
        		if (searchAddr.intern() == "exit") return;
        		
	            StringBuffer response = getNaverGeoData(searchAddr);
	            getGeoData(response.toString());
        	}
        } catch (Exception e) {
            System.out.println(e);
        }
	}

	private StringBuffer getNaverGeoData(String addr)
			throws UnsupportedEncodingException, MalformedURLException, IOException, ProtocolException {
		addr = URLEncoder.encode(addr, "UTF-8");
		String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr; //json
		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
		con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);
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
//            System.out.println(response.toString());
		return response;
	}
	
	private void getGeoData(String data) {
		Gson gson = new Gson();
		GeoData geoData = gson.fromJson(data, GeoData.class);
		GeoPoint point = geoData.getResult().getItems().get(0).getPoint();
		System.out.println("x : " + point.getX() + ", y : " + point.getY());
	}
}
class GeoData {
	class GeoPoint {
		private String x;
		private String y;
		public String getX() {
			return x;
		}
		public void setX(String x) {
			this.x = x;
		}
		public String getY() {
			return y;
		}
		public void setY(String y) {
			this.y = y;
		}
	}
	class Item {
		private GeoPoint point;
		public GeoPoint getPoint() {
			return point;
		}
		public void setPoint(GeoPoint point) {
			this.point = point;
		}
		
	}
	class Result {
		List<Item> items;

		public List<Item> getItems() {
			return items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}
	}
	private Result result;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
}
/*
{    
	"result": {        
				"total": 1,        
				"userquery": "불정로 6",        
				"items": [            
							{                
							"address": "경기도 성남시 분당구 불정로 6 NAVER그린팩토리",                
							"addrdetail": {                    
											"country": "대한민국",                    
											"sido": "경기도",                    
											"sigugun": "성남시 분당구",                    
											"dongmyun": "불정로",                    
											"ri": "",                    
											"rest": "6 NAVER그린팩토리"                
										  },                
							"isRoadAddress": true,                
							"point": {                    
									"x": 127.1052133,                    
									"y": 37.3595316                
									}            
							}        
						]    
				}
}
*/












