
public class Ika {

	public static void main(String[] args) {
		
		int ika = 0;	
		
		//Jos ik� on 0-18, tulosta "Olet alaik�inen"
		if (ika >= 0 && ika < 18) {
			
			System.out.println("Olet alaik�inen"); 
				
			//Jos ik� on 15, tulosta "Saat ajaa mopoa". Jos 16-17 "Saat ajaa kevaria"
			if (ika == 15) {
			
					System.out.println("Saat ajaa mopoa");
					
				}	else if (ika >= 16) {
						System.out.println("Voit ajaa kevaria");
					}			
				
			//Jos ik� on 18 tulosta "Olet juuri tullut t�ysi-ik�iseksi ja saat ajaa autoa!"	
			} else if (ika == 18) {
			
				System.out.println("Olet juuri tullut t�ysi-ik�iseksi ja saat ajaa autoa!");
				
				//Jos ik� on 100, tulosta kolmelle riville "Onnea!"
			} else if (ika == 100) {
				System.out.println("Onnea!\nOnnea!\nOnnea!");
				
			//Jos ik� on 65 tai yli tulosta "Olet el�kel�inen" jos tasan 65 "Hyvi� el�kep�ivi�!"
			} else if (ika >= 65 ) {
				System.out.println("Olet el�kel�inen");	
				
				if (ika == 65) {
					System.out.println("Hyvi� el�kep�ivi�!");
				
				}if (ika == 70 || ika == 80 || ika == 90) {
					System.out.println("Onnea py�reist� vuosista!");
				}
				
				//Jos ik� 58 tai yli tulosta "Voit j��d� varhaisel�kkeelle!" 
			} else if (ika >= 58) {
				System.out.println("Voit j��d� varhaisel�kkeelle!");
				
				//Jos ik� 60 tulosta "Onnea py�reist� vuosista!"
					if (ika == 60) {
						System.out.println("Onnea py�reist� vuosista!");
					}
				//Muuten tulosta "Olet aikuinen" Jos tasavuosikymmen "Onnea py�reist� vuosista!"
			}else {
			System.out.println("Olet aikuinen");
				
					if (ika == 20 || ika == 30 || ika == 40 || ika == 50) {
					System.out.println("Onnea py�reist� vuosista!");
					}
				
				//Jos ik� 40-50 tulosta "Parasta keski-ik��!"
					if (ika >= 40 && ika <= 50) {
					System.out.println("Parasta keski-ik��!");
				
				}
	}
		
	}
}





