
public class check {

	public static void main(String[] args) {
		String str = "azxxzy"; //expected output ay such as azxxzy - azzy - ay
		//String is immutable - transforming in string buffer.
		StringBuffer strb = new StringBuffer(str);
		strb.delete(2,4);
		System.out.println(strb);
		
	}

}
