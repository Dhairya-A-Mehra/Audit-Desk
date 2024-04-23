/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Rutu Bhanderi
 */
public class Session {
     private static boolean userSignedIn = false;
    private static int facultyID = -1;
    private static String fname = null;
    private static String password = null;
    private static String email = null;

    public static boolean isUserSignedIn() {
        return userSignedIn;
    }

    public static void setUserSignedIn(boolean userSignedIn) {
        Session.userSignedIn = userSignedIn;
    }

    public static int getFacultyID() {
        return facultyID;
    }

    public static void setFacultyID(int facultyID) {
        Session.facultyID = facultyID;
    }

    public static String getfname() {
        return fname;
    }

    public static void setfname(String fname) {
        Session.fname = fname;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Session.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Session.email = email;
    }
    public static void setSignIn(int facultyID, String fname, String password, String email) {
        Session.userSignedIn = true;
        Session.facultyID = facultyID;
        Session.fname = fname;
        Session.password = password;
        Session.email = email;
    }
}
