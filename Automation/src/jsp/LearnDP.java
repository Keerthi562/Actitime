package jsp;

import org.testng.annotations.DataProvider;

public class LearnDP {
	@DataProvider
public Object[][] getData() {
	Object[][] data= {{"admin","manager"},{"john cena","khali"},{"jon snow","danaerys"},
			{"rohith","hitman"},{"rocky bhai","KGF"},{"jack","rose"},
			{"tom","jerry"}};
	return data;
}
}
