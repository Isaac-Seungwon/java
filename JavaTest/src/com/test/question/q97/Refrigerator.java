package com.test.question.q97;

import java.util.Calendar;

class Refrigerator {
	private Item[] items = new Item[100];
	private int index = 0;

	// 냉장고에 아이템 추가
	public void add(Item item) {

		// 현재 아이템 개수가 배열 최대 크기보다 작은 경우에만 추가
		if (this.index < this.items.length) {
			this.items[index] = item;
			System.out.printf("'%s'를 냉장고에 넣었습니다.\n", this.items[index].getName());

			this.index++;
		} else {
			System.out.println("냉장고가 터질 지경입니다.");
		}
	}

	// 냉장고에서 아이템을 꺼냄
	public Item get(String name) {
		System.out.println();

		int targetIndex = -1;

		// 냉장고에 있는 아이템들을 순회하면서 찾고자 하는 아이템을 이름으로 비교하여 인덱스를 찾음
		for (int i = 0; i < index; i++) {
			if (items[i].getName().equals(name)) {
				targetIndex = i;
				break;
			}
		}

		// 찾은 아이템이 존재하는 경우
		if (targetIndex != -1) {
			// 해당 인덱스에 있는 아이템을 임시 변수에 저장
			Item tempItem = items[targetIndex];

			// 꺼낸 아이템을 배열에서 왼쪽으로 Shift하여 빈 자리를 메꿈
			for (int i = targetIndex; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}

			// 맨 마지막 인덱스를 null로 초기화하여 빈 자리를 처리
			items[items.length - 1] = null;
			index--;

			return tempItem;
		} else {
			return null;
		}
	}

	// 냉장고에 있는 아이템 개수를 확인
	public int count() {
		return this.index;
	}

	// 냉장고에 있는 아이템 목록 출력
	public void listItem() {
		System.out.println();
		System.out.println("[냉장고 아이템 목록]");

		// 냉장고에 있는 모든 아이템들을 순회하면서 이름과 유통기한을 출력
		for (int i = 0; i < this.index; i++) {
			System.out.printf("%s(%s)\n", this.items[i].getName(), this.items[i].getExpiration());
		}
	}
}
