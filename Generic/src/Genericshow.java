import java.util.ArrayList;
import java.util.List;

public class Genericshow {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList<>();
        list.add("school");
        list.add(Integer.valueOf(5));

        for (Object obj : list) {
            String str = (String) obj;
            System.out.println(str);
        }

    }
}
