package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Inventory keeps a searchable collection of Guitars. It is meant to be use
 * to find matching guitars for customers. 
 *
 * Course Name : Object Oriented Design and Analysis
 * Professor Name : Orlando Montalvo
 * Date : 09-18-2018
 * Assignment1
 * Participants : Saran Nemani(01400045)
 *
 * Version 2.0
 */
public class Inventory {
  private List<Guitar> guitars = new LinkedList<Guitar>();

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}
