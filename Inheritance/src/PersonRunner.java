public class PersonRunner
{
    public static void main(String[] args)
    {
        Person wolfgang = new Person("Wolfgang Amadeus Mozart","January 27, 1756");
        Student johann = new Student("Johann Nepomuk Hummel","November 14, 1778", 10, 4.0);

        System.out.println(wolfgang.getName());
        System.out.println(wolfgang.getBirthday());
        System.out.println(johann.getName());
        System.out.println(johann.getBirthday());
        System.out.println(johann.getGrade());
        System.out.println(johann.getGpa());


    }
}

