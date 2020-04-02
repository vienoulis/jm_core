package ru.vienoulis;


public class Sqrt {

        public static void main (String[]args) {
            System.out.println(getCallerClassAndMethodName());
//            getCallerClassAndMethodNameTest();
            anotherMethod();


        }

        private static void anotherMethod () {
            System.out.println(getCallerClassAndMethodName());
//        getCallerClassAndMethodNameTest();
        anotherMethod2();
        }
        private static void anotherMethod2 () {
            System.out.println(getCallerClassAndMethodName());
//        getCallerClassAndMethodNameTest();
        }

    private static String getCallerClassAndMethodName() {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length < 4) return null;
        return "" + stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();


    }

    public static void getCallerClassAndMethodNameTest () {
           StackTraceElement[] stackTraceElement =  Thread.currentThread().getStackTrace();
           int i = 0;
            for (StackTraceElement s : stackTraceElement ) {
                System.out.print(i + " Class ");
                System.out.println(s.getClassName());
                System.out.print(i + " Metod ");
                System.out.println(s.getMethodName());
                i++;
            }
        }



}

