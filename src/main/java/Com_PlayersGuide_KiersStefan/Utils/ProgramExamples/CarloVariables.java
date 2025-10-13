//package Com_PlayersGuide_KiersStefan.Utils.ProgramExamples;
//
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class CarloVariables {
//    static void main() {
///*
//programma carlo.
// */
//
//
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.function.Predicate;
//
//        public class Challenge_6_to_7 {
//
//            static int type_int;
//            static double type_double;
//            static short type_short;
//            static long type_long;
//            static float type_float;
//            static byte type_byte;
//            static char type_char;
//            static String type_string;
//            static boolean type_boolean;
//
//            static void sleep(float seconds) {
//                try {
//                    Thread.sleep((long) (seconds * 1000));
//                } catch (InterruptedException e) {
//                    readText("The variable shop is currently unavailable");
//                }
//            }
//
//            static void readText(String text) {
//                System.out.println();
//                for (int i = 0; i < text.length(); i++) {
//                    System.out.print(text.charAt(i));
//                    sleep(0.05f);
//                }
//            }
//
//            static void slowLoad() {
//                for (int i = 1; i <= 3; i++) {
//                    sleep(1);
//                    System.out.print(".");
//                    if (i == 3) {
//                        sleep(1);
//                    }
//                }
//            }
//
//            static void openShop(ArrayList<Object> types) {
//                slowLoad();
//                readText("Welcome!");
//                sleep(1);
//                printList(types);
//                slowLoad();
//                readText("Would you like to change any variables in the variable shop? ");
//                changeVariables(types);
//            }
//
//            static void changeLoop(Scanner input, ArrayList<Object> typeList) {
//                readText("Which variable would you like to change? ");
//                // Do stuff here, ask to change another or see the list?
//                String selectedVar = input.nextLine().toLowerCase();
//                if (Arrays.stream(Com_PlayersGuide_KiersStefan.Utils.Challenge_6_to_7.class.getDeclaredFields()).anyMatch(field -> field.getName().equals(selectedVar)) || selectedVar.equals("exit")) {
//                    // Continue "What will it's new value be?"
//                    readText("What will it's new value be? ");
//                    try {
//                        typeList.get(typeList.indexOf(selectedVar)) = input.nextLine();
//                    } catch () {
//                        // Throw exception, typing error etc...
//                    }
//                    sleep(1);
//                } else {
//                    // Continue "This variable is not available at the shop! Try again or choose "exit" to exit"
//                    readText("This variable is not available at the shop!\nTry again or choose \"exit\" to exit.");
//                }
//            }
//
//            static void changeVariables(ArrayList<Object> types) {
//                Scanner input = new Scanner(System.in);
//                while (true) {
//                    String answer = input.nextLine().toUpperCase();
//                    sleep(1);
//                    if (answer.matches("[NY]")) {
//                        if (answer.equals("Y")) {
//                            changeLoop(input);
//                        } else if (answer.equals("N")) {
//                            readText("Thank you for checking out our variable shop!\nTill next time!");
//                        }
//                        break;
//                    } else {
//                        System.out.println("Your input was invalid!\nPlease answer with only Y or N");
//                    }
//                }
//            }
//
//            static ArrayList<Object> createList() {
//                type_int = 1;
//                type_double = 2.00d;
//                type_short = 12;
//                type_long = 200000;
//                type_float = 2.01f;
//                type_byte = 2;
//                type_char = 'c';
//                type_string = "C";
//                type_boolean = true;
//                return new ArrayList<>(
//                        Arrays.asList(
//                                type_int,
//                                type_double,
//                                type_short,
//                                type_long,
//                                type_float,
//                                type_byte,
//                                type_char,
//                                type_string,
//                                type_boolean
//                        )
//                );
//            }
//
//            static void printList(ArrayList<Object> types) {
//                Field[] typeList = Com_PlayersGuide_KiersStefan.Utils.Challenge_6_to_7.class.getDeclaredFields();
//                readText("Let's see");
//                slowLoad();
//                readText("The list of variables is currently:\n");
//                sleep(1);
//                // This next println() is so horrendous, but it does exactly what I want, so suck it
////        for (int i = 0; i < types.size(); i++) {
////            System.out.println(
////                    "variable [" +
////                    typeList[i].toString().substring(typeList[i].toString().indexOf("6_to_7.") + 7)
////                    + "] is a" + (String.valueOf(types.get(i).getClass().toString().substring(types.get(i).getClass().toString().indexOf("java.lang.") + 10).charAt(0)).matches("[aeuioAEUIO]") ? "n" : "") +" [" +
////                    types.get(i).getClass().toString().substring(types.get(i).getClass().toString().indexOf("java.lang.") + 10)
////                    + "] type with value: " +
////                    types.get(i)
////            );
////        }
//                // Slightly optimized version of the horrendous println(), no .substring() and back n forth toString() > charAt() etc
//                for (int i = 0; i < types.size(); i++) {
//                    System.out.println(
//                            "variable [" +
//                            typeList[i].getName()
//                            + "] is a" + (types.get(i).getClass().getSimpleName().matches("^[aeuioAEUIO].*") ? "n" : "") + " [" +
//                            types.get(i).getClass().getSimpleName()
//                            + "] type with value: " +
//                            types.get(i)
//                    );
//                    sleep(0.25f);
//                }
//            }
//
//            public static void main(String[] args) {
//                ArrayList<Object> types = createList();
//                openShop(types);
//            }
//        }
//    }
//}
//
