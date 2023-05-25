package template;

public class main {
	public static void main(String[] args) {
        orderprocessor onlineOrder = new onlineorderprocessor();
        orderprocessor offlineOrder = new offlineorderprocessor();

        System.out.println("Processing an online order:");
        onlineOrder.processorder();

        System.out.println("\nProcessing an offline order:");
        offlineOrder.processorder();
    }

}
