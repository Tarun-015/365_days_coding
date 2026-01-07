class RamayanaDeadlock {
    public static void main(String[] args) {
        final String bow = "Bow";
        final String arrow = "Arrow";

        Thread ram = new Thread(() -> {
            synchronized (bow) {
                System.out.println("Ram has Bow, waiting for Arrow...");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (arrow) {
                    System.out.println("Ram got Arrow too!");
                }
            }
        });

        Thread ravan = new Thread(() -> {
            synchronized (arrow) {
                System.out.println("Ravan has Arrow, waiting for Bow...");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (bow) {
                    System.out.println("Ravan got Bow too!");
                }
            }
        });

        ram.start();
        ravan.start();
    }
}
