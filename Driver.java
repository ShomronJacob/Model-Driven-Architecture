import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please select which Gas pump you would like to use! ");
		System.out.println(" 1. GasPump-1");
		System.out.println(" 2. GasPump-2");
		System.out.println("Press 1 for Gas Pump 1");
		System.out.println("Press 2 for Gas Pump 2");
		
		int input = sc.nextInt();
		sc.nextLine();
		if(input == 1){
			GasPump1 gp1 = new GasPump1();
			System.out.println(" You have selected GasPump-1");
			System.out.println("Menu of operations");
			System.out.println("0. Activate(float,float)");
			System.out.println("1. Start()");
			System.out.println("2. PayCredit()");
			System.out.println("3. Reject()");
			System.out.println("4. Cancel()");
			System.out.println("5. Approved()");
			System.out.println("6. Super()");
			System.out.println("7. Regular()");
			System.out.println("8. StartPump()");
			System.out.println("9. PumpGallon()");
			System.out.println("st. StopPump()");
			System.out.println("quit. Quit program");
			System.out.println(" ********************");
			System.out.println();
			
			while(true){
				System.out.println("Select Operation:");
				System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-Super,7-Regular,8-StartPump,9-PumpGallon, st-StopPump, quit-quit");
				
				String in = sc.nextLine();
				if(in.equals("0")){
					System.out.println("Operation: Activate(float a,float b)");
					System.out.println("Please enter value of the parameter a:");
					float a = sc.nextFloat();
					sc.nextLine();
					System.out.println("Please enter value of the parameter b:");
					float b = sc.nextFloat();
					sc.nextLine();
					gp1.Activate(a, b);
				} else if(in.equals("1")){
					System.out.println("Operation: Start()");
					gp1.Start();
				} else if(in.equals("2")){
					System.out.println("Operation: PayCredit()");
					gp1.PayCredit();
				} else if(in.equals("3")){
					System.out.println("Operation: Reject()");
					gp1.Reject();
				} else if(in.equals("4")){
					System.out.println("Operation: Cancel()");
					gp1.Cancel();
				} else if(in.equals("5")){
					System.out.println("Operation: Approved()");
					gp1.Approved();
				} else if(in.equals("6")){
					System.out.println("Operation: Super()");
					gp1.Super();
				} else if(in.equals("7")){
					System.out.println("Operation: Regular()");
					gp1.Regular();
				} else if(in.equals("8")){
					System.out.println("Operation: StartPump()");
					gp1.StartPump();
				} else if(in.equals("9")){
					System.out.println("Operation: PumpGallon()");
					gp1.PumpGallon();
				} else if(in.equals("st")){
					System.out.println("Operation: StopPump()");
					gp1.StopPump();
				} else if(in.equals("quit")){
					return;
				}
			}
		} else if(input == 2){
			GasPump2 gp2 = new GasPump2();
			System.out.println(" You have selected GasPump-2");
			System.out.println(" Menu of operations");
			System.out.println("0. Activate(float,float,float)");
			System.out.println("1. Start()");
			System.out.println("2. PayCash(float)");
			System.out.println("3. Cancel()");
			System.out.println("4. Premium()");
			System.out.println("5. Regular()");
			System.out.println("6. Super()");
			System.out.println("7. StartPump()");
			System.out.println("8. PumpLiter()");
			System.out.println("9. Stop()");
			System.out.println("a. Receipt()");
			System.out.println("b. NoReceipt()");
			System.out.println("q. Quit program");
			System.out.println(" ********************");
			System.out.println();
			
			while(true){
				System.out.println("Select Operation:");
				System.out.println("0-Activate,1-Start,2-PayCash,3-Cancel,4-Premium,5-Regular,6-Super, 7-StartPump,8-PumpLiter, 9-Stop, a-Receipt, b-NoReceipt, q-quit");
				
				String in = sc.nextLine();
				if(in.equals("0")){
					System.out.println("Operation: Activate(int a,int b,int c)");
					System.out.println("Please enter value of the parameter a:");
					int a = sc.nextInt();
					sc.nextLine();
					System.out.println("Please enter value of the parameter b:");
					int b = sc.nextInt();
					sc.nextLine();
					System.out.println("Please enter value of the parameter c:");
					int c = sc.nextInt();
					sc.nextLine();
					gp2.Activate(a, b, c);
				} else if(in.equals("1")){
					System.out.println("Operation: Start()");
					gp2.Start();
				} else if(in.equals("2")){
					System.out.println("Operation: PayCash(float c)");
					System.out.println("Please enter value of the parameter c:");
					float c = sc.nextFloat();
					sc.nextLine();
					gp2.PayCash(c);
				} else if(in.equals("3")){
					System.out.println("Operation: Cancel()");
					gp2.Cancel();
				} else if(in.equals("4")){
					System.out.println("Operation: Premium()");
					gp2.Premium();
				} else if(in.equals("5")){
					System.out.println("Operation: Regular()");
					gp2.Regular();
				} else if(in.equals("6")){
					System.out.println("Operation: Super()");
					gp2.Super();
				} else if(in.equals("7")){
					System.out.println("Operation: StartPump()");
					gp2.StartPump();
				} else if(in.equals("8")){
					System.out.println("Operation: PumpLiter()");
					gp2.PumpLiter();
				} else if(in.equals("9")){
					System.out.println("Operation: Stop()");
					gp2.Stop();
				} else if(in.equals("a")){
					System.out.println("Operation: Receipt()");
					gp2.Receipt();
				} else if(in.equals("b")){
					System.out.println("Operation: NoReceipt()");
					gp2.NoReceipt();
				} else if(in.equals("q")){
					return;
				}
			}
		}
	}

}

