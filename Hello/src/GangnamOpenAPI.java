//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//public class GangnamOpenAPI {
//
//	public static void main(String[] args) {
//		
//		
//	}
//
//	private static void m2() {
//
//		/*
//		{
//			"name": "Isaac",
//			"age": 24
//			"tel": [ "010-1111-1111", "010-2222-2222", "010-3333-3333" ]
//		}
//		*/
//		// 자바에서는 이해할 수가 없는 표현이다. 이를 자바에 그대로 쓰면 오류가 난다.
//		// 이 표현을 자바에서 인식시키는 과정이다.
//		// 먼저 문자열 변수 안에 내용을 그대로 넣는다.
//		
//		String json = "{\r\n"
//				+ "			\"name\": \"Isaac\",\r\n"
//				+ "			\"age\": 24\r\n"
//				+ "			\"tel\": [ \"010-1111-1111\", \"010-2222-2222\", \"010-3333-3333\" ]\r\n"
//				+ "		}";
//		
//		JSONParser parser = new JSONParser();
//		// org.json.simple에 있는 parser를 불러온다.
//		// 구문을 분석하고 해석하는 역할을 하는 것들을 주로 parser라고 부른다.
//		
//		try {
//			
//			JSONObject obj = (JSONObject)parser.parse(json);
//			System.out.println(obj); // {"name":"Isaac","tel":["010-1111-1111","010-2222-2222","010-3333-3333"],"age":24}
//			
//			System.out.println(obj.get("name")); // Isaac
//			System.out.println(obj.get("age")); // 24
//			// System.out.println(obj.get("tel")); // ["010-1111-1111","010-2222-2222","010-3333-3333"]
//			
//			JSONArray arr = (JSONArray)obj.get("tel");
//			
//			for (Object t : arr) {
//				System.out.println(t);
//			}
//			/*
//				010-1111-1111
//				010-2222-2222
//				010-3333-3333
//			*/
//			
//			// 예외처리를 위해 trycatch문으로 묶어준다.
//			// 파싱(해석)을 하면 JSON 오브젝트라는 클래스 타입으로 리턴한다.
//			// 다운캐스팅을 해줘야 한다. (JSONObject)
//			
//		} catch (Exception e) {
//			System.out.println("at Ex76.m2");
//			e.printStackTrace();
//		}
//	}
//
//	private static void m1() {
//
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("[지하철 정보 검색]");
//		System.out.print("지하철 역 검색: ");
//		String stationName = scan.nextLine();
//		
//		
//		// 1. 요청 URL 만들기
//		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?"; // ?를 붙인다
//		// QueryString
//		// http://data.go.kr/SttnList?키=데이터&키=데이터&키=데이터&키=데이터
//		// 인터넷 주소 맨 끝에 ?(예약어)를 붙인다.
//		// 이 주소를 호출할 때, 데이터를 같이 보내겠다는 의미의 물음표이다.
//		// ? 뒤에 서버에 넘겨주고 싶은 데이터를 입력한다. 그런데 이때 변수의 이름을 붙이듯이 데이터에 이름을 붙여줘야 하며, 이를 key라고 한다.
//		// 어떤 데이터를 넘겨받았는지를
//		// 이렇게 ?로 연결된 값들을 QueryString이라고 부른다.
//		
//		
//		// ServiceKey=
//		url += "ServiceKey=iLyILlrJV98k5gCiUTZbXPS97A3iKXGPwf9Hodv7RqvBL6A%2Fq0GZbBD0F7BV%2Bxsi6MJEhSpU8TFY8ryMtv0B8Q%3D%3D";
//		// 할당받은 개인 키 입력하면 서비스를 이용하는 자격이 생긴 것이다.
//		
//		// &_type=json
//		url += "&_type=json"; // XML or JSON
//		// 데이터를 요청하면 데이터를 반환받는데, XML으로 받을지 JSON으로 받을지를 선택할 수 있다.
//		// 지금은 JSON으로 돌려받기도 하자.
//	
//		
//		url += "&numOfRows=10"; // 10개씩 돌려받겠습니다.
//		
//		url += "&pageNo=1"; // 첫번째 페이지부터 받겠습니다.
//		
//		
//		// url += "&subwayStationName=역삼"; // 조회하고 싶은 역 조회	
//
//		url += "&subwayStationName=" + URLEncoder.encode(stationName); // 조회하고 싶은 역 조회
//		//System.out.println(url);
//		
//		// 이렇게 만들어진 주소를 chrome에 넣으면 값이 나온다.
//		// {"response":{"header":{"resultCode":"00","resultMsg":"NORMAL SERVICE."},"body":{"items":{"item":{"subwayRouteName":"2호선","subwayStationId":"MTRS12221","subwayStationName":"역삼"}},"numOfRows":10,"pageNo":1,"totalCount":1}}}
//		
//		
//		try {
//			// URL 객체 생성
//			URL obj_url = new URL(url);
//			
//			// URL과 연결하는 객체를 생성 > 브라우저 대신에 접속을 해준다.
//			HttpURLConnection conn = (HttpURLConnection)obj_url.openConnection();
//			// HttpURLConnection는 java.net으로 가져와야 한다. (패키지가 4개가 있다.)
//			
//			conn.setRequestMethod("GET");
//			conn.setRequestProperty("Content-type", "application/json");
//			// 요청할 떄 들어가는 옵션
//			
//			BufferedReader reader = null;
//			
//			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			} else {
//				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//			}
//			
//			// reader > 검색 결과 읽기가 가능해졌다.
//			String line = null;
//			
//			/*
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//			*/
//			/*
//			// 에러 발생
//			<OpenAPI_ServiceResponse>
//				<cmmMsgHeader>
//					<errMsg>SERVICE ERROR</errMsg>
//					<returnAuthMsg>SERVICE_KEY_IS_NOT_REGISTERED_ERROR</returnAuthMsg>
//					<returnReasonCode>30</returnReasonCode>
//				</cmmMsgHeader>
//			</OpenAPI_ServiceResponse>
//			*/
//			
//			
//			// JSONParser
//			JSONParser parser = new JSONParser();
//			
//			JSONObject root = (JSONObject)parser.parse(reader);
//			
//			JSONObject response = (JSONObject)root.get("response");
//			
//			JSONObject body = (JSONObject)response.get("body");
//			
//			JSONObject items = (JSONObject)body.get("items");
//			
//			// 역삼/잠실이 형태가 서로 다르다.
//			// 역이 1개일 때와 여러개일 때 JSON 표현이 다르다.
//			
//			ArrayList<String> temp = new ArrayList<String>();
//			
//			if (items.get("item") instanceof JSONObject) {
//				
//				JSONObject item = (JSONObject)items.get("item");
//				
//				System.out.println("1. ");
//				System.out.println("호선: " + item.get("subwayRouteName"));
//				System.out.println("역명: " + item.get("subwayStationName"));
//				
//				temp.add(item.get("subwayStationId").toString());
//				
//			} else {
//				
//				JSONArray arr = (JSONArray)items.get("item");
//				
//				int n = 1;
//				
//				for (Object obj : arr) {
//					JSONObject item = (JSONObject)obj;
//					System.out.println(n + ".");
//					System.out.println("호선: " + item.get("subwayRouteName"));
//					System.out.println("역명: " + item.get("subwayStationName"));
//					System.out.println("--------");
//					temp.add(item.get("subwayStationId").toString());
//					n++;
//				}
//			}
//			
//			reader.close();
//			conn.disconnect();
//			
//			System.out.print("역 선택: ");
//			int sel = scan.nextInt();
//			
//			System.out.println(temp.get(sel - 1)); // 역 ID
//			
//			
//			// 지하철역 출구번호별로 주변시설의 목록을 조회하는 기능
//			url = "http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnExitAcctoCfrFcltyList?";
//			url += "ServiceKey=iLyILlrJV98k5gCiUTZbXPS97A3iKXGPwf9Hodv7RqvBL6A%2Fq0GZbBD0F7BV%2Bxsi6MJEhSpU8TFY8ryMtv0B8Q%3D%3D";
//			url += "&_type=json";
//			url += "&numOfRows=10";
//			url += "&pageNo=1";
//			url += "&subwayStationId=" + temp.get(sel - 1);
//			
//			obj_url = new URL(url);
//			conn = (HttpURLConnection)obj_url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.setRequestProperty("Content-type", "application/json");
//			
//			reader = null;
//			
//			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			} else {
//				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//			}
//			
//			root = (JSONObject)parser.parse(reader);
//			response = (JSONObject)root.get("response");
//			body = (JSONObject)response.get("body");
//			items = (JSONObject)body.get("items");
//			
//			if (items.get("item") instanceof JSONObject) {
//				
//				JSONObject item = (JSONObject)items.get("item");
//				
//				System.out.println("출구: " + item.get("exitNo") + "번");
//				System.out.println("주변시설: " + item.get("dirDesc"));
//				
//			} else {
//				JSONArray arr = (JSONArray)items.get("item");
//			
//				for (Object obj : arr) {
//					
//					JSONObject item = (JSONObject)obj;
//					
//					System.out.println("출구: " + item.get("exitNo") + "번");
//					System.out.println("주변시설: " + item.get("dirDesc"));
//				}
//			}
//			
//			reader.close();
//			conn.disconnect();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		// 이렇게 만들어진 주소를 URL이라는 클래스의 인스턴스로 만든다.
//		// 인터넷으로 나가는 입출력이므로 예외처리를 해준다.
//		
//		
//		//json viewer
//		// http://json.parser.online.fr/
//		// JSON으로 조회한 결과를 붙여넣는다.
//		// JSON이라는 데이터를 표현하는 문법을 보기 좋게 변환시켜 주는 사이트이다.
//		/*
//		// JSON은 객체를 중괄호 {}로 표현한다.
//		{
//			"name": "홍길동",
//			"kor": 100,
//			"eng": 90,
//			"math", 80
//			"nick": ["데이터1", "데이터2"]
//		}
//		*/
//		
//		
//		// response 라는 이름으로 객체를 돌려준 것이다.
//		// 그리고 header라는 데이터와 body라는 데이터로 구분되어 있는 것을 볼 수 있다.
//		// body 안에 items라는 파트 안에 내가 알고 싶은 데이터가 보통 들어 있고, 그것에 관련된 추가 상황들을 아래에서 보여준다.
//		
//	}
//}
