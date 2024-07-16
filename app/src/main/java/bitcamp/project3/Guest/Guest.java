package bitcamp.project3.Guest;

// Kid (어린아이)
// Student (학생)
// NoJob (백수)
// Grandpa (할아버지)
public interface Guest {

  String getType();

  void setType(String type);

  int getLossForce();

  int getReputation();

  int getRentPeriod();

  void setRentPeriod(int rentPeriod);

  int getTiredness();

  void setTiredness(int tiredness);


}
