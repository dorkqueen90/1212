public class testlab {
    static boolean[] list;

    public static void main(String[] args) {

        list = new boolean[5]; // part A
        System.out.println("Intializing global variable");
        for (int i =0; i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
        list[4]=true; // part B
        System.out.println("Making a new variable with same name:");
        boolean [] list={true,true,false}; // part C
        for (int i =0; i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();

        myMethod();

    }

    public static void myMethod() {
        System.out.println("Calling the global variable in a method after changing its last element");
        for (int i =0; i<list.length;i++){
            System.out.print(list[i]+" "); // part D
        }
    }

}
