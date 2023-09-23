package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StuffInfo {

	static Scanner sc;
	static {
		sc = new Scanner(System.in);

	}
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public static ArrayList<SellingStuff> list;
	static {
		StuffInfo.list = new ArrayList<>();
	}

public static void listLoad(){
    try (BufferedReader br = new BufferedReader(new FileReader("/Users/oseunghyeon/Downloads/sellingStuff.txt"))) {
        String line;
        while ((line = br.readLine()) != null ) {
            String[] temp=line.split(","); //
            SellingStuff s = new SellingStuff(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7], temp[8],temp[9],temp[10]);
           StuffInfo.list.add(s);
        }
    }

    catch (IOException e) {
        e.printStackTrace();

    }

}

	public static void main(String[] args) {

        StuffInfo stuffInfo = new StuffInfo();


        try (BufferedReader br = new BufferedReader(new FileReader("/Users/oseunghyeon/Downloads/sellingStuff.txt"))) {
            String line;
            int lineRead = 0;

            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("[번호]\t [제목]\t\t[카테고리]\t[물건 상태]\t[판매 가격]\t[판매자명]\t[상품 거래 방식]\t[결제 방식]\t[등록 날짜]\t[마감 날짜]\t[찜]");

            while ((line = br.readLine()) != null && lineRead < 10) {

                String[] data = line.split(",");

                String num = data[0];
                String name = data[1];
                String category = data[2];
                String condition = data[6];
                String price = data[3];
                String seller = data[10];
                String method = data[4];
                String payment = data[5];
                String from = data[7];
                String end = data[8];
                String like = data[9];

                System.out.printf("%3s %10s %5s %4s %s %s %s %s %s %s %s", num, name, category, condition, price, seller, method, payment, from, end, like);
                System.out.println();

                lineRead++;// 10줄 출력 하기 위해
            }



            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        } catch (IOException e) {
            e.printStackTrace();

        }



        Scanner sc = new Scanner(System.in);

        System.out.println("[구매할 물품의 번호를 입력하세요]");
        System.out.println("구매할 물품>");
        stuffInfo.setInput(sc.nextLine());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");




        int aaa;
        ArrayList<String[]> numList = new ArrayList<>();
        ArrayList<String> test = new ArrayList<>(); //?
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/oseunghyeon/Downloads/sellingStuff.txt"))) {
            String line;


            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                numList.add(data);
                test.add(data[0]);


                //SellingStuff sellingStuff = new SellingStuff(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[9], data[10], data[11]);
                //list.add(sellingStuff);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        aaa = -1;
        for (int i = 0; i < test.size(); i++) {
            if (test.get(i).equals(stuffInfo.getInput())) {
                aaa = 1;
            }
        }



        if (aaa > 0) {
            System.out.println("판매 페이지로 이동합니다.");
            System.out.println("판매 페이지로 이동하려면 Enter를 눌러주세요");
            sc.nextLine();
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            ArrayList<String> lines = new ArrayList<>();

            // 파일을 읽어서 StringBuffer에 저장
            StringBuffer fileContent = new StringBuffer();


            // StringBuffer의 내용을 ArrayList에 한 줄씩 저장
            String[] linesArray = fileContent.toString().split(",");
            for (String theline : linesArray) {
                lines.add(theline);
            }

            int desiredLineIndex = Integer.parseInt(stuffInfo.getInput()) - 1;

            // 원하는 줄 출력
            if (desiredLineIndex >= 0 && desiredLineIndex < lines.size()) {

                String desiredLine = lines.get(desiredLineIndex);
                System.out.println("[번호]\t  [제목]\t\t[카테고리]\t[물건 상태]\t[판매 가격]\t[판매자명]\t[상품 거래 방식]\t[결제 방식]\t[등록 날짜]\t[마감 날짜]\t[찜]");
                System.out.println(desiredLine);
                String num = sc.nextLine();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("/Users/oseunghyeon/Downloads/sellingStuff.txt"));
                    String theline;
                    while ((theline = reader.readLine()) != null) {
                        String[] data = theline.split(",");
                        numList.add(data);
                        if(Integer.parseInt(data[0]) == Integer.parseInt(num)){
                            System.out.println(numList);
                        }
                    }

                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                for (String theline : linesArray) {
                  //  if (lines..equals(num);
                }
                System.out.println("물품 거래 날짜를 선택하세요");
                System.out.println("날짜 설정하기>");

                try (BufferedReader br = new BufferedReader(new FileReader("/Users/oseunghyeon/Downloads/sellingStuff.txt"))) {
                    String line;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    while ((line = br.readLine()) != null) {
                        String[] temp = line.split(","); //
                        SellingStuff s = new SellingStuff(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], temp[10]);
                        StuffInfo.list.add(s);
                        if (temp.length >= 11) {
                            LocalDate date7 = LocalDate.parse(temp[7], formatter);
                            LocalDate date8 = LocalDate.parse(temp[8], formatter);

//                            if (date7.isAfter() && date7.isBefore(rangeEnd) &&
//                                    date8.isAfter(rangeStart) && date8.isBefore(rangeEnd)) {
//                                System.out.println("Value in range: " + line);
//
//                                String DateInput = sc.nextLine();
                        }

                    }
                }

                catch (IOException e) {
                    e.printStackTrace();

                }

                String dateInput = sc.nextLine();