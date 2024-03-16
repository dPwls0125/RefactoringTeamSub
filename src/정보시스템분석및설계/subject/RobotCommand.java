package 정보시스템분석및설계.subject;

/*
로봇 명령어를 나타내는 타입
 */
public class RobotCommand {
    private final String  name;
    public RobotCommand(String name) {
        this.name = name;
    }
    public String toString(){
        return "[ RobotCommand : " + name + " ]";
    }
}
