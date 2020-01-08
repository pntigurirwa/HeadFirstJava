class TapeDeck{

        boolean canRecord = false;

        void playtape(){
            System.out.println("tape playing");
        }

        void recordTape(){
          System.out.println("tape recording");
        }
        }

        class TapeDeckTestDrive{
          public static void main(String [] args){

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playtape();

        if (t.canRecord == true){
          t.recordTape();
        }

        }
        }
