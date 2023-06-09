public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = add(a,b);
        println("a + b:");
        println(c);
        int greaterValue = greaterValue(a,b);
        println("a > b");
        println(c);
        float x= 2.5f;
        float y = 7.5f;
        float z = add(x,y);
        println("x + y:");
        println(z);
        println("Print both c and z:");
        printAll(c,z);
        String[] strings = { "One", "Two", "Three" };
        println("Print each string in the array:");
        printAll(strings);
    };

    static int add(int x, int y){
        return x + y;
    };

    static int greaterValue(int x, int y){
        if(x > y){
            return x;
        }else{
            return y;
        }
    };

    static void println(Object out){
        System.out.println(String.valueOf(out));
    };

    static float add(float x, float y){
        return x + y;
    };

    static void printAll(Object... out){
//        for(int i = 0; i < out.length; i++){
//            println((out[i]));
//        };
        for(Object o: out){
            println(o);
        }

    };
}