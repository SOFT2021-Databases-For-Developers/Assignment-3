package myStuff;

public class MyMain {
    public static void main(String[] args) {
        MyJsonObject object = new MyJsonObject();

        MyJsonObject student = new MyJsonObject();
        student.addAttribute(new MyAttribute("name"), new MyValueString("John"));
        student.addAttribute(new MyAttribute("age"), new MyValueNumber(34));

        object.addAttribute(new MyAttribute("student"), student);

        MyJsonArray courses = new MyJsonArray();
        MyJsonObject course1 = new MyJsonObject();
        course1.addAttribute(new MyAttribute("id"), new MyValueNumber(1234));
        course1.addAttribute(new MyAttribute("name"), new MyValueString("Seahorse riding"));
        course1.addAttribute(new MyAttribute("ects"), new MyValueNumber(15));

        MyJsonObject course2 = new MyJsonObject();
        course2.addAttribute(new MyAttribute("id"), new MyValueNumber(4321));
        course2.addAttribute(new MyAttribute("name"), new MyValueString("Squid painting"));
        course2.addAttribute(new MyAttribute("ects"), new MyValueNumber(5));
        courses.addItem(course1);
        courses.addItem(course2);

        object.addAttribute(new MyAttribute("courses"), courses);

        object.addAttribute(new MyAttribute("active"), new MyValueBoolean(true));

        System.out.println(object.stringPlz());
    }
}
