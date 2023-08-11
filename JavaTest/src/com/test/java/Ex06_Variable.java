package com.test.java;

public class Ex06_Variable {

	public static void main(String[] args) {
		
		//Ex06_Variable
		
		// 목표 > 자료형 + 변수 + 리터럴
		
		// 1. 주변의 데이터 검색! > 몸무게 > 저장할 변수 생성
		// 2. 형태 + 길이 > 자료형 결정 > double
		// 3. 변수 생성 + 값 대입
		// 4. 출력

		// 각 자료형(값형 8가지, String) x 10회 = 9 x 10회
		
		
		// boolean
		System.out.println("# boolean");
		
		boolean isResearchResult;
		isResearchResult = true;
		System.out.println("검사 결과 " + isResearchResult + "가 나왔습니다.");
		
		boolean isResult;
		isResult = false;
		System.out.println("결과는 " + isResult + "입니다.");
		
		boolean isTrueFalse;
		isTrueFalse = true;
		System.out.println("진실은 " + isTrueFalse + "입니다.");
		
		boolean isGameResult;
		isGameResult = false;
		System.out.println("이번 게임은 " + isGameResult + "입니다.");
		
		boolean isSale;
		isSale = true;
		System.out.println("현재 세일 기간이라는 건 " + isSale + "입니다.");

		boolean isAnswer;
		isAnswer = true;
		System.out.println("그가 말한 것은 " + isAnswer + "입니다.");

		boolean isMyAnswer;
		isMyAnswer = false;
		System.out.println("제가 말한 것은 " + isAnswer + "입니다.");
		
		boolean isAccess;
		isAccess = false;
		System.out.println("당신의 엑세스 결과는 " + isAccess + "입니다.");
		
		boolean isGoalIn;
		isGoalIn = true;
		System.out.println("내가 골을 넣었다는 것은 " + isGoalIn + "입니다.");
		
		boolean isTaskResult;
		isTaskResult = false;
		System.out.println("이번 시도는 " + isTaskResult + "입니다.\n");
		
		
		
		// char
		System.out.println("# char");
		
		char surname;
		surname = '이';
		System.out.println("제 성은 " + surname + "입니다.");
		
		char word;
		word = '긍';
		System.out.println("그 단어의 한 글자는 " + word + "입니다.");

		char wordMoney;
		wordMoney = '돈';
		System.out.println("Money는 한글로 " + wordMoney + "입니다.");

		char yourSurname;
		yourSurname = '김';
		System.out.println("당신의 성은 " + yourSurname + "입니까?");

		char guestSurname;
		guestSurname = '정';
		System.out.println("손님께서는 " + guestSurname + "으로 등록하셨습니다.");

		char parentSurname;
		parentSurname = '이';
		System.out.println("부모님의 성은 " + parentSurname + "이십니다.");
		
		char mostSurname;
		mostSurname = '김';
		System.out.println("한국에서 가장 많은 성씨는 " + mostSurname + "입니다.");

		char mailUseCharacter;
		mailUseCharacter = '@';
		System.out.println("메일을 보낼 때 사용하는 특수문자는 " + mailUseCharacter + "입니다.");
		
		char waterTranslateKorean;
		waterTranslateKorean = '물';
		System.out.println("water는 한국어로 " + waterTranslateKorean + "입니다.");
		
		char cJammAlbumName;
		cJammAlbumName = '킁';
		System.out.println("씨잼이 낸 앨범 이름은 " + cJammAlbumName + "입니다.\n");
		
		
		
		// byte
		System.out.println("# byte");
		
		byte mathScore;
		mathScore = 90;
		System.out.println("수학 점수는 " + mathScore + "점 입니다.");

		byte englishScore;
		englishScore = 85;
		System.out.println("영어 점수는 " + englishScore + "점 입니다.");

		byte chemistryScore;
		chemistryScore = 95;
		System.out.println("화학 점수는 " + chemistryScore + "점 입니다.");
	
		byte myHeight;
		myHeight = 110;
		System.out.println("제 키는 " + myHeight + "cm 입니다.");
		
		byte myWeight;
		myWeight = 60;
		System.out.println("제 몸무게는 " + myWeight + "kg 입니다.");

		byte callNumberPolice;
		callNumberPolice = 112;
		System.out.println("비상 상황에는 " + callNumberPolice + "에 전화하세요.");

		byte myAge;
		myAge = 15;
		System.out.println("제 나이는 " + myAge + "살 입니다.");

		byte parentAge;
		parentAge = 55;
		System.out.println("제 부모님의 나이는 " + parentAge + "살 입니다.");
		
		byte byteMax;
		byteMax = Byte.MAX_VALUE;
		System.out.println("byte의 최대값은 " + byteMax + "입니다.");

		byte byteMin;
		byteMin = Byte.MIN_VALUE;
		System.out.println("byte의 최대값은 " + byteMin + "입니다.\n");
		
		
		
		// short
		System.out.println("# short");
		
		short shortMax;
		shortMax = Short.MAX_VALUE;
		System.out.println("short의 최대값은 " + shortMax + "입니다.");

		short shortMin;
		shortMin = Short.MIN_VALUE;
		System.out.println("short의 최소값은 " + shortMin + "입니다.");

		short friendheight;
		friendheight = 85;
		System.out.println("제 친구의 키는 " + friendheight + "입니다.");

		short AgeHeightAvg13;
		AgeHeightAvg13 = 114;
		System.out.println("13살의 평균 키는 " + AgeHeightAvg13 + "입니다.");

		short wineAgeing;
		wineAgeing = 24;
		System.out.println("이 와인은 " + wineAgeing + "년 에이징 되었습니다.");
		
		short grandfatherAge;
		grandfatherAge = 98;
		System.out.println("제 할아버지는 " + grandfatherAge + "살까지 사셨습니다.");

		short guestRate;
		guestRate = 165;
		System.out.println("이 손님은 " + guestRate + "번째에요.");

		short theMaximumRainfallYear;
		theMaximumRainfallYear = 2010;
		System.out.println("가장 많은 강우량을 기록한 해는 " + theMaximumRainfallYear + "년 입니다.");
		
		short paceCounters;
		paceCounters = 8000;
		System.out.println("오늘 만보기를 확인했더니 " + paceCounters + "를 걸었더라.");
		
		short studyHours;
		studyHours = 300;
		System.out.println("내일 목표한 공부 시간은 " + studyHours + "분 입니다.\n");
		
		
		
		// integer
		System.out.println("# integer");
		
		int numberEmployee;
		numberEmployee = 10064948;
		System.out.println("사원 번호는 " + numberEmployee + "입니다.");
		
		int intMax;
		intMax = Integer.MAX_VALUE;
		System.out.println("int의 최대값은 " + intMax + "입니다.");

		int intMin;
		intMin = Integer.MIN_VALUE;
		System.out.println("int의 최소값은 " + intMin + "입니다.");
		
		int seoulToBusan;
		seoulToBusan = 320;
		System.out.println("서울에서 부산까지 거리는 " + seoulToBusan + "입니다.");

		int drinkWater;
		drinkWater = 500;
		System.out.println("그 음료수는 " + drinkWater + "ml야.");

		int manufactureCarYear;
		manufactureCarYear = 1985;
		System.out.println("선택한 자동차 생산 년도: " + manufactureCarYear + "년");
		
		int taskAttempt;
		taskAttempt = 3236;
		System.out.println("이번 시도는 " + taskAttempt + "번째 입니다.");

		int priceNotepad;
		priceNotepad = 1638000;
		System.out.println("내가 갖고 싶은 노트북 가격은 " + priceNotepad + "원 입니다.");
		
		int priceCar;
		priceCar = 72800000;
		System.out.println("벤츠 가격은 " + priceCar + "원 입니다.");
		
		int bookVolume;
		bookVolume = 150;
		System.out.println("이 책은 " + bookVolume + "쪽으로 이루어져 있습니다.\n");
		
		
		
		// long
		System.out.println("# long");
		
		long longMax;
		longMax = Long.MAX_VALUE;
		System.out.println("long의 최대값은 " + longMax + "입니다.");
		
		long longMin;
		longMin = Long.MIN_VALUE;
		System.out.println("long의 최소값은 " + longMin + "입니다.");

		long longAge;
		longAge = 21231581L;
		System.out.println("우주의 나이는 " + longAge + "살 쯤 될까?");
		
		long miracleFiveLoavesAndTwoFishes;
		miracleFiveLoavesAndTwoFishes = 5000;
		System.out.println("오병이어의 기적을 통해 예수님께서 먹인 사람은 " + miracleFiveLoavesAndTwoFishes + "명 입니다.");

		long priceBitcoin;
		priceBitcoin = 3831435159L;
		System.out.println("현재 비트코인 가격: " + priceBitcoin + "원");
		
		long koreaschool;
		koreaschool = 20696l;
		System.out.println("한국의 학교 수: " + koreaschool + "개");
		
		long co2Korea;
		co2Korea = 290000000l;
		System.out.println("한국의 co2 배출량은 " + co2Korea + "톤 입니다.");
		
		long populationKorea;
		populationKorea = 51740000l;
		System.out.println("한국의 인구수는 " + populationKorea + "명 입니다.");
	
		long salaryRequirement;
		salaryRequirement = 30000000l;
		System.out.println("25살 제 희망 연봉은 " + salaryRequirement + "원 입니다.");

		long earthAge;
		earthAge =  4500000000l;
		System.out.println("지구의 나이는 " + earthAge + "살 입니다.\n");
		
		
		
		// float
		System.out.println("# float");
		
		final float floatPI;
		floatPI = 3.141592653589793238462643383279f;
		System.out.println("float로 선언한 PI를 출력하면 " + floatPI + "가 나옵니다.");

		float heightAvg;
		heightAvg = 165.1321535136f;
		System.out.println("우리 반 키 평균은" + heightAvg + "입니다.");
		
		float timeWage;
		timeWage = 30.50f;
		System.out.println("근무 외 시간 수당은 " + timeWage + "% 더 지불할 예정입니다.");

		float jobSatisfactionAvg;
		jobSatisfactionAvg = 80.65f;
		System.out.println("자사 직업 만족도 평균은 " + jobSatisfactionAvg + "점을 기록했습니다.");
		
		float battingAvg;
		battingAvg = 0.339f;
		System.out.println("해당 선수의 야구 타율은 " + battingAvg + "% 입니다.");
		
		float rainfallProbability;
		rainfallProbability = 24.5f;
		System.out.println("내일 강우 확률은 " + rainfallProbability + "% 입니다.");
		
		float taskProgressRate;
		taskProgressRate = 78.02f;
		System.out.println("과제 진도율: " + taskProgressRate + "%");
		System.out.println(100 - taskProgressRate + "% 남았습니다. 더 노력하세요!");

		float priceRiseRate;
		priceRiseRate = 0.05f;
		System.out.println("가격 상승률이 " + priceRiseRate + "%를 기록했다.");

		float successProbability;
		successProbability = 67.52f;
		System.out.println("성공 확률은 " + successProbability + "% 입니다.");

		float pValue;
		pValue = 0.1453f;
		System.out.println("유의함을 확인할 pValue는 " + pValue + "가 나왔습니다.\n");
		
		
		
		// double
		System.out.println("# double");
		
		double mycurrentWeight;
		mycurrentWeight = 70.525;
		System.out.println("현재 제 몸무게는 " + mycurrentWeight + "kg 입니다.");

		final double doublePI;
		doublePI = 3.141592653589793238462643383279d;
		System.out.println("double로 선언한 PI를 출력하면 " + doublePI + "가 나옵니다.");
		
		double scoreAvg;
		scoreAvg = 75.50d;
		System.out.println("우리 반 점수 평균은" + scoreAvg + "이다. 더 노력하자.");

		double RegisteredCars;
		RegisteredCars = 2.412357;
		System.out.println("자동차 등록대수는" + RegisteredCars + "를 기록했습니다.");

		double penRiseRate;
		penRiseRate = 51.5163;
		System.out.println("보고서 결과 이번 분기에 펜 생산량을" + penRiseRate + "% 올리는 것이 적합합다고 여겨집니다.");
		
		double hyperInflation;
		hyperInflation = 129.75;
		System.out.println("초인플레이션은 물가가" + hyperInflation + "% 오르는 것을 의미한다.");
		
		double flavoredStrawberry;
		flavoredStrawberry = 50.65;
		System.out.println("이 음료수에는 딸기가 무려 " + flavoredStrawberry + "% 함유되어 있다!");

		double repairComputer;
		repairComputer = 33.655613d;
		System.out.println("컴퓨터 복구 작업중... " + repairComputer + "% 완료");

		double devideCake;
		devideCake = 16.65623;
		System.out.println("공평하게 케이크를 자르기 위해선 " + devideCake + "˚로 케이크를 잘라야 해");
		
		double exchangeRate;
		exchangeRate = 0.00079d;
		System.out.println("미국 달러 환율은 1원당 " + exchangeRate + "달러 입니다.\n");
		
		
		
		// string
		System.out.println("# string");
		
		String foundCountryFrance;
		foundCountryFrance = "1792년 9월 22일";
		System.out.println("프랑스 건국일은 " + foundCountryFrance + "입니다.");
		
		String firstMovie;
		firstMovie = "열차의 도착";
		System.out.println("최초의 영화 검색 결과: " + firstMovie + " 입니다.");
		
		String nameGeust;
		nameGeust = "이정렬";
		System.out.println("신청한 고객님의 이름은 " + nameGeust + "입니다.");
		
		String audienceAvatar;
		audienceAvatar = "10,804,957명";
		System.out.println("영화 아바타의 관객 수는 " + audienceAvatar + "명 입니다.");
		
		String backStretch;
		backStretch = "코브라 스트레칭, 브릿지 자세, 고양이 기지개 자세, 몸통 비틀기";
		System.out.println("허리 건강에 좋은 스트레칭을 알려드립니다. " + backStretch + " 스트레칭을 해보세요.");

		String likeFoodMenu;
		likeFoodMenu = "고구마 맛탕, 돼지 갈비, 떡볶이";
		System.out.println("제가 좋아하는 음식은 " + likeFoodMenu + "랍니다.");

		String trainingCourse;
		trainingCourse = "(디지털컨버전스)AWS 클라우드와 Elasticsearch를 활용한 Java(자바) Full-Stack 개발자 양성과정(B)";
		System.out.println("제가 듣는 교육 과정은 " + trainingCourse + "입니다.");
		
		String gameIntro;
		gameIntro = "이 게임은 2018년에 개발된 게임으로, 젊은 세대에게 인기가 많다.";
		System.out.println("Intro: " + gameIntro);

		String inviteGuestList;
		inviteGuestList = "이순신, 박혁거세, 김좌진, 곽두팔, 쉬샤우동";
		System.out.println("초대할 손님 목록: " + inviteGuestList);

		String psalm_119_9;
		psalm_119_9 = "청년이 무엇으로 그의 행실을 깨끗하게 하리이까 주의 말씀만 지킬 따름이니이다";
		System.out.println("시편 119편 9절 말씀 " + psalm_119_9 + " 아멘");
		
	}
	
}
