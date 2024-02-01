// Credit @kedarmhaswade Github for elements.txt
// https://gist.github.com/kedarmhaswade/ca46b689652b98e0bbdb995e1dd615ec

public enum Element {
    Hydrogen("H", 1, "+1", 1.008, "1s^1"),
    Helium("He", 2, "0", 4.0026, "1s^2"),
    Lithium("Li", 3, "+1", 6.94, "[He] 2s^1"),
    Beryllium("Be", 4, "+2", 9.0122, "[He] 2s^2"),
    Boron("B", 5, "+3", 10.81, "[He] 2s^2 2p^1"),
    Carbon("C", 6, "+4", 12.011, "[He] 2s^2 2p^2"),
    Nitrogen("N", 7, "-3", 14.007, "[He] 2s^2 2p^3"),
    Oxygen("O", 8, "-2", 15.999, "[He] 2s^2 2p^4"),
    Fluorine("F", 9, "-1", 18.998, "[He] 2s^2 2p^5"),
    Neon("Ne", 10, "0", 20.180, "[He] 2s^2 2p^6"),
    Sodium("Na", 11, "+1", 22.990, "[Ne] 3s^1"),
    Magnesium("Mg", 12, "+2", 24.305, "[Ne] 3s^2"),
    Aluminium("Al", 13, "+3", 26.982, "[Ne] 3s^2 3p^1"),
    Silicon("Si", 14, "+4", 28.085, "[Ne] 3s^2 3p^2"),
    Phosphorus("P", 15, "-3", 30.974, "[Ne] 3s^2 3p^3"),
    Sulfur("S", 16, "-2", 32.06, "[Ne] 3s^2 3p^4"),
    Chlorine("Cl", 17, "-1", 35.45, "[Ne] 3s^2 3p^5"),
    Argon("Ar", 18, "0", 39.948, "[Ne] 3s^2 3p^6"),
    Potassium("K", 19, "+1", 39.098, "[Ar] 4s^1"),
    Calcium("Ca", 20, "+2", 40.078, "[Ar] 4s^2"),
    Scandium("Sc", 21, "+3", 44.956, "[Ar] 3d^1 4s^2"),
    Titanium("Ti", 22, "+4", 47.867, "[Ar] 3d^2 4s^2"),
    Vanadium("V", 23, "+5", 50.942, "[Ar] 3d^3 4s^2"),
    Chromium("Cr", 24, "+3", 51.996, "[Ar] 3d^5 4s^1"),
    Manganese("Mn", 25, "+2", 54.938, "[Ar] 3d^5 4s^2"),
    Iron("Fe", 26, "+3", 55.845, "[Ar] 3d^6 4s^2"),
    Cobalt("Co", 27, "+2", 58.933, "[Ar] 3d^7 4s^2"),
    Nickel("Ni", 28, "+2", 58.693, "[Ar] 3d^8 4s^2"),
    Copper("Cu", 29, "+1", 63.546, "[Ar] 3d^10 4s^1"),
    Zinc("Zn", 30, "+2", 65.38, "[Ar] 3d^10 4s^2"),
    Gallium("Ga", 31, "+3", 69.723, "[Ar] 3d^10 4s^2 4p^1"),
    Germanium("Ge", 32, "+4", 72.63, "[Ar] 3d^10 4s^2 4p^2"),
    Arsenic("As", 33, "-3", 74.922, "[Ar] 3d^10 4s^2 4p^3"),
    Selenium("Se", 34, "-2", 78.971, "[Ar] 3d^10 4s^2 4p^4"),
    Bromine("Br", 35, "-1", 79.904, "[Ar] 3d^10 4s^2 4p^5"),
    Krypton("Kr", 36, "0", 83.798, "[Ar] 3d^10 4s^2 4p^6"),
    Rubidium("Rb", 37, "+1", 85.468, "[Kr] 5s^1"),
    Strontium("Sr", 38, "+2", 87.62, "[Kr] 5s^2"),
    Yttrium("Y", 39, "+3", 88.906, "[Kr] 4d^1 5s^2"),
    Zirconium("Zr", 40, "+4", 91.224, "[Kr] 4d^2 5s^2"),
    Niobium("Nb", 41, "+5", 92.906, "[Kr] 4d^4 5s^1"),
    Molybdenum("Mo", 42, "+6", 95.95, "[Kr] 4d^5 5s^1"),
    Technetium("Tc", 43, "+7", 98, "[Kr] 4d^5 5s^2"),
    Ruthenium("Ru", 44, "+4", 101.07, "[Kr] 4d^7 5s^1"),
    Rhodium("Rh", 45, "+3", 102.91, "[Kr] 4d^8 5s^1"),
    Palladium("Pd", 46, "+2", 106.42, "[Kr] 4d^10"),
    Silver("Ag", 47, "+1", 107.87, "[Kr] 4d^10 5s^1"),
    Cadmium("Cd", 48, "+2", 112.41, "[Kr] 4d^10 5s^2"),
    Indium("In", 49, "+3", 114.82, "[Kr] 4d^10 5s^2 5p^1"),
    Tin("Sn", 50, "+4", 118.71, "[Kr] 4d^10 5s^2 5p^2"),
    Antimony("Sb", 51, "-3", 121.76, "[Kr] 4d^10 5s^2 5p^3"),
    Tellurium("Te", 52, "-2", 127.6, "[Kr] 4d^10 5s^2 5p^4"),
    Iodine("I", 53, "-1", 126.9, "[Kr] 4d^10 5s^2 5p^5"),
    Xenon("Xe", 54, "0", 131.29, "[Kr] 4d^10 5s^2 5p^6"),
    Caesium("Cs", 55, "+1", 132.91, "[Xe] 6s^1"),
    Barium("Ba", 56, "+2", 137.33, "[Xe] 6s^2"),
    Lanthanum("La", 57, "+3", 138.91, "[Xe] 5d^1 6s^2"),
    Cerium("Ce", 58, "+4", 140.12, "[Xe] 4f^1 5d^1 6s^2"),
    Praseodymium("Pr", 59, "+3", 140.91, "[Xe] 4f^3 6s^2"),
    Neodymium("Nd", 60, "+3", 144.24, "[Xe] 4f^4 6s^2"),
    Promethium("Pm", 61, "+3", 145, "[Xe] 4f^5 6s^2"),
    Samarium("Sm", 62, "+3", 150.36, "[Xe] 4f^6 6s^2"),
    Europium("Eu", 63, "+3", 151.96, "[Xe] 4f^7 6s^2"),
    Gadolinium("Gd", 64, "+3", 157.25, "[Xe] 4f^7 5d^1 6s^2"),
    Terbium("Tb", 65, "+3", 158.93, "[Xe] 4f^9 6s^2"),
    Dysprosium("Dy", 66, "+3", 162.5, "[Xe] 4f^10 6s^2"),
    Holmium("Ho", 67, "+3", 164.93, "[Xe] 4f^11 6s^2"),
    Erbium("Er", 68, "+3", 167.26, "[Xe] 4f^12 6s^2"),
    Thulium("Tm", 69, "+3", 168.93, "[Xe] 4f^13 6s^2"),
    Ytterbium("Yb", 70, "+3", 173.05, "[Xe] 4f^14 6s^2"),
    Lutetium("Lu", 71, "+3", 174.97, "[Xe] 4f^14 5d^1 6s^2"),
    Hafnium("Hf", 72, "+4", 178.49, "[Xe] 4f^14 5d^2 6s^2"),
    Tantalum("Ta", 73, "+5", 180.95, "[Xe] 4f^14 5d^3 6s^2"),
    Tungsten("W", 74, "+6", 183.84, "[Xe] 4f^14 5d^4 6s^2"),
    Rhenium("Re", 75, "+7", 186.21, "[Xe] 4f^14 5d^5 6s^2"),
    Osmium("Os", 76, "+4", 190.23, "[Xe] 4f^14 5d^6 6s^2"),
    Iridium("Ir", 77, "+3", 192.22, "[Xe] 4f^14 5d^7 6s^2"),
    Platinum("Pt", 78, "+2", 195.08, "[Xe] 4f^14 5d^9 6s^1"),
    Gold("Au", 79, "+1", 196.97, "[Xe] 4f^14 5d^10 6s^1"),
    Mercury("Hg", 80, "+2", 200.59, "[Xe] 4f^14 5d^10 6s^2"),
    Thallium("Tl", 81, "+1", 204.38, "[Xe] 4f^14 5d^10 6s^2 6p^1"),
    Lead("Pb", 82, "+2", 207.2, "[Xe] 4f^14 5d^10 6s^2 6p^2"),
    Bismuth("Bi", 83, "+3", 208.98, "[Xe] 4f^14 5d^10 6s^2 6p^3"),
    Polonium("Po", 84, "+4", 209, "[Xe] 4f^14 5d^10 6s^2 6p^4"),
    Astatine("At", 85, "-1", 210, "[Xe] 4f^14 5d^10 6s^2 6p^5"),
    Radon("Rn", 86, "0", 222, "[Xe] 4f^14 5d^10 6s^2 6p^6"),
    Francium("Fr", 87, "+1", 223, "[Rn] 7s^1"),
    Radium("Ra", 88, "+2", 226, "[Rn] 7s^2"),
    Actinium("Ac", 89, "+3", 227, "[Rn] 6d^1 7s^2"),
    Thorium("Th", 90, "+4", 232.04, "[Rn] 6d^2 7s^2"),
    Protactinium("Pa", 91, "+5", 231.04, "[Rn] 5f^2 6d^1 7s^2"),
    Uranium("U", 92, "+6", 238.03, "[Rn] 5f^3 6d^1 7s^2"),
    Neptunium("Np", 93, "+6", 237, "[Rn] 5f^4 6d^1 7s^2"),
    Plutonium("Pu", 94, "+6", 244, "[Rn] 5f^6 7s^2"),
    Americium("Am", 95, "+6", 243, "[Rn] 5f^7 7s^2"),
    Curium("Cm", 96, "+6", 247, "[Rn] 5f^7 6d^1 7s^2"),
    Berkelium("Bk", 97, "+6", 247, "[Rn] 5f^9 7s^2"),
    Californium("Cf", 98, "+6", 251, "[Rn] 5f^10 7s^2"),
    Einsteinium("Es", 99, "+6", 252, "[Rn] 5f^11 7s^2"),
    Fermium("Fm", 100, "+6", 257, "[Rn] 5f^12 7s^2"),
    Mendelevium("Md", 101, "+6", 258, "[Rn] 5f^13 7s^2"),
    Nobelium("No", 102, "+6", 259, "[Rn] 5f^14 7s^2"),
    Lawrencium("Lr", 103, "+6", 266, "[Rn] 5f^14 6d^1 7s^2"),
    Rutherfordium("Rf", 104, "+4", 267, "[Rn] 5f^14 6d^2 7s^2"),
    Dubnium("Db", 105, "+5", 270, "[Rn] 5f^14 6d^3 7s^2"),
    Seaborgium("Sg", 106, "+6", 269, "[Rn] 5f^14 6d^4 7s^2"),
    Bohrium("Bh", 107, "+7", 270, "[Rn] 5f^14 6d^5 7s^2"),
    Hassium("Hs", 108, "+8", 270, "[Rn] 5f^14 6d^6 7s^2"),
    Meitnerium("Mt", 109, "+9", 278, "[Rn] 5f^14 6d^7 7s^2"),
    Darmstadtium("Ds", 110, "+10", 281, "[Rn] 5f^14 6d^8 7s^2"),
    Roentgenium("Rg", 111, "+11", 282, "[Rn] 5f^14 6d^9 7s^2"),
    Copernicium("Cn", 112, "+12", 285, "[Rn] 5f^14 6d^10 7s^2"),
    Nihonium("Nh", 113, "+13", 286, "[Rn] 5f^14 6d^10 7s^2 7p^1"),
    Flerovium("Fl", 114, "+14", 289, "[Rn] 5f^14 6d^10 7s^2 7p^2"),
    Moscovium("Mc", 115, "+15", 290, "[Rn] 5f^14 6d^10 7s^2 7p^3"),
    Livermorium("Lv", 116, "+16", 293, "[Rn] 5f^14 6d^10 7s^2 7p^4"),
    Tennessine("Ts", 117, "+17", 294, "[Rn] 5f^14 6d^10 7s^2 7p^5"),
    Oganesson("Og", 118, "+18", 294, "[Rn] 5f^14 6d^10 7s^2 7p^6");

    public final int id;
    public final String symbol;
    public final String elementName;
    public final String charge;
    public final String electronConfiguration;
    public final double atomicWeight;

    Element(String symbol, int id, String charge, double weight, String eC) {
        this.id = id;
        this.symbol = symbol;
        this.elementName = name();
        this.charge = charge;
        this.atomicWeight = weight;
        this.electronConfiguration = eC;
    }

    @Override
    public String toString() {
        return elementName+"["+charge+"]";
    }

    public static Element getElementFromSymbol(String s) {
        for (Element e : values()) {
            if (s.equals(e.symbol))
                return e;
        }
        return null;
    }
};