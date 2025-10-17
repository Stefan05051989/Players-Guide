package Com_PlayersGuide_KiersStefan.Challenge_24;

/*
Stefan Kiers
18-08-2025


    Define enumerations for the three variations on food: type (soup, stew, gumbo), main ingredient
    (mushrooms, chicken, carrots, potatoes), and seasoning (spicy, salty, sweet).
    Make a class to represent a soup composed of the three above enumeration types.
    Let the user pick a type, main ingredient, and seasoning from the allowed choices and fill the “soup object”
    with the results. Hint: You could give the user a menu to pick from or simply compare the user’s
    text input against specific strings to determine which enumeration value represents their choice.
    When done, display the contents of the soup object in a format like “Sweet Chicken Gumbo.”
    Hint: You don’t need to convert the enumeration value back to a string. Simply displaying an
    enumeration value with System.out.print or System.out.printlin will display the name of the enumeration value.

 */

import java.util.Scanner;

public class SimulasSoup {
    public static void main(String[] args) {
        // enums are special class that represent fixed set of const. (data type like)
        // import scanner
        Scanner userChoice = new Scanner(System.in);

        // user choice for food type :
        System.out.println("Choose food type : ");
        System.out.println("1 : Arrow");
        System.out.println("2 : Stew");
        System.out.println("3 : Gumbo");

        int typeChoice = userChoice.nextInt();
        FoodType selectedType; // can only hold Foodtype values (variable declaration)

        switch (typeChoice) {
            case 1:
                selectedType = FoodType.SOUP; // becomes immutable object
                break;
            case 2:
                selectedType = FoodType.STEW;// becomes immutable object
                break;
            case 3:
                selectedType = FoodType.GUMBO;// becomes immutable object
                break;
            default:
                selectedType = FoodType.SOUP;// becomes immutable object
                break;
        }
        // works : System.out.println(typeChoice);

        System.out.println("Main ingredient : ");
        System.out.println("1 : Mushrooms");
        System.out.println("2 : Chicken");
        System.out.println("3 : Potatoes");
        System.out.println("4 : Carrots");

        int ingredientChoice = userChoice.nextInt();
        MainIngredient selectedIngredient; // can only hold MainIngredient values (variable declaration)
        switch (ingredientChoice) {
            case 1:
                selectedIngredient = MainIngredient.MUSHROOM;// becomes immutable object
                break;
            case 2:
                selectedIngredient = MainIngredient.CHICKEN;// becomes immutable object
                break;
            case 3:
                selectedIngredient = MainIngredient.POTATOE;// becomes immutable object
                break;
            case 4:
                selectedIngredient = MainIngredient.CARROT;// becomes immutable object
                break;
            default:
                selectedIngredient = MainIngredient.POTATOE;// becomes immutable object
                break;
        }
        // works : System.out.println(ingredientChoice);
        System.out.println("Choose seasoning flavour : ");
        System.out.println("1 : Salty");
        System.out.println("2 : Spicy");
        System.out.println("3 : Sweet");

        int seasoningChoice = userChoice.nextInt();
        Seasoning selectedSeasoning; // can only hold Seasoning values (variable declaration)
        switch (seasoningChoice) {
            case 1:
                selectedSeasoning = Seasoning.SALTY;// becomes immutable object
                break;
            case 2:
                selectedSeasoning = Seasoning.SPICY;// becomes immutable object
                break;
            case 3:
                selectedSeasoning = Seasoning.SWEET;// becomes immutable object
                break;
            default:
                selectedSeasoning = Seasoning.SALTY;// becomes immutable object
                break;
        }

        Soup userSoup = new Soup(selectedType, selectedIngredient, selectedSeasoning);
        System.out.println(userSoup);
        userChoice.close();

    }
    /*
    Enums by itself are a group of constants (unchangeble / final variables!)
    This means that the values of the enum can not be changed, but also that they
    are instances. Which means you cannot instantiatie an enum to call it and print the content.
    these have to be handled seperately.

    Declare general class,
    declare final Enum + name (Foodtype type)

    create private method with parameters for calling varargs
    this. etc

    Then override the Enum with a ToString() method to display the formatted print statement.
    without the to string method, it will print the Hashcode.

     */
    static class Soup{
        private final FoodType type;
        private final MainIngredient mainIngredient;
        private final Seasoning seasoning;

        private Soup(FoodType type, MainIngredient mainIngredient, Seasoning seasoning){
            this.type = type;
            this.mainIngredient = mainIngredient;
            this.seasoning = seasoning;
        }

        // format print statement
        @Override
        public String toString() {
            return seasoning + " " + mainIngredient + " " + type;
        }
    }
}
// Create enum
 /*
    Enums by itself are a group of constants (unchangeble / final variables!)
    This means that the values of the enum can not be changed, but also that they
    are instances. Which means you cannot instantiatie an enum to call it and print the content.
    these have to be handled seperately.

    Declare general class,
    declare final Enum + name (Foodtype type)

    create private method with parameters for calling varargs
    this. etc

    Then override the Enum with a ToString() method to display the formatted print statement.
    without the to string method, it will print the Hashcode.

  */
enum FoodType {
    SOUP, STEW, GUMBO;
        /*
        Each constant is a "public static final INSTANCE of an enum (in this case foodtype)
        this is why you cannot instantiate an enum, because it carry's instances of constance.
        Each enum has three aspects :
        1 : singleton - only 1 can ever exist.
        2 : Immutable - cannot be changed (same as strings)
        3 : type-safe - can only be compared with other values from the same enum
        (foodtype with foodtype, mainingredient with mainingredient, seasoning with seasoning.
         */
}
// create enum
enum MainIngredient {
    // set constants for ingredient
    MUSHROOM, CHICKEN, CARROT, POTATOE;
}
// create enum
enum Seasoning {
    // set constants for flavour
    SPICY, SWEET, SALTY;
}