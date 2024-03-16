package 정보시스템분석및설계.subject;

public class Main {
    //Robot0
    public static void main(String[] args) {
        Robot0 robot = new Robot0("Tom");
        robot.order(Robot0.COMMAND_WALK);
        robot.order(Robot0.COMMAND_JUMP);
        robot.order(Robot0.COMMAND_STOP);
//        robot.order(0);
    }

//    Robot1 _ class
//        public static void main(String[] args) {
//        Robot1 robot = new Robot1("Mike");
//        robot.order(Robot1.COMMAND_WALK);
//        robot.order(Robot1.COMMAND_STOP);
//        robot.order(Robot1.COMMAND_JUMP);
////        robot1.order(1); // 컴파일 에러
//    }

    //Robot2 _enum
//    public static void main(String[] args) {
//        Robot2 robot = new Robot2("Jane");
//        robot.order(Robot2.Command.WALK);
//        robot.order(Robot2.Command.JUMP);
//        robot.order(Robot2.Command.STOP);
////        robot.order(0); // 컴파일 에러
//
//    }
}


