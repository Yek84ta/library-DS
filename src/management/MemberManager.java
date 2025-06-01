package management;

import datastructures.maps.CustomHashMap;
import library.Member;
import library.Transaction;

public class MemberManager {

    private CustomHashMap<String, Member> members;

    public MemberManager() {
        this.members = new CustomHashMap<>();
    }

    public void addMember(Member member) {
        if (member != null && member.getMemberId() != null) {
            members.put(member.getMemberId(), member);
        }
    }

    public Member getMember(String memberId) {
        if (memberId == null) {
            return null;
        }
        return members.get(memberId);
    }

    public void recordTransaction(String memberId, Transaction transaction) {
        if (memberId == null || transaction == null) {
            return;
        }

        Member member = members.get(memberId);
        if (member != null) {
            member.addTransaction(transaction);
        }
    }

    public Transaction getLastTransaction(String memberId) {
        if (memberId == null) {
            return null;
        }

        Member member = members.get(memberId);
        return member != null ? member.getLastTransaction() : null;
    }
}