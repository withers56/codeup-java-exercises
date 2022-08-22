package codewars;

public class StopgninnipSMysdroW {

    public static void main(String[] args) {
        StopgninnipSMysdroW test = new StopgninnipSMysdroW();

        test.spinWords("Hey fellow warriors");
    }

    public String spinWords(String sentence) {
        //TODO: Code stuff here

        String[] sentenceSplitArray = sentence.split(" ");
        sentence = "";

        for (int i = 0; i < sentenceSplitArray.length; i++) {

            if (sentenceSplitArray[i].length() >= 5) {
                sentenceSplitArray[i] = new StringBuilder(sentenceSplitArray[i]).reverse().toString();
            }
            sentence += sentenceSplitArray[i] + " ";
        }

        System.out.println(sentence);

        return sentence.trim();
    }
}
