package br.edu.univas.vo;

public interface AbstractFactory {
	
	AnimalEat getType(AnimalEatType animalType);
}
