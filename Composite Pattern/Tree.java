import java.util.*;

public class Tree implements TreeElement {

  public ArrayList<TreeElement> ElementList = new ArrayList<TreeElement>();
  // ArrayList to stored the elements of the tree.
  // This is example of unordered implementation of the composite pattern where the ordering of the
  // objects in the arraylist is insignificant

  public TreeElement get(int i) { // next element in the tree
    return ElementList.get(i);
  }

  public void add(TreeElement ElementToBeAdded) {
    ElementList.add(ElementToBeAdded); // add element from list
  }

  public void remove(TreeElement ElementToBeRemoved) {
    ElementList.remove(ElementToBeRemoved); // remove element from list
  }

  public void print() {
    for (TreeElement i : this.ElementList) {
      i.print(); // run print function for each element in the list.
    }
  }
}
