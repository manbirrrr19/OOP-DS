class PC {
    SSD ssd;
    CPU cpu;
    PC(SSD ssd, CPU cpu){
        this.ssd = ssd;
        this.cpu = cpu;
    }
    public String toString() {
        return ("PC with CPU " + cpu.brand + " and SSD " + ssd.brand);
    }
}

class CPU {
    String brand;
    CPU(String brand) {
        this.brand = brand;
    }
}

class SSD {
    String brand;
    String capacity;
    SSD(String brand, String capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }
}

public class CreatePC {
    public static void main(String[] args){
        SSD ssd = new SSD ("Crucial T705", "2TB");
        CPU cpu = new CPU("Intel");
        PC pc = new PC(ssd,cpu);
        System.out.println(pc);
    }
}
