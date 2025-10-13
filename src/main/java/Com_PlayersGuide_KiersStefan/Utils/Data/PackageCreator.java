//package Com_PlayersGuide_KiersStefan.Utils.Data;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
///**
// * Utility class for creating complete Java class files with comment sections
// *
// * @author Stefan Kiers
// */
//public class PackageCreator {
//
//    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yy");
//    private static final String DEFAULT_AUTHOR = "Stefan Kiers";
//
//    /**
//     * Creates a complete Java class file with all comments and basic structure
//     *
//     * @param packageName String full package path (e.g., "Com_PlayersGuide_KiersStefan.Challenge_07")
//     * @param className String the class name
//     * @param challengeDescription String what you're working on
//     * @param classDescription String what the class does
//     * @param filePath String where to save the file (e.g., "src/Products/java/...")
//     */
//    public static void createCompleteClass(String packageName, String className,
//                                           String challengeDescription, String classDescription,
//                                           String filePath) {
//        String currentDate = LocalDate.now().format(DATE_FORMAT);
//        String challengeNumber = packageName.substring(packageName.lastIndexOf('.') + 1);
//
//        StringBuilder classContent = new StringBuilder();
//
//        // Package declaration
//        classContent.append("package ").append(packageName).append(";\n\n");
//
//        // Comment section
//        classContent.append("/*\n");
//        classContent.append(DEFAULT_AUTHOR).append("\n");
//        classContent.append(currentDate).append("\n\n");
//        classContent.append(challengeDescription).append("\n\n");
//        classContent.append(" */\n\n");
//
//        // JavaDoc section
//        classContent.append("/**\n");
//        classContent.append(" * ").append(classDescription).append("\n");
//        classContent.append(" * \n");
//        classContent.append(" * Part of: ").append(challengeNumber).append("\n");
//        classContent.append(" * Created: ").append(currentDate).append("\n");
//        classContent.append(" * \n");
//        classContent.append(" * @author ").append(DEFAULT_AUTHOR).append("\n");
//        classContent.append(" */\n");
//
//        // Class declaration and basic structure
//        classContent.append("public class ").append(className).append(" {\n\n");
//        classContent.append("    /**\n");
//        classContent.append("     * BuyingInventory method for testing the ").append(className).append(" class\n");
//        classContent.append("     * \n");
//        classContent.append("     * @param args command line arguments\n");
//        classContent.append("     */\n");
//        classContent.append("    public static void Products(String[] args) {\n");
//        classContent.append("        System.out.println(\"Starting ").append(className).append(" execution...\");\n\n");
//        classContent.append("        // TODO: Implement your solution here\n\n");
//        classContent.append("        System.out.println(\"").append(className).append(" execution completed.\");\n");
//        classContent.append("    }\n\n");
//        classContent.append("    // TODO: Add your methods here\n\n");
//        classContent.append("}\n");
//
//        // Write to file
//        try {
//            // Create directories if they don't exist
//            Path path = Paths.get(filePath);
//            Files.createDirectories(path.getParent());
//
//            // Write the file
//            FileWriter writer = new FileWriter(filePath);
//            writer.write(classContent.toString());
//            writer.close();
//
//            System.out.println("✅ Class created successfully: " + filePath);
//            System.out.println("📦 Package: " + packageName);
//            System.out.println("📝 Class: " + className);
//
//        } catch (IOException e) {
//            System.err.println("❌ Error creating file: " + e.getMessage());
//        }
//    }
//
//    /**
//     * Quick method to create a class with standard Player's Guide structure
//     *
//     * @param challengeNumber String (e.g., "Challenge_07")
//     * @param className String the class name
//     * @param description String what you're working on
//     */
//    public static void createPlayersGuideClass(String challengeNumber, String className, String description) {
//        String packageName = "Com_PlayersGuide_KiersStefan." + challengeNumber;
//        String filePath = "src/" + packageName.replace('.', '/') + "/" + className + ".java";
//
//        createCompleteClass(
//                packageName,
//                className,
//                description,
//                "This class handles the " + challengeNumber.replace('_', ' ') + " implementation",
//                filePath
//        );
//    }
//
//    /**
//     * Simple method that just returns the complete class content as String
//     * (Use this if you want to copy-paste instead of creating files)
//     */
//    public static String generateCompleteClassContent(String packageName, String className,
//                                                      String challengeDescription, String classDescription) {
//        String currentDate = LocalDate.now().format(DATE_FORMAT);
//        String challengeNumber = packageName.substring(packageName.lastIndexOf('.') + 1);
//
//        StringBuilder classContent = new StringBuilder();
//
//        // Package declaration
//        classContent.append("package ").append(packageName).append(";\n\n");
//
//        // Comment section
//        classContent.append("/*\n");
//        classContent.append(DEFAULT_AUTHOR).append("\n");
//        classContent.append(currentDate).append("\n\n");
//        classContent.append(challengeDescription).append("\n\n");
//        classContent.append(" */\n\n");
//
//        // JavaDoc section
//        classContent.append("/**\n");
//        classContent.append(" * ").append(classDescription).append("\n");
//        classContent.append(" * \n");
//        classContent.append(" * Part of: ").append(challengeNumber).append("\n");
//        classContent.append(" * Created: ").append(currentDate).append("\n");
//        classContent.append(" * \n");
//        classContent.append(" * @author ").append(DEFAULT_AUTHOR).append("\n");
//        classContent.append(" */\n");
//
//        // Class declaration and basic structure
//        classContent.append("public class ").append(className).append(" {\n\n");
//        classContent.append("    /**\n");
//        classContent.append("     * BuyingInventory method for testing the ").append(className).append(" class\n");
//        classContent.append("     * \n");
//        classContent.append("     * @param args command line arguments\n");
//        classContent.append("     */\n");
//        classContent.append("    public static void Products(String[] args) {\n");
//        classContent.append("        System.out.println(\"Starting ").append(className).append(" execution...\");\n\n");
//        classContent.append("        // TODO: Implement your solution here\n\n");
//        classContent.append("        System.out.println(\"").append(className).append(" execution completed.\");\n");
//        classContent.append("    }\n\n");
//        classContent.append("    // TODO: Add your methods here\n\n");
//        classContent.append("}\n");
//
//        return classContent.toString();
//    }
//
//    /**
//     * Demonstration method showing different ways to use the creator
//     */
//    public static void Products(String[] args) {
//        System.out.println("=== PACKAGE CREATOR DEMO ===\n");
//
//        // Method 1: Create actual file
//        System.out.println("1. Creating actual file:");
//        createPlayersGuideClass(
//                "Challenge_08",
//                "ArraySorter",
//                "Learning array sorting algorithms"
//        );
//
//        System.out.println("\n" + "=".repeat(50) + "\n");
//
//        // Method 2: Generate content for copy-paste
//        System.out.println("2. Generated content for copy-paste:");
//        String content = generateCompleteClassContent(
//                "Com_PlayersGuide_KiersStefan.Challenge_09",
//                "Calculator",
//                "Basic arithmetic operations",
//                "Simple calculator with four basic operations"
//        );
//
//        System.out.println("===== COPY THIS ENTIRE CLASS =====");
//        System.out.println(content);
//        System.out.println("==================================");
//    }
//
//    /**
//     * Ultra-quick method for your daily workflow
//     *
//     * @param challengeNum int the challenge number (e.g., 7 for Challenge_07)
//     * @param className String the class name
//     * @param description String what you're working on
//     */
//    public static void quickCreate(int challengeNum, String className, String description) {
//        String challengeNumber = String.format("Challenge_%02d", challengeNum);
//        createPlayersGuideClass(challengeNumber, className, description);
//    }
//
//    /**
//     * Print method for easy copy-paste workflow
//     */
//    public static void printCompleteClass(String challengeNumber, String className, String description) {
//        String packageName = "Com_PlayersGuide_KiersStefan." + challengeNumber;
//        String classDescription = "This class handles the " + challengeNumber.replace('_', ' ') + " implementation";
//
//        String content = generateCompleteClassContent(packageName, className, description, classDescription);
//
//        System.out.println("===== COPY THIS ENTIRE CLASS =====");
//        System.out.println(content);
//        System.out.println("==================================");
//    }
//}