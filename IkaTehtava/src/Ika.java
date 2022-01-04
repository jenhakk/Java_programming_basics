
public class Ika {

	public static void main(String[] args) {
		
		int ika = 0;	
		
		//Jos ikä on 0-18, tulosta "Olet alaikäinen"
		if (ika >= 0 && ika < 18) {
			
			System.out.println("Olet alaikäinen"); 
				
			//Jos ikä on 15, tulosta "Saat ajaa mopoa". Jos 16-17 "Saat ajaa kevaria"
			if (ika == 15) {
			
					System.out.println("Saat ajaa mopoa");
					
				}	else if (ika >= 16) {
						System.out.println("Voit ajaa kevaria");
					}			
				
			//Jos ikä on 18 tulosta "Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa!"	
			} else if (ika == 18) {
			
				System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa!");
				
				//Jos ikä on 100, tulosta kolmelle riville "Onnea!"
			} else if (ika == 100) {
				System.out.println("Onnea!\nOnnea!\nOnnea!");
				
			//Jos ikä on 65 tai yli tulosta "Olet eläkeläinen" jos tasan 65 "Hyviä eläkepäiviä!"
			} else if (ika >= 65 ) {
				System.out.println("Olet eläkeläinen");	
				
				if (ika == 65) {
					System.out.println("Hyviä eläkepäiviä!");
				
				}if (ika == 70 || ika == 80 || ika == 90) {
					System.out.println("Onnea pyöreistä vuosista!");
				}
				
				//Jos ikä 58 tai yli tulosta "Voit jäädä varhaiseläkkeelle!" 
			} else if (ika >= 58) {
				System.out.println("Voit jäädä varhaiseläkkeelle!");
				
				//Jos ikä 60 tulosta "Onnea pyöreistä vuosista!"
					if (ika == 60) {
						System.out.println("Onnea pyöreistä vuosista!");
					}
				//Muuten tulosta "Olet aikuinen" Jos tasavuosikymmen "Onnea pyöreistä vuosista!"
			}else {
			System.out.println("Olet aikuinen");
				
					if (ika == 20 || ika == 30 || ika == 40 || ika == 50) {
					System.out.println("Onnea pyöreistä vuosista!");
					}
				
				//Jos ikä 40-50 tulosta "Parasta keski-ikää!"
					if (ika >= 40 && ika <= 50) {
					System.out.println("Parasta keski-ikää!");
				
				}
	}
		
	}
}





