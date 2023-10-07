import java.util.Random;

import java.io.*;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {

        // 입력 파일과 출력 파일 경로 설정
        String inputFilePath = "C:\\Class\\code\\java\\Hello\\src\\file.txt";
        String outputFilePath = "C:\\Class\\code\\java\\Hello\\src\\output.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            
            Set<String> insertStatements = new HashSet<>();
            String line;
            
            while ((line = reader.readLine()) != null) {
                // INSERT 문 찾기
                if (line.startsWith("INSERT INTO tblTestScore (testScoreNum,testNum,studentNum,attendanceScore,writtenScore,practicalScore) VALUES")) {
                    // 중복 INSERT 문이 아닌 경우만 쓰기 실행
                    if (insertStatements.add(line)) {
                        writer.write(line);
                        writer.newLine();
                    }
                } else {
                    writer.write(line);
                    writer.newLine();
                }
            }
            
            reader.close();
            writer.close();
            
            System.out.println("중복 INSERT문 제거 SQL 파일 생성");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
//		Random rnd = new Random();
//		
//		for (int i = 1; i <= 30; i++) {
//			int memberNo = rnd.nextInt(330) + 1;
//			int teacherNo = rnd.nextInt(6) + 1;
//			System.out.println("INSERT INTO tblConsulting (consultingNum, studentNum, teacherNum, consultingContent, isComplete)");
//			System.out.println("			VALUES (seqConsulting, '" + memberNo + "', '" + teacherNo + "', 1" + ");");
//		}
//		
		/*
		for (int i = 1; i <= 504; i++) {
			if (i <= 336) {
				System.out.println("INSERT INTO tblAccessCard (accessCardNum, studentNum, isAccessCard) values (seqAccessCard, '" + i + "', 0);");
			} else {
				System.out.println("INSERT INTO tblAccessCard (accessCardNum, studentNum, isAccessCard) values (seqAccessCard, '" + i + "', 1);");
			}
		}
		
		/*
		Random random = new Random();
        String j = "'4'";
        String item = "'PK1100'";

        for (int i = 1; i <= 200; i++) {
            double randomValue = random.nextDouble(); // 0.0에서 1.0 사이의 랜덤 실수 생성
            String itemCondition;

            if (randomValue <= 0.8) {
                itemCondition = "'상'";
            } else if (randomValue <= 0.9) {
                itemCondition = "'중'";
            } else {
                itemCondition = "'하'";
            }

            String lectureRoomNum;
            if (i <= 35) {
                lectureRoomNum = "'1'";
            } else if (i <= 70) {
                lectureRoomNum = "'2'";
            } else if (i <= 105) {
                lectureRoomNum = "'3'";
            } else if (i <= 135) {
                lectureRoomNum = "'4'";
            } else if (i <= 165) {
                lectureRoomNum = "'5'";
            } else if (i <= 195) {
                lectureRoomNum = "'6'";
            } else {
                lectureRoomNum = "NULL";
            }

            System.out.println("INSERT INTO tblItemDetail (itemDetailNum, itemNum, itemName, itemCondition, lectureRoomNum)");
            System.out.println("			values (seqItemDetail.nextVal, " + j + ", " + item + ", " + itemCondition + ", " + lectureRoomNum + ");");
        }
        */
	}
}

//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.io.BufferedReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /*URL*/
//        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=서비스키"); /*Service Key*/
//        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
//        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
//        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
//        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20210628", "UTF-8")); /*‘21년 6월 28일발표*/
//        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /*05시 발표*/
//        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
//        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
//        URL url = new URL(urlBuilder.toString());
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Content-type", "application/json");
//        System.out.println("Response code: " + conn.getResponseCode());
//        BufferedReader rd;
//        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        } else {
//            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//        }
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = rd.readLine()) != null) {
//            sb.append(line);
//        }
//        rd.close();
//        conn.disconnect();
//        System.out.println(sb.toString());
//        
//        System.out.println(urlBuilder);
//    }
//}