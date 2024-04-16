package day06.member;

// 역할: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    static Member[] members;
    static Member[] restoreList; // 삭제된 회원들이 모일 배열

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 50);
        members[1] = new Member("ghi@def.com", "5432", "팥돌이", "남성", 40);
        members[2] = new Member("xyz@def.com", "7890", "팥죽이", "여성", 30);
    }

    // 메서드

    // 회원정보 생성
    void addNewMember(Member newMember) {

        // 배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];

        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }

    // 이메일 중복을 확인하는 기능
    boolean isDuplicateEmail(String targetEmail) {
        for(Member m : members) {
            if (targetEmail.equals((m.email))) {
                return true;
            }
        } return false;
    }

    public Member findMemberByEmail(String inputEmail) {
        for (Member m : members) {
            if (inputEmail.equals(m.email)) {
                return m;
            }
        }return null;
    }



}
