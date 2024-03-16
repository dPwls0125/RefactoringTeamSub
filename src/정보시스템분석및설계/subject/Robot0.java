package 정보시스템분석및설계.subject;

public class Robot0 {
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;
    private final String name;
    public Robot0(String name) {
        this.name = name;
    }
    public void order(int command){
        if(command == COMMAND_WALK){
            System.out.println(name + " walks.");
        }else if(command == COMMAND_JUMP){
            System.out.println(name + " jumps.");
        }else if(command == COMMAND_STOP){
            System.out.println(name + " stops.");
        }else{
            System.out.println("Command error. command = "+command);
        }
    }
}
