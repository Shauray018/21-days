class MotorCycle {
    String make; 
    String color; 
    boolean engineState;

    void startEngine() { 
        if (engineState == true) { 
            System.out.println("Engine is already running");
        } else { 
            engineState = true; 
            System.out.println("Engine is now running!!");
        }
        // engineState? System.out.println("enigne is already runinh") : engineState = true; 
    }

    void showAtts() { 
        System.out.println("the motorcycle is of " + color + " " + make);
        if (engineState == true) { 
            System.out.println("The engine is on");
        } else { 
            System.out.println("The engine is off");
        }
    }
    public static void main (String args[]) {
    MotorCycle m = new MotorCycle();
    m.make = "RE Classic";
    m.color = "Stealth Black";
    System.out.println("showing attributes...");
    m.showAtts();
    System.out.println("-------");
    System.out.println("engine starting....");
    m.startEngine();
}
}
