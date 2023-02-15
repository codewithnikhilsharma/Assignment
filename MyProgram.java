package Today;

	public class MyProgram {
	    public static void main(String[] args) {
	        DisplayMessage message = new DisplayMessage();
	        message.printMessage();
	    }
	    
	    static class DisplayMessage {
	        void printMessage() {
	            System.out.println("Hello My Message");
	        }
	    }
	}


