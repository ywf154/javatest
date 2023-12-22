public class Rectangle {
    private int width;
    private int height;
    public Rectangle(){}//无参构造方法
    public Rectangle(int width,int height){//有参构造方法
        this.width=width;this.height=height;
    }
    public int Area(){
        return this.height*this.width;
    }
    public int Perimeter(){
        return  (this.width+this.height)*2;
    }






    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12,2);
        System.out.println(r1.Area());
        System.out.println(r1.Perimeter());
    }
}