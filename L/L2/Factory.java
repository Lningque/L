package L.L2;

public class Factory {
    public static Shape shape(String a){
        Shape shape=null;
        try{
            if(a.equalsIgnoreCase("circle")){
                shape=new Circle();
                System.out.println("初始化圆形");
            }
            else if(a.equalsIgnoreCase("rectangle")){
                shape=new Rectangle();
                System.out.println("初始化矩形");
            }
            else if(a.equalsIgnoreCase("triangle")){
                shape=new Triangle();
                System.out.println("初始化三角形");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return shape;
    }
}
