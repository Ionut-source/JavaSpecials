package ro.java.ctrln;

public class OuterClassWithLocalClass {

    enum Weekday {MONDAY, TUESDAY};

    private final static int SIZE = 5;
    private  String[] messageList = {"Message1","Message2","Message3","Message4","Message5","Message6", "etc."};

    public void showMessages() {
        class LocalClass{

            // enum Weekday {MONDAY, TUESDAY};

            private int nextIndex = 0;
            public boolean hasNext() {
                return (this.nextIndex <= messageList.length - 1);
            }

            public String next() {
                return messageList[this.nextIndex++];
            }
        }

        LocalClass localClass = new LocalClass();
        while(localClass.hasNext()) {
            System.out.println("Mesajul este: " + localClass.next());
        }
    }

    public static void main(String[] args) {
        OuterClassWithLocalClass outerClassWithLocalClass = new OuterClassWithLocalClass();
        outerClassWithLocalClass.showMessages();
        //LocalClass localClass = new LocalClass(); eroare de compilare fiindca nu este gasita clasa localClass
        OuterClass.Weekday weekDay= OuterClass.Weekday.MONDAY;
    }
}
