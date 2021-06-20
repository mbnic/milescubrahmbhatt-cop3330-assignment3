/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex43;

import java.util.Scanner;

public class Application {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Website website = new Website();
        getSiteInfo(website);
        website.createSiteFolder();
        website.createSite();
        website.createExtrasFolders();
    }

    public static void getSiteInfo(Website website) {
        System.out.print("Site name: ");
        website.setSiteName(in.next());

        System.out.print("Author: ");
        website.setAuthor(in.next());

        System.out.print("Do you want a folder for JavaScript? (enter y or n): ");
        website.setJsChoice(in.next());

        System.out.print("Do you want a folder for CSS (enter y or n): ");
        website.setCssChoice(in.next());
    }
}
