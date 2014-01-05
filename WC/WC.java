public class WC{
	
	String[] contentArray;
	String newContent = "";

	public int getNoOfLines(String content) {
	 	return content.split("\n").length;
    }
	public static void main(String args[]){
		WC wc = new WC();
		String content = "good morning.\nhave a nice day";
		int lines,words,characters;

		System.out.println("lines "+wc.getNoOfLines(content));
	}
}