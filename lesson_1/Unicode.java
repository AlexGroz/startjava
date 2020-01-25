public class Unicode {
	public static void main (String[] args) throws Exception{	
			
		String str = "\u9398";
		byte[] utf8byte = str.getBytes("UTF8");
		
		for (int i = 9398; i <= 10178; i++ ){
			String result = new String (utf8byte, "UTF8");
			System.out.println(result);
			System.out.println(utf8byte);
			for (int j = 0; j < (utf8byte.size); j++) utf8byte[j];
			//byte data = utf8byte;// = utf8byte+0001;


		}
	}
}
