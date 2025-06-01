package library;

public class Member {
    private String memberId;
    private String name;
    // TODO: Define a data structure to hold transactions of each member

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        // TODO: Initialize your data structure here
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    public void addTransaction(Transaction transaction) {
        // TODO
    }

    public Transaction getLastTransaction() {
        // TODO
        return null;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
