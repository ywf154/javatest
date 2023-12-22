public class Person {
        private String name;//姓名
        private int age ;  //年龄
        public Person(){}//无参构造方法
        public Person(String name,int age){//有参构造方法
            this.name=name;this.age=age;
        }
        public void printPerson(){
            System.out.println("This person：name:"+name+"  age:"+age);
        }
        public void setName(String name){
            this.name = name ;
        }
        public String getName(){
            return name;
        }
        public void setAge(int age){//15
            this.age = age ;
        }
        public int getAge(){
            return age;
        }

    public static void main(String[] args) {
        Person p1= new Person("li",17);
        p1.printPerson();
    }
}
