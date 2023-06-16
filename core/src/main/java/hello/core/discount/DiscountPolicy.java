package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    int Discount (Member member, int price);
}