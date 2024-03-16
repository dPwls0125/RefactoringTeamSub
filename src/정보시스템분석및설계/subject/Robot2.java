package 정보시스템분석및설계.subject;

public class Robot2 {
    private final String name;
    public enum Command {
        WALK,
        STOP,
        JUMP
    }
    public void order(Robot2.Command command){
        if(command == Command.WALK){
            System.out.println(name + " walks.");
        }else if (command == Command.STOP){
            System.out.println(name + " stops.");
        }else if(command == Command.JUMP) {
            System.out.println(name + " jumps");
        }else{
            System.out.println("Command error, command = " + command);
        }
    }
    public Robot2(String name){
      this.name = name;
    }
}
