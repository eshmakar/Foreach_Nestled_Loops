public class NestledLoops {
    static public void main(String ... d) {

        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"math", "economic"};

        for (String s:students){
            for (String s2:exams)
                System.out.println(s + " " + s2);
        }
    }
}
//OUTPUT БУДЕТ ТАКИМ:
//    Ivanov math
//    Ivanov economic
//    Petrov math
//    Petrov economic
//    Sidorov math
//    Sidorov economic