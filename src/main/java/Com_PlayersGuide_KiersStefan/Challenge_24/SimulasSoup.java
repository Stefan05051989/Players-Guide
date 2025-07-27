package Com_PlayersGuide_KiersStefan.Challenge_24;

import Com_PlayersGuide_KiersStefan.Utils.OddEvenTest.Main;

import java.util.Scanner;

public class SimulasSoup {
    public static void main(String[] args) {
        // import scanner
        Scanner userChoice = new Scanner(System.in);

        // user choice for food type :
        System.out.println("Choose food type : ");
        System.out.println("1 : Soup");
        System.out.println("2 : Stew");
        System.out.println("3 : Gumbo");

        int typeChoice = userChoice.nextInt();
        FoodType selectedType;

        switch (typeChoice) {
            case 1:
                selectedType = FoodType.SOUP;
                break;
            case 2:
                selectedType = FoodType.STEW;
                break;
            case 3:
                selectedType = FoodType.GUMBO;
                break;
            default:
                selectedType = FoodType.SOUP;
                break;
        }
        // works : System.out.println(typeChoice);

        System.out.println("Main ingredient : ");
        System.out.println("1 : Mushrooms");
        System.out.println("2 : Chicken");
        System.out.println("3 : Potatoes");
        System.out.println("4 : Carrots");

        int ingredientChoice = userChoice.nextInt();
        MainIngredient selectedIngredient;
        switch (ingredientChoice) {
            case 1:
                selectedIngredient = MainIngredient.MUSHROOMS;
                break;
            case 2:
                selectedIngredient = MainIngredient.CHICKEN;
                break;
            case 3:
                selectedIngredient = MainIngredient.POTATOES;
                break;
            case 4:
                selectedIngredient = MainIngredient.CARROTS;
                break;
            default:
                selectedIngredient = MainIngredient.POTATOES;
                break;
        }
        // works : System.out.println(ingredientChoice);
        System.out.println("Choose seasoning flavour : ");
        System.out.println("1 : Salty");
        System.out.println("2 : Spicy");
        System.out.println("3 : Sweet");

        int seasoningChoice = userChoice.nextInt();
        Seasoning selectedSeasoning;
        switch (seasoningChoice) {
            case 1:
                selectedSeasoning = Seasoning.SALTY;
                break;
            case 2:
                selectedSeasoning = Seasoning.SPICY;
                break;
            case 3:
                selectedSeasoning = Seasoning.SWEET;
                break;
            default:
                selectedSeasoning = Seasoning.SALTY;
                break;
        }

        Soup userSoup = new Soup(selectedType, selectedIngredient, selectedSeasoning);
        System.out.println(userSoup);
        userChoice.close();

    }
    enum FoodType {
        SOUP, STEW, GUMBO;
    }
    enum MainIngredient {
        MUSHROOMS, CHICKEN, CARROTS, POTATOES;
    }
    enum Seasoning {
        SPICY, SWEET, SALTY;
    }

    static class Soup{
        private FoodType type;
        private MainIngredient mainIngredient;
        private Seasoning seasoning;

        public Soup(FoodType type, MainIngredient mainIngredient, Seasoning seasoning){
            this.type = type;
            this.mainIngredient = mainIngredient;
            this.seasoning = seasoning;
        }

        public FoodType getType() {
            return type;
        }

        public MainIngredient getMainIngredient() {
            return mainIngredient;
        }

        public Seasoning getSeasoning() {
            return seasoning;
        }

        // format print statement
        @Override
        public String toString() {
            return seasoning + " " + mainIngredient + " " + type;
        }
    }
}