public class Ass11Q1 {
    public static void main(String args[]) {

        String string1 = "This is Exercise1";
        String string2 = "This is Exercise2";

        int result = string1.compareTo(string2);

        if (result < 0) {
            System.out.println("\"" + string1 + "\" is less than \"" + string2 + "\"");
        } 
        else if (result > 0) {
            System.out.println("\"" + string1 + "\" is greater than \"" + string2 + "\"");
        } 
        else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\"");
        }
    }
}
