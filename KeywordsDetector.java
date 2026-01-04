public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is fun",
            "We need to leverage our core competencies",
            "The weather is nice today",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Our new technology presents a significant paradigm shift"
        };
        String[] keywords = {"transform", "leverage", "disrupt", "synergy", "paradigm"};
        detectAndPrint(sentences, keywords);
    }

    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String lowerSentence = lowerCase(sentence);
            for (int j = 0; j < keywords.length; j++) {
                String keyword = lowerCase(keywords[j]);
                if (contains(lowerSentence, keyword)) {
                    System.out.println(sentence);
                    break;
                }
            }
        }
    }

    public static String lowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0) {
            return true;
        }
        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}