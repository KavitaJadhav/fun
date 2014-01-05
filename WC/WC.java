public class WC{
	
	String[] contentArray;
	String newContent = "";

	public int getNoOfLines(String content) {
	 	return content.split("\n").length;
    }
	public int getNoOfWords(String content) {
		contentArray = content.split("\n");
		for(int i =0 ;i<contentArray.length ; i++)
			newContent = newContent + contentArray[i]+" ";
		return newContent.split(" ").length;
    }
	public static void main(String args[]){
		WC wc = new WC();
		String content = "good morning.\nhave a nice day";
		int lines,words,characters;

		System.out.println("lines "+wc.getNoOfLines(content));
		System.out.println("words "+wc.getNoOfWords(content));

	}
}