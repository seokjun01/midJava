package collection.map.test;

import java.util.*;

public class DictionaryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dictionary = new HashMap<>();

		System.out.println("==단어 입력 단계==");
		while (true) {
			System.out.println("영어 단어를 입력하세요 (종료는 'q') :");
			String input = sc.nextLine();
			if (input.equals("q")) {
				break;
			}
			System.out.println("한글 뜻을 입력하세요 (종료는 'q') :");
			String korean = sc.nextLine();
			dictionary.put(input, korean);
		}

			System.out.println("==단어 검색 단계==");
			while (true) {
				System.out.println("찾을 영어 단어를 입력하세요 (종료는 'p') :");
					String word = sc.nextLine();
					if (word.equals("p")) {
						break;
					}

					if (dictionary.containsKey(word)) {
						String koreanMeaning = dictionary.get(word);
						System.out.println(word + "의 뜻 " + koreanMeaning);
					}else {
						System.out.println(word + "는 사전에 없는 단어입니다.");
					}


				}

		}


	}
