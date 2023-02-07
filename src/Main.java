public class Main {
    public static void main(String[] args)
    {
        Person person = new Person("Sanzhar","Abdymomunov",19,'M',"Kyrgyzstan");
        System.out.println(person.toString());
        System.out.println(person.eat("Coffee"));
        System.out.println(person.work("Java developer"));

    }
}