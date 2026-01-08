

public class MultipleResourcesinOneTry {
    try (
    FileReader fr = new FileReader("input.txt");
    FileWriter fw = new FileWriter("output.txt")
    ) {
        int c;
        while((c = fr.read()) != -1)
            fw.write(c);
        System.out.println("File copied!");
    } catch (IOException e) {
        System.out.println("Error: " + e);
    }

    
}
