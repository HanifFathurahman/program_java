class Laptop extends Komputer {
    Laptop(String paramProcessor, String paramMerk, String paramMemory) { 
        super(paramProcessor, paramMerk, paramMemory); 
    }
     
    public String lihatSpec() { 
        return "Merk: " + getMerk() + ", Processor: " + getProcessor() + ", Jumlah Memory: " + getMemory(); 
    }
}