import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DummyData {
	public static void main(String[] args) {

		Random rnd = new Random();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		String dataFilePath = "C:\\Class\\code\\java\\Hello\\src\\menu_selection.txt";
		String sortedDataFilePath = "C:\\Class\\code\\java\\Hello\\src\\sorted_menu_selection.txt";

		// 더미데이터 생성
		/*
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(dataFilePath));

			for (int i = 0; i < 3000; i++) {
				// 회원 번호 (1~1000)
				int memberNo = rnd.nextInt(1000) + 1;

				// 메뉴 번호 (1~300)
				int menuNo = rnd.nextInt(300) + 1;

				// 날짜
				Calendar calendar = Calendar.getInstance();
				calendar.set(2022, Calendar.JANUARY, 1);
				calendar.add(Calendar.DAY_OF_YEAR, rnd.nextInt(621)); // 2023년 9월 13일
				String date = dateFormat.format(calendar.getTime());

				writer.write(String.format("%d,%d,%d,%s\r\n", i + 1, memberNo, menuNo, date));
			}

			writer.close();
			System.out.println("메뉴 선택 더미 데이터 생성");

		} catch (Exception e) {
			System.out.println("메뉴 선택 더미 데이터 생성 에러");
			e.printStackTrace();
		}
		*/
		
		// 더미데이터 중복 확인
		try {
			BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
			Map<Integer, Set<String>> memberDateMap = new HashMap<>();

			String line;
			while ((line = reader.readLine()) != null) {
				// 번호,회원번호,메뉴번호,날짜
				String[] parts = line.split(",");
				if (parts.length == 4) {
					int memberNo = Integer.parseInt(parts[1]);
					String date = parts[3];

					Set<String> dateSet = memberDateMap.getOrDefault(memberNo, new HashSet<>());

					// 회원별 중복 날짜 검증
					if (dateSet.contains(date)) {
						System.out.println("회원 번호 " + memberNo + "의 중복된 날짜: " + date);
					} else {
						dateSet.add(date);
						memberDateMap.put(memberNo, dateSet);
					}
				}
			}

			reader.close();
		} catch (Exception e) {
			System.out.println("더미데이터 중복 확인 에러");
			e.printStackTrace();
		}

		// 특정 회원의 메뉴 리스트 확인
		try {
			BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
			Map<Integer, StringBuilder> memberDataMap = new HashMap<>();

			String line;
			while ((line = reader.readLine()) != null) {
				// 번호,회원번호,메뉴번호,날짜
				String[] parts = line.split(",");
				if (parts.length == 4) {
					int memberNo = Integer.parseInt(parts[1]);
					String menuInfo = String.format("메뉴번호: %s, 날짜: %s\n", parts[2], parts[3]);

					// 데이터를 StringBuilder에 추가
					StringBuilder memberData = memberDataMap.getOrDefault(memberNo, new StringBuilder());
					memberData.append(menuInfo);
					memberDataMap.put(memberNo, memberData);
				}
			}

			reader.close();

			// 특정 회원 번호의 데이터 출력
			int memberIdToDisplay = 1; // 1번 회원
			StringBuilder memberData = memberDataMap.get(memberIdToDisplay);
			if (memberData != null) {
				System.out.println("회원 번호 " + memberIdToDisplay + "의 데이터:\n" + memberData.toString());
			} else {
				System.out.println("회원 번호 " + memberIdToDisplay + "에 대한 데이터가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("특정 회원의 메뉴 리스트 확인 에러");
			e.printStackTrace();
		}

		// 데이터를 날짜 기준으로 오름차순으로 정렬
		try {
			BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
			List<String> lines = new ArrayList<>();

			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}

			reader.close();

			Collections.sort(lines, new Comparator<String>() {
				@Override
				public int compare(String line1, String line2) {
					// 번호,회원번호,메뉴번호,날짜
					String[] parts1 = line1.split(",");
					String[] parts2 = line2.split(",");
					if (parts1.length == 4 && parts2.length == 4) {
						String date1 = parts1[3];
						String date2 = parts2[3];
						return date1.compareTo(date2);
					}
					return 0;
				}
			});

			// 정렬된 데이터를 기반으로 라벨링을 새로 함
			BufferedWriter writer = new BufferedWriter(new FileWriter(sortedDataFilePath));
			int lineNumber = 1;
			for (String sortedLine : lines) {
				String[] parts = sortedLine.split(",");
				if (parts.length == 4) {
					String newLine = lineNumber + "," + parts[1] + "," + parts[2] + "," + parts[3];
					writer.write(newLine + "\r\n");
					lineNumber++;
				}
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("데이터를 날짜 기준으로 오름차순으로 정렬 에러");
			e.printStackTrace();
		}
	}
}

//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Random;
//
//public class DummyData {
//
//    public static void main(String[] args) {
//
//        Random rnd = new Random();
//
//        String idCharacters = "abcdefghijklmnopqrstuvwxyz";
//        String passwordCharacters = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
//
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Class\\code\\java\\Hello\\src\\member.txt"));
//
//            for (int i = 0; i < 1000; i++) {
//                // 회원 번호
//                int no = i + 1;
//
//                // ID
//                String id = generateRandomString(idCharacters, rnd.nextInt(6) + 5);
//
//                // 비밀번호
//                String password = generateRandomString(passwordCharacters, rnd.nextInt(7) + 10);
//
//                // 회원명
//                String name = generateRandomName(rnd);
//
//                // 나이 (20 ~ 60)
//                int age = rnd.nextInt(41) + 20;
//
//                // 연락처
//                String tel = "010-" + (rnd.nextInt(8999) + 1000) + "-" + (rnd.nextInt(8999) + 1000);
//                
//				// 생년월일
//				String birthdate = generateRandomBirthdate();
//				
//                writer.write(String.format("%d,%s,%s,%s,%s,%s\r\n", no, id, password, name, tel, birthdate));
//            }
//
//            writer.close();
//            System.out.println("더미 데이터 생성 완료");
//
//        } catch (Exception e) {
//            System.out.println("at DummyData.main");
//            e.printStackTrace();
//        }
//    }
//
//    private static String generateRandomString(String characters, int length) {
//        Random rnd = new Random();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            int index = rnd.nextInt(characters.length());
//            sb.append(characters.charAt(index));
//        }
//        return sb.toString();
//    }
//
//    // Generate a random name from your existing arrays
//    private static String generateRandomName(Random rnd) {
//        String[] name1 = { "김", "이", "박", "최", "정", "현", "길", "조", "신", "허" };
//        String[] name2 = { "진", "민", "인", "지", "명", "정", "석", "길", "원", "현", "동", "덕" };
//        return name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)]
//                + name2[rnd.nextInt(name2.length)];
//    }
//    
//    private static String generateRandomBirthdate() {
//        Random rnd = new Random();
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR, -rnd.nextInt(60));
//        calendar.add(Calendar.DAY_OF_YEAR, -rnd.nextInt(365));
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
//        return dateFormat.format(calendar.getTime());
//    }
//}
