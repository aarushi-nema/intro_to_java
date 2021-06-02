package Ch9;

/*
    Q: Create a class TV which defines for its objecs: states (channelNumber, volume, and power on or off)
        and behaviors (change channels (channelUp(), channelDown(), setChannel()), adjust volume (volumeUp(), volumeDown
        ()), and turn on/off).
        The maximum channels on the TV is 100 and the maximum volume is 10.
        Note the channel and volume level are not changed if the TV is not on.

        Write a test class to test all the functions of the TV class. Create two TV objects and display the data
        fields after every modification
 */

public class TV {

    int channelNumber;
    int volume;
    boolean on;

    //Constructor to initialize the properties of the object
    TV(){
        channelNumber=1;
        volume=1;
        on=false;
    }

    //method to turn on TV
   public void turnOn(){
        on =true;
   }

   //method to turn off TV
   public void turnOff(){
        on = false;
   }

   //method to increase channel by one
   public void channelUp(){
        if(on && channelNumber<100){
            channelNumber++;
        } else if (on && channelNumber==100){
            channelNumber=1;
        }
   }

   //method to decrease channel by one
   public void channelDown(){
        if(on && channelNumber>1){
            channelNumber--;
        } else if (on && channelNumber==1){
            channelNumber=100;
        }
   }

   //method to set channel number
   public void setChannelNumber(int channelNumber){
        this.channelNumber= channelNumber;
   }

   //method to increase volume by one
   public void volumeUp(){
        if(on && volume<10){
            volume++;
        }
   }

    //method to decrease volume by one
    public void volumeDown(){
        if(on && volume>1){
            volume--;
        }
   }
}

/* **************************** This program in a new file ********************* */

package Ch9;

public class TVTest {

    public static void main(String[] args) {
        TV tv1= new TV();
        displayObject(tv1, 1);
        tv1.turnOn();
        displayObject(tv1, 1);
        tv1.channelUp();
        displayObject(tv1, 1);
        tv1.setChannelNumber(45);
        displayObject(tv1, 1);
        tv1.volumeUp();
        displayObject(tv1, 1);
        tv1.turnOff();
        displayObject(tv1, 1);

        TV tv2= new TV();
        displayObject(tv2, 2);
        tv2.turnOn();
        displayObject(tv2, 2);
        tv2.volumeUp();
        displayObject(tv2, 2);
        tv2.setChannelNumber(20);
        displayObject(tv2, 2);
        tv2.turnOff();
        displayObject(tv2, 2);

    }

    public static void displayObject(TV tv, int tvNumber){
        System.out.println("\nThe TV" + tvNumber+ " is " + ((tv.on)?
                ("on" + "\nChannel Number is " + tv.channelNumber + "\nVolume is " + tv.volume):"off"));
    }
}

/*

  Test
  
  The TV1 is off

  The TV1 is on
  Channel Number is 1
  Volume is 1

  The TV1 is on
  Channel Number is 2
  Volume is 1

  The TV1 is on
  Channel Number is 45
  Volume is 1

  The TV1 is on
  Channel Number is 45
  Volume is 2

  The TV1 is off

  The TV2 is off

  The TV2 is on
  Channel Number is 1
  Volume is 1

  The TV2 is on
  Channel Number is 1
  Volume is 2

  The TV2 is on
  Channel Number is 20
  Volume is 2

  The TV2 is off

*/
