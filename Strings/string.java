class string{
    public static void main(String args[]){
        String name = "micro";
        name = name.toUpperCase();
        name = name.replace("I", "1");
        name = name.replace("O", "0");
        name = name.replace("C", "3");
        System.out.print(name);
    }
}