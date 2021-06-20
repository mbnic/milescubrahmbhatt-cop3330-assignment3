package ex45;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        FileEditor FE = new FileEditor();

        String out_FileName = getUser_OutputFile_Name();

        String output = FE.replaceWord();

        FE.createOutputFile(out_FileName, output);

        in.close();
    }

    //get the name of the new output file from user
    private static String getUser_OutputFile_Name() {
        System.out.println("What would you like to name the output file?");
        return in.nextLine();
    }
}
