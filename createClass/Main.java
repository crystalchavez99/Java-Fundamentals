public class Main {
    public static void main(String[] args){
        Person jim = new Person("Jim");
//        jim.name = "Jim";
        Person callie = new Person("Callie");
//        callie.name = "Callie";
        jim.sayHello();
        callie.sayHello();
        System.out.println(jim.getCreatedDate());
        System.out.println(callie.getCreatedDate());
    }
}
