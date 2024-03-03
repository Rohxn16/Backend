package Pkgs;

import static Pkgs.A.message; // here we can see that the message function has been imported from A.java class of pkgs folder

public class B {
    public static void main(String[] args) {
        message();
    }
}
