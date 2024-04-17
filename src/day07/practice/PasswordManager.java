package day07.practice;

public class PasswordManager {
    public PasswordManager(int password, boolean isChanged) {
        this.password = password;
        this.isChanged = isChanged;
    }

    // 필드생성
    private int password;
    private boolean isChanged;

    public PasswordManager(String oldPassword123) {
        this.password = password;
    }


    // 메서드 생성
    public boolean changePassword (String oldPassword, String newPassword) {
        if (oldPassword != newPassword) {
           return true;
        } else {
            return isChanged;
        }
    }


}
