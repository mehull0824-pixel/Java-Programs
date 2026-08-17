public class StringBuil {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Reacher");
        //Set Char
        //System.out.println(sb.charAt(0));

        //Get char
        //sb.setCharAt(0 , 'L');
        //System.out.println(sb);


        //Insert char
        //sb.insert(0 , 'R');
        //System.out.println(sb);

        //delete char
        //sb.delete(0 , 1);
        //System.out.println(sb);


        sb.append(" Jack ");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
