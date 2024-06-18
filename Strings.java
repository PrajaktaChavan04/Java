class Strings {
    public static void main(String a[])
    {
        // String name = "Prajakta";
        String name = new String("Prajakta");
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Chavan"));
        name = name + " Chavan"; //not changing the string
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Prajakta");
        System.out.println(sb.capacity());
        sb.append(" Chavan");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2, "a");
        System.out.println(sb);
        sb.setLength(30);
    }
}
