package Day7;


public class SubstringWord {
    public static void main(String[] args) {
        String srr[] = {"a","abc","bc","d"};
        String word = "abc";
        int c = 0;
        for(String v:srr)
        {
            if(word.indexOf(v)!=-1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
