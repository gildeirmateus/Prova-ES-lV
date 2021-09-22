package br.edu.univas.main;
import java.util.Scanner;
import br.edu.univas.vo.AnimalEat;
import br.edu.univas.vo.AnimalEatType;
import br.edu.univas.vo.AnimalType;
import br.edu.univas.vo.FactoryProvider;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			
			br.edu.univas.vo.AbstractFactory factory = 
					FactoryProvider.getFactory(AnimalType.VERTEBRADOS);
			AnimalEat animalEat1 = 
					factory.getType(AnimalEatType.ELEPHANT);
			animalEat1.eat();
			

			br.edu.univas.vo.AbstractFactory factory2 = 
					FactoryProvider.getFactory(AnimalType.VERTEBRADOS);
			AnimalEat animalEat2 = 
					factory2.getType(AnimalEatType.SHARK);
			animalEat2.eat();
			
			

		} else if (option == 2) {
			br.edu.univas.vo.AbstractFactory factory = 
					FactoryProvider.getFactory(AnimalType.INVERTEBRADOS);
			AnimalEat animalEat1 = 
					factory.getType(AnimalEatType.BEE);
			animalEat1.eat();
			
			br.edu.univas.vo.AbstractFactory factory2 = 
					FactoryProvider.getFactory(AnimalType.INVERTEBRADOS);
			AnimalEat animalEat2 = 
					factory2.getType(AnimalEatType.ANT);
			animalEat2.eat();
			
		}
		
		scanner.close();
	}
}
