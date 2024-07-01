package Constructors;

public class Human {
    String name1 = "Paul";
    int age1 = 18;
    double weight1 = 55.6;
    String name2 = "Nha";
    int age2 = 18;
    double weight2 = 45.5;
    void Human1(String name, int age , double weight ){
        this.name1 = name;
        this.age1 = age;
        this.weight1 = weight;
    }
    void Human2(String name, int age, double weight){
        this.name2 = name;
        this.age2 = age;
        this.weight2 = weight;
    }
    void Love1(){
        System.out.println(name1+" is loving");
    }
    void Love2(){
        System.out.println(name2+" is loving");
    }
}
