package chem;

public class Bond {
	
	Atom atom_one, atom_two;
	
	private String bondType;
	private boolean isElectronsShared;
	private boolean isElectronsSharedEqually;
	
	public Bond(Atom atom_one, Atom atom_two) {
		
		this.atom_one = atom_one;
		this.atom_two = atom_two;
		
		
		
	}
	private void setBondType() {
		//if one of the atoms are a noble gas then a bond can't be formed
				if (atom_one.getElectronegativity() == 0 || atom_two.getElectronegativity() == 0) {
					System.out.println("A bond can't be formed with a group 18 element");
				}
				//If atom one is a metal and atom two is a nonmetal then the bond is ionic and electrons are transferred
				else if ((atom_one.getClassification() == "Metal" && atom_two.getClassification() == "Nonmetal") || (atom_one.getClassification() == "Nonmetal" && atom_two.getClassification() == "Metal")) {
					isElectronsShared = false;		
					bondType = "Ionic";
				}
				else {
					isElectronsShared = true;
					
					//the bond is nonpolar if the two electronegativities equal each other
					if (atom_one.getElectronegativity() == atom_two.getElectronegativity()) {
						//nonpolar bonds share electrons equally
						isElectronsSharedEqually = true;
						bondType = "Nonpolar Covalent";
					}
					//if the electronegativies dont equal each other the bond is polar
					else {
						isElectronsSharedEqually = false;
						bondType = "Polar Covalent";
					}
				}
	}
}
