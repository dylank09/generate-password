

public class password {
	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwyxzABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789";
		String password = "";
		int i = 0;
		
		while (i < 20) {
			
			int n = (int) (Math.random() * alphabet.length());
			password = password + alphabet.charAt(n);
			i ++;
		
		}
		
		
		
		System.out.println(password);
		
		
	}

}
