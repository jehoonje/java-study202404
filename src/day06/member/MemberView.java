package day06.member;

import util.SimpleInput;


import static day06.member.MemberRepository.restoreList;

// 역할: 회원 데이터 관리를 위해 입력 출력을 담당함
public class MemberView {

    // 객체의 협력
    MemberRepository mr;
    SimpleInput si;

    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }

    void showMembers() {
        System.out.printf("========= 현재 회원 목록 (총 %d명) ==========\n", MemberRepository.members.length);
        for (Member m : MemberRepository.members) {
            System.out.println(m);
        }
    }

    // 회원정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = null;    // 변수의 사용범위 while문 안에서 email을 정의하면 while문에서만 사용 가능하기때문에 밖에서 정의
        while (true) {
            email = si.input("- 이메일: ");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일 입니다.");
        }
        String name = si.input("- 이름: ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별: ");
        int age = Integer.parseInt(si.input("- 나이: "));

        // 입력데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);

        // 위임 - 관심사의 분리
        mr.addNewMember(newMember);
    }

    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료");
        System.out.println("=============================");


        String menuNumber = si.input("- 메뉴 번호: ");
        return menuNumber;
    }

    // 프로그램 종료를 판단하는 입출력
    boolean exitProgram() {
        String exit = si.input("- 프로그램을 종료합니까? [y/n]\n>>");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다!");
            return true;
        }
        else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }
    void modifyMembers() {
        // 수정할 회원의 이메일을 입력받음
        String inputEmail = si.input("해당 회원의 이메일을 작성해주세요.");

        // 입력받은 이메일을 가진 회원을 찾음
        Member foundMember = mr.findMemberByEmail(inputEmail);

        // 회원을 찾지 못한 경우
        if (foundMember == null) {
            System.out.println("해당 이메일을 가진 회원을 찾을 수 없습니다.");
            return;
        }

        // 수정할 비밀번호를 입력받음
        String newPassword = si.input("- 새로운 비밀번호를 입력해주세요: ");

        // 회원의 비밀번호를 변경
        foundMember.setPassword(newPassword);

        System.out.println("비밀번호가 성공적으로 변경되었습니다.");
    }
//
//    // 회원정보 수정을 위해 입력을 처리
//    void modifyMembers() {
//        // 수정할 회원 번호를 입력받음
//        String inputNumber = si.input("- 수정하실 회원 번호를 입력해주세요: ");
//
//        // 입력받은 번호를 정수형으로 변환
//        int memberIndex = Integer.parseInt(inputNumber) - 1;
//
//        // 유효한 인덱스인지 확인
//        if (memberIndex >= 0 && memberIndex < mr.members.length) {
//            // 해당 인덱스에 해당하는 회원을 찾음
//            Member memberToModify = mr.members[memberIndex];
//            modifyInform(memberIndex);
//
//            // 여기서 해당 회원을 수정할 수 있음
//            // 이어서 수정할 정보를 입력받고 수정하는 등의 작업을 수행할 수 있음
//        } else {
//            System.out.println("유효하지 않은 회원 번호입니다.");
//        }
//    }
//
//    void modifyInform(int index) {
//        // 해당 인덱스에 있는 회원을 찾음
//        Member memberToModify = mr.members[index];
//
//        // 회원 정보를 수정하는 로직을 추가
//        // 예를 들어, 이름, 패스워드, 성별, 나이 등을 수정할 수 있도록 입력 받는다
//
//        String email = null;    // 변수의 사용범위 while문 안에서 email을 정의하면 while문에서만 사용 가능하기때문에 밖에서 정의
//        while (true) {
//            email = si.input("- 이메일: ");
//            if (!mr.isDuplicateEmail(email)) {
//                break;
//            }
//            System.out.println("중복된 이메일 입니다.");
//        }
//        String name = si.input("- 이름: ");
//        String password = si.input("- 패스워드: ");
//        String gender = si.input("- 성별: ");
//        int age = Integer.parseInt(si.input("- 나이: "));
//
//        // 입력데이터를 기반으로 한 명의 회원 객체를 생성
//
//        // 수정된 정보로 해당 회원 객체를 업데이트
//        mr.members[index] = new Member(email, password, name, gender, age);
//    }


    public void getMember() {
        String inputEmail = si.input("해당 회원의 이메일을 작성해주세요.");

        Member foundMember = mr.findMemberByEmail(inputEmail);


        if (foundMember != null) {
            System.out.println("======== 조회 결과 =========");
            System.out.println("# 이름: " + foundMember.memberName);
            System.out.println("# 비밀번호: " + foundMember.password);
            System.out.println("# 성별: " + foundMember.gender);
            System.out.println("# 나이: " + foundMember.age);
            System.out.println();
        } else {
            System.out.println("\n# 해당 회원은 존재하지 않습니다.");
        }
    }

    // 회원정보 삭제을 위해 입력을 처리
    void removeMembers() {
        // 삭제할 회원 번호를 입력받음
        String inputNumber = si.input("- 삭제하실 회원 번호를 입력해주세요: ");

        // 입력받은 번호를 정수형으로 변환
        int memberIndex = Integer.parseInt(inputNumber) - 1;

        // 유효한 인덱스인지 확인
        if (memberIndex >= 0 && memberIndex < mr.members.length) {
            // 해당 인덱스에 해당하는 회원을 찾음
            Member removedMember = mr.members[memberIndex];
            removeInform(memberIndex);

            // 여기서 해당 회원을 수정할 수 있음
            // 이어서 수정할 정보를 입력받고 수정하는 등의 작업을 수행할 수 있음
        } else {
            System.out.println("유효하지 않은 회원 번호입니다.");
        }
    }

    void removeInform(int index) {
        // 삭제할 회원 이후의 요소를 앞으로 이동시킴
        for (int i = index; i < mr.members.length - 1; i++) {
            mr.members[i] = mr.members[i + 1];
        }

        // 배열의 마지막 요소를 null로 설정하여 삭제된 것으로 표시
        mr.members[mr.members.length - 1] = null;

        // 삭제된 회원을 임시 저장소인 restoreList에 추가
        addToRestoreList(mr.members[index]);
    }

    // addToRestoreList 메서드는 restoreList에 삭제된 회원을 추가하는 역할을 합니다.
    void addToRestoreList(Member removedMember) {
        // 만약 restoreList가 초기화되지 않았다면, 새로운 배열을 생성하고 삭제된 회원을 첫 번째 요소로 추가합니다.
        if (restoreList == null) {
            restoreList = new Member[]{removedMember};
        } else {
            // 이미 요소가 있는 경우, 기존 배열의 크기를 늘리고 삭제된 회원을 추가합니다.
            Member[] temp = new Member[restoreList.length + 1];
            for (int i = 0; i < restoreList.length; i++) {
                temp[i] = restoreList[i];
            }
            temp[temp.length - 1] = removedMember;
            restoreList = temp;
        }
    }
    void recoverMember() {
        // 복구할 회원의 이메일을 입력받음
        String inputEmail = si.input("복구할 회원의 이메일을 입력하세요: ");

        // 입력받은 이메일을 가진 회원을 찾음
        Member recoveredMember = mr.findMemberByEmail(inputEmail);

        // 회원을 찾은 경우
        if (recoveredMember != null) {
            // 회원을 회원 목록에 다시 추가
            mr.addNewMember(recoveredMember);
            // 복구된 회원을 임시 저장소에 추가
            addToRestoreList(recoveredMember);
            System.out.println("회원을 성공적으로 복구했습니다.");
        } else {
            System.out.println("입력한 이메일을 가진 회원을 찾을 수 없습니다.");
        }
    }


}




