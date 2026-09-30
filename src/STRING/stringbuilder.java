package STRING;

import java.util.Arrays;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder.toString());
        String name = "Apurvi Agrahari";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.getBytes()));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
