package lessons;

public class Computer {

    int ram;
    String cpu;

    public Computer(String cpu, int ram){

        this.cpu = cpu;
        this.ram = ram;

    }

    public String toString(){

        return String.format("I'm %s with %d MB RAM on board", cpu, ram);

    }

    public String toString(int cores){

        return String.format("I'm %s with %d cores and %d MB RAM on board", cpu, cores, ram);

    }

}
