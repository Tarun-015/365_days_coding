
public class TryWithResources {
    try (FileReader fr = new FileReader("data.txt")) {
    int c;
    while ((c = fr.read()) != -1)
        System.out.print((char)c);
    } catch (IOException e) {
        System.out.println("Handled: " + e);
    }

    
}
