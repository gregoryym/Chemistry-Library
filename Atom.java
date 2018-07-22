package chem;

public class Atom {

	private int atomicNumber;
	private String atomName;
	private double atomicRadius;
	private String atomicSymbol;
	private double atomicMass;
	private String bondCharge;
	private int netAtomicCharge = 0;
	private double electronegativity;	////
	private int firstIonizationEnergy;
	private double meltingpoint;
	private double boilingpoint;
	private double density;
	private String classification; ////
	private int energyLevels;
	private int numberOfOxidationStates;
	private int numberOfRemainingBonds;
	int[] electronConfiguration;
	int[] oxidationStates;
	int[] atomRGB; 
	
	public Atom(int atomicNumber) {
		
		this.atomicNumber = atomicNumber;
		properties();
		
	}
	
	private void properties() {
		if (atomicNumber == 1) {
	
			int elecConfig[] = {1};
			int oxStates[] = {+1, -1};
			int RGB[] = {255, 0, 0};
			
			//atomic properties
			atomName = "Hydrogen";
			atomicRadius = 32;
			atomicSymbol = "H";
			atomicMass = 1.00794;
			electronegativity = 2.2;
			firstIonizationEnergy = 1312;
			meltingpoint = 14;
			boilingpoint = 20;
			density = 0.000082;
			energyLevels = 1;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 2;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
			
		}
		else if (atomicNumber == 2) {
			
			int elecConfig[] = {2};
			int oxStates[] = {0};
			int RGB[] = {255, 0, 0};
			
			atomName = "Helium";
			atomicRadius = 37;
			atomicSymbol = "He";
			atomicMass = 4.00260;
			electronegativity = 0;
			firstIonizationEnergy = 2372;
			meltingpoint = 0;
			boilingpoint = 4;
			density = 0.000164;
			energyLevels = 1;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
		}
		else if (atomicNumber == 3) {
			
			int elecConfig[] = {2, 1};
			int oxStates[] = {+1};
			int RGB[] = {255, 0, 0};
			
			atomName = "Lithium";
			atomicRadius = 130;
			atomicSymbol = "Li";
			atomicMass = 6.941;
			electronegativity = 1.0;
			firstIonizationEnergy = 520;
			meltingpoint = 454;
			boilingpoint = 1615;
			density = 0.534;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Metal";
			
		}
		else if (atomicNumber == 4) {
			
			int elecConfig[] = {2, 2};
			int oxStates[] = {+2};
			int RGB[] = {255, 0, 0};
			
			atomName = "Beryllium";
			atomicRadius = 99;
			atomicSymbol = "Be";
			atomicMass = 9.01218;
			electronegativity = 1.6;
			firstIonizationEnergy = 900;
			meltingpoint = 1560;
			boilingpoint = 2744;
			density = 1.85;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Metal";
			
		}
		else if (atomicNumber == 5) {
			
			int elecConfig[] = {2, 3};
			int oxStates[] = {+3};
			int RGB[] = {255, 0, 0};
			
			atomName = "Boron";
			atomicRadius = 84;
			atomicSymbol = "B";
			atomicMass = 10.81;
			electronegativity = 2.0;
			firstIonizationEnergy = 801;
			meltingpoint = 2348;
			boilingpoint = 4273;
			density = 2.34;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Metalloid";
			
		}
		else if (atomicNumber == 6) {
			
			int elecConfig[] = {2, 4};
			int oxStates[] = {-4, +2, +4};
			int RGB[] = {255, 0, 0};
			
			atomName = "Carbon";
			atomicRadius = 75;
			atomicSymbol = "C";
			atomicMass = 12.011;
			electronegativity = 2.6;
			firstIonizationEnergy = 1086;
			meltingpoint = 0;
			boilingpoint = 0;
			density = 0;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 3;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
		}
		else if (atomicNumber == 7) {
			
			int elecConfig[] = {2, 5};
			int oxStates[] = {-3, -2, -1, +1, +2, +3, +4, +5};
			int RGB[] = {255, 0, 0};
			
			atomName = "Nitrogen";
			atomicRadius = 71;
			atomicSymbol = "N";
			atomicMass = 14.0067;
			electronegativity = 3.0;
			firstIonizationEnergy = 1402;
			meltingpoint = 63;
			boilingpoint = 77;
			density = 0.001145;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 8;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
		}
		else if (atomicNumber == 8) {
			
			int elecConfig[] = {2, 6};
			int oxStates[] = {-2};
			int RGB[] = {255, 0, 0};
			
			atomName = "Oxygen";
			atomicRadius = 64;
			atomicSymbol = "O";
			atomicMass = 15.9994;
			electronegativity = 3.4;
			firstIonizationEnergy = 1314;
			meltingpoint = 54;
			boilingpoint = 90;
			density = 0.001308;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
		}
		else if (atomicNumber == 9) {
			
			int elecConfig[] = {2, 7};
			int oxStates[] = {-1};
			int RGB[] = {255, 0, 0};
			
			atomName = "Flourine";
			atomicRadius = 60;
			atomicSymbol = "F";
			atomicMass = 18.9984;
			electronegativity = 4.0;
			firstIonizationEnergy = 1681;
			meltingpoint = 53;
			boilingpoint = 85;
			density = 0.001553;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
		}
		else if (atomicNumber == 10) {
			
			int elecConfig[] = {2, 8};
			int oxStates[] = {0};
			int RGB[] = {255, 0, 0};
			
			atomName = "Neon";
			atomicRadius = 62;
			atomicSymbol = "Ne";
			atomicMass = 20.180;
			electronegativity = 0;
			firstIonizationEnergy = 2081;
			meltingpoint = 24;
			boilingpoint = 27;
			density = 0.000825;
			energyLevels = 2;
			electronConfiguration = elecConfig;
			numberOfOxidationStates = 1;
			oxidationStates = oxStates;
			atomRGB = RGB;
			classification = "Nonmetal";
			
		}
		
	}
	
public String getAtomName() {
		return atomName;
	}
	public double getElectronegativity() {
		return electronegativity;
	}
	public int getRemainingBonds() {
		return numberOfRemainingBonds;
	}
	public void newBondCount() {
		numberOfRemainingBonds --;
	}
	public String getClassification() {
		return classification;
	}
}
