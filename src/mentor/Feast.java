package mentor;

public class Feast {

    public static void main(String[] args) {

        String name = "great blue heron";
        String dish = "garlic naan";
        System.out.println(feast("great blue heron", "Garlic naan"));
        System.out.println(feast("great blue heron".toLowerCase(), "Garlic naaj".toLowerCase()));

    }


    public static boolean feast (String name, String dish){


        if (name.substring(0, 1).equals(dish.substring(0, 1)) && name.substring(name.length()-1)
                .equals(dish.substring(dish.length()-1)) ){
            return true;
        }

            return false;
    }

}
