package L.L1;

public class Nvwa {
    public static Person person(String a){
        Person person=null;
        if(a.equalsIgnoreCase("M")){
            person=new M();
            System.out.println("初始化男人");
        }
        else if(a.equalsIgnoreCase("W")){
            person=new W();
            System.out.println("初始化女人");

        }
        else if(a.equalsIgnoreCase("R")){
            person=new R();
            System.out.println("初始化机器人");
        }
        return person;
    }
}
