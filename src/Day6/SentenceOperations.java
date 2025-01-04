package Day6;

import java.util.Scanner;

public class SentenceOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // 1. Count the number of words in the sentence
        String[] words = sentence.split("\\s+");
        int wordCount = words.length;
        System.out.println(wordCount);

        // 2. Reverse the entire sentence
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println(reversedSentence);

        // 3. Replace all vowels in the sentence with '*'
        String sentenceWithReplacedVowels = sentence.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(sentenceWithReplacedVowels);
    }
}

