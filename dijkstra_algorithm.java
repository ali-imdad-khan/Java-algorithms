//The node class
public class Node{
  //declare node attributes
  private String name;
  private Int node_distance= INTEGER.MAX;
  private Map<Node,Integer> neighbour_nodes= new HashMap<>();
  private List<Node> node_shortest_path= new LinkedList<>();
  
  //add neighbouring nodes function
  public void add_neighbouring_nodes(Node neightbour, int distance){
    neighbour_nodes.add(neighbour,distance);
  }
  
  publice Node(String name, int distance){
  this.node_distance=distance;
  this.name=name;
  }
}
//The graph class
public class Graph {
  
  private Set<Node> graph_nodes= new HashSet<>();
  
  //Method to add a node to graph_nodes
  public void add_node_to_graph(Node node){
    graph_nodes.add(node);
  }
}

