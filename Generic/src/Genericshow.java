import java.util.ArrayList;
import java.util.List;

public class Genericshow {
	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<>();
		list.add("school");
		list.add("pew pew");
		for (Object obj : list) {
			String str = (String) obj;
			System.out.println(str);
		}

	}
}
