package SOLID.BookClass;

import java.util.List;

public interface MemberRepository {
    void addMember(Member member);

    Member finMemberById(String memberId);

    List<Member> getAllMember();
}
