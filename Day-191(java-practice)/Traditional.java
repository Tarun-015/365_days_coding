
public class Traditional {
    FileReader fr = null;
    try {
        fr = new FileReader("data.txt");
        int c;
        while((c = fr.read()) != -1)
            System.out.print((char)c);
    } catch (IOException e) {
        System.out.println("Error: " + e);
    } finally {
        try {
            if(fr != null)
                fr.close(); // must close manually
        } catch(IOException e){
            System.out.println("Error closing file");
        }
}

}
