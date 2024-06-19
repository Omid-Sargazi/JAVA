package SOLID.BookClass;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMemberRepository implements MemberRepository {
    private List<Member> members = new ArrayList<>();

    @Override
    public void addMember(Member member) {
        // TODO Auto-generated method stub
        members.add(member);

    }

    @Override
    public Member finMemberById(String memberId) {
        // TODO Auto-generated method stub
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public List<Member> getAllMember() {
        // TODO Auto-generated method stub
        return members;
    }
}
