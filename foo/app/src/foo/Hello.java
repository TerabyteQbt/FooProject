package foo;

import foo.Constants;

class Hello {

    public static void main(String[] args) {
        for(String d : Constants.DEVS) {
            System.out.println("Hello, Developer " + d + "!\n");
        }
    }
}
