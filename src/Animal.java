/**
 * @description:
 * @author: chenHui
 * @time: 2021/8/10 14:35
 */
public class Animal {
/*我对这里进行了修改*/
    static {
        num = 12;
    }

    static int num = 10;

    int age;
    String name;

    public Animal(){
        this.age = 1;
        this.name = "name1";
    }

    static {
        num = 13;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

