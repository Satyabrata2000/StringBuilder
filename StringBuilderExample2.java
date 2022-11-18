package StringBuilder;

//StringBuilder insert method

public class StringBuilderExample2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Monday comes after Sunday");
        System.out.println(sb);
        sb.insert(0, "Sunday comes after Saturday and ");
        System.out.println(sb);
    }
}
