
class stringMethods {
    public static void main(String args[]){
        
        String name = "    micro    ";
        System.out.println(name);

        String name1 = name.toUpperCase();
        System.out.println(name1);

        String name2 = name.toLowerCase();
        System.out.println(name2);
        
        String name3 = name.trim();
        System.out.println(name3);

        String name4 = name.substring(5);
        System.out.println(name4);

        String name5 = name.substring(0, 5);
        System.out.println(name5);

        String name6 = name.replace('i', 'o');
        System.out.println(name6);

        String name7 = name.endsWith("ro") ? "Yes" : "No";
        System.out.println(name7);

        String name8 = name.startsWith(" ") ? "Yes" : "No";
        System.out.println(name8);

        String name9 = name.charAt(5) + "";
        System.out.println(name9);

        String name10 = name.indexOf('i') + "";
        System.out.println(name10);
    }
}