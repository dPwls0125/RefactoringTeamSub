package 정보시스템분석및설계.subject;

public class Robot1 {
    private final String name;
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
    public Robot1(String name){
        this.name = name;
    }
    public void order(RobotCommand command) {
        if(command == COMMAND_WALK){
            System.out.println(name + " walks.");
        }else if (command == COMMAND_STOP){
            System.out.println(name + " stop.");
        }else if(command == COMMAND_JUMP){
            System.out.println(name + " jump.");
        }else{
            System.out.println("Command error. command = " + command);
        }
    }

}