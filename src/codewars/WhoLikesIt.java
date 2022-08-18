package codewars;

public class WhoLikesIt {

//    You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
//    pictures or other items. We want to create the text that should be displayed next to such an item.

//    []                                -->  "no one likes this"
//            ["Peter"]                         -->  "Peter likes this"
//            ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//            ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//            ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

    public static void main(String[] args) {
        String[] names = {"me", "you"};

        whoLikesIt();
        whoLikesIt("Peter");
        whoLikesIt("Jacob", "Alex");
        whoLikesIt("Max", "John", "Mark");
        whoLikesIt("Alex", "Jacob", "Mark", "Max");
        whoLikesIt("Alex", "Jacob", "Mark", "Max","Alex", "Jacob", "Mark", "Max","Alex", "Jacob", "Mark", "Max","Alex", "Jacob", "Mark", "Max");
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here

        switch (names.length) {
            case 0:
                System.out.println("no one likes this");
                return "no one likes this";
            case 1:
                System.out.println(names[0] + " likes this");
                return names[0] + " likes this";
            case 2:
                System.out.println(names[0] + " and " + names[1] + " like this");
                return names[0] + " and " + names[1] + " like this";
            case 3:
                System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                System.out.println(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}
