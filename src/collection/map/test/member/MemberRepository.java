package collection.map.test.member;

import java.util.*;

public class MemberRepository {

	private Map<String, Member> memberMap = new HashMap<>();

	public void save(Member member) {
		memberMap.put(member.getId(), member);
	}

	public void remove(String id) {
		memberMap.remove(id);
	}

	public Member findById(String id) {
		return memberMap.get(id);
	}

	public Member findByName(String name) {
		for (Member member : memberMap.values()) { // Map구조의 값들을 collection으로 모음
			if (member.getName().equals(name)) {
				return member;
			}
		}
		return null;
	}

	//실행 결과
	// findMember1 = Member{id='id1', name='회원1'}
	// findMember3 = Member{id='id3', name='회원3'}
	// removedMember1 = null

}
