package chem;
import java.util.*;

public class Molecule {
	
	ArrayList<Atom> atoms = new ArrayList<Atom>();
	ArrayList<Bond> bonds = new ArrayList<Bond>();
	
	Atom[][] molecule;
	
	private int maxBondCount = 4;
	
	public void addAtom(int atomicNumber) {
		atoms.add(new Atom(atomicNumber));
		molecule = new Atom[atoms.size()][maxBondCount + 1];
		 
		for (int i = 0; i < atoms.size(); i++) {
			molecule[i][0] = new Atom(atomicNumber);
		}
	}
	public void bondAtoms(Atom atom_one, Atom atom_two, int numberOfBonds) {
		//for loop to bond a atom to another atom more than once
		for (int i = 1; i <= numberOfBonds; i++) {
			//if the remaining bonds dont equal zero then it can bond
			if (atom_one.getRemainingBonds() != 0 && atom_two.getRemainingBonds() != 0) {
				//a new bond is created
				bonds.add(new Bond(atom_one, atom_two));
			}
			//if the remaining bond count equals zero then the two atoms can not be bonded
			else {
				System.out.println("Cannot bond atoms because there is it reached its max number of bonds");
			}
		}
		
	}
}
