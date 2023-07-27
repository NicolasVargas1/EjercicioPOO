// crear una clase SmartDevice
// crear las clases hijas : SmartPhone, SmartWatch
// agregar atributos tal cual tendrian esos bjetos en la realidad
// crear constructor vacio y con todos los parametros para cada clase
// desde la calse Main crear objetos de cada una y utilizarlos para imprimir por consola

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("SMARTPHONE:");

        SmartDevice smartPhone = new SmartDevice("Samsung", 5000, "Facial sensor");// Encapsulacion

        System.out.println("The brand name is : " + smartPhone.brandName );
        System.out.println("The battery capacity is: " + smartPhone.batteryCapacity + "mAh");
        System.out.println(smartPhone.sensors);

        System.out.println();
        System.out.println("SMARTWATCH:");

        SmartDevice smartWatch = new SmartDevice ("Huawei", 400, "Facial sensor");// Encapsulacion

        System.out.println("The brand name is : " + smartWatch.brandName);
        System.out.println("The battery capacity is: " + smartWatch.batteryCapacity + "mAh");
        System.out.println(smartWatch.sensors);

        SmartWatch smartWatch1 = new SmartWatch();
        smartWatch1.setSize(46);
        System.out.println("The smartwatch size is: " + smartWatch1.getSize() + "mm");
    }
}
class SmartDevice {

    String brandName;

    int batteryCapacity;

    String sensors;

    public SmartDevice() { // Constructor vacio
    }

    public SmartDevice(String brandName, int batteryCapacity, String sensors) { // Constructor con parametros de la calse SMARTDEVICE
        this.brandName = brandName;
        this.batteryCapacity = batteryCapacity;
        this.sensors = sensors;
    }
}

class SmartPhone extends SmartDevice {

}
class SmartWatch extends SmartDevice{

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}