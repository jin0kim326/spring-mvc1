package hello.servlet.domain.member;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
public class Member {
    private Long id;
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
