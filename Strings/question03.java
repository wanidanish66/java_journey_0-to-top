class question03 {
    public static void main(String args[]) {
        String letter = "dear <|name|> ,thanks a lot";
        letter = letter.replace("<|name|>" , "micro");

        System.out.print(letter);
    }
}