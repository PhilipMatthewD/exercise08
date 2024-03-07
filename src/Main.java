package com.killoran;
public class Main {

    public static void main(String[] args) {
        // write your code here
        double totalPrice = 0;
        PowerSupply mySupply = new PowerSupply("EVGA - SuperNOVA 750",110.00,750,true,"Gold");
        mySupply.display();
        CPU cpu = new CPU("Intel", 901, 3);
        System.out.println(cpu.toString());
        GPU graphic = new GPU(8373563, "NVIDIA");
        System.out.println(graphic.toString());
        MotherBoard mobo = new MotherBoard(123, "This one", "Groot 3");
        System.out.println(mobo.toString());
        Ram ram = new Ram(1, 1, true);
        System.out.println(ram.toString());
        Storage storage = new Storage("SSD", 23);
        Case myPC = new Case("HP", mySupply, cpu, mobo, ram, storage, graphic);
        totalPrice += mySupply.getPrice();
        System.out.println("\nRunning total:\t\t\t\t\t\t\t$" + totalPrice);
        //hint after other objects are created they can be placed within a case object this demonstrates composition

        Electronics e1 = new Electronics();

        Camera c1 = new Camera();

        Electronics e2 = new Camera();

        Electronics e3 = new Electronics();


        e1.start();

        c1.start();

        c1.takePicture();

        e2.start();

        // e2.takePicture(); doesnt work anymore

        ((Camera)e2).takePicture();
CodingLanguage lang1 = new CodingLanguage();
CodingLanguage lang2 = new Java();
Java lang3 = new Java();

ArrayList<CodingLanguage> listOfLang = new ArrayList<>();

listOfLang.add(lang1);
listOfLang.add(lang2);
listOfLang.add(lang3);

lang1.display();
 lang2.display();
 lang3.display();
        
for (CodingLanguage a : listOfLang){
     a.display();
}
}
class CodingLanguage{
    public void display(){
        System.out.println("this is a coding language");
    }
}

class Java extends CodingLanguage {
    @Override
    public void display() {
        System.out.println("This is java");
    }
    public void beTough(){
        System.out.println("be tough");
    }
}
class Electronics{
    public void start(){
        System.out.println("Device Powered On");
    }
}
class Camera extends Electronics{
    @Override
    public void start() {
        System.out.println("Camera Powered On");
    }
    public void takePicture(){
        System.out.println("*CLICK*");
    }
}
