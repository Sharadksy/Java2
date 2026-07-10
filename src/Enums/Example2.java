package Enums;

public class Example2 {

    enum TShirtSize{
        Small(30),
        Medium(34),
        Large(39);

        private final int chestWidth;

        TShirtSize(int chestWidth){
            this.chestWidth = chestWidth;
        }

        public int getChestSize(){
            return chestWidth;
        }
    }

    public static void main(String[] args) {
        TShirtSize size1 = TShirtSize.Medium;
        TShirtSize size2 = TShirtSize.Large;
        TShirtSize size3 = TShirtSize.Small;

        System.out.println("Medium width is: "+ size1.getChestSize() +" inches.");
        System.out.println("Large width is: "+ size2.getChestSize() +" inches.");
        System.out.println("Small width is: "+ size3.getChestSize() +" inches.");
    }
}
