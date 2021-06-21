/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex43;

import java.io.*;

public class Website {

    //site attributes
    private String siteName;
    private String author;
    private String sitePath;
    private String jsChoice;
    private String cssChoice;



    public void createSite() {
        File f = new File(sitePath + "/index.html");

        String html = "<html>\n\t<head>\n\t\t<title>" + siteName + "</title>"
                + "\n\t\t<meta " + author + ">"
                + "\n\t</head>"
                + "\n\n\t<body><h1>Did you ever hear the tragedy of Darth Plagueis The Wise?</h1></body>"
                + "\n</html>";

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();
            System.out.println("Created ." + sitePath.substring(18) + "/index.html");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }


    //creates the directory for website extras
    public void createExtrasFolders() {

        if (jsChoice.equals("y"))
            createJS_folder();

        if (cssChoice.equals("y"))
            createCSS_folder();

    }

    public void createSiteFolder() {
        //define the new path and create the directory
        sitePath = "src/main/java/ex43/website/" + siteName;
        File dir = new File(sitePath);
        boolean check = dir.mkdir();

        //checker
        if (check)
            System.out.println("Created ./website/" + siteName);
        else
            System.out.println("failure");
    }

    private void createJS_folder() {
        File dir = new File(sitePath + "/js/");
        boolean check = dir.mkdir();

        //checker
        if (check)
            System.out.println("Created ." + sitePath.substring(18) + "/js/");
        else
            System.out.println("failure");

    }

    private void createCSS_folder() {
        File dir = new File(sitePath + "/css/");
        boolean check = dir.mkdir();

        //checker
        if (check)
            System.out.println("Created ." + sitePath.substring(18) + "/css/");
        else
            System.out.println("failure");
    }

    //setters
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setJsChoice(String jsChoice) {
        this.jsChoice = jsChoice;
    }

    public void setCssChoice(String cssChoice) {
        this.cssChoice = cssChoice;
    }
}
