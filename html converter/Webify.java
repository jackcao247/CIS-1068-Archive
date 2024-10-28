import java.io.*;
import java.util.Scanner;

public class Webify {
    public static Scanner Console = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please type file path here!  For example C:\\Users\\Bao\\eclipse-workspace\\HTMLconverter\\src\\input.txt");
        
        String fileName = Console.nextLine();
        
        long startTime = System.currentTimeMillis();
        
        String fileNameWithoutSuffix = getFileName(fileName);
        String outputFileName = fileNameWithoutSuffix + ".html";
        
        HTMLConverter(outputFileName, fileName);
       
//==========[Just calculating runtime and let us know when it finished]==========\\
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Finished!");
        System.out.println("Estimated runtime : " + duration + "ms");
    }

    public static String getFileName(String fileName) {
        return fileName.substring(0, fileName.length() - 4);
    }
    
    public static boolean urlRule(String text) {
        return text.startsWith("[[") && text.endsWith("]]");
    }

    public static void HTMLConverter(String outputFileName, String fileName) throws FileNotFoundException {
        PrintStream outputFile = new PrintStream(new File(outputFileName));
        Scanner inputText = new Scanner(new File(fileName));

        outputFile.println("<html>");
        outputFile.println("<body>");

        boolean startList = true;
        boolean lastIsList = false;

        String h1Start = "#";
        String listStart = "-";

        while (inputText.hasNextLine()) {
            String text = inputText.nextLine();
            if (lastIsList && !text.startsWith(listStart)) {
                outputFile.println("</ul>");
                lastIsList = false;
                startList = true;
            }

            if (text.length() == 0) {
                outputFile.println("<p>");
            } else {
                boolean isURL = urlRule(text);
                if (isURL) {
                    String plainURLText = text.substring(2, text.length() - 2);
                    String X = plainURLText.substring(0, plainURLText.indexOf("]["));
                    String Y = plainURLText.substring(plainURLText.indexOf("][") + 2);
                    String URL = "<a href=\"" + X + "\">" + Y + "</a>";
                    outputFile.println(URL + "/S");
                } else {
                    if (text.startsWith(h1Start) && text.endsWith(h1Start)) {
                        String plainText = text.substring(1, text.length() - 1);
                        outputFile.println("<h1>" + plainText + "</h1>");
                    } else if (text.startsWith(listStart)) {
                        lastIsList = true;
                        if (startList) {
                            outputFile.println("<ul>");
                            startList = false;
                        }
                        String listText = text.substring(2);
                        outputFile.println("<li>" + listText + "</li>");
                    } else {
                        outputFile.println(text + "<br />");
                    }
                }
            }
        }

        if (lastIsList) {
            outputFile.println("</ul>");
        }

        outputFile.println("</body>");
        outputFile.println("</html>");
        
        inputText.close();
        outputFile.close();
    }
}
