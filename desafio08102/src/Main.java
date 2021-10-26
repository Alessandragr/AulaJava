public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        Desktop desk = new Desktop();
        Notebook note = new Notebook();
        
        
        pc.discoRigido = "1 TB SSD";
        pc.memoriaRam = "16GB";
        pc.processador = "i9 - 11° Geração";
        pc.marca = "Acer";
        
        desk.fonte = "550W";
        desk.tamanhoGabinete = "60cm";
        desk.monitorExterno = "25\"";
        desk.discoRigido = "1 TB SSD";
        desk.memoriaRam = "16GB";
        desk.processador = "i9 - 11° Geração";
        desk.marca = "Acer";

        note.bateria = "6 células 96w";
        note.velocidadeWifi = "Wifi 3.0";
        note.versaoBluetooth = "4.0";
        note.discoRigido = "1 TB SSD";
        note.memoriaRam = "16GB";
        note.processador = "i9 - 11° Geração";
        note.marca = "Acer";

        Object objetoC = pc;
        Object objetoD = desk;
        Object objetoN = note;

        Computador pcNovo = (Computador)objetoC;
        Desktop deskNovo = (Desktop)objetoD;
        Notebook noteNovo = (Notebook)objetoN;
        
        System.err.println("\n----- Computador -----\n");
        imprimir(pcNovo);
        System.err.println("\n----- Desktop -----\n");
        imprimir(deskNovo);
        System.err.println("\n----- Notebook -----\n");
        imprimir(noteNovo);

    }
    public static void imprimir(Object obj) {
        System.err.println(obj.toString());
    }
}
