public class Name {
    public static void main(String[] args) {
        String name = "pragadesh";
        int[] freq = new int[26];
        for(var c: name.toCharArray())
            freq[c-'a']++;
        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Freq of first char: " + freq[name.charAt(0) - 'a']);
    }
}
