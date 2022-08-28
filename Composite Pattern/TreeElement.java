public interface TreeElement {
  // Composite pattern

  abstract void print(); // applicable for both tree and nodes.
  // different implementation for node and trees.

  // Default implementation in an interface- here errors are thrown to prevent trees and nodes from
  // using other operations
  // these need to be overridden by the trees and the nodes.

  // not applicable for trees
  default Object getvalue() {
    // public ValueType getvalue() ValueType is the type of value stored in the Tree.
    // in this example ValueType is integer. (Object = integer)
    throw new UnsupportedOperationException(); // default
  }

  default void setvalue(Object i) {
    // public ValueType getvalue() ValueType is the type of value stored in the Tree.
    // in this example ValueType is integer. (Object = integer)
    throw new UnsupportedOperationException(); // default
  }

  // not applicable for nodes
  default TreeElement get(int i) { // next element in the tree
    throw new UnsupportedOperationException(); // default
  }

  default void add(TreeElement ElementToBeAdded) {
    throw new UnsupportedOperationException(); // default
  }

  default void remove(TreeElement ElementToBeRemoved) {
    throw new UnsupportedOperationException(); // default
  }
}
