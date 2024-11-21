package com.quest.libraryManagementSystemNew;

public class PremiumMember extends Member{

    public PremiumMember(String memberName, String memberId) {
        super(memberName, memberId);
        this.bookCount=5;
    }
}
