public class Constructor {
        Constructor(String y, String b, String d, String e){
            y = "java";
            b = "python";
            d = "c";
            e = "kotlin";
            System.out.println(y);
            System.out.println(b);
            System.out.println(d);
            System.out.println(e);
        }

        public static void main(String[] args) {
            Constructor constructor = new Constructor("a","s","e", "w");
        }
}