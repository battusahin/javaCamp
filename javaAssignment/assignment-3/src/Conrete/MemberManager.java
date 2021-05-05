package Conrete;

import Abstract.MemberCheckService;
import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService {

	private MemberCheckService memberCheckService;

	public MemberManager(MemberCheckService memberCheckService) {
		
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void add(Member member) throws Exception {
		
		if(memberCheckService.checkIfRealPerson(member)) {
			System.out.println("add to Db : " + member.getFirstName() + " " + member.getLastName());
		}else {
			System.out.println("Not a valid person");
			throw new Exception("Not a valid person this " + member);
		}
	}

	@Override
	public void update(Member member) {
		
		System.out.println("update : " + member.getFirstName() + " " + member.getLastName());
	}

	@Override
	public void remove(Member member) {
		
		System.out.println("remove : " + member.getFirstName() + " " + member.getLastName());
	}
	
}
