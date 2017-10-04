public class Solvability {
  
  private int[] name;
  private int complexity = 0;
  private boolean solveable;
  
  public int[] turnIntoInts(String[] array){
    name = new int[array.length - 1];
    for (int index = 0; index < array.length - 1; ++index) {
      name[index] = Integer.parseInt(array[index]);
    }
    return name;
  }
  
  public int HasSolution(int[] array) {
    solveable = false;
    for (int indexCurrent = 0; indexCurrent < array.length; ++indexCurrent) {
      for (int indexRest = indexCurrent + 1; indexRest < array.length; ++indexRest) {
        if (array[indexCurrent] > array[indexRest])
          complexity = complexity + 1;
      }
      
    }
    System.out.println("This puzzle has a complexity of: " + complexity);
    return complexity;
  }
}