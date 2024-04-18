package day08.enum_.practice;

// TeamRole enum: 팀원의 역할을 정의하고 각 역할에 따른 설명을 제공
enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");
    // enum 쓰는 이유 : 문자열은 오타나도 안알려주니까 안전하게 오타안나게
    private final String description;
    // enum 의 생성자를 만들어야함
    TeamRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// TeamMember class: 팀원의 이름과 역할을 관리
class TeamMember {
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        System.out.println(name + " is assigned to " + role.getDescription());
    }
}


