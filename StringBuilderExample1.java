package StringBuilder;

//append method

public class StringBuilderExample1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Sunday is fun");
        System.out.println(sb);
        sb.append(" and fun");
        System.out.println(sb);
    }
}
