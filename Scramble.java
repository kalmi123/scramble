public class Scramble {
	
	/**
	 * Reverse the the inner letters of the words in the sentence 
	 * 
	 * @param sentence
	 * 
	 */
	public static String sentenceScramble(String sentence){
		String result = "";
		String string = "";
		String EOS = String.valueOf(sentence.charAt(sentence.length() - 1));	//Enf Of Sentence character
		if (EOS.equals(".") | EOS.equals("?") | EOS.equals("!"))
			string = sentence.substring(0, sentence.length() - 1);
		else
			string = sentence;
		String[] stringArray = string.split(" ");	//splits the sentence into an array
		int arrayLength = stringArray.length;
		
		for (int i=0; i<arrayLength; i++){
			if(stringArray[i].length() < 3){
				result = result + stringArray[i];
			if(i != arrayLength - 1)
				result = result + " ";
			}
			else {
				result = result + reverse(stringArray[i]);
				if(i != arrayLength - 1)
					result = result + " ";
			}
			
		}
		if (EOS.equals(".") | EOS.equals("?") | EOS.equals("!"))
			result = result + EOS;
		
		return result;
	}


	/**
	 * Reverse the inner letters of the word
	 * 
	 * @param word
	 * 
	 */
	public static String reverse(String word){
		String str = "";
		int stringLength = word.length();
		String EOW = String.valueOf(word.charAt(stringLength - 1));	//End Of Word character
		
		str = String.valueOf(word.charAt(0));
		for (int i = stringLength - 2; i > 0; i--){
			str =str + String.valueOf(word.charAt(i));
		}
		str = str + EOW;
		return str;
		
	}
}
