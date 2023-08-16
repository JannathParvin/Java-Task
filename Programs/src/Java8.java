public class Java8 {
        public void displayInfo() {
            System.out.println("Common English Language");
        }
    }

    class Java extends Java8{
        public void displayInfo() {
            System.out.println("Java Programming Language");
        }
    }

    class program {
        public static void main(String[] args) {

            // create an object of Java class
            Java j1 = new Java();
            j1.displayInfo();

            // create an object of Language class
            Java8 l1 = new Java8();
            l1.displayInfo();
        }

    }
