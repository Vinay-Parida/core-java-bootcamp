package com.tothenew.bootcamp.corejava;

/*class Inner {

    void show() {
        System.out.println("Inside inner class");
    }
}*/

/*interface SomeInterface {
    void show();
}*/

public class Outer {

    /*class Inner { // Member class (Nested inner class)

        public void show() { // new Outer().new Inner().show()
            System.out.println("Inside inner class");
        }
    }*/

    /*static class Inner { // Static member class (Nested inner class)

        public void show() { // new Outer.Inner().show()
            System.out.println("Inside static inner class");
        }
    }*/

    /*void someMethod() { // new Outer().someMethod()
        System.out.println("Inside method of outer class");

        class Inner { // Local class (Method local inner class)

            public void show() {
                System.out.println("Inside method of inner class");
            }
        }

        Inner inner = new Inner();
        inner.show();
    }*/

    /*static Inner inner = new Inner() { // Anonymous inner class: As subclass of Inner class
        void show() {
            System.out.println("Hiding show method of original body");
        }
    };

    public void hide() {
        inner.show();
    }*/

    /*void show() {
        SomeInterface someInterface = new SomeInterface() { // Anonymous inner class: As implementation of interface
            @Override
            public void show() {
                System.out.println("Inside show method of anonymous inner class");
            }
        };
        someInterface.show();
    }*/
}
